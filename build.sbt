organization in ThisBuild := "no.flatmap"

name := "calculator"

version in ThisBuild := "0.1-SNAPSHOT"

crossScalaVersions := Seq("2.10.4", "2.11.0")

scalaVersion in ThisBuild := crossScalaVersions.value.last

lazy val core = project

lazy val web = project.dependsOn(core)
