package easy.array;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

//задача странная, в условии сказано что большинство обязательно равно вхождению ⌊n / 2⌋
//то есть нужно следить за количеством вхождений. Если 6 элементов массива то большинство должно быть больше 3
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

    @Test
    void majorityElement3() {
        int expected = 3;
        int actual = solution.majorityElement(new int[]{3, 3, 2, 3});
        assertEquals(expected, actual);

    }


    @Test
    void majorityElement4() {
        int expected = 5;
        int actual = solution.majorityElement(new int[]{5, 5, 5, 2, 3, 5});
        assertEquals(expected, actual);
    }

}