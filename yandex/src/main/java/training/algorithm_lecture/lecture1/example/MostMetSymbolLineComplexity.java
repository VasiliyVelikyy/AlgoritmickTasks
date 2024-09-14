package training.algorithm_lecture.lecture1.example;

import java.util.HashMap;
import java.util.Map;

//Сложность алгоритма O(N)
// Затраченная память O(k) так как k<N и k количество элементов в словаре. Всю строку нам не надо хранить
public class MostMetSymbolLineComplexity implements MostMetSymbol {
    @Override
    public char process(String string) {
        if (string == null
                || string.isBlank()
                || string.isEmpty()) {
            return ' ';
        }
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
