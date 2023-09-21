name := "Scala Problems"

version := "0.1"

scalaVersion := "2.13.12"

lazy val scalaTest = "org.scalatestplus.play" %% "scalatestplus-play" % "5.1.0"

lazy val CourseTest = config("ct").extend(Test)

lazy val root = (project in file("."))
  .configs(CourseTest)
  .settings(
    inConfig(CourseTest)(Defaults.testSettings),
    libraryDependencies += scalaTest % Test,
    libraryDependencies += scalaTest % CourseTest,
    libraryDependencies += "org.scalatestplus" %% "mockito-4-11" % "3.2.17.0" % "test"
  )

CourseTest / unmanagedSourceDirectories += baseDirectory.value / "ct"

