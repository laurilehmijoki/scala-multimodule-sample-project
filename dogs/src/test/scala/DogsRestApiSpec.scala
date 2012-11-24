package dogs

import org.scalatra.test.specs2.MutableScalatraSpec
import org.junit.runner.RunWith
import org.specs2.runner.JUnitRunner

@RunWith(classOf[JUnitRunner])
class DogsRestApiSpec extends MutableScalatraSpec {
  addServlet(classOf[DogsRestApi], "/*")

  "GET / on DogsRestApi" should {
    "return 200" in {
      get("/") {
        status must_== 200
      }
    }

    "wuf" in {
      get("/") {
        body must be equalTo("wuf!")
      }
    }
  }
}
