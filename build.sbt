libraryDependencies += "org.scalactic" %% "scalactic" % "3.0.4"
libraryDependencies += "org.scalatest" %% "scalatest" % "3.0.4" % "test"

lazy val JOakClassFiles = ProjectRef(file("../JOakClassFiles"), "JOakClassFiles")

lazy val JOakAnalyser = (project in file("."))
  .settings(
    name := "JOakAnalyser",
    scalaVersion := "2.12.4"
  ).dependsOn(JOakClassFiles)

