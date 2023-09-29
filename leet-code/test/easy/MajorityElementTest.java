package easy;

import easy.MajorityElement;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MajorityElementTest {

    @Test
    void majorityElement() {
        MajorityElement solution = new MajorityElement();
        int expected = 3;
        int actual = solution.majorityElement(new int[]{3, 2, 3});
        assertEquals(expected, actual);

        expected = 2;
        actual = solution.majorityElement(new int[]{2, 2, 1, 1, 1, 2, 2});
        assertEquals(expected, actual);
    }
}