name := Common.prefix(name.value)

libraryDependencies ++= Seq(
  "net.databinder" %% "unfiltered-filter" % "0.8.0",
  "net.databinder" %% "unfiltered-jetty"  % "0.8.0"
)
