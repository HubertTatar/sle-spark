ThisBuild / version := "0.1.0-SNAPSHOT"

ThisBuild / scalaVersion := "2.12.18"

val sparkVersion = "3.3.0"
val log4jVersion = "2.20.0"

lazy val root = (project in file("."))
  .settings(
    name := "sle-spark",
    libraryDependencies ++= Seq(
      "org.apache.spark"        %% "spark-core" % sparkVersion,
      "org.apache.spark"        %% "spark-sql"  % sparkVersion,
      "org.apache.logging.log4j" % "log4j-api"  % log4jVersion,
      "org.apache.logging.log4j" % "log4j-core" % log4jVersion
    )
  )
