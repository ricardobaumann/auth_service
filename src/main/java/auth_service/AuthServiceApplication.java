package auth_service;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

/**
 * Created by ricardobaumann on 05/01/17.
 */
@SpringBootApplication
@EnableDiscoveryClient
public class AuthServiceApplication {

    public static void main(String[] args) {
        System.setProperty("spring.config.name", "auth_service");
        SpringApplication.run(AuthServiceApplication.class);
    }

}
