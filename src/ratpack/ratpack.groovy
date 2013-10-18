import static org.ratpackframework.groovy.RatpackScript.ratpack
import static org.ratpackframework.groovy.Util.exec

ratpack {
    handlers {

        get("blocking") {
            println "${new Date()} - received blocking request"
            Thread.sleep(10000)
            println "${new Date()} - replying blocking request"
            response.send()
        }

        get("non-blocking") {
          println "${new Date()} - received non-blocking request"
          exec getBlocking(),
            { Thread.sleep(10000) },
            {
              println "${new Date()} - replying non-blocking request"
              response.send()
            }
        }

    }
}
