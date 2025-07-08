package easy.string;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class IsomorphicStringsTest {
    IsomorphicStrings solution = new IsomorphicStrings();

    @Test
    void isIsomorphic() {
        var actualAnsw = solution.isIsomorphic("egg", "add");
        assertTrue(actualAnsw);
    }

    @Test
    void isIsomorphic2() {
        var actualAnsw = solution.isIsomorphic("foo", "bar");
        assertFalse(actualAnsw);
    }

    @Test
    void isIsomorphic3() {
        var actualAnsw = solution.isIsomorphic("paper", "title");
        assertTrue(actualAnsw);
    }

    @Test
    void isIsomorphic4() {
        var actualAnsw = solution.isIsomorphic("badc", "baba");
        assertFalse(actualAnsw);
    }
}