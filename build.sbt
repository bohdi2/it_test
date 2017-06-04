name := "it-test"

organization := "com.ebs.qa"

version := "1.0"

scalaVersion := "2.11.8"

libraryDependencies ++= Seq(
  "org.scalatest" %% "scalatest" % "2.1.6",
  "junit" % "junit" % "4.11" % "test",
  "com.novocode" % "junit-interface" % "0.10" % "test",
  "com.github.nscala-time" %% "nscala-time" % "1.4.0",
  "com.typesafe" % "config" % "1.3.0"
)

Defaults.itSettings

publishMavenStyle := true

isSnapshot := true

testOptions += Tests.Argument(TestFrameworks.JUnit, "-v")

parallelExecution in IntegrationTest := false

fork in IntegrationTest := true

javaOptions in IntegrationTest += "-Xmx2048m"

javaOptions in IntegrationTest += "-Xms1024m"

javaOptions in IntegrationTest += "-Xmn512m"

javaOptions in IntegrationTest += "-Xss256k"

javaOptions += "-ea"





