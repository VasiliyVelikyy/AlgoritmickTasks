package ylab.taskTwo.stats_accumulator;

public class StatsAccumulatorTest {
    public static void main(String[] args) {
        StatsAccumulator s =new StatsAccumulatorImpl(); // как то создается
        System.out.println("First step:");
        s.add(1);
        s.add(2);
        System.out.println("getAvg: "+s.getAvg()); // 1.5 - среднее арифметическое  элементов

        s.add(0);
        System.out.println("getMin: "+s.getMin()); // 0 - минимальное из переданных    значений

        s.add(3);
        s.add(8);
        System.out.println("getMax: "+s.getMax()); // 8 - максимальный из переданных
        System.out.println("getCount: "+s.getCount()); // 5 - количество переданных элементов
        System.out.println("Second step: ");
        s.add(46);
        s.add(44);
        s.add(-36);
        s.add(-34);
        s.add(31);
        System.out.println("getAvg: "+s.getAvg()); // 6.5 - среднее арифметическое  элементов
        System.out.println("getMin: "+s.getMin()); // -36 - минимальное из переданных    значений
        System.out.println("getMax: "+s.getMax()); // 46 - максимальный из переданных
        System.out.println("getCount: "+s.getCount()); // 10 - количество переданных элементов

    }
}
