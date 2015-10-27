
package br.com.jerseycrud.resources;

import br.com.jerseycrud.bean.HelloWorldService;
import br.com.jerseycrud.model.input.ContactInput;
import javax.validation.Valid;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
@Path("/contact")
public class EndPoint {

    @Autowired private HelloWorldService helloWorldService;

    @GET
    public String test(){
        return "it's work!";
    }

    @POST
    public Long saveContact(@Valid ContactInput input){
        System.out.println(helloWorldService.sayHello());
        return 1L;
    }

}
