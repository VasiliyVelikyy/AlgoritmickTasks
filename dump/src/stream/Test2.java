package stream;

public class Test2 {
    private static final int DAY_OF_WEEK = 7;
    private static final int WEEKS_IN_YEAR = 52;
    private static final int MISSING_DAY_FROM_LAST_YEAR = 1;//1 день с недели прошлого года

    public static void main(String[] args) {
//        System.out.println("number of week 1: " + getMoneyOfCertainWeek(1));
//        System.out.println("number of week 2: " + getMoneyOfCertainWeek(2));
//        System.out.println("number of week 3: " + getMoneyOfCertainWeek(3));
//        System.out.println("number of week 4: " + getMoneyOfCertainWeek(4));
//        System.out.println("number of week today: " + getMoneyOfCertainWeek(30));
//        System.out.println("number of week 50: " + getMoneyOfCertainWeek(50));
//        System.out.println("number of week 51: " + getMoneyOfCertainWeek(51));
//        System.out.println("number of week 52: " + getMoneyOfCertainWeek(52));
//
//        System.out.println(result(52));
//
//        System.out.println("The amount now that could be in the account: " + result(30));
        System.out.println("----------------");
        showAllSchedulePayment();
        System.out.println(controlResult(52));
    }


    private static int controlResult(int numberOfWeek) {
        int allDays = DAY_OF_WEEK * numberOfWeek + MISSING_DAY_FROM_LAST_YEAR;//1 день с недели прошлого года
        int result = 0;
        for (int j = 1; j <= allDays; j++) {
            result += j;
        }
        return result;
    }

    private static int getMoneyOfCertainWeek(int numberOfWeek) {

        int endDay = DAY_OF_WEEK * numberOfWeek;
        int startDay = endDay - DAY_OF_WEEK + 1;
        if (numberOfWeek == WEEKS_IN_YEAR) {
            endDay += MISSING_DAY_FROM_LAST_YEAR; //добавить пропущенный день в конец года
        }
        int result = 0;
        for (int day = startDay; day <= endDay; day++) {
            result += day;
        }
        return result;
    }

    private static void showAllSchedulePayment() {
        System.out.println("All Schedule Payments");
        int allMoney = 0;

        for (int week = 1; week <= WEEKS_IN_YEAR; week++) {
            int moneyForCertainWeek = getMoneyOfCertainWeek(week);
            allMoney += moneyForCertainWeek;
            String message = String.format("Number of week: %s.  You can add to account money %s. All sum will be  %s",
                    week, moneyForCertainWeek, allMoney);
            System.out.println(message);
        }

    }
}
