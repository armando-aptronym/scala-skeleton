import Dependencies._

ThisBuild / scalaVersion     := "3.4.2"
ThisBuild / version          := "0.1.0-SNAPSHOT"

ThisBuild / organization     := "com.skeleton"
ThisBuild / organizationName := "skeleton"

Compile / compile := (Compile / compile).dependsOn(Compile / scalafmt).value
Test / compile := (Test / compile).dependsOn(Test / scalafmt).value

lazy val root = (project in file("."))
  .settings(
    name := "scala-skeleton",
    libraryDependencies += "org.scalatest" %% "scalatest" % "3.2.10" % Test
  )
