package com.sampa.rest.hateoas.configuration;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;

@Configuration
@ComponentScan("com.sampa.rest.hateoas")
@EnableWebMvc
public class ApplicationConfiguration {

}
