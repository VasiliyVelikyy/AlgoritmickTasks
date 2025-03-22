package medium;

import java.util.*;
import java.util.stream.Collectors;

//1647. Minimum Deletions to Make Character Frequencies Unique
/*A string s is called good if there are no two different characters in s that have the same frequency.

Given a string s, return the minimum number of characters you need to delete to make s good.

The frequency of a character in a string is the number of times it appears in the string. For example, in the string "aab", the frequency of 'a' is 2, while the frequency of 'b' is 1.



Example 1:

Input: s = "aab"
Output: 0
Explanation: s is already good.
Example 2:

Input: s = "aaabbbcc"
Output: 2
Explanation: You can delete two 'b's resulting in the good string "aaabcc".
Another way it to delete one 'b' and one 'c' resulting in the good string "aaabbc".
Example 3:

Input: s = "ceabaacb"
Output: 2
Explanation: You can delete both 'c's resulting in the good string "eabaab".
Note that we only care about characters that are still in the string at the end (i.e. frequency of 0 is ignored).*/
public class MinimumDeletionsToMakeCharacterFrequenciesUnique {

    //my Solution
    //If use TreeMap, Runtime will be 127ms Beats 5.08%of users with Java  and Memory 44.50MB Beats 64.77%of users with Java
    //Runtime 53ms Beats 20.10%of users with Jav
    //Memory 44.79MB Beats 23.01%of users with Java
    public int minDeletions(String s) {
        Map<Character, Integer> map = new HashMap<>();
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            map.put(c, map.getOrDefault(c, 0) + 1);
        }
        int count = 0;


        List<Integer> sortedList = map.values().stream().sorted((o1, o2) -> {
            if (o1 < o2) return 1;
            else if (o1 > o2) return -1;
            return 0;
        }).collect(Collectors.toList());

        for (int i = 0; i < sortedList.size() - 1; i++) {
            if (sortedList.get(i) - sortedList.get(i + 1) == 0) {
                for (int j = i + 1; j < sortedList.size(); j++) {
                    if (sortedList.get(i) != 0) {
                        if (sortedList.get(i).intValue() == sortedList.get(j).intValue()) {
                            count++;
                            sortedList.set(j, sortedList.get(i) - 1);
                        }
                    }
                }
            }
        }
        return count;
    }


//    public int minDeletions(String s) {
//        int[] letters = new int[26];
//        for (char c : s.toCharArray()) {
//            System.out.println("a is" + 'a' + "char is" + c);
//            letters[c - 'a']++;
//        }
//        Arrays.sort(letters);
//        int delCount = 0;
//        for (int i = 24; i >= 0; i--) {
//            if (letters[i] == 0) break;
//            if (letters[i] >= letters[i + 1]) {
//                int prev = letters[i];
//                letters[i] = Math.max(0, letters[i + 1] - 1);
//                delCount += prev - letters[i];
//            }
//        }
//        return delCount;
//    }


    //other solution
    //Runtime 50ms Beats 27.46%of users with Java
    //Memory 44.58MB Beats 49.64%of users with Java
    //Time Complexity: O(n), as you only iterate through the list once.
    //Space Complexity: O(n)), to store the frequencies in cnt and the used frequencies in used_frequencies.
//    public int minDeletions(String s) {
//        Map<Character, Integer> map = new HashMap<>();
//        Set<Integer> checkSet = new HashSet<>();
//        int countDel = 0;
//        for (int i = 0; i < s.length(); i++) {
//            char c = s.charAt(i);
//            map.put(c, map.getOrDefault(c, 0) + 1);
//        }
//
//        for (int i : map.values()) {
//            while (i > 0 && checkSet.contains(i)) {
//                i--;
//                countDel++;
//            }
//            checkSet.add(i);
//        }
//        return countDel;
//    }

    //other solution Sorting Algorithm 2/3: Sort and Minimize
    //Runtime 55ms Beats 16.58%of users with Java
    //Memory Details 44.48MB Beats 64.77%of users with Java
//    public int minDeletions(String s) {
//        Map<Character, Integer> cnt = new HashMap<>();
//        for (char c : s.toCharArray()) {
//            cnt.put(c, cnt.getOrDefault(c, 0) + 1);
//        }
//        int deletions = 0;
//        Set<Integer> usedFrequencies = new HashSet<>();
//        List<Integer> sortedFreqs = new ArrayList<>(cnt.values());
//        Collections.sort(sortedFreqs, Collections.reverseOrder());
//        for (int freq : sortedFreqs) {
//            if (!usedFrequencies.contains(freq)) {
//                usedFrequencies.add(freq);
//                continue;
//            }
//            while (freq > 0 && usedFrequencies.contains(freq)) {
//                freq--;
//                deletions++;
//            }
//            usedFrequencies.add(freq);
//        }
//        return deletions;
//    }

    //other solutio Heap / Priority Queue 3/3: Prioritize Frequencies to Adjust
    //Runtime  49ms Beats 29.43%of users with Java
    //Memory 44.56MB Beats 49.64%of users with Java
//    public int minDeletions(String s) {
//        Map<Character, Integer> frequencyMap = new HashMap<>();
//
//        // Iterate through the characters in the input string 's'.
//        for (char c : s.toCharArray()) {
//            frequencyMap.put(c, frequencyMap.getOrDefault(c, 0) + 1);
//        }
//
//        PriorityQueue<Integer> maxHeap = new PriorityQueue<>((a, b) -> b - a);
//        maxHeap.addAll(frequencyMap.values());
//
//        int count = 0;
//
//        // Continue as long as there are at least two frequencies in the max-heap.
//        while (maxHeap.size() > 1) {
//            int top = maxHeap.poll(); // Get the character frequency with the highest count.
//            // Check if the next character in the max-heap has the same frequency as 'top' (and it's not zero).
//            if (maxHeap.peek() != null && maxHeap.peek() == top && top != 0) {
//                count++; // Increment the deletion count.
//                maxHeap.add(top - 1); // Decrease 'top' frequency by 1 and push it back into the max-heap.
//            }
//        }
//        // Return the minimum number of deletions required to make the string "good."
//        return count;
//    }
}
