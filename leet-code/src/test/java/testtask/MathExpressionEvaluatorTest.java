package testtask;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MathExpressionEvaluatorTest {
    MathExpressionEvaluator solution=new MathExpressionEvaluator();

    @Test
    void evaluate() {
      var answer=  solution.evaluate("-123 + 23");
      assertEquals(-100,answer);
    }

    @Test
    void evaluate2() {
        var answer=  solution.evaluate("-((5 -2) - (3) +2) + 1");
        assertEquals(-1,answer);
    }

    @Test
    void evaluate3() {
        var answer=  solution.evaluate("(1 + -2) + (3-4 - (5-6 - 7)) +8");
        assertEquals(14,answer);
    }

    @Test
    void evaluate4() {
        var answer=  solution.evaluate("--42");
        assertEquals(42,answer);
    }
}