package ylab.taskTwo.snils_validator;

public class SnilsValidatorImpl implements SnilsValidator {
    int[] position = {9, 8, 7, 6, 5, 4, 3, 2, 1};// массив для удобства итерации по разрядам

    @Override
    public boolean validate(String snils) {
        snils = removeDashAndSpace(snils);
        short factSum = 0;
        if (snils.length() != 11) return false; //прервать дальнейшее выполнение(снилс не валиден)

        for (int i = 0; i < position.length; i++) {
            char retVal = snils.charAt(i);
            if (!Character.isDigit(retVal))
                return false;//прервать дальнейшее выполнение(снилс не валиден)
            factSum += Character.digit(retVal, 10) * position[i];
        }
        return checkSum(factSum, snils);
    }

    /**
     * Метод проверки фактической суммы и суммы из снилса * @param factSum
     * -получившаяся сумма * @param snils- вводимый номер снилса
     */
    private boolean checkSum(short factSum, String snils) {
        String sumStr = fetchControlSumFromSnils(snils);
        for (int i = 0; i < sumStr.length(); i++) {
            char retVal = sumStr.charAt(i);
            if (!Character.isDigit(retVal))
                return false;//прервать дольнейшее выполнение(снилс не валиден)
        }
        short controlSum = Short.parseShort(sumStr);
        return compareFactAndControlSum(factSum, controlSum);
    }

    /**
     * Метод извлечения контольной суммы из снилса
     *
     * @param snils -номер снилса
     */
    private String fetchControlSumFromSnils(String snils) {
        return snils.substring(snils.length() - 2, snils.length());
    }

    /**
     * Метод сравнения контрольной суммы з снилса( последние 2 цифры) и фактической
     * суммы
     *
     * @param factSum    -получившаяся сумма
     * @param controlSum -сумма из номер снилса
     */
    private boolean compareFactAndControlSum(short factSum, short controlSum) {
        if (factSum < 100) {
            return factSum == controlSum;
        } else if (factSum == 100) {
            return controlSum == 0;
        } else if (factSum > 100) {
            int ostatok = factSum % 101;
            if (ostatok == 100) {
                return controlSum == 0;
            } else
                return ostatok == controlSum;
        }
        return false;
    }

    /**
     * Метод для удаления тире и пробелов в вводимом снилсе
     *
     * @param snils- вводимый номер снилса
     * @return -отформатированная строка
     */
    private String removeDashAndSpace(String snils) {
        snils = snils.trim();
        return snils.replaceAll("-", "").replaceAll(" ", "");
    }
}
