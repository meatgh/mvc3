package technicalblog;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@SpringBootApplication
@ComponentScan
@EnableAutoConfiguration

public class TechnicalBlogApplication {

    public static void main(String[] args){
        SpringApplication.run(TechnicalBlogApplication.class, args);
    }

}

//fragment & th:replace notes in MVC-2, login feature -1
