package org.web.model

sealed trait Scale {
  def name: String

  def calculate: Double
}

class Hipster() extends Scale {
  val name = "Hipster"

  override def calculate: Double = {
    0
  }
}