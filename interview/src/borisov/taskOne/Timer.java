package borisov.taskOne;

import org.springframework.stereotype.Component;

@Component
public class Timer implements Mode {
    @Override
    public void methodA() {
        System.out.println("Timer method a");
    }

    @Override
    public void methodB() {
        System.out.println("Timer method b");
    }
}
