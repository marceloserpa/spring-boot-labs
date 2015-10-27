package br.com.jerseycrud.config;

import br.com.jerseycrud.exceptionmapper.ConstraintViolationExceptionMapper;
import br.com.jerseycrud.resources.EndPoint;
import org.glassfish.jersey.server.ResourceConfig;
import org.springframework.stereotype.Component;

@Component
public class JerseyConfig extends ResourceConfig {

    public JerseyConfig() {
        register(EndPoint.class);
        register(ConstraintViolationExceptionMapper.class);
    }

}
