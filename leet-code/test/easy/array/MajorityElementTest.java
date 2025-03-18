package easy.array;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class MajorityElementTest {

    MajorityElement solution = new MajorityElement();

    @Test
    void majorityElement() {
        int expected = 3;
        int actual = solution.majorityElement(new int[]{3, 2, 3});
        assertEquals(expected, actual);

    }

    @Test
    void majorityElement2() {
        int expected = 2;
        int actual = solution.majorityElement(new int[]{2, 2, 1, 1, 1, 2, 2});
        assertEquals(expected, actual);
    }

}