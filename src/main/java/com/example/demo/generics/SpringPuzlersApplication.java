package com.example.demo.generics;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class SpringPuzlersApplication {


	@Bean
	public Message<Json> jsonMessage() {
		return new StructuredJsonMessage();
	}

	@Bean
	public Message<ParentMsg> xmlMessage() {
		return new XmlStructuredMessage();
	}

	@Bean
	public ApiRestClient<Json> restClient () {
		return new ApiRestClient<>(jsonMessage());
	}

	@Bean ApiSoapClient<ParentMsg> soapClient () {
		return new ApiSoapClient<>();
	}

	public static void main(String[] args) {
		SpringApplication.run(SpringPuzlersApplication.class, args);
	}

}
