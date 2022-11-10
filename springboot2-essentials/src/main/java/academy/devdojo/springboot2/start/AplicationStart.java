package academy.devdojo.springboot2.start;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.context.annotation.ComponentScan;


@ComponentScan(basePackages = "academy.devdojo.springboot2")
@SpringBootApplication(exclude = {DataSourceAutoConfiguration.class })
public class AplicationStart {
    public static void main(String[] args) {
        SpringApplication.run(AplicationStart.class, args);
    }
}
