package org.gis.spring;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan({ "org.gis.service" })
public class ServiceConfig {
}
