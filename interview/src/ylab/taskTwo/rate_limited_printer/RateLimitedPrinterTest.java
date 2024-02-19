package ylab.taskTwo.rate_limited_printer;

import java.util.Date;

public class RateLimitedPrinterTest {

    public static void main(String[] args) {
        RateLimitedPrinter rateLimitedPrinter = new RateLimitedPrinterImpl(2000);
        for (int i = 0; i < 1_000_000_000; i++) {
            rateLimitedPrinter.print(new Date().toString());
        }
        //long currentTime = System.currentTimeMillis(); // возвращает текущее
// время
    }
}
