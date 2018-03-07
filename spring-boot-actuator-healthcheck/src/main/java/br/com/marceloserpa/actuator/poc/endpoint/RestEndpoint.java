package br.com.marceloserpa.actuator.poc.endpoint;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class RestEndpoint {

    @RequestMapping(method = RequestMethod.GET, value = "/hello")
    public String sayHello(){
        return "test";
    }


}
