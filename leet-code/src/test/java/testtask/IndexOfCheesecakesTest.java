package testtask;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;
class IndexOfCheesecakesTest {
    IndexOfCheesecakes solution=new IndexOfCheesecakes();

    @Test
    void evaluate() {
       var answer= solution.evaluate(new int[]{40,50,60});
       assertEquals(3,answer);
    }

    @Test
    void evaluate2() {
        var answer= solution.evaluate(new int[]{40});
        assertEquals(0,answer);
    }

    @Test
    void evaluate3() {
        var answer= solution.evaluate(new int[]{80,70,60});
        assertEquals(0,answer);
    }
}