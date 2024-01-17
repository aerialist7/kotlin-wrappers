// Generated by Karakum - do not modify it manually!

package node.inspector


@Suppress("NESTED_CLASS_IN_EXTERNAL_INTERFACE")
@seskar.js.JsVirtual
sealed external interface SessionMethod {
    sealed interface SCHEMA_GETDOMAINS : SessionMethod
    sealed interface RUNTIME_EVALUATE : SessionMethod
    sealed interface RUNTIME_AWAITPROMISE : SessionMethod
    sealed interface RUNTIME_CALLFUNCTIONON : SessionMethod
    sealed interface RUNTIME_GETPROPERTIES : SessionMethod
    sealed interface RUNTIME_RELEASEOBJECT : SessionMethod
    sealed interface RUNTIME_RELEASEOBJECTGROUP : SessionMethod
    sealed interface RUNTIME_RUNIFWAITINGFORDEBUGGER : SessionMethod
    sealed interface RUNTIME_ENABLE : SessionMethod
    sealed interface RUNTIME_DISABLE : SessionMethod
    sealed interface RUNTIME_DISCARDCONSOLEENTRIES : SessionMethod
    sealed interface RUNTIME_SETCUSTOMOBJECTFORMATTERENABLED : SessionMethod
    sealed interface RUNTIME_COMPILESCRIPT : SessionMethod
    sealed interface RUNTIME_RUNSCRIPT : SessionMethod
    sealed interface RUNTIME_QUERYOBJECTS : SessionMethod
    sealed interface RUNTIME_GLOBALLEXICALSCOPENAMES : SessionMethod
    sealed interface DEBUGGER_ENABLE : SessionMethod
    sealed interface DEBUGGER_DISABLE : SessionMethod
    sealed interface DEBUGGER_SETBREAKPOINTSACTIVE : SessionMethod
    sealed interface DEBUGGER_SETSKIPALLPAUSES : SessionMethod
    sealed interface DEBUGGER_SETBREAKPOINTBYURL : SessionMethod
    sealed interface DEBUGGER_SETBREAKPOINT : SessionMethod
    sealed interface DEBUGGER_REMOVEBREAKPOINT : SessionMethod
    sealed interface DEBUGGER_GETPOSSIBLEBREAKPOINTS : SessionMethod
    sealed interface DEBUGGER_CONTINUETOLOCATION : SessionMethod
    sealed interface DEBUGGER_PAUSEONASYNCCALL : SessionMethod
    sealed interface DEBUGGER_STEPOVER : SessionMethod
    sealed interface DEBUGGER_STEPINTO : SessionMethod
    sealed interface DEBUGGER_STEPOUT : SessionMethod
    sealed interface DEBUGGER_PAUSE : SessionMethod
    sealed interface DEBUGGER_SCHEDULESTEPINTOASYNC : SessionMethod
    sealed interface DEBUGGER_RESUME : SessionMethod
    sealed interface DEBUGGER_GETSTACKTRACE : SessionMethod
    sealed interface DEBUGGER_SEARCHINCONTENT : SessionMethod
    sealed interface DEBUGGER_SETSCRIPTSOURCE : SessionMethod
    sealed interface DEBUGGER_RESTARTFRAME : SessionMethod
    sealed interface DEBUGGER_GETSCRIPTSOURCE : SessionMethod
    sealed interface DEBUGGER_SETPAUSEONEXCEPTIONS : SessionMethod
    sealed interface DEBUGGER_EVALUATEONCALLFRAME : SessionMethod
    sealed interface DEBUGGER_SETVARIABLEVALUE : SessionMethod
    sealed interface DEBUGGER_SETRETURNVALUE : SessionMethod
    sealed interface DEBUGGER_SETASYNCCALLSTACKDEPTH : SessionMethod
    sealed interface DEBUGGER_SETBLACKBOXPATTERNS : SessionMethod
    sealed interface DEBUGGER_SETBLACKBOXEDRANGES : SessionMethod
    sealed interface CONSOLE_ENABLE : SessionMethod
    sealed interface CONSOLE_DISABLE : SessionMethod
    sealed interface CONSOLE_CLEARMESSAGES : SessionMethod
    sealed interface PROFILER_ENABLE : SessionMethod
    sealed interface PROFILER_DISABLE : SessionMethod
    sealed interface PROFILER_SETSAMPLINGINTERVAL : SessionMethod
    sealed interface PROFILER_START : SessionMethod
    sealed interface PROFILER_STOP : SessionMethod
    sealed interface PROFILER_STARTPRECISECOVERAGE : SessionMethod
    sealed interface PROFILER_STOPPRECISECOVERAGE : SessionMethod
    sealed interface PROFILER_TAKEPRECISECOVERAGE : SessionMethod
    sealed interface PROFILER_GETBESTEFFORTCOVERAGE : SessionMethod
    sealed interface PROFILER_STARTTYPEPROFILE : SessionMethod
    sealed interface PROFILER_STOPTYPEPROFILE : SessionMethod
    sealed interface PROFILER_TAKETYPEPROFILE : SessionMethod
    sealed interface HEAPPROFILER_ENABLE : SessionMethod
    sealed interface HEAPPROFILER_DISABLE : SessionMethod
    sealed interface HEAPPROFILER_STARTTRACKINGHEAPOBJECTS : SessionMethod
    sealed interface HEAPPROFILER_STOPTRACKINGHEAPOBJECTS : SessionMethod
    sealed interface HEAPPROFILER_TAKEHEAPSNAPSHOT : SessionMethod
    sealed interface HEAPPROFILER_COLLECTGARBAGE : SessionMethod
    sealed interface HEAPPROFILER_GETOBJECTBYHEAPOBJECTID : SessionMethod
    sealed interface HEAPPROFILER_ADDINSPECTEDHEAPOBJECT : SessionMethod
    sealed interface HEAPPROFILER_GETHEAPOBJECTID : SessionMethod
    sealed interface HEAPPROFILER_STARTSAMPLING : SessionMethod
    sealed interface HEAPPROFILER_STOPSAMPLING : SessionMethod
    sealed interface HEAPPROFILER_GETSAMPLINGPROFILE : SessionMethod
    sealed interface NODETRACING_GETCATEGORIES : SessionMethod
    sealed interface NODETRACING_START : SessionMethod
    sealed interface NODETRACING_STOP : SessionMethod
    sealed interface NODEWORKER_SENDMESSAGETOWORKER : SessionMethod
    sealed interface NODEWORKER_ENABLE : SessionMethod
    sealed interface NODEWORKER_DISABLE : SessionMethod
    sealed interface NODEWORKER_DETACH : SessionMethod
    sealed interface NODERUNTIME_NOTIFYWHENWAITINGFORDISCONNECT : SessionMethod

    companion object {
        @seskar.js.JsValue("Schema.getDomains")
        val SCHEMA_GETDOMAINS: SCHEMA_GETDOMAINS

        @seskar.js.JsValue("Runtime.evaluate")
        val RUNTIME_EVALUATE: RUNTIME_EVALUATE

        @seskar.js.JsValue("Runtime.awaitPromise")
        val RUNTIME_AWAITPROMISE: RUNTIME_AWAITPROMISE

        @seskar.js.JsValue("Runtime.callFunctionOn")
        val RUNTIME_CALLFUNCTIONON: RUNTIME_CALLFUNCTIONON

        @seskar.js.JsValue("Runtime.getProperties")
        val RUNTIME_GETPROPERTIES: RUNTIME_GETPROPERTIES

        @seskar.js.JsValue("Runtime.releaseObject")
        val RUNTIME_RELEASEOBJECT: RUNTIME_RELEASEOBJECT

        @seskar.js.JsValue("Runtime.releaseObjectGroup")
        val RUNTIME_RELEASEOBJECTGROUP: RUNTIME_RELEASEOBJECTGROUP

        @seskar.js.JsValue("Runtime.runIfWaitingForDebugger")
        val RUNTIME_RUNIFWAITINGFORDEBUGGER: RUNTIME_RUNIFWAITINGFORDEBUGGER

        @seskar.js.JsValue("Runtime.enable")
        val RUNTIME_ENABLE: RUNTIME_ENABLE

        @seskar.js.JsValue("Runtime.disable")
        val RUNTIME_DISABLE: RUNTIME_DISABLE

        @seskar.js.JsValue("Runtime.discardConsoleEntries")
        val RUNTIME_DISCARDCONSOLEENTRIES: RUNTIME_DISCARDCONSOLEENTRIES

        @seskar.js.JsValue("Runtime.setCustomObjectFormatterEnabled")
        val RUNTIME_SETCUSTOMOBJECTFORMATTERENABLED: RUNTIME_SETCUSTOMOBJECTFORMATTERENABLED

        @seskar.js.JsValue("Runtime.compileScript")
        val RUNTIME_COMPILESCRIPT: RUNTIME_COMPILESCRIPT

        @seskar.js.JsValue("Runtime.runScript")
        val RUNTIME_RUNSCRIPT: RUNTIME_RUNSCRIPT

        @seskar.js.JsValue("Runtime.queryObjects")
        val RUNTIME_QUERYOBJECTS: RUNTIME_QUERYOBJECTS

        @seskar.js.JsValue("Runtime.globalLexicalScopeNames")
        val RUNTIME_GLOBALLEXICALSCOPENAMES: RUNTIME_GLOBALLEXICALSCOPENAMES

        @seskar.js.JsValue("Debugger.enable")
        val DEBUGGER_ENABLE: DEBUGGER_ENABLE

        @seskar.js.JsValue("Debugger.disable")
        val DEBUGGER_DISABLE: DEBUGGER_DISABLE

        @seskar.js.JsValue("Debugger.setBreakpointsActive")
        val DEBUGGER_SETBREAKPOINTSACTIVE: DEBUGGER_SETBREAKPOINTSACTIVE

        @seskar.js.JsValue("Debugger.setSkipAllPauses")
        val DEBUGGER_SETSKIPALLPAUSES: DEBUGGER_SETSKIPALLPAUSES

        @seskar.js.JsValue("Debugger.setBreakpointByUrl")
        val DEBUGGER_SETBREAKPOINTBYURL: DEBUGGER_SETBREAKPOINTBYURL

        @seskar.js.JsValue("Debugger.setBreakpoint")
        val DEBUGGER_SETBREAKPOINT: DEBUGGER_SETBREAKPOINT

        @seskar.js.JsValue("Debugger.removeBreakpoint")
        val DEBUGGER_REMOVEBREAKPOINT: DEBUGGER_REMOVEBREAKPOINT

        @seskar.js.JsValue("Debugger.getPossibleBreakpoints")
        val DEBUGGER_GETPOSSIBLEBREAKPOINTS: DEBUGGER_GETPOSSIBLEBREAKPOINTS

        @seskar.js.JsValue("Debugger.continueToLocation")
        val DEBUGGER_CONTINUETOLOCATION: DEBUGGER_CONTINUETOLOCATION

        @seskar.js.JsValue("Debugger.pauseOnAsyncCall")
        val DEBUGGER_PAUSEONASYNCCALL: DEBUGGER_PAUSEONASYNCCALL

        @seskar.js.JsValue("Debugger.stepOver")
        val DEBUGGER_STEPOVER: DEBUGGER_STEPOVER

        @seskar.js.JsValue("Debugger.stepInto")
        val DEBUGGER_STEPINTO: DEBUGGER_STEPINTO

        @seskar.js.JsValue("Debugger.stepOut")
        val DEBUGGER_STEPOUT: DEBUGGER_STEPOUT

        @seskar.js.JsValue("Debugger.pause")
        val DEBUGGER_PAUSE: DEBUGGER_PAUSE

        @seskar.js.JsValue("Debugger.scheduleStepIntoAsync")
        val DEBUGGER_SCHEDULESTEPINTOASYNC: DEBUGGER_SCHEDULESTEPINTOASYNC

        @seskar.js.JsValue("Debugger.resume")
        val DEBUGGER_RESUME: DEBUGGER_RESUME

        @seskar.js.JsValue("Debugger.getStackTrace")
        val DEBUGGER_GETSTACKTRACE: DEBUGGER_GETSTACKTRACE

        @seskar.js.JsValue("Debugger.searchInContent")
        val DEBUGGER_SEARCHINCONTENT: DEBUGGER_SEARCHINCONTENT

        @seskar.js.JsValue("Debugger.setScriptSource")
        val DEBUGGER_SETSCRIPTSOURCE: DEBUGGER_SETSCRIPTSOURCE

        @seskar.js.JsValue("Debugger.restartFrame")
        val DEBUGGER_RESTARTFRAME: DEBUGGER_RESTARTFRAME

        @seskar.js.JsValue("Debugger.getScriptSource")
        val DEBUGGER_GETSCRIPTSOURCE: DEBUGGER_GETSCRIPTSOURCE

        @seskar.js.JsValue("Debugger.setPauseOnExceptions")
        val DEBUGGER_SETPAUSEONEXCEPTIONS: DEBUGGER_SETPAUSEONEXCEPTIONS

        @seskar.js.JsValue("Debugger.evaluateOnCallFrame")
        val DEBUGGER_EVALUATEONCALLFRAME: DEBUGGER_EVALUATEONCALLFRAME

        @seskar.js.JsValue("Debugger.setVariableValue")
        val DEBUGGER_SETVARIABLEVALUE: DEBUGGER_SETVARIABLEVALUE

        @seskar.js.JsValue("Debugger.setReturnValue")
        val DEBUGGER_SETRETURNVALUE: DEBUGGER_SETRETURNVALUE

        @seskar.js.JsValue("Debugger.setAsyncCallStackDepth")
        val DEBUGGER_SETASYNCCALLSTACKDEPTH: DEBUGGER_SETASYNCCALLSTACKDEPTH

        @seskar.js.JsValue("Debugger.setBlackboxPatterns")
        val DEBUGGER_SETBLACKBOXPATTERNS: DEBUGGER_SETBLACKBOXPATTERNS

        @seskar.js.JsValue("Debugger.setBlackboxedRanges")
        val DEBUGGER_SETBLACKBOXEDRANGES: DEBUGGER_SETBLACKBOXEDRANGES

        @seskar.js.JsValue("Console.enable")
        val CONSOLE_ENABLE: CONSOLE_ENABLE

        @seskar.js.JsValue("Console.disable")
        val CONSOLE_DISABLE: CONSOLE_DISABLE

        @seskar.js.JsValue("Console.clearMessages")
        val CONSOLE_CLEARMESSAGES: CONSOLE_CLEARMESSAGES

        @seskar.js.JsValue("Profiler.enable")
        val PROFILER_ENABLE: PROFILER_ENABLE

        @seskar.js.JsValue("Profiler.disable")
        val PROFILER_DISABLE: PROFILER_DISABLE

        @seskar.js.JsValue("Profiler.setSamplingInterval")
        val PROFILER_SETSAMPLINGINTERVAL: PROFILER_SETSAMPLINGINTERVAL

        @seskar.js.JsValue("Profiler.start")
        val PROFILER_START: PROFILER_START

        @seskar.js.JsValue("Profiler.stop")
        val PROFILER_STOP: PROFILER_STOP

        @seskar.js.JsValue("Profiler.startPreciseCoverage")
        val PROFILER_STARTPRECISECOVERAGE: PROFILER_STARTPRECISECOVERAGE

        @seskar.js.JsValue("Profiler.stopPreciseCoverage")
        val PROFILER_STOPPRECISECOVERAGE: PROFILER_STOPPRECISECOVERAGE

        @seskar.js.JsValue("Profiler.takePreciseCoverage")
        val PROFILER_TAKEPRECISECOVERAGE: PROFILER_TAKEPRECISECOVERAGE

        @seskar.js.JsValue("Profiler.getBestEffortCoverage")
        val PROFILER_GETBESTEFFORTCOVERAGE: PROFILER_GETBESTEFFORTCOVERAGE

        @seskar.js.JsValue("Profiler.startTypeProfile")
        val PROFILER_STARTTYPEPROFILE: PROFILER_STARTTYPEPROFILE

        @seskar.js.JsValue("Profiler.stopTypeProfile")
        val PROFILER_STOPTYPEPROFILE: PROFILER_STOPTYPEPROFILE

        @seskar.js.JsValue("Profiler.takeTypeProfile")
        val PROFILER_TAKETYPEPROFILE: PROFILER_TAKETYPEPROFILE

        @seskar.js.JsValue("HeapProfiler.enable")
        val HEAPPROFILER_ENABLE: HEAPPROFILER_ENABLE

        @seskar.js.JsValue("HeapProfiler.disable")
        val HEAPPROFILER_DISABLE: HEAPPROFILER_DISABLE

        @seskar.js.JsValue("HeapProfiler.startTrackingHeapObjects")
        val HEAPPROFILER_STARTTRACKINGHEAPOBJECTS: HEAPPROFILER_STARTTRACKINGHEAPOBJECTS

        @seskar.js.JsValue("HeapProfiler.stopTrackingHeapObjects")
        val HEAPPROFILER_STOPTRACKINGHEAPOBJECTS: HEAPPROFILER_STOPTRACKINGHEAPOBJECTS

        @seskar.js.JsValue("HeapProfiler.takeHeapSnapshot")
        val HEAPPROFILER_TAKEHEAPSNAPSHOT: HEAPPROFILER_TAKEHEAPSNAPSHOT

        @seskar.js.JsValue("HeapProfiler.collectGarbage")
        val HEAPPROFILER_COLLECTGARBAGE: HEAPPROFILER_COLLECTGARBAGE

        @seskar.js.JsValue("HeapProfiler.getObjectByHeapObjectId")
        val HEAPPROFILER_GETOBJECTBYHEAPOBJECTID: HEAPPROFILER_GETOBJECTBYHEAPOBJECTID

        @seskar.js.JsValue("HeapProfiler.addInspectedHeapObject")
        val HEAPPROFILER_ADDINSPECTEDHEAPOBJECT: HEAPPROFILER_ADDINSPECTEDHEAPOBJECT

        @seskar.js.JsValue("HeapProfiler.getHeapObjectId")
        val HEAPPROFILER_GETHEAPOBJECTID: HEAPPROFILER_GETHEAPOBJECTID

        @seskar.js.JsValue("HeapProfiler.startSampling")
        val HEAPPROFILER_STARTSAMPLING: HEAPPROFILER_STARTSAMPLING

        @seskar.js.JsValue("HeapProfiler.stopSampling")
        val HEAPPROFILER_STOPSAMPLING: HEAPPROFILER_STOPSAMPLING

        @seskar.js.JsValue("HeapProfiler.getSamplingProfile")
        val HEAPPROFILER_GETSAMPLINGPROFILE: HEAPPROFILER_GETSAMPLINGPROFILE

        @seskar.js.JsValue("NodeTracing.getCategories")
        val NODETRACING_GETCATEGORIES: NODETRACING_GETCATEGORIES

        @seskar.js.JsValue("NodeTracing.start")
        val NODETRACING_START: NODETRACING_START

        @seskar.js.JsValue("NodeTracing.stop")
        val NODETRACING_STOP: NODETRACING_STOP

        @seskar.js.JsValue("NodeWorker.sendMessageToWorker")
        val NODEWORKER_SENDMESSAGETOWORKER: NODEWORKER_SENDMESSAGETOWORKER

        @seskar.js.JsValue("NodeWorker.enable")
        val NODEWORKER_ENABLE: NODEWORKER_ENABLE

        @seskar.js.JsValue("NodeWorker.disable")
        val NODEWORKER_DISABLE: NODEWORKER_DISABLE

        @seskar.js.JsValue("NodeWorker.detach")
        val NODEWORKER_DETACH: NODEWORKER_DETACH

        @seskar.js.JsValue("NodeRuntime.notifyWhenWaitingForDisconnect")
        val NODERUNTIME_NOTIFYWHENWAITINGFORDISCONNECT: NODERUNTIME_NOTIFYWHENWAITINGFORDISCONNECT
    }
}