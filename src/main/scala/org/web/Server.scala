package org.web

import com.twitter.finagle.Http
import com.twitter.util.Await
import io.finch._
import io.finch.circe._
import io.circe.generic.auto._

object Server extends App {

  val api: Endpoint[String] = get("hello") {
    Ok("world")
  }

  Await.ready(Http.server.serve(":8080", api.toService))
}
