package hello;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.config.server.EnableConfigServer;

@EnableConfigServer
@SpringBootApplication
public class ConfigServiceApplication {
    
    public static void main(String[] args) {
    	System.out.println(ConfigServiceApplication.class.getClassLoader().getResource("application.properties"));
        SpringApplication.run(ConfigServiceApplication.class, args);
    }
}
