libraryDependencies ++= Seq(
  "net.databinder" %% "unfiltered-filter" % "0.8.0",
  "net.databinder" %% "unfiltered-jetty"  % "0.8.0"
)

val buildInfo = taskKey[Seq[File]]("generates an object with build information")

buildInfo <<= Def.task{
  val content =
    s"""
       |package calc
       |
       |object BuildInfo {
       |  val version = "${version.value}"
       |  val timestamp = ${System.currentTimeMillis()}L
       |}
     """.stripMargin
  val file = (sourceManaged in Compile).value / "buildinfo" / "BuildInfo.scala"
  IO.write(file, content)
  Seq(file)
}

sourceGenerators in Compile <+= buildInfo