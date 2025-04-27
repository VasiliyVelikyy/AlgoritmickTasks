package testtask;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class IdealRouteTest {
    IdealRoute solution = new IdealRoute();

    @Test
    void evaluate() {
        int answer = solution.evaluate(7, new int[]{1, 2, 3, 4, 3, 2, 1});
        assertEquals(7, answer);
    }

    @Test
    void evaluate2() {
        int answer =  solution.evaluate(10, new int[]{1, 2, 3, 4, 5, 5, 4, 3, 2, 1});
        assertEquals(10, answer);
    }

    @Test
    void evaluate3() {
        int answer =  solution.evaluate(6, new int[]{1, 2, 3, 1, 2, 3});
        assertEquals(0, answer);
    }

    @Test
    void evaluate4() {
        int answer =  solution.evaluate(3, new int[]{1, 1, 2});
        assertEquals(2, answer);
    }

    @Test
    void evaluate5() {
        int answer =  solution.evaluate(4, new int[]{1, 1,1, 2});
        assertEquals(3, answer);
    }
}