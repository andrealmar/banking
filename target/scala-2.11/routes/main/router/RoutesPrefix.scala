
// @GENERATOR:play-routes-compiler
// @SOURCE:/Users/andrealmar/dev/play_framework/banking/conf/routes
// @DATE:Mon Oct 26 13:58:37 BRST 2015


package router {
  object RoutesPrefix {
    private var _prefix: String = "/"
    def setPrefix(p: String): Unit = {
      _prefix = p
    }
    def prefix: String = _prefix
    val byNamePrefix: Function0[String] = { () => prefix }
  }
}
