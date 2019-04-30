package demo

import scala.collection.JavaConverters._

object App {
  def run(params: java.util.Map[String, String]) = {
    println(s"Hello, Lambda! params = ${params.asScala.mkString(", ")}")
  }
}
