package training.algorithm_lecture.lecture1;

//Сложность алгоритма O(N*N)
public class MostMetSymbolSquareLineComplexity implements MostMetSymbol {

    public char process(String line) {
        char[] chars = line.replaceAll(",", "").toCharArray();
        int answCount = 0;
        char answer = ' ';
        for (char aChar : chars) {
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
        }
        return answer;
    }
}
