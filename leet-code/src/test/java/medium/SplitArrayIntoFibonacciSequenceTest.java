package medium;

import medium.fibonacci.SplitArrayIntoFibonacciSequence;
import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;


class SplitArrayIntoFibonacciSequenceTest {

    @Test
    void splitIntoFibonacci() {
        SplitArrayIntoFibonacciSequence solution = new SplitArrayIntoFibonacciSequence();
        List<Integer> actual = solution.splitIntoFibonacci("1101111");
        List<Integer> expected = Arrays.asList(11, 0, 11, 11);
        assertEquals(actual, expected);

        actual = solution.splitIntoFibonacci("112358130");
        expected = List.of();
        assertEquals(actual, expected);

        actual = solution.splitIntoFibonacci("0123");
        expected = List.of();
        assertEquals(actual, expected);

    }
}