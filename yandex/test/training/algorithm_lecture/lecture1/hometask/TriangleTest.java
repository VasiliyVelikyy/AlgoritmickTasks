package training.algorithm_lecture.lecture1.hometask;

import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.assertEquals;

class TriangleTest {
    Triangle triangle = new Triangle();

    @Test
    void process1() {
        String actual = triangle.evaluateTriangle(Arrays.asList(3, 4, 5));
        assertEquals("YES", actual);
    }

    @Test
    void process2() {
        String actual = triangle.evaluateTriangle(Arrays.asList(3, 5, 4));
        assertEquals("YES", actual);
    }

    @Test
    void process3() {
        String actual = triangle.evaluateTriangle(Arrays.asList(4, 5, 3));
        assertEquals("YES", actual);
    }

    @Test
    void process4() {
        String actual = triangle.evaluateTriangle(Arrays.asList(3, 3, 3));
        assertEquals("YES", actual);
    }

    @Test
    void process5() {
        String actual = triangle.evaluateTriangle(Arrays.asList(5, 5, 11));
        assertEquals("NO", actual);
    }
}