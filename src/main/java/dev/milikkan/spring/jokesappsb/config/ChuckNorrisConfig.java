package dev.milikkan.spring.jokesappsb.config;

import guru.springframework.norris.chuck.ChuckNorrisQuotes;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/*
This config class is useless now, because config is moved out to a XML config file.
 */
//@Configuration
public class ChuckNorrisConfig {

    //@Bean
    public ChuckNorrisQuotes chuckNorrisQuotes() {
        return new ChuckNorrisQuotes();
    }
}
