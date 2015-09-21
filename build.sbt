name := "sillycat-predict-scala"

version := "1.0"

libraryDependencies ++= Seq(
  "org.slf4j"        % "slf4j-api" % "1.7.12",                       // MIT
  "org.apache.spark" %% "spark-core" % "1.3.1" % "provided",  // Apache v2
  "org.apache.spark" %% "spark-mllib" % "1.3.1" % "provided", // Apache v2
  "com.google.guava" % "guava" % "18.0",                      // Apache v2
  "com.typesafe"     % "config" % "1.3.0",                        // Apache v2
  "org.scalatest"    %% "scalatest" % "2.2.0" % "test",          // Apache v2
  "org.mockito"      % "mockito-all" % "1.9.5" % "test"            // MIT
)

