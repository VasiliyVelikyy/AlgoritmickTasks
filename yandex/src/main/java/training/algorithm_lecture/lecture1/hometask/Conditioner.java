package training.algorithm_lecture.lecture1.hometask;

import java.util.Scanner;

public class Conditioner {
    private final static String FREEZE = "freeze";
    private final static String HEAT = "heat";
    private final static String AUTO = "auto";
    private final static String FAN = "fan";

    public static void main(String[] args) {
        Conditioner conditioner = new Conditioner();
        System.out.println(conditioner.process());
    }
    public short process() {
        Scanner scanner = new Scanner(System.in);
        String[] temperatures = scanner.nextLine().split(" ");
        short roomTemp = Short.parseShort(temperatures[0]);
        short condTemp = Short.parseShort(temperatures[1]);
        String mode = scanner.nextLine().trim();

        return getTemperature(roomTemp, condTemp, mode);
    }

    public short getTemperature(short roomTemp, short condTemp, String mode) {
        switch (mode) {
            case FREEZE:
                if (roomTemp < condTemp) {
                    return roomTemp;
                } else {
                    return condTemp;
                }
            case HEAT:
                if (roomTemp > condTemp) {
                    return roomTemp;
                } else {
                    return condTemp;
                }
            case AUTO:
                return condTemp;
            case FAN:
                return roomTemp;
            default:
                throw new IllegalStateException("Conditioner not supported operation " + mode);
        }
    }
}
