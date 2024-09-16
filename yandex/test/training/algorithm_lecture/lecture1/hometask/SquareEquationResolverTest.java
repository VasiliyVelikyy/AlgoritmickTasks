package training.algorithm_lecture.lecture1.hometask;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class SquareEquationResolverTest {

    @Test
    void process() {
        SquareEquationResolver resolver = new SquareEquationResolver();
        String actual = resolver.process(3, 4, 5);
        assertEquals("7", actual);
    }

    @Test
    void process2() {
        SquareEquationResolver resolver = new SquareEquationResolver();
        String actual = resolver.process(1, 2, -3);
        assertEquals("NO SOLUTION", actual);
    }

    @Test
    void process3() {
        SquareEquationResolver resolver = new SquareEquationResolver();
        String actual = resolver.process(1, 2, 3);
        assertEquals("7", actual);
    }
}