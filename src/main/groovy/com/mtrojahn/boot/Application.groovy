package com.mtrojahn.boot

import org.springframework.boot.Banner
import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.builder.SpringApplicationBuilder

@SpringBootApplication
class Application {
    static main(args) {
        def context = new SpringApplicationBuilder()
                .sources(Application.class)
                .bannerMode(Banner.Mode.OFF)
                .run()

        def app = context.getBean(Application.class)
        app.start()
    }

    def start() {
        println("Hello World!")
    }
}
