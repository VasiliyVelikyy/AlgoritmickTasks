package easy.number;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class TwoSum3DataStructureDesignTest {
    TwoSum3DataStructureDesign solution = new TwoSum3DataStructureDesign();

    @Test
    void isPerfectSquare() {
        solution.twoSumSolution.add(1);
        solution.twoSumSolution.add(3);
        solution.twoSumSolution.add(5);
        assertTrue(solution.twoSumSolution.find(4));
        assertFalse(solution.twoSumSolution.find(7));
    }
}