package easy.array;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class CrawlerLogFolderTest {

    @Test
    void minOperations1() {
        CrawlerLogFolder solution = new CrawlerLogFolder();
        String[] logs = new String[]{"d1/", "d2/", "../", "d21/", "./"};
        int expected = 2;
        int actual = solution.minOperations(logs);
        assertEquals(expected, actual);
    }

    @Test
    void minOperations2() {
        CrawlerLogFolder solution = new CrawlerLogFolder();
        String[] logs = new String[]{"d1/", "d2/", "./", "d3/", "../", "d31/"};
        int expected = 3;
        int actual = solution.minOperations(logs);
        assertEquals(expected, actual);
    }

    @Test
    void minOperations3() {
        CrawlerLogFolder solution = new CrawlerLogFolder();
        String[] logs = new String[]{"d1/", "../", "../", "../"};
        int expected = 0;
        int actual = solution.minOperations(logs);
        assertEquals(expected, actual);
    }
}