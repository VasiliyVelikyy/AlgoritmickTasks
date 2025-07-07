package easy.number;

public class ExcelSheetColumnNumber {
    //Other solution
    //Runtime 1 ms Beats 93.28%
    // Memory 42.50 MB Beats 30.14%
    public int titleToNumber(String columnTitle) {
        int result = 0;
        for(char c : columnTitle.toCharArray()){
            int d = c - 'A' + 1;
            result = result*26 + d;
        }
        return result;
    }
}
