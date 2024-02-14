package borisov.taskOne;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class Main {

    public static void main(String[] args) {
        // SpringApplication.run(Main.class, args);

        ConfigurableApplicationContext context = SpringApplication.run(Main.class, args);
        Clock bean = (Clock) context.getBean(Clock.class);

        System.out.println("ok");
    }
}
