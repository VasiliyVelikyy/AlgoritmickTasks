package training.algorithm_lecture.lecture1.hometask;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

import static training.algorithm_lecture.lecture1.hometask.YesNowAnswer.NO;
import static training.algorithm_lecture.lecture1.hometask.YesNowAnswer.YES;

public class PhoneBook {
    public static void main(String[] args) {
        PhoneBook phoneBook = new PhoneBook();
        phoneBook.process().forEach(System.out::println);
    }

    public List<String> process() {
        short fourNumber = 4;
        List<String> numbers = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);
        for (int i = 0; i < fourNumber; i++) {
            numbers.add(scanner.nextLine());
        }

        return getAnswersForNumbers(numbers);

    }

    public List<String> getAnswersForNumbers(List<String> numbers) {
        List<String> answer = new LinkedList<>();
        String currentNumber = reformat(numbers.get(0));
        for (int i = 1; i < numbers.size(); i++) {
            if (currentNumber.equals(reformat(numbers.get(i)))) {
                answer.add(YES);
            } else {
                answer.add(NO);
            }
        }
        return answer;
    }

    /*Prepare string to view 6406361642**/
    private String reformat(String number) {
        number = number
                .replace("-", "")
                .replace("(", "")
                .replace(")", "");

        return number.length() > 7 ? number.substring(number.length() - 10) : "495" + number.substring(number.length() - 7);
    }
}
