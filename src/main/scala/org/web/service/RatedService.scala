package org.web.service

import io.circe._
import io.circe.parser._


object RatedService extends App {

  override def main(args: Array[String]): Unit = {
    val data = decode[Map[String, Map[String, Map[String, Int]]]](scala.io.Source.fromFile(getClass.getResource("/data.json").getPath).mkString)

  }

}
