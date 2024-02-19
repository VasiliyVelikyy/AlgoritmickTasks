package ylab.taskTwo.sequences;

//Последовательности A - J заданы в виде нескольких значений следующим образом
//A. 2, 4, 6, 8, 10...
//B. 1, 3, 5, 7, 9...
//C. 1, 4, 9, 16, 25...
//D. 1, 8, 27, 64, 125...
//E. 1, -1, 1, -1, 1, -1...
//F. 1, -2, 3, -4, 5, -6...
//G. 1, -4, 9, -16, 25....
//H. 1, 0, 2, 0, 3, 0, 4....
//I. 1, 2, 6, 24, 120, 720...
//J. 1, 1, 2, 3, 5, 8, 13, 21…
//Необходимо найти закономерности, по которым эти последовательности
//сформированы и реализовать следующий интерфейс, каждый метод которого
//принимает число N и выводит в консоль N элементов соответствующей
//последовательности. Каждый элемент можно выводить с новой строки

public class SequencesImpl implements Sequences {
    private static final short PATTERN_A = 2;
    private static final short PATTERN_B = 2;
    private static final short PATTERN_D = 3;
    private static final byte PATTERN_E = 1;
    private static final byte PATTERN_F = 1;

    private static final String ERROR_MESSAGE = "Результат последовательностей выходит за рамки результирующего типа данных.\n Понизте число последовательностей. " +
            "Вы ввели %s значений последовательности";

    @Override
    public void a(int n) {
        System.out.print("A. ");
        try {
            byte result = 0;
            for (int i = 1; i <= n; i++) {
                result += PATTERN_A;
                checkAndPrintElement(result, n);
            }
            System.out.println();
        } catch (SequenceException e) {
            System.out.println(e.getMessage());
        }
    }


    @Override
    public void b(int n) {
        try {
            System.out.print("B. ");
            byte result = -1;
            for (int i = 1; i <= n; i++) {
                result += PATTERN_B;
                checkAndPrintElement(result, n);
            }
            System.out.println();
        } catch (SequenceException e) {
            System.out.println(e.getMessage());
        }
    }

    @Override
    public void c(int n) {
        try {
            short patternC = 3;
            System.out.print("C. ");
            byte result = 1;
            for (int i = 1; i <= n; i++) {
                checkAndPrintElement(result, n);
                result += patternC;
                patternC += 2;
            }
            System.out.println();
        } catch (SequenceException e) {
            System.out.println(e.getMessage());
        }
    }

    @Override
    public void d(int n) {
        try {
            System.out.print("D. ");
            short result;
            for (int i = 1; i <= n; i++) {
                result = (short) Math.pow(i, PATTERN_D);
                checkAndPrintElement(result, n);
            }
            System.out.println();
        } catch (SequenceException e) {
            System.out.println(e.getMessage());
        }
    }

    @Override
    public void e(int n) {
        System.out.print("E. ");
        byte result;
        for (int i = 1; i <= n; i++) {//здесь ексепшн не нужен так как результат не выйдет за рамки byte
            result = (byte) Math.pow(-1, PATTERN_E + i);
            printElement(result);
        }
        System.out.println();

    }

    @Override
    public void f(int n) {
        try {
            System.out.print("F. ");
            byte result;
            for (int i = 1; i <= n; i++) {
                result = (byte) (Math.pow(-1, PATTERN_F + i) * i);
                if (result == -128 || result == 127) throw new SequenceException(String.format(ERROR_MESSAGE, n));
                printElement(result);
            }
            System.out.println();
        } catch (SequenceException e) {
            System.out.println(e.getMessage());
        }

    }

    @Override
    public void g(int n) {
        try {
            byte patternG = 3;
            System.out.print("G. ");
            byte count = 1;
            byte result = 1;
            for (int i = 1; i <= n; i++) { //не придумал лучше как захардкодить случай когда результат выходит за интервалы byte
                if (result == 112 ) throw new SequenceException(String.format(ERROR_MESSAGE, n));
                printElement(result);
                count += patternG;
                result = (byte) (Math.pow(-1, i) * count);
                patternG += 2;
            }
            System.out.println();
        } catch (SequenceException e) {
            System.out.println(e.getMessage());
        }
    }

    @Override
    public void h(int n) {
        try {
            System.out.print("H. ");
            byte result;
            byte count = 0;
            for (int i = 1; i <= n; i++) {
                if (i % 2 == 0)
                    result = 0;
                else {
                    count++;
                    result = count;
                }
                checkAndPrintElement(result, n);
            }
            System.out.println();
        } catch (SequenceException e) {
            System.out.println(e.getMessage());
        }
    }

    @Override
    public void i(int n) {
        try {
            System.out.print("I. ");
            short result = 1;
            for (int i = 1; i <= n; i++) {
                result = (short) (result * i);
                checkAndPrintElement(result, n);
            }
            System.out.println();
        } catch (SequenceException e) {
            System.out.println(e.getMessage());
        }
    }

    @Override
    public void j(int n) {
        try {
            System.out.print("J. ");
            byte[] retVal = new byte[n];
            retVal[0] = 1;
            retVal[1] = 1;
            for (int i = 0; i < n; ++i) {
                if (i == 0 || i == 1) {
                    printElement(retVal[i]);
                    continue;
                }
                retVal[i] = (byte) (retVal[i - 1] + retVal[i - 2]);
                checkAndPrintElement(retVal[i], n);
            }
            System.out.println();
        } catch (SequenceException e) {
            System.out.println(e.getMessage());
        }
    }

    @Override
    public void checkAndPrintElement(int result, int n) throws SequenceException {
        checkSequencesBound(result, n);
        printElement(result);

    }

    @Override
    public void checkSequencesBound(int result, int n) throws SequenceException {
        if (result < 0) throw new SequenceException(String.format(ERROR_MESSAGE, n));
    }

    public void printElement(int result) {
        System.out.print(result + ", ");
    }
}
