// Generated by Karakum - do not modify it manually!


package node.os


sealed external interface NetworkInterfaceBase {
    var address: String
    var netmask: String
    var mac: String
    var internal: Boolean
    var cidr: String?
}