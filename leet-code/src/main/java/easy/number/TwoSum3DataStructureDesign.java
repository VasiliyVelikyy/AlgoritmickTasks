package easy.number;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/*
170. Two Sum III - Data structure design
* Design and implement a TwoSum class. It should support the following operations: add and find.

add - Add the number to an internal data structure.
find - Find if there exists any pair of numbers which sum is equal to the value.

Example 1:

add(1); add(3); add(5);
find(4) -> true
find(7) -> false
Example 2:

add(3); add(1); add(2);
find(3) -> true
find(6) -> false*/
public class TwoSum3DataStructureDesign {
    public TwoSum twoSumSolution;


    public TwoSum3DataStructureDesign() {
        this.twoSumSolution = new TwoSum();
    }

    public class TwoSum {
        private final List<Integer> list;
        private final Map<Integer, Integer> map;

        public TwoSum() {
            list = new ArrayList<>();
            map= new HashMap<>();
        }

        public void add(int number) {
            list.add(number);
            map.put(number, map.getOrDefault(number, 0) + 1);
        }

        //Other solution O(n)
        public boolean find(int value) {
            for (int num1 : list) {
                int num2 = value - num1;
                if ((num1 == num2 && map.get(num1) > 1) || num1 != num2 && map.containsKey(num2)) {
                    return true;
                }
            }
            return false;
        }

        //My solution O(n *log n)
//        public boolean find(int value) {
//            for (int i = 0; i < list.size(); i++) {
//                int elem = list.get(i);
//                int remainder = value - elem;
//                for (int j = i + 1; j < list.size(); j++) {
//                    if (remainder == list.get(j)) {
//                        return true;
//                    }
//                }
//            }
//            return false;
//        }
    }
}
