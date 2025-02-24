package yandex.algorithms.traveling_salesman;

import java.text.MessageFormat;
import java.util.ArrayList;
import java.util.List;

//https://thecode.media/path-js/
//https://thecode.media/path-rec/
public class ShortestPath {
    private List<List<Integer>> results = new ArrayList<>();
    // номер самого короткого маршрута
    int minCounter;


    //когда мы знаем структуру массива bruteForceWhenKnownStructure
    public int bruteForceWhenKnownStructure(int[][] values) {
        int minPath = Integer.MAX_VALUE;
        int countPath = 0;
        int minNumberPath = 0;
        List<String> paths = new ArrayList<>();

        for (int i = 0; i <= 4; i++) {
            for (int j = 0; j <= 4; j++) {
                for (int k = 0; k <= 4; k++) {
                    for (int l = 0; l <= 4; l++) {
                        for (int m = 0; m <= 4; m++) {

                            if ((i != j) && (i != k) && (i != l) && (i != m) && //проверка чтобы мы не попали в одну и туже точку
                                    (j != k) && (j != l) && (j != m) &&
                                    (k != l) && (k != m) &&
                                    (l != m)) {
                                paths.add((i + 1) + "->" + (j + 1) + "->" + (k + 1) + "->" + (l + 1) + "->" + (m + 1));  //какой путь
                                System.out.print(paths.get(countPath));

                                int currentValPath = values[i][j] + values[j][k] + values[k][l] + values[l][m];
                                System.out.println(" valuePath: " + currentValPath); // значение пути
                                if (minPath > currentValPath) {
                                    minPath = currentValPath;
                                    minNumberPath = countPath;
                                }
                                countPath++;
                            }
                        }
                    }
                }
            }
        }
        System.out.println(MessageFormat.format("We find min path. Path : {0} ,path value: {1}", paths.get(minNumberPath), minPath));

        return minPath;
    }


}
