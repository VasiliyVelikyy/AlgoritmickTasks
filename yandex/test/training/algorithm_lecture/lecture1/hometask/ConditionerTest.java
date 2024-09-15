package training.algorithm_lecture.lecture1.hometask;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ConditionerTest {
    Conditioner conditioner = new Conditioner();

    @Test
    void processHeat() {
        short actual = conditioner.getTemperature((short) 10, (short) 20, "heat");
        assertEquals(20, actual);
    }

    @Test
    void processFreeze() {
        short actual = conditioner.getTemperature((short) 10, (short) 20, "freeze");
        assertEquals(10, actual);
    }

    @Test
    void processAuto() {
        short actual = conditioner.getTemperature((short) 10, (short) 20, "auto");
        assertEquals(20, actual);
    }

    @Test
    void processFan() {
        short actual = conditioner.getTemperature((short) 10, (short) 20, "fan");
        assertEquals(10, actual);
    }

    @Test
    void processNotSupportedOperation() {
        Exception exception = assertThrows(IllegalStateException.class, () ->
                conditioner.getTemperature((short) 10, (short) 20, "test"));

        String expectedMessage = "Conditioner not supported operation test";
        String actualMessage = exception.getMessage();

        assertTrue(actualMessage.contains(expectedMessage));
    }
}