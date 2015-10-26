
package views.html

import play.twirl.api._
import play.twirl.api.TemplateMagic._


     object main_Scope0 {
import models._
import controllers._
import play.api.i18n._
import views.html._
import play.api.templates.PlayMagic._
import java.lang._
import java.util._
import scala.collection.JavaConversions._
import scala.collection.JavaConverters._
import play.core.j.PlayMagicForJava._
import play.mvc._
import play.data._
import play.api.data.Field
import play.mvc.Http.Context.Implicit._

class main extends BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with play.twirl.api.Template2[String,Html,play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(page: String)(content: Html):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](format.raw/*1.31*/("""

"""),format.raw/*3.1*/("""<!DOCTYPE html>

<html>
    <head>
        <title>"""),_display_(/*7.17*/page),format.raw/*7.21*/(""" """),format.raw/*7.22*/("""(Crossover Bank)</title>
        <meta name="viewport" content="width=device-width, initial-scale=1.0">
        <link rel="stylesheet" href="//maxcdn.bootstrapcdn.com/bootstrap/3.3.2/css/bootstrap.min.css">

            <!--  Load site-specific customizations after bootstrap. -->
        <link rel="stylesheet" media="screen" href=""""),_display_(/*12.54*/routes/*12.60*/.Assets.versioned("stylesheets/main.css")),format.raw/*12.101*/("""">
        <link rel="shortcut icon" type="image/png" href=""""),_display_(/*13.59*/routes/*13.65*/.Assets.versioned("images/favicon.png")),format.raw/*13.104*/("""">

            <!-- HTML5 shim and Respond.js IE8 support of HTML5 elements and media queries -->
            <!--[if lt IE 9]>
          <script src="//cdnjs.cloudflare.com/ajax/libs/html5shiv/3.7.2/html5shiv.js"></script>
          <script src="//cdnjs.cloudflare.com/ajax/libs/respond.js/1.4.2/respond.js"></script>
        <![endif]-->
    </head>
    <body>

            <!-- Responsive navbar -->
        <div class="navbar navbar-inverse navbar-fixed-top" role="navigation">
            <div class="container">
                <div class="navbar-header">
                    <button type="button" class="navbar-toggle" data-toggle="collapse" data-target=".navbar-collapse">
                            <!--  Display three horizontal lines when navbar collapsed. -->
                        <span class="icon-bar"></span> <span class="icon-bar"></span> <span class="icon-bar"></span>
                    </button>
                    <a class="navbar-brand" href="#">Crossover Bank</a>
                </div>
                <div class="collapse navbar-collapse">
                    <ul class="nav navbar-nav">
                        <li class=""""),_display_(/*35.37*/("active".when(page == "Home"))),format.raw/*35.68*/(""""><a href=""""),_display_(/*35.80*/routes/*35.86*/.Application.index()),format.raw/*35.106*/("""">Home</a></li>
                        <li class=""""),_display_(/*36.37*/("active".when(page == "Transfer"))),format.raw/*36.72*/(""""><a href=""""),_display_(/*36.84*/routes/*36.90*/.Application.transferMoney()),format.raw/*36.118*/("""">Transfer</a></li>
                    </ul>
                </div>
            </div>
        </div>
        """),_display_(/*41.10*/content),format.raw/*41.17*/("""
            """),format.raw/*42.13*/("""<!-- Load Bootstrap JavaScript components. -->
        <script src="//code.jquery.com/jquery.min.js"></script>
        <script src="//maxcdn.bootstrapcdn.com/bootstrap/3.3.2/js/bootstrap.min.js"></script>
    </body>
</html>"""))
      }
    }
  }

  def render(page:String,content:Html): play.twirl.api.HtmlFormat.Appendable = apply(page)(content)

  def f:((String) => (Html) => play.twirl.api.HtmlFormat.Appendable) = (page) => (content) => apply(page)(content)

  def ref: this.type = this

}


}

/**/
object main extends main_Scope0.main
              /*
                  -- GENERATED --
                  DATE: Mon Oct 26 14:03:31 BRST 2015
                  SOURCE: /Users/andrealmar/dev/play_framework/banking/app/views/main.scala.html
                  HASH: fcbc2473c2a2d546ca2c2594d121ebc92ee9ccd5
                  MATRIX: 748->1|872->30|900->32|977->83|1001->87|1029->88|1390->422|1405->428|1468->469|1556->530|1571->536|1632->575|2814->1730|2866->1761|2905->1773|2920->1779|2962->1799|3041->1851|3097->1886|3136->1898|3151->1904|3201->1932|3340->2044|3368->2051|3409->2064
                  LINES: 27->1|32->1|34->3|38->7|38->7|38->7|43->12|43->12|43->12|44->13|44->13|44->13|66->35|66->35|66->35|66->35|66->35|67->36|67->36|67->36|67->36|67->36|72->41|72->41|73->42
                  -- GENERATED --
              */
          