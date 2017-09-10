
def scalatest = "org.scalatest" %% "scalatest" % "2.1.6"
def typesafeConfig = "com.typesafe" % "config" % "1.3.1"

lazy val root = (project in file("."))
                 .configs(IntegrationTest)

                 .settings(
                    scalaVersion := "2.11.8",
                    version := "1.0",
                    name := "it-test",
                    Defaults.itSettings,
                    libraryDependencies ++= List(scalatest, typesafeConfig),
                    mainClass in (assembly in IntegrationTest) := Some("org.scalatest.tools.Runner")
                    )




