import AssemblyKeys._

assemblySettings

assemblyOption in assembly ~= { _.copy(prependShellScript = Some(defaultShellScript)) }

jarName in assembly := s"calculator_${scalaBinaryVersion.value}.jar"

graphSettings