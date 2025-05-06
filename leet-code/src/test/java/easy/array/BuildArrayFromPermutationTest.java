package easy.array;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class BuildArrayFromPermutationTest {

    BuildArrayFromPermutation solution = new BuildArrayFromPermutation();

    @Test
    void buildArray() {
       int[] actual= solution.buildArray(new int[]{0,2,1,5,3,4});
       assertArrayEquals(new int[]{0,1,2,4,5,3}, actual);
    }

    @Test
    void buildArray2() {
        int[] actual= solution.buildArray(new int[]{5,0,1,2,3,4});
        assertArrayEquals(new int[]{4,5,0,1,2,3}, actual);
    }
}