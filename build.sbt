
def scalatest = "org.scalatest" %% "scalatest" % "2.1.6"
def typesafeConfig = "com.typesafe" % "config" % "1.3.1"

/*
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
                    */

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
                    } ,
                    scriptClasspath += (packageBin in IntegrationTest).value.name
                )




