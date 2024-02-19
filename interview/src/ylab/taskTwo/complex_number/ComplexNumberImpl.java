package ylab.taskTwo.complex_number;

//Complex Numbers
//Реализовать класс, описывающий комплексное число (действительная и мнимая часть
//должны иметь точность double). Должны быть доступны следующие операции:
//1. Cоздание нового числа по действительной части (конструктор с 1
//параметром)
//2. Создание нового числа по действительной и мнимой части (конструктор
//с 2 параметрами)
//3. Сложение
//4. Вычитание
//5. Умножение
//6. Операция получения модуля
//7. преобразование в строку (toString)
//(арифметические действия должны создавать новый экземпляр класса)
//Написать код, демонстрирующий работу с созданными классами

public class ComplexNumberImpl implements ComplexNumber {
    private double realPart; //действительная часть
    private double imaginaryPart; //мнимая часть


    public ComplexNumberImpl(double realPart) {
        this.realPart = realPart;
    }

    public ComplexNumberImpl(double realPart, double imaginaryPart) {
        this.realPart = realPart;
        this.imaginaryPart = imaginaryPart;
    }

    //нет смысла в методах ариф операций создавать экземпляр по конструктору с 1 параметром если newImaginaryPart=0, ведь при инициализации экземпляра
    //он все равно будет 0
    public ComplexNumber sum(ComplexNumber num) {
        double newRealPart = this.realPart + num.getRealPart();
        double newImaginaryPart = this.imaginaryPart + num.getImaginaryPart();
        return new ComplexNumberImpl(newRealPart, newImaginaryPart);
    }

    public ComplexNumber diff(ComplexNumber num) {
        double newRealPart = this.realPart - num.getRealPart();
        double newImaginaryPart = this.imaginaryPart - num.getImaginaryPart();
        return new ComplexNumberImpl(newRealPart, newImaginaryPart);
    }

    public ComplexNumber multiplication(ComplexNumber num) {
        double newRealPart = this.realPart * num.getRealPart();
        double newImaginaryPart = this.imaginaryPart * num.getImaginaryPart();
        return new ComplexNumberImpl(newRealPart, newImaginaryPart);
    }

    public double getModule() {
        return Math.sqrt(realPart * realPart + imaginaryPart * imaginaryPart);
    }

    @Override
    public String toString() {
        return "ComplexNumberImpl{" +
                "realPart=" + realPart +
                ", imaginaryPart=" + imaginaryPart +
                '}';
    }

    public double getRealPart() {
        return realPart;
    }

    public double getImaginaryPart() {
        return imaginaryPart;
    }
}

