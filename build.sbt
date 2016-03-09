name := "hipster-stack"

version := "1.0-SNAPSHOT"

scalaVersion := "2.11.7"

resolvers ++= Seq(
  DefaultMavenRepository
)

libraryDependencies ++= Seq(
  "com.github.finagle" %% "finch-core" % "0.10.0",
  "com.github.finagle" %% "finch-circe" % "0.10.0",
  "io.circe" %% "circe-generic" % "0.3.0",
  "io.circe" %% "circe-parser" % "0.3.0",
  "io.circe" %% "circe-core" % "0.3.0",
  "com.firebase" % "firebase-client-android" % "2.5.0",
  "com.github.dblock" % "oshi-core" % "2.1"
)