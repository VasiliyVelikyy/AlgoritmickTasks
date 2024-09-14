package training.algorithm_lecture.lecture1;

import java.util.HashMap;
import java.util.Map;

//Сложность алгоритма O(N)
public class MostMetSymbolLineComplexity implements MostMetSymbol {
    @Override
    public char process(String string) {
        Map<Character, Integer> tempMap = new HashMap<>();

        char[] chars = string.replaceAll(",", "").toCharArray();
        int answCount = 0;
        char answer = ' ';
        for (char aChar : chars) {
            if (!tempMap.containsKey(aChar)) {
                int nowCount = 0;
                for (char bChar : chars) {
                    if (bChar == aChar) {
                        nowCount++;
                    }
                }
                if (nowCount > answCount) {
                    answer = aChar;
                    answCount = nowCount;
                }
                tempMap.put(aChar, nowCount);
            }
        }
        return answer;
    }
}
