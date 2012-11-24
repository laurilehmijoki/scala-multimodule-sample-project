package cats

import org.scalatra.test.specs2.MutableScalatraSpec
import org.specs2.runner.JUnitRunner
import org.junit.runner.RunWith

@RunWith(classOf[JUnitRunner])
class CatsRestApiSpec extends MutableScalatraSpec {
  addServlet(classOf[CatsRestApi], "/*")

  "GET / on CatsRestApi" should {
    "return 200" in {
      get("/") {
        status must_== 200
      }
    }

    "meow" in {
      get("/") {
        body must be equalTo("meow!")
      }
    }
  }
}
