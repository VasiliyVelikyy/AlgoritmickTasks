package easy.array;

import java.util.ArrayList;
import java.util.List;

public class PascalsTriangle2 {

    //My solution
    //Runtime 1 ms Beats 67.40%
    // Memory41.20 MB Beats65.35%
    public List<Integer> getRow(int rowIndex) {
        rowIndex++;
        List<List<Integer>> result = new ArrayList<>();

        for (int i = 0; i < rowIndex; i++) {
            List<Integer> row = new ArrayList<>();
            for (int j = 0; j <= i; j++) {
                if (j == 0 || j == i) {
                    row.add(1);
                } else {
                    var prevRow = result.get(i - 1);
                    row.add(prevRow.get(j) + prevRow.get(j - 1));
                }
            }
            result.add(row);
        }
        return result.get(--rowIndex);
    }

    //Other solution
    //Runtime 1 ms Beats 67.40%
    // Memory 41.44 MB Beats19.60%
    // public List<Integer> getRow(int rowIndex) {
    //     //because rowIndex 0 = [1] position in triangle
    //     var lists = generate(++rowIndex);
    //     return lists.get(--rowIndex);
    // }
    //
    // private List<List<Integer>> generate(int rowIndex) {
    //     List<List<Integer>> result = new ArrayList<>();
    //     if (rowIndex == 0) {
    //         return result;
    //     }
    //
    //     if (rowIndex == 1) {
    //         return new ArrayList<>() {{
    //             add(List.of(1));
    //         }};
    //     }
    //
    //     result = generate(rowIndex - 1);
    //     List<Integer> prev = result.get(rowIndex - 2);
    //     List<Integer> curr = new ArrayList<>();
    //     curr.add(1);
    //
    //     for (int i = 1; i < rowIndex - 1; i++) {
    //         curr.add(i, prev.get(i - 1) + prev.get(i));
    //     }
    //     curr.add(1);
    //     result.add(curr);
    //     return result;
    // }
}
