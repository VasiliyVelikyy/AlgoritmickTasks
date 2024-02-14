package borisov.taskOne;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class Clock implements Mode {
    int index = 0;

    @Autowired
    private List<Mode> list;

    @Override
    public void methodA() {
        list.get(index).methodA();
    }

    @Override
    public void methodB() {
        list.get(index).methodB();
    }

    public void methodC() {
        if (index == list.size()) index = 0;
        else
            index++;
    }
}




