package dev.milikkan.spring.jokesappsb;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ImportResource;

@SpringBootApplication
@ImportResource("classpath:chuck-config.xml")
public class JokesAppSbApplication {

    public static void main(String[] args) {
        SpringApplication.run(JokesAppSbApplication.class, args);
    }

}
