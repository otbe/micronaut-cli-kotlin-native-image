package org.example.cli

import io.micronaut.configuration.picocli.PicocliRunner
import picocli.CommandLine


@CommandLine.Command(name = "my-cli-app", description = ["..."], mixinStandardHelpOptions = true)
class Application : Runnable {
    @CommandLine.Option(names = ["-v", "--verbose"], description = ["..."])
    var verbose = false

    override fun run() { // business logic here
        if (verbose) {
            println("Hi!")
        }
    }

    companion object {
        @Throws(Exception::class)
        @JvmStatic
        fun main(args: Array<String>) {
            PicocliRunner.run(Application::class.java, *args)
        }
    }
}