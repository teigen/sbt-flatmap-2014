organization in ThisBuild := "no.flatmap"

name := "calculator"

version in ThisBuild := "0.1-SNAPSHOT"

scalaVersion in ThisBuild := "2.11.0"

lazy val core = project

lazy val web = project.dependsOn(core)
