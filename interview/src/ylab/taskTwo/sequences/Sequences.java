package ylab.taskTwo.sequences;

public interface Sequences extends SequenceGenerator {

    /**
     * метод проверки на границы последоватльности и вывода на экран
     *
     * @param n-     введенное число последоватльности
     * @param result - проверяемый результат
     */
    void checkAndPrintElement(int result, int n) throws SequenceException;

    /**
     * метод вывода на экран последовательности
     *
     * @param result - выводимый результат
     */
    void printElement(int result);

    /**
     * метод проверки на границы последоватльности
     *
     * @param n-     введенное число последоватльности
     * @param result - проверяемый результат
     */
    void checkSequencesBound(int result, int n) throws SequenceException;
}
