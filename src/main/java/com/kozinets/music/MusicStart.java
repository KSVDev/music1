package com.kozinets.music;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class MusicStart {
    private static Logger LOGGER = LogManager.getLogger(MusicStart.class);

    public static void main(String[] args) {
        SpringApplication.run(MusicStart.class, args);
        LOGGER.info("Simple log statement with inputs 1, 2 and 3");
    }
}
