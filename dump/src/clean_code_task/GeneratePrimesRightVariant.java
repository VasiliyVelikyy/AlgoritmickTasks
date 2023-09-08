package clean_code_task;

//переработанный вариант Роберта Мартина
/**
 * Класс генерирует простые числа до максимального значения, заданного
 * пользователем, по алгоритму "Решета Эратосфена".
 * Берем массив целых чисел, начиная с 2, и вычеркиваем
 * из него все числа, кратные 2. Находим следующее невычеркнутое число
 * и вычеркиваем все числа, кратные ему. Повторяем до тех пор, пока из массива
 * не будут вычеркнуты все кратные.
 */
public class GeneratePrimesRightVariant {

    private static boolean[] crossedOut;
    private static int[] result;
    public static int[] generatePrimes(int maxValue)
    {
        if (maxValue < 2)
            return new int[0];
        else
        {
            uncrossIntegersUpTo(maxValue);
            crossOutMultiples();
            putUncrossedIntegersIntoResult();
            return result;
        }
    }
    private static void uncrossIntegersUpTo(int maxValue)
    {
        crossedOut = new boolean[maxValue + 1];
        for (int i = 2; i < crossedOut.length; i++)
            crossedOut[i] = false;
    }
    private static void crossOutMultiples()
    {
        int limit = determineIterationLimit();
        for (int i = 2; i <= limit; i++)
            if (notCrossed(i))
                crossOutMultiplesOf(i);
    }
    private static int determineIterationLimit()
    {
        // Каждое кратное в массиве имеет простой множитель, больший либо равный
        // квадратному корню из размера массива. Следовательно, вычеркивать элементы,
        // кратные числам, превышающих квадратный корень, не нужно.
        double iterationLimit = Math.sqrt(crossedOut.length);
        return (int) iterationLimit;
    }
    private static void crossOutMultiplesOf(int i)
    {
        for (int multiple = 2*i; multiple < crossedOut.length;multiple += i)
        crossedOut[multiple] = true;
    }
    private static boolean notCrossed(int i)
    {
        return crossedOut[i] == false;
    }
    private static void putUncrossedIntegersIntoResult()
    {
        result = new int[numberOfUncrossedIntegers()];
        for (int j = 0, i = 2; i < crossedOut.length; i++)
            if (notCrossed(i))
                result[j++] = i;
    }
    private static int numberOfUncrossedIntegers()
    {
        int count = 0;
        for (int i = 2; i < crossedOut.length; i++)
            if (notCrossed(i))
                count++;
        return count;
    }
}
