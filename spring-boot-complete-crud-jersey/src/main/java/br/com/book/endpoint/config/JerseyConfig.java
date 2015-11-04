package br.com.book.endpoint.config;

import org.glassfish.jersey.server.ResourceConfig;
import org.springframework.stereotype.Component;

import br.com.book.endpoint.RestEndpoint;

@Component
public class JerseyConfig extends ResourceConfig {

	public JerseyConfig(){
		register(RestEndpoint.class);
	}
	
}
