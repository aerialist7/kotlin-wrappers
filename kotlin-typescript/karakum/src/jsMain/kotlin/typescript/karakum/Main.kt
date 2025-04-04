package typescript.karakum

import io.github.sgrishchenko.karakum.configuration.Granularity
import io.github.sgrishchenko.karakum.configuration.NamespaceStrategy
import io.github.sgrishchenko.karakum.configuration.loadExtensions
import io.github.sgrishchenko.karakum.extension.*
import io.github.sgrishchenko.karakum.extension.Annotation
import io.github.sgrishchenko.karakum.generate
import io.github.sgrishchenko.karakum.util.manyOf
import js.import.import
import js.objects.recordOf
import node.path.path
import node.process.process
import node.url.fileURLToPath

suspend fun main() {
    val typescriptPackage = import.meta.resolve("typescript/package.json")
        .let { fileURLToPath(it) }
        .let { path.dirname(it) }

    val outputPath = process.argv[2]

    val cwd = process.cwd()

    val jsPlugins = loadExtensions(
        "Plugin",
        arrayOf("kotlin/plugins/*.js"),
        cwd
    ) { plugin ->
        if (plugin is Function<*>) {
            createPlugin(plugin.unsafeCast<SimplePlugin>())
        } else {
            plugin.unsafeCast<Plugin>()
        }
    }

    val jsInjections = loadExtensions(
        "Injection",
        arrayOf("kotlin/injections/*.js"),
        cwd
    ) { injection ->
        if (injection is Function<*>) {
            createInjection(injection.unsafeCast<SimpleInjection>())
        } else {
            injection.unsafeCast<Injection>()
        }
    }

    val jsAnnotations = loadExtensions<Annotation>(
        "Annotation",
        arrayOf("kotlin/annotations/*.js"),
        cwd,
    )

    val jsNameResolvers = loadExtensions<NameResolver>(
        "Name Resolver",
        arrayOf("kotlin/nameResolvers/*.js"),
        cwd,
    )

    val jsInheritanceModifiers = loadExtensions<InheritanceModifier>(
        "Inheritance Modifier",
        arrayOf("kotlin/inheritanceModifiers/*.js"),
        cwd,
    )

    val jsVarianceModifiers = loadExtensions<VarianceModifier>(
        "Variance Modifier",
        arrayOf("kotlin/varianceModifiers/*.js"),
        cwd,
    )

    generate {
        plugins = manyOf(
            values = jsPlugins + arrayOf(
            )
        )
        injections = manyOf(values = jsInjections + arrayOf())
        annotations = manyOf(values = jsAnnotations + arrayOf())
        nameResolvers = manyOf(values = jsNameResolvers + arrayOf())
        inheritanceModifiers = manyOf(values = jsInheritanceModifiers + arrayOf())
        varianceModifiers = manyOf(values = jsVarianceModifiers + arrayOf())

        input = manyOf("$typescriptPackage/lib/typescript.d.ts")
        output = outputPath
        ignoreOutput = manyOf(
            "**/server/**",
            "**/CompletionsTriggerCharacter.kt",
            "**/SignatureHelpRetriggerCharacter.kt",
            "**/SignatureHelpTriggerCharacter.kt",
            "**/SignatureDeclarationBaseKind.kt",
            "**/isTypeOnlyExportDeclaration.contract.kt",
            "**/isTypeOnlyExportDeclaration.kt",
            "**/isTypeOnlyImportDeclaration.contract.kt",
            "**/isTypeOnlyImportDeclaration.kt",
        )
        libraryName = "typescript"
        libraryNameOutputPrefix = true
        granularity = Granularity.topLevel
        moduleNameMapper = recordOf(
            ".+" to "typescript"
        )
        packageNameMapper = recordOf(
            "ts/(.+)" to "typescript/$1",
            "createProgram.kt" to "createProgram.fun.kt",
        )
        importInjector = recordOf(
            ".contract.kt" to arrayOf(
                "kotlin.contracts.contract"
            ),
            "FileWatcherCallback.kt" to arrayOf(
                "js.date.Date"
            ),
            "LanguageService.kt" to arrayOf(
                "js.promise.Promise"
            ),
            "LanguageServiceHost.kt" to arrayOf(
                "js.promise.Promise"
            ),
            "ReadonlyUnderscoreEscapedMap.kt" to arrayOf(
                "js.collections.ReadonlyMap"
            ),
            "SolutionBuilderHostBase.kt" to arrayOf(
                "js.date.Date"
            ),
            "System.kt" to arrayOf(
                "js.date.Date"
            )
        )
        namespaceStrategy = recordOf(
            "ScriptSnapshot" to NamespaceStrategy.`object`,
            "JsTyping" to NamespaceStrategy.`object`,
            "ts" to NamespaceStrategy.`package`
        )
        disclaimer = "// Automatically generated - do not modify!"
    }
}
