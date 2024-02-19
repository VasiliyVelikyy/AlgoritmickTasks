package ylab.taskTwo.snils_validator;

public class SnilsValidatorTest {

    public static void main(String[] args) {
        System.out.println("Check snils  01468870570: " + new SnilsValidatorImpl().validate("01468870570")); // false
        System.out.println("Check snils  90114404441: " + new SnilsValidatorImpl().validate("90114404441")); // true
        System.out.println("Check snils  901-144-044 41: " + new SnilsValidatorImpl().validate("901-144-044 41")); // true
        System.out.println("Check snils  901-144-044 99: " + new SnilsValidatorImpl().validate("901-144-044 99")); // false
        System.out.println("Check snils  9011se4404441: " + new SnilsValidatorImpl().validate("9011se4404441"));// false
        System.out.println("Check snils  112-233-445 95: " + new SnilsValidatorImpl().validate("112-233-445 95"));// true
        System.out.println("Check snils  9011440444123223: " + new SnilsValidatorImpl().validate("9011440444123223")); // false
        System.out.println("Check snils  90114: " + new SnilsValidatorImpl().validate("90114")); // false

    }
}
