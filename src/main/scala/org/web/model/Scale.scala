package org.web.model

sealed trait Scale {
  def name: String
}

case object Hipster extends Scale {
  val name = "Hipster"
}
