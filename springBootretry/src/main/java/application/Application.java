package application;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.retry.annotation.EnableRetry;
//import org.springframework.retry.annotation.EnableRetry;

@SpringBootApplication
@ComponentScan("myrest,applogic")
@EnableRetry
public class Application {
    public static void main(String[] args) {

        SpringApplication.run(Application.class, args);
        for (String arg :args) {
            System.out.println(arg);
        }
    }


}