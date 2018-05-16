

trait CommonBuild extends Build {

  lazy val scalaTestDependency = "org.scalatest" %% "scalatest" % "2.2.4"
  val course = SettingKey[String]("course")
  val assignment = SettingKey[String]("assignment")
  val courseId = SettingKey[String]("courseId")
  val commonSourcePackages = SettingKey[Seq[String]]("commonSourcePackages")

}
