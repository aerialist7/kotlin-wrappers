// Generated by Karakum - do not modify it manually!

package node.dns


suspend fun resolve(hostname: String): js.array.ReadonlyArray<String> =
    resolveAsync(
        hostname
    ).await()


suspend fun resolve(hostname: String, rrtype: ResourceRecordType.A): js.array.ReadonlyArray<String> =
    resolveAsync(
        hostname, rrtype
    ).await()


suspend fun resolve(hostname: String, rrtype: ResourceRecordType.AAAA): js.array.ReadonlyArray<String> =
    resolveAsync(
        hostname, rrtype
    ).await()


suspend fun resolve(hostname: String, rrtype: ResourceRecordType.ANY): js.array.ReadonlyArray<AnyRecord> =
    resolveAsync(
        hostname, rrtype
    ).await()


suspend fun resolve(hostname: String, rrtype: ResourceRecordType.CAA): js.array.ReadonlyArray<CaaRecord> =
    resolveAsync(
        hostname, rrtype
    ).await()


suspend fun resolve(hostname: String, rrtype: ResourceRecordType.CNAME): js.array.ReadonlyArray<String> =
    resolveAsync(
        hostname, rrtype
    ).await()


suspend fun resolve(hostname: String, rrtype: ResourceRecordType.MX): js.array.ReadonlyArray<MxRecord> =
    resolveAsync(
        hostname, rrtype
    ).await()


suspend fun resolve(hostname: String, rrtype: ResourceRecordType.NAPTR): js.array.ReadonlyArray<NaptrRecord> =
    resolveAsync(
        hostname, rrtype
    ).await()


suspend fun resolve(hostname: String, rrtype: ResourceRecordType.NS): js.array.ReadonlyArray<String> =
    resolveAsync(
        hostname, rrtype
    ).await()


suspend fun resolve(hostname: String, rrtype: ResourceRecordType.PTR): js.array.ReadonlyArray<String> =
    resolveAsync(
        hostname, rrtype
    ).await()


suspend fun resolve(hostname: String, rrtype: ResourceRecordType.SOA): SoaRecord =
    resolveAsync(
        hostname, rrtype
    ).await()


suspend fun resolve(hostname: String, rrtype: ResourceRecordType.SRV): js.array.ReadonlyArray<SrvRecord> =
    resolveAsync(
        hostname, rrtype
    ).await()


suspend fun resolve(
    hostname: String,
    rrtype: ResourceRecordType.TXT,
): js.array.ReadonlyArray<js.array.ReadonlyArray<String>> =
    resolveAsync(
        hostname, rrtype
    ).await()


suspend fun resolve(
    hostname: String,
    rrtype: String,
): Any /* string[] | MxRecord[] | NaptrRecord[] | SoaRecord | SrvRecord[] | string[][] | AnyRecord[] */ =
    resolveAsync(
        hostname, rrtype
    ).await()
