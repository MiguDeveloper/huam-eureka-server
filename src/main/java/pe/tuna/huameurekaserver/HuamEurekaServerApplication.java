package pe.tuna.huameurekaserver;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@EnableEurekaServer
@SpringBootApplication
public class HuamEurekaServerApplication {

    public static void main(String[] args) {
        SpringApplication.run(HuamEurekaServerApplication.class, args);
    }

}
