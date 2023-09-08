package stream;

import java.util.*;
import java.util.stream.Collectors;

public class Sample {
    private final static List<User> userList = Arrays.asList(
            new User(1, "Michael", "Robert", 37, "TR"),
            new User(2, "Mary", "Patricia", 11, "EN"),
            new User(3, "John", "Michael", 7, "FR"),
            new User(4, "Jennifer", "Linda", 77, "TR"),
            new User(5, "William", "Elizabeth", 23, "US"),
            new User(6, "Sue", "Jackson", 11, "IT"),
            new User(7, "Michael", "Tommy", 37, "EN")
    );

    public static void main(String... args) {
        Sample sample = new Sample();
        test2(userList);
        test3(userList);
        test5(userList);
        test6(userList);
        
        test9(userList);
        test10(userList);

    }

    //User старше 10 лет, у которых первый символ firstName не равен M.
    private static void test10(List<User> userList) {
       String answer= userList.stream().filter(user -> user.getAge()>10 && user.getFirstName().charAt(0)!='M')
                .map(user -> user.getFirstName()+" ,"+user.getAge())
                .collect(Collectors.joining("; "));
        System.out.println("task10: " + answer);
    }

    private static void test9(List<User> userList) {
       String answer= userList.stream()
                .map(User::getNationality)
                .distinct().collect(Collectors.joining(", "));

        System.out.println("dist answer: "+answer);

        long countDifferentNationalites = userList.stream()
                .map(User::getNationality)
                .distinct()
                .count();
        System.out.println("countDifferentNationalites: " + countDifferentNationalites);
    }

    //9. Количество разных национальностей (nationality).
    
    
    // 6. Проверка, что у всех User возраст (age) больше 6.
    //результат -boolean
    private static void test6(List<User> userList) {
        System.out.println("Test 6");
        boolean isAllAgesGreaterThan6 = userList.stream()
                .allMatch(user -> user.getAge() > 6);
        System.out.println("isAllAgesGreaterThan6: " +     isAllAgesGreaterThan6);
    }

    
    //5. Вычисление среднего возраста (age) и максимальной длины firstName.
    private static void test5(List<User> userList) {
        System.out.println("Test 5");
        OptionalDouble average=  userList.stream().mapToInt(User::getAge).average();
        OptionalInt maxFirstName=  userList.stream().mapToInt(user -> user.getFirstName().length()).max();

        System.out.println(average.getAsDouble());
        System.out.println(maxFirstName.getAsInt());
    }

    //2.Изменение внутреннего состояния объекта
    private static void test2(List<User> userList) {
        System.out.println("Test 2");
        Sample.userList.stream()
                .map(u -> {
                    return new User(u.getId(),"x "+u.getFirstName(),"Y "+u.getLastName(),u.getAge()+10,u.getNationality());
                }).map(u->u.getAge())
                .forEach(System.out::println);
    }

    private static  void test3(List<User> userList) {
        System.out.println("Test 3");
        Sample.userList.stream()
                .sorted(Comparator.comparingDouble(User::getAge))
                .map(user -> user.getAge())
                .forEach(System.out::println);
    }

    public  static class User {
        private long id;
        private String firstName;
        private String lastName;
        private int age;
        private String nationality;

        public User(long id, String firstName, String lastName, int age, String nationality) {
            this.id = id;
            this.firstName = firstName;
            this.lastName = lastName;
            this.age = age;
            this.nationality = nationality;
        }

        public long getId() {
            return id;
        }

        public String getFirstName() {
            return firstName;
        }

        public String getLastName() {
            return lastName;
        }

        public int getAge() {
            return age;
        }

        public String getNationality() {
            return nationality;
        }
    }
}