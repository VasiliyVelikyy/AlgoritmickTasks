package utils;

import java.util.ArrayList;
import java.util.List;

public class ChunkSplitter {
    public static <T> List<List<T>> splitArrayIntoChunks(T[] array, int chunkSize) {
        List<List<T>> result = new ArrayList<>();

        for (int i = 0; i < array.length; i += chunkSize) {
            List<T> chunk = new ArrayList<>();
            for (int j = i; j < Math.min(i + chunkSize, array.length); j++) {
                chunk.add(array[j]);
            }
            result.add(chunk);
        }

        return result;
    }
}
