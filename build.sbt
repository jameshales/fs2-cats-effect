organization := "org.jameshales"
name := "fs2-cats-effect"

Settings.settings

libraryDependencies ++= Seq(
  "co.fs2"         %% "fs2-core"    % "0.9.7",
  "co.fs2"         %% "fs2-cats"    % "0.3.0",
  "org.typelevel"  %% "cats-effect" % "0.3"
)
