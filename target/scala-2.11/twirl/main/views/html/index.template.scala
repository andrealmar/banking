
package views.html

import play.twirl.api._
import play.twirl.api.TemplateMagic._


     object index_Scope0 {
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

class index extends BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with play.twirl.api.Template1[String,play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(message: String):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](format.raw/*1.19*/("""

"""),_display_(/*3.2*/main("Home")/*3.14*/ {_display_(Seq[Any](format.raw/*3.16*/("""

    """),format.raw/*5.5*/("""<div class="container">
        <p>"""),_display_(/*6.13*/message),format.raw/*6.20*/("""</p>
    </div>


""")))}),format.raw/*10.2*/("""
"""))
      }
    }
  }

  def render(message:String): play.twirl.api.HtmlFormat.Appendable = apply(message)

  def f:((String) => play.twirl.api.HtmlFormat.Appendable) = (message) => apply(message)

  def ref: this.type = this

}


}

/**/
object index extends index_Scope0.index
              /*
                  -- GENERATED --
                  DATE: Mon Oct 26 13:38:38 BRST 2015
                  SOURCE: /Users/andrealmar/dev/play_framework/banking/app/views/index.scala.html
                  HASH: c6ad5b271ba0961b7a8213f4f0c8d7977c6fd3ab
                  MATRIX: 745->1|857->18|885->21|905->33|944->35|976->41|1038->77|1065->84|1114->103
                  LINES: 27->1|32->1|34->3|34->3|34->3|36->5|37->6|37->6|41->10
                  -- GENERATED --
              */
          