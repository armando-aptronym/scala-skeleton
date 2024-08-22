import Dependencies._

ThisBuild / scalaVersion     := "3.4.2"
ThisBuild / version          := "0.1.0-SNAPSHOT"

ThisBuild / organization     := "com.skeleton"
ThisBuild / organizationName := "skeleton"

Compile / compile := (Compile / compile).dependsOn(Compile / scalafmt).value
Test / compile := (Test / compile).dependsOn(Test / scalafmt).value

lazy val root = (project in file("."))
  .settings(name := "scala-skeleton")

libraryDependencies ++= Seq(
  "dev.zio" %% "zio" % "2.0.15",
  "dev.zio" %% "zio-streams" % "2.0.15",
  "dev.zio" %% "zio-test" % "2.0.15" % Test,
  "dev.zio" %% "zio-test-sbt" % "2.0.15" % Test,
  "org.scalatest" %% "scalatest" % "3.2.10" % Test
)
