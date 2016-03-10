package org.web.model

sealed trait Layer {
  val layer: String
}

case object Language extends Layer {
  override val layer: String = "Language"
}

case object FrontendFramework extends Layer {
  override val layer: String = "FrontendFramework"
}

case object Database extends Layer {
  override val layer: String = "Database"
}

case object InfrastructureCode extends Layer {
  override val layer: String = "InfrastructureCode"
}

