package ylab.taskTwo.stats_accumulator;

public class StatsAccumulatorImpl implements StatsAccumulator {

    private int count = 0;
    private int min = 0;
    private int max = 0;
    private int sumAllElement = 0;
    private double avg = 0;

    @Override
    public void add(int value) {
        count++;
        sumAllElement += value;
        avg = (double) sumAllElement / count;
        if (count == 1) {   //при первом добавлении присвоить значения обоим
            min = value;
            max = value;
        } else {            //при последующем добавлении уже выбирать мин и макс
            if (value > max)
                max = value;
            else if (value < min) min = value;
        }
    }

    @Override
    public int getMin() {
        return min;
    }

    @Override
    public int getMax() {
        return max;
    }

    @Override
    public int getCount() {
        return count;
    }

    @Override
    public Double getAvg() {
        return avg;
    }
}

