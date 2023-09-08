package stream;

import java.util.*;
import java.util.stream.Collectors;

public class TaskForStream {
    private final static List<String> informationList = Arrays.asList("author:Vasiliy, comment: shakalaka",
            "author:Nikolay, comment: I have a great solution",
            "author:Kirill, comment: testtesttesttesttesttest",
            "author:Vova, comment: My name is Vova");

    public static void main(String[] args) {
        //найти самый длинный коментарий автора и вывести
        findComment(informationList);
    }

    private static void findComment(List<String> informationList) {
        //сделать хешмапу где ключ имя (можно с фамилией) автора -комментра

        Map<String, Integer> map = informationList.stream().collect(Collectors.
                toMap(mes -> mes, mes -> mes.substring(mes.indexOf("comment"), mes.length()).replace("comment:", "").trim().length()));


        Map.Entry<String, Integer> maxEntry = map.entrySet().stream()
                .max(Comparator.comparing(Map.Entry::getValue)).orElse(null);

        System.out.println(maxEntry.getKey() + "==" + maxEntry.getValue());
    }

}




/*records -> {
 "Andrew:something i can talk",
 "Ben:me too",
 "Andrew:more and more"
 "Sam: I can talk endlessly so I will speak more and more",
  null
} -> Sam, Andrew

/* Требуется реализовать метод позволяющий найти автора(ов) с наибольшим количеством сказанных слов:
*
*/

   /* public static List<String> findTheMostTalkingAuthors(List<String> records, Integer numToView) {

        validateParams(records,numToView);

        Map<String ,Integer> difMap= records.stream().collect(Collectors
                .toMap((message -> message.substring(0,message.indexOf(":")),
                        message-> message.substring(message.indexOf(":"), message.lenght()).trim().split(" ").lenght,
                        (v1,v2)-> Integer.sum(v1,v2));

        List<String> limitTwoList=   difMap.entrySet().stream()
                .sorted(
                        Comparator.comparing(Map.Entry::getValue(),Comparator.reverseOrder())
          .limit(numToView)
                .map(Map.Entry::getKey())
          .collect(Collectors.toList);

        return limitTwoList;
    }



    public static validateParams(List<String> records, Integer numToView

  if(numToView<0) throw new RuntimeException(" неверное число вывода авторов");


        }*/