package ylab.taskTwo.complex_number;

public interface ComplexNumber {
    /**
     * Взятие действительной части
     */
    double getRealPart();

    /**
     * Взятие мнимой части
     *
     */
    double getImaginaryPart();

    /**
     * Сложение комплексного числа
     *
     * @param num- слагаемое комплексное число
     * @return новый экземпляр комплексного числа
     */
    ComplexNumber sum(ComplexNumber num);

    /**
     * Вычитание комплексного числа
     *
     * @param num- вычитаемое комплексное число
     * @return новый экземпляр комплексного числа
     */
    ComplexNumber diff(ComplexNumber num);

    /**
     * Умножение комплексного числа
     *
     * @param num- умножаемое комплексное число
     * @return новый экземпляр комплексного числа
     */
    ComplexNumber multiplication(ComplexNumber num);

    /**
     * Операция получения модуля комплексного числа
     *
     * @param num- слагаемое комплексное число
     * @return новый экземпляр комплексного числа
     */
    double getModule();
}

