package org.web.model

case class Rated[T <: Layer](name: String, rating: Map[Scale, Double])