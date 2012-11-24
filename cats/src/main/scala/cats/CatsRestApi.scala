package cats

import org.scalatra.ScalatraServlet

class CatsRestApi extends ScalatraServlet {

  get("/*") {
    "meow!"
  }
}
