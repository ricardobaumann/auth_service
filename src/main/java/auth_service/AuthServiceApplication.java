package auth_service;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.security.oauth2.config.annotation.web.configuration.EnableAuthorizationServer;
import org.springframework.security.oauth2.config.annotation.web.configuration.EnableResourceServer;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.security.Principal;

/**
 * Created by ricardobaumann on 05/01/17.
 */
@SpringBootApplication
@RestController
@EnableDiscoveryClient
@EnableResourceServer
@EnableAuthorizationServer
public class AuthServiceApplication {

    public static void main(String[] args) {
        System.setProperty("spring.config.name", "auth_service");
        SpringApplication.run(AuthServiceApplication.class);
    }

    @RequestMapping("/users/current")
    public Principal user(Principal user) {
        return user;
    }

}
