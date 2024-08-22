package com.example

import zio._

object Main extends App {
    val program: ZIO[Any, Nothing, Unit] = {
        println("Hello, ZIO!")
        ZIO.unit
    }

    def run(args: List[String]): ZIO[Any, Nothing, ExitCode] =
        program.exitCode
}
