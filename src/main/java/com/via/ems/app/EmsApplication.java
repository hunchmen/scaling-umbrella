package com.via.ems.app;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * 
 * 
 * @author hunchmen
 * 
 * 
 *         May 16, 2022
 */
@SpringBootApplication
@EnableAutoConfiguration
public class EmsApplication {

    /**
     * Main method
     * 
     * @param args
     */
    public static void main(String[] args) {
        SpringApplication.run(EmsApplication.class, args);
    }

}
