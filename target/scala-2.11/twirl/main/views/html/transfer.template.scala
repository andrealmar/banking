
package views.html

import play.twirl.api._
import play.twirl.api.TemplateMagic._


     object transfer_Scope0 {
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

class transfer extends BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with play.twirl.api.Template1[String,play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(message: String):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](format.raw/*1.19*/("""

"""),_display_(/*3.2*/main("Transfer Money Online right now!!!")/*3.44*/ {_display_(Seq[Any](format.raw/*3.46*/("""
    """),format.raw/*4.5*/("""<div class="container">
        <p>"""),_display_(/*5.13*/message),format.raw/*5.20*/("""</p>
        <p>andre almar</p>
    </div>
""")))}),format.raw/*8.2*/("""
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
object transfer extends transfer_Scope0.transfer
              /*
                  -- GENERATED --
                  DATE: Mon Oct 26 13:59:58 BRST 2015
                  SOURCE: /Users/andrealmar/dev/play_framework/banking/app/views/transfer.scala.html
                  HASH: e3d6fc0d61da79d5c246bace0bd94a1f1469df60
                  MATRIX: 751->1|863->18|891->21|941->63|980->65|1011->70|1073->106|1100->113|1173->157
                  LINES: 27->1|32->1|34->3|34->3|34->3|35->4|36->5|36->5|39->8
                  -- GENERATED --
              */
          