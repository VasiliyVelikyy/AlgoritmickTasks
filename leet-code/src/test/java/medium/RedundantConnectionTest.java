package medium;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class RedundantConnectionTest {
    RedundantConnection solution = new RedundantConnection();
    @Test
    void findRedundantConnection() {
       int[] answer= solution.findRedundantConnection(new int[][]{
                new int[]{1,2},
                new int[]{1,3},
                new int[]{2,3}});
       assertArrayEquals(new int[]{2,3},answer);
    }
}