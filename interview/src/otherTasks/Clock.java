package otherTasks;

/*Описание:

Вам дана строка времени в формате hh:mm, где некоторые цифры в строке скрыты (представлены символом ?).

Допустимое время находится в диапазоне от 00:00 до 23:59.

Верните самое позднее допустимое время, которое можно получить из строки времени, заменив скрытые цифры.

Пример 1:

Ввод: time = "2?:?0"
Вывод: "23:50"
Объяснение: Самое позднее время, начинающееся с цифры '2', — это 23, а самое позднее время, заканчивающееся на цифру '0', — это 50.

Пример 2:

Ввод: time = "0?:3?"
Вывод: "09:39"

Пример 3:

Ввод: time = "1?:22"
Вывод: "19:22"

Ввод: time = "?1:2?"
Вывод: "21:29"*/
public class Clock {
    char three = '3';
    char five = '5';
    char nine = '9';
    String splitter = ":";
    char question = '?';

    public String maximumTime(String time) {
        String[] strings = time.split(splitter);
        String hour = strings[0];
        String minutes = strings[1];

        minutes = fixMinutes(minutes);
        hour = fixHour(hour);

        return hour + splitter + minutes;
    }


    private String fixMinutes(String minutes) {
        return (minutes.charAt(1) == question) ?
                minutes.replace(question, nine) : minutes.replace(question, five);
    }

    private String fixHour(String hour) {
        return (hour.charAt(0) == question) ? fixSingleValue(hour) : fixStringDecimal(hour);
    }

    private String fixStringDecimal(String hour) {
        if (hour.charAt(0) == '1') {
            return hour.replace(question, nine);
        } else if (hour.charAt(0) == '2') {
            return hour.replace(question, three);
        } else {
            return hour.replace(question, nine);
        }
    }

    private String fixSingleValue(String hour) {
        int num = hour.charAt(1);
        if (num < '9' && num > '3') {
            return hour.replace(question, '1');
        } else if (num >= '1') {
            return hour.replace(question, '2');
        } else {
            return hour.replace(question, '0');
        }
    }
}


