import AssemblyKeys._

libraryDependencies ++= Seq(
  "net.databinder" %% "unfiltered-filter" % "0.8.0",
  "net.databinder" %% "unfiltered-jetty"  % "0.8.0"
)

buildInfoSettings

buildInfoPackage := "calc"

buildInfoKeys += BuildInfoKey("timestamp", System.currentTimeMillis())

sourceGenerators in Compile <+= buildInfo

assemblySettings

assemblyOption in assembly ~= { _.copy(prependShellScript = Some(defaultShellScript)) }

jarName in assembly := s"calculator_${scalaBinaryVersion.value}.jar"
