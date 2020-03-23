name := "YBCqlHelloWorld"
version := "1.0"
scalaVersion := "2.12.11"
scalacOptions := Seq("-unchecked", "-deprecation")

// https://mvnrepository.com/artifact/com.yugabyte/cassandra-driver-core
libraryDependencies += "com.yugabyte" % "cassandra-driver-core" % "3.2.0-yb-19"
