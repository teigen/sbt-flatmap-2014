import sbt._, Keys._


object BuildInfo {
  val buildInfoPackage = settingKey[String]("package of generated build info object")
  val buildInfo        = taskKey[Seq[File]]("generates an object with build information")

  def settings:Seq[Setting[_]] = Seq(
    buildInfo <<= Def.task {
      val content =
        s"""
       |package ${buildInfoPackage.value}
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
  )

}