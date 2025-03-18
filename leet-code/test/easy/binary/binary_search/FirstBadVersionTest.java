package easy.binary.binary_search;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class FirstBadVersionTest {
    FirstBadVersion solution = new FirstBadVersion();

//    @Test
//    void firstBadVersion() {
//        int actual = solution.firstBadVersion(5);
//        assertEquals(4, actual);
//    }
//
//    @Test
//    void firstBadVersion2() {
//        int actual = solution.firstBadVersion(1);
//        assertEquals(1, actual);
//    }
//
//    @Test
//    void firstBadVersion3() {
//        int actual = solution.firstBadVersion(6);
//        assertEquals(4, actual);
//     }

    @Test
    void firstBadVersion4() {
        int actual = solution.firstBadVersion(2126753390);
        assertEquals(1702766719, actual);
    }
}