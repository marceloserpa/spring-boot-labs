
package br.com.jerseycrud.bean;

import org.springframework.stereotype.Component;

@Component
public class HelloWorldService {

    public String sayHello(){
        return "say hello";
    }

}
