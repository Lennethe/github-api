name := """github-api"""
organization := "com.example"

version := "1.0-SNAPSHOT"

//lazy val root = (project in file(".")).enablePlugins(PlayJava, PlayEbean)
lazy val root = (project in file(".")).enablePlugins(PlayJava)

libraryDependencies ++= Seq(
  evolutions,
  javaJdbc,
  javaWs,
  "mysql" % "mysql-connector-java" % "5.1.20"
)

scalaVersion := "2.13.3"

libraryDependencies += guice
