package org.web.model

sealed trait Layer {
  val layer: String
}

case class Language() extends Layer {
  override val layer: String = "Language"
}

case class FrontendFramework() extends Layer {
  override val layer: String = "FrontendFramework"
}

case class Database() extends Layer {
  override val layer: String = "Database"
}

case class InfrastructureCode() extends Layer {
  override val layer: String = "InfrastructureCode"
}