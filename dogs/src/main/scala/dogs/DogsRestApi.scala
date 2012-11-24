package dogs

import org.scalatra.ScalatraServlet

class DogsRestApi extends ScalatraServlet {
  get("/*") {
    "wuf!"
  }
}
