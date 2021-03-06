import sbt._
class Plugins(info: ProjectInfo) extends PluginDefinition(info) {

  // Add ScalaToolsSnapshots
  lazy val snapshots = ScalaToolsSnapshots

  // Add plugin
  lazy val a = "net.liftweb" % "lift-sbt" % "2.4-SNAPSHOT"
  lazy val bnd4sbt = "com.weiglewilczek.bnd4sbt" % "bnd4sbt" % "1.0.2"
}
