package clean_code_task;

/**
 * Класс генерирует простые числа в диапазоне до максимального значения,
 * заданного пользователем, по алгоритму "Решета Эратосфена".
 * Алгоритм весьма прост. Берем массив целых чисел, начиная с 2, и вычеркиваем
 * из него все числа, кратные 2. Находим следующее невычеркнутое число
 * и вычеркиваем все его кратные. Повторяем до тех пор, пока не дойдем
 * до квадратного корня верхней границы диапазона.
 *
 * @author vmoskalev
 */
public class GeneratePrimesRemade {
    private static int[] result;

    public static void main(String[] args) {
        printElem(generatePrimes(21));
    }

    public static int[] generatePrimes(int maxValue) {
        if (maxValue < 2)
            return new int[0];
        else
            return genereteValues(maxValue);
    }

    private static int[] genereteValues(int maxValue) {
        boolean[] boolElements = new boolean[maxValue + 1];

        initBoolElements(boolElements);
        removeJunkELements(boolElements);
        definitionIntValues(boolElements);

        return result;
    }

    private static void initBoolElements(boolean[] boolElements) {
        boolElements[0] = boolElements[1] = false;
        for (int i = 2; i < boolElements.length; i++) {
            boolElements[i] = true;
        }
    }


    private static void removeJunkELements(boolean[] boolElements) {
        int limit = definitionLimit(boolElements.length);
        for (int i = 2; i <= limit; i++) {
            if (notCrossed(boolElements[i]))
                crossOutMultiplesElements(boolElements, i);
        }
    }

    private static int definitionLimit(int elementsLength) {
        //определить лимит для перебора равный корню длине массива
        double iterationLimit = Math.sqrt(elementsLength);
        return (int) iterationLimit;
    }

    private static boolean notCrossed(boolean element) {
        return element;
    }

    private static void crossOutMultiplesElements(boolean[] boolElements, int curIndexElem) {
        for (int j = 2 * curIndexElem; j < boolElements.length; j += curIndexElem)
            boolElements[j] = false; // Кратные числа не являются простыми.
    }


    private static void definitionIntValues(boolean[] boolArray) {
        result = new int[getNumberOfUncrossedValues(boolArray)];

        for (int i = 0, j = 0; i < boolArray.length; i++) {
            if (notCrossed(boolArray[i]))
                result[j++] = i;
        }
    }

    private static int getNumberOfUncrossedValues(boolean[] boolArray) {
        int count = 0;
        for (int i = 0; i < boolArray.length; i++) {
            if (boolArray[i])
                count++;
        }
        return count;
    }


    private static void printElem(int[] generatePrimes) {
        for (int a : generatePrimes) {
            System.out.print(a + " ");
        }
    }
}
