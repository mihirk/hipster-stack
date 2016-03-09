package org.web.model


sealed trait Base {
  val name: String

  val measuringScale: Scale

  val rating: Double
}

case class Language(name: String, measuringScale: Scale, rating: Double) extends Base

case class FrontendFramework(name: String, measuringScale: Scale, rating: Double) extends Base

case class Database(name: String, measuringScale: Scale, rating: Double) extends Base

case class InfrastructureCode(name: String, measuringScale: Scale, rating: Double) extends Base
