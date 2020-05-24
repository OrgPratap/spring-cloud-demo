package org.pratap.sb.ex.booksclient.booksclient;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.zuul.EnableZuulProxy;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.security.oauth2.config.annotation.web.configuration.EnableResourceServer;

@EnableZuulProxy
@EnableDiscoveryClient
@EnableResourceServer
@SpringBootApplication
@ComponentScan({"org.pratap.sb.ex.booksclient.booksclient"})
public class BooksClientApplication {

	public static void main(String[] args) {
		SpringApplication.run(BooksClientApplication.class, args);
	}

}
