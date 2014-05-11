libraryDependencies ++= Seq(
  "net.databinder" %% "unfiltered-filter" % "0.8.0",
  "net.databinder" %% "unfiltered-jetty"  % "0.8.0"
)

buildInfoSettings

buildInfoPackage := "calc"

buildInfoKeys += BuildInfoKey("timestamp", System.currentTimeMillis())

sourceGenerators in Compile <+= buildInfo