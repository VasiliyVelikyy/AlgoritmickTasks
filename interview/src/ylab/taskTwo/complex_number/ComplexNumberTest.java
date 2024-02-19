package ylab.taskTwo.complex_number;

public class ComplexNumberTest {

    public static void main(String[] args) {
        ComplexNumber numberOne = new ComplexNumberImpl(3, -1);
        ComplexNumber numberTwo = new ComplexNumberImpl(-2, 3);
        ComplexNumber numberThree = new ComplexNumberImpl(-2);

        System.out.println("Operation sum: "+numberOne.sum(numberTwo).toString());
        System.out.println("Operation different: "+numberOne.diff(numberTwo).toString());
        System.out.println("Operation multiplication: "+numberOne.multiplication(numberTwo).toString());
        System.out.println("Operation get module: "+numberOne.getModule()+" for complex number: "+numberOne.toString());
    }
}
