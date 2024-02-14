package yandex.taskThree;


public class Foot implements Runnable {
    private final String name;
    //стринги в хипе хроняться, и когда будет создаваться левая и правая нога,то эта переменная будет ссылаться у двух обьектов на одну и туже ссылку
    private final String lock = "lock";
    private static volatile int currentLeg = 0; //0-left, 1- right;

    public Foot(String name) {
        this.name = name;
        Integer integer;
    }

    public void run() {
        while (true) {
            try {
                step();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

    private void step() throws InterruptedException {
        synchronized (lock) {
            while (true) { //может быть что поток проснется после else
                if (currentLeg == 0 && this.name.equals("left")
                        || currentLeg == 1 && this.name.equals("right")) {
                    System.out.println(String.format("Step by %s", name));
                    currentLeg = (currentLeg + 1) % 2;
                    lock.notify(); //возобновляет выполнение потока, который ожидает вызывающего объекта
                    return;
                } else {
                    lock.wait(); //ожидает другого потока выполнения
                }
            }
        }
    }
}
