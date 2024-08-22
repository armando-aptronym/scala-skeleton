package com.skeleton

import scala.concurrent.{Future, Await}
import scala.concurrent.ExecutionContext.Implicits.global
import scala.concurrent.duration._

object Main {

    private def someProcess: Future[String] = Future {
        // Simulate a long-running computation
        Thread.sleep(2000)
        "Hello, World!"
    }


    def main(args: Array[String]): Unit =
        val message: String = Await.result(someProcess, 5.seconds)
        println(message)

}
