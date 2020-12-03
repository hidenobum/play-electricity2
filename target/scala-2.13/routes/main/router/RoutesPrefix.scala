// @GENERATOR:play-routes-compiler
// @SOURCE:/Users/hidenobumochigase/play-electricity/conf/routes
// @DATE:Fri Nov 06 15:55:12 JST 2020


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
