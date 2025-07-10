package utils;

import java.util.List;
import java.util.stream.IntStream;

import static utils.ChunkSplitter.splitArrayIntoChunks;

/**
 * Stub
 */
public class Reader4 {
    int readerSize = 4;
    int chunkPosition = 0;
    List<List<Character>> list;
    boolean isFirstCall = true;

    public int reader4(char[] buf) {
        if (isFirstCall) {
            Character[] objectArray = IntStream.range(0, buf.length)
                    .mapToObj(i -> buf[i])
                    .toArray(Character[]::new);
            list = splitArrayIntoChunks(objectArray, readerSize);
            isFirstCall = false;
        }
        return list.get(chunkPosition++).size();

    }
}
