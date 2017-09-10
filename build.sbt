
def scalatest = "org.scalatest" %% "scalatest" % "2.2.4"
def typesafeConfig = "com.typesafe" % "config" % "1.3.1"

enablePlugins(JavaAppPackaging)

lazy val root = (project in file("."))
                .enablePlugins(JavaAppPackaging)
                .configs(IntegrationTest)
                .settings(Defaults.itSettings: _*)
                .settings(
                    name := "it-test",
                    version := "1.0",
                    scalaVersion := "2.11.8",
                    mainClass in Compile := Some("org.scalatest.tools.Runner"),
                    libraryDependencies ++= List(scalatest, typesafeConfig),
                    // add integration tests to universal packaging
                    mappings in Universal += {
                        val jar = (sbt.Keys.`package` in IntegrationTest).value
                        jar -> s"lib/${jar.getName}"
                    },
                    scriptClasspath += (packageBin in IntegrationTest).value.name
                )




