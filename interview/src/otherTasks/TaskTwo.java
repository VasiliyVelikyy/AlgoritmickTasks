package otherTasks;


//как сделать так что бы в конце main выводился 0
public class TaskTwo implements Runnable {
    private int counter;

    public void inc() {
        counter++;
    }

    public void dec() {
        counter--;
    }

    public int get() {
        return counter;
    }

    @Override
    public void run() {
        for (int i = 0; i < 4; i++) {
            inc();
        }
    }

    public static void main(String[] args) throws InterruptedException {
        TaskTwo taskTwo = new TaskTwo();
        //new Thread(taskTwo).start(); //этот код может выполниться после цикла ниже

        //решение
//        Thread thread = new Thread(taskTwo);
//        thread.start();
//        thread.join();

        for (int i = 0; i < 4; i++) {
            taskTwo.dec();
        }
        System.out.println(taskTwo.get());
    }
}
