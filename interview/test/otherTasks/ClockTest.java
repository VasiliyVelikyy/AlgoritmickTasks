package otherTasks;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class ClockTest {
    Clock clock = new Clock();

    @Test
    void maximumTime() {
        var actual = clock.maximumTime("2?:?0");
        assertEquals("23:50", actual);
    }

    @Test
    void maximumTime2() {
        var actual = clock.maximumTime("0?:3?");
        assertEquals("09:39", actual);
    }

    @Test
    void maximumTime3() {
        var actual = clock.maximumTime("1?:22");
        assertEquals("19:22", actual);
    }

    @Test
    void maximumTime4() {
        var actual = clock.maximumTime("?1:2?");
        assertEquals("21:29", actual);
    }
}