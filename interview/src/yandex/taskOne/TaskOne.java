package yandex.taskOne;

import java.util.*;
import java.util.stream.Collectors;

//есть мультимапа
// 1->[0,1,2]
//2->[3,4]
//Требуеться: развернуть мапу с использованием StreamApi (можем считать что коллизий не возникает))
// 0->1; 1->1 2->1; 3->2; 4->2;
public class TaskOne {
    public static void main(String[] args) {
        Map<Integer, List<Long>> inputMap = new HashMap<>();
        inputMap.put(1, Arrays.asList(0L, 1L, 2L));
        inputMap.put(2, Arrays.asList(3L, 4L));

        // Map<Long,Integer> outputMap=?

        Map<Long, Integer> outputMap = inputMap.entrySet().stream()
                .flatMap(entry -> {
                    Integer key = entry.getKey();
                    List<Long> value = entry.getValue();
                    return value.stream().map(num -> Map.entry(num, key));
                })
                .collect(Collectors.toMap(Map.Entry::getKey, Map.Entry::getValue));

        System.out.println(outputMap);
    }
}



