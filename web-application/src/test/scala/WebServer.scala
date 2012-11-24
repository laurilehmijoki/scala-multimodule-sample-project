import org.eclipse.jetty.server.handler.ContextHandlerCollection
import org.eclipse.jetty.server.Server
import org.eclipse.jetty.webapp.WebAppContext

class WebServer(webApplicationPath: String) {
  val server = new Server(8080)
  val contexts = new ContextHandlerCollection()
  contexts.addHandler(new WebAppContext(webApplicationPath, "/"))
  server.setHandler(contexts)
  def start { server.start }

  def stop {
    server.stop
    server.join
  }

  def run {
    start
    server.join
  }
}

object WebServer {
  def main(args: Array[String]) {
    new WebServer("web-application/src/main/webapp").run
  }
}