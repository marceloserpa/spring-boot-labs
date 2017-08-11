package com.mserpa.dockerpoc;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;


@SpringBootApplication
public class Application {

    public static void main(String[] args) {
        SpringApplication.run(Application.class, args);
    }

    @RestController
    class RestEndpoint {

        @RequestMapping(method = RequestMethod.GET, value = "/")
        public Hello sayHello(){
            return new Hello("Hello World!!!");
        }

    }

    private class Hello {

        private String message;

        public Hello(String message) {
            this.message = message;
        }

        public Hello() {
        }

        public String getMessage() {
            return message;
        }

        public void setMessage(String message) {
            this.message = message;
        }
    }

}
