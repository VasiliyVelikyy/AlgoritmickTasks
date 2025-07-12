package easy.array;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SummaryRangesTest {
    SummaryRanges solution = new SummaryRanges();

    @Test
    void summaryRanges() {
        var answer = solution.summaryRanges(new int[]{0, 1, 2, 4, 5, 7});
        assertArrayEquals(new String[]{"0->2", "4->5", "7"}, answer.toArray());
    }

    @Test
    void summaryRanges2() {
        var answer = solution.summaryRanges(new int[]{0, 2, 3, 4, 6, 8, 9});
        assertArrayEquals(new String[]{"0", "2->4", "6", "8->9"}, answer.toArray());
    }
}