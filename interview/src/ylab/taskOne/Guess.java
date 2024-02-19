package ylab.taskOne;

import java.util.Random;
import java.util.Scanner;


//Игра угадайка. При запуске программа загадывает число от 1 до 99 (включительно) и дает пользователю 10 попыток отгадать.
// Далее пользователь начинает вводить число. И тут возможен один из следующих вариантов:
//- Пользователь отгадал число. В таком случае выводится строка
//“Ты угадал с N попытки”, где N - номер текущей попытки пользователя
//- Пользователь ввел число, меньше загаданного. В таком случае выводится сообщение “Мое число меньше! У тебя осталось M попыток”
// где M - количество оставшихся попыток
//- Пользователь ввел число, больше загаданного. В таком случае выводится сообщение “Мое число больше! У тебя осталось M попыток”
// где M - количество оставшихся попыток
//- У пользователя закончились попытки и число не было угадано. В таком случае выводится сообщение “Ты ну угадал”
//
//Получить случайный элемент от 1 до 99 (включительно):
//int number = new Random().nextInt(99) + 1;
public class Guess {
    static final int attempt = 10;  //число попыток

    public static void main(String[] args) {
        runGame();

    }

    private static void runGame() {
        int hiddenNumber = new Random().nextInt(99) + 1; //загаданное число

        System.out.println("Я загадал число от 1 до 99. У тебя 10 попыток угадать");

        int numberOfAttempt = 0;//текущая попытка
        boolean answer = false; //ответ
        Scanner scanner = null;
        try {
            scanner = new Scanner(System.in);
            while (attempt > numberOfAttempt) {
                try {
                    answer = checkResult(scanner.nextInt(), hiddenNumber, ++numberOfAttempt);
                    if (answer) break;
                } catch (Exception e) {
                    System.out.println("Вы ввели строку, попробуйте еще раз ");
                }
            }
        } finally {
            if (scanner != null)
                scanner.close();
        }
    }

    //возврат значения: ответ либо верен, либо нет, либо число попыток истекло
    private static boolean checkResult(int enterNumber, int hiddenNumber, int numberOfAttempt) {
        int countAttempt = attempt - numberOfAttempt; //число оставшихся попыток
        if (enterNumber == hiddenNumber) {
            System.out.println("Ты угадал с " + numberOfAttempt + " попытки");
            return true;
        } else if (enterNumber > hiddenNumber) {
            System.out.println("Мое число меньше! У тебя осталось " + countAttempt + " попыток");
            return false;
        } else if (numberOfAttempt == attempt) {
            System.out.println("Ты не угадал");
            return true;
        } else if (enterNumber < hiddenNumber)
            System.out.println(" Мое число больше! У тебя осталось " + countAttempt + " попыток ");
        return false;
    }
}