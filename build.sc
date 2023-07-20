import mill._, scalalib._


object app extends ScalaModule {
  def scalaVersion = "2.13.10"

  def ivyDeps = Agg(
    ivy"com.lihaoyi::cask:0.9.1",
  )
  object test extends Tests{
    def testFramework = "utest.runner.Framework"

    def ivyDeps = Agg(
      ivy"com.lihaoyi::utest::0.7.10",
      ivy"com.lihaoyi::requests::0.6.9",
    )
  }
}
