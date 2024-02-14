package borisov.taskOne;


import org.springframework.stereotype.Component;

@Component
public class Calendar implements Mode {
    @Override
    public void methodA() {
        System.out.println("calendar method a");
    }

    @Override
    public void methodB() {
        System.out.println("calendar method b");
    }
}
