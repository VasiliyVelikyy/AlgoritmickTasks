package training.algorithm_lecture.lecture1;

import java.util.Set;
import java.util.stream.Collectors;

//Сложность алгоритма O(N*K) или N*log(n)
public class MostMetSymbolLogLineComplexity implements MostMetSymbol {
    @Override
    public char process(String string) {
        Set<Character> setChars = string.chars()
                .mapToObj(c -> (char) c)
                .collect(Collectors.toSet());

        char[] chars = string.replaceAll(",", "").toCharArray();
        int answerCount = 0;
        char answer = ' ';
        for (char aChar : setChars) {
            int nowCount = 0;
            for (char bChar : chars) {
                if (bChar == aChar) {
                    nowCount++;
                }
            }
            if (nowCount > answerCount) {
                answer = aChar;
                answerCount = nowCount;
            }
        }
        return answer;
    }
}
