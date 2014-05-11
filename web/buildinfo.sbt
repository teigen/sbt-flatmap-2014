buildInfoSettings

buildInfoPackage := "calc"

buildInfoKeys += BuildInfoKey("timestamp", System.currentTimeMillis())

sourceGenerators in Compile <+= buildInfo