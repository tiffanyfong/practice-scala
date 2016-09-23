package exercises

import net.ruippeixotog.scalascraper.browser.JsoupBrowser
import net.ruippeixotog.scalascraper.dsl.DSL._
import net.ruippeixotog.scalascraper.dsl.DSL.Extract._
import net.ruippeixotog.scalascraper.dsl.DSL.Parse._
import net.ruippeixotog.scalascraper.model.Element
import net.ruippeixotog.scalascraper.util.Validated.{VSuccess,VFailure}

object WebScraper extends App {

  /*
    This is a Flappy Bird recreation I made last semester.
    Fun fun fun!
   */

  val browser = JsoupBrowser()
  val doc = browser.get("http://tiffanyfong.github.io/FlappyAlien/v3/")

  // Content validation
  println("=== Testing content validation ===")

  doc ~/~ validator(text("title"))(_ == "Flappy Alien") match {
    case VSuccess(_) => println("Correct title")
    case VFailure(_) => println("WHO CHANGED MY TITLE")
  }

  doc ~/~ validator(".settings")(_.size == 4) match {
    case VSuccess(_) => println("4 settings found as expected")
    case VFailure(_) => println("NOOOOOO")
  }

  println("==================================")
  println()
  println("=== FLAPPY ALIEN :D ===")

  println("The custom settings are: ")
  doc >> texts(".settings") foreach println

  println("=======================")
  println()
}