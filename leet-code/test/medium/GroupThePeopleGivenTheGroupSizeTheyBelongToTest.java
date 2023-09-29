package medium;

import medium.GroupThePeopleGivenTheGroupSizeTheyBelongTo;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class GroupThePeopleGivenTheGroupSizeTheyBelongToTest {

    @Test
    void groupThePeople() {
        GroupThePeopleGivenTheGroupSizeTheyBelongTo solution = new GroupThePeopleGivenTheGroupSizeTheyBelongTo();
        List<List<Integer>> actual = solution.groupThePeople(new int[]{3, 3, 3, 3, 3, 1, 3});
        List<List<Integer>> expected = initExpectedList();
        assertEquals(expected, actual);

        expected = initExpectedList2();
        actual=solution.groupThePeople(new int[]{2,1,3,3,3,2});
        assertEquals(expected,actual);
    }

    private List<List<Integer>> initExpectedList() {
        List<Integer> firstList = new ArrayList<>(Arrays.asList(0, 1, 2));
        List<Integer> secondList = new ArrayList<>(Arrays.asList(3, 4, 6));
        List<Integer> thirdList = new ArrayList<>(Arrays.asList(5));
        List<List<Integer>> allList = new ArrayList<>();
        allList.add(firstList);
        allList.add(secondList);
        allList.add(thirdList);
        return allList;
    }

    private List<List<Integer>> initExpectedList2() {
        List<Integer> firstList = new ArrayList<>(Arrays.asList(0, 5));
        List<Integer> secondList =  new ArrayList<>(Arrays.asList(1));
        List<Integer> thirdList = new ArrayList<>(Arrays.asList(2, 3, 4));
        List<List<Integer>> allList = new ArrayList<>();
        allList.add(firstList);
        allList.add(secondList);
        allList.add(thirdList);
        return allList;
    }
}