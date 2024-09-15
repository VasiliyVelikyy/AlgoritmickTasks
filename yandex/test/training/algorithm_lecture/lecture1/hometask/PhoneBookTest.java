package training.algorithm_lecture.lecture1.hometask;

import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

class PhoneBookTest {
    PhoneBook phoneBook = new PhoneBook();

    @Test
    void process1() {
        List<String> answers = phoneBook.getAnswersForNumbers(
                Arrays.asList(
                        "8(495)430-23-97",
                        "+7-4-9-5-43-023-97",
                        "4-3-0-2-3-9-7",
                        "8-495-430"));
        assertEquals("YES", answers.get(0));
        assertEquals("YES", answers.get(1));
        assertEquals("NO", answers.get(2));
    }

    @Test
    void process2() {
        List<String> answers = phoneBook.getAnswersForNumbers(
                Arrays.asList(
                        "86406361642",
                        "83341994118",
                        "86406361642",
                        "83341994118"));
        assertEquals("NO", answers.get(0));
        assertEquals("YES", answers.get(1));
        assertEquals("NO", answers.get(2));
    }

    @Test
    void process3() {
        List<String> answers = phoneBook.getAnswersForNumbers(
                Arrays.asList(
                        "+78047952807",
                        "+78047952807",
                        "+76147514928",
                        "88047952807"));
        assertEquals("YES", answers.get(0));
        assertEquals("NO", answers.get(1));
        assertEquals("YES", answers.get(2));
    }
}