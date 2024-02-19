package ylab.taskTwo.rate_limited_printer;

//Реализовать класс RateLimiterPrinter. Класс имеет конструктор, в который передается
//interval и метод print(), в который передается строка. Класс функционирует по
//следующему принципу: на объекте класса вызывается метод print(). Далее идет
//проверка, когда был последний вывод в консоль. Если интервал (в миллисекундах)
//между последним состоявшимся выводом и текущим выводом больше значения
//interval, переданного в конструктор - то происходит вывод значения. Иначе - не
//происходит, и сообщение отбрасывается. То есть класс ограничивает частоту вывода в
//консоль. Другими словами, сообщение не   будет выводится чаще чем 1 раз в interval
//милисекунд. Реализовать описанный класс.
public class RateLimitedPrinterImpl implements RateLimitedPrinter {
    private int interval;
    private long lastStart = 0;

    public RateLimitedPrinterImpl(int interval) {
        this.interval = interval;
    }

    @Override
    public void print(String message) {
        System.out.println(message);
        lastStart = System.currentTimeMillis();
        slowDown(); //slowDownTwo();

    }


    /**
     * 1 способ - торможение через цикл
     */
    private void slowDown() {
        while (System.currentTimeMillis() - lastStart < interval) {//торможение вывода в цикле пока не пройдет нужный интервал

        }
    }

    /**
     * 2 способ -торможение через Thread.sleep
     */
    private void slowDownTwo() {
        try {
            Thread.sleep(interval);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

}