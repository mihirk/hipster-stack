package org.web.service

import io.circe.syntax._
import io.circe.parser._
import org.scalatest.FunSuite
import org.web.model.{Hipster, Language, Rated}

class RatedService$Test extends FunSuite {
  test("YO") {
    val data: Map[String, Map[String, Map[String, Int]]] = decode[Map[String, Map[String, Map[String, Int]]]](scala.io.Source.fromFile(getClass.getResource("/data.json").getPath).mkString).valueOr(Map())
    val languageList = data("languages").map { kv => new Rated[Language](kv._1, Map(new Hipster() -> kv._2("hipster"))) }
    languageList.foreach({ item => println(item.asJson) })
  }


}
