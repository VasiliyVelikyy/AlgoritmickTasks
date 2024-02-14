package otherTasks;

import java.util.HashMap;
import java.util.Map;
import java.util.stream.Collectors;

//Написать парсер строки. С функциями
//1. по ключу могли достать значение за о(1)
//2. выдавать исходную строку
//Пример входнойстроки "key=val1;key1=abc;key2=val2;key3=val3; key1=val4;key2=val5;key1=val6"
public class TaskThree {

    public static void main(String[] args) {
        String testString = "key=val1;key1=abc;key2=val2;key3=val3; " +
                "key1=val4;key2=val5;key1=val6";
        ParseHolder parser = new ParseHolder();
        parser.parse(testString);
        System.out.println(parser.generateRecord());
        System.out.println(parser.getValue("key1"));
    }
}

class ParseHolder {
    private Map<String, String> map;

    public ParseHolder() {
        this.map = new HashMap<>();
    }

    void parse(String str) {
        str = str.replaceAll(" ", "");
        String[] pair = str.split(";");

        for (int i = 0; i < pair.length; i += 2) {
            String[] keyAndValue = pair[i].split("=");
            map.put(keyAndValue[0], keyAndValue[1]);
        }
    }

    String generateRecord() {
        return map.entrySet().stream()
                .map(pair -> pair.getKey() + "=" + pair.getValue())
                .collect(Collectors.joining(";"));
    }

    String getValue(String key) {
        return map.get(key);
    }
}