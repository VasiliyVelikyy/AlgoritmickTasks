package easy.array;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class BestTimeToBuyTest {

    BestTimeToBuy solution = new BestTimeToBuy();

    @Test
    void maxProfit1() {
        int actual = solution.maxProfit(new int[]{7, 1, 5, 3, 6, 4});
        assertEquals(5, actual);
    }

    @Test
    void maxProfit2() {
        int actual = solution.maxProfit(new int[]{7, 6, 4, 3, 1});
        assertEquals(0, actual);
    }

    @Test
    void maxProfit3() {
        int actual = solution.maxProfit(new int[]{2, 4, 1});
        assertEquals(2, actual);
    }

    @Test
    void maxProfit4() {
        int actual = solution.maxProfit(new int[]{3, 2, 6, 5, 0, 3});
        assertEquals(4, actual);
    }

}