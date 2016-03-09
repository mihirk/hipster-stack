package org.web.model


sealed trait Base {
  val name: String

  val rating: Map[Scale, Double]
}

case class Language(name: String, rating: Map[Scale, Double]) extends Base

case class FrontendFramework(name: String, rating: Map[Scale, Double]) extends Base

case class Database(name: String, rating: Map[Scale, Double]) extends Base

case class InfrastructureCode(name: String, rating: Map[Scale, Double]) extends Base