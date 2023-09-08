package stream;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class TaskForStreamForCar {

    public static void main(String[] args) {

        List<Car> cars = initListOfCar();


        //отобразить автомобили указанного цвета
        System.out.println("TASK1: " + taks1("Silver", cars));

        //отобразить автомобили указанного цвета, сгруппированного по маркам
        System.out.println("TASK2: \n" + taks2("Silver", cars));

        //получить map где ключ - цена, значение-имя машины
        System.out.println("TASK3: " + taks3(cars));

        //отобразить автомобили дороже указанной цены;
        System.out.println("TASK4: " + taks4(20000, cars));

        //отобразить автомобили, чей год выпуска находится в заданном диапазоне;
        System.out.println("TASK5: " + taks5(2017, 2018, cars));

        //сортировать автомобили в порядке убывания стоимости.
        System.out.println("TASK6: " + taks6(cars));


    }

    private static String taks6(List<Car> cars) {
        String answer = cars.stream().sorted(new Comparator<Car>() {
            @Override
            public int compare(Car o1, Car o2) {
                if (o1.getPrice() < o2.getPrice()) return 1;
                else if (o1.getPrice() > o2.getPrice()) return -1;
                else
                    return 0;
            }
        }).map(car -> String.valueOf(car.getPrice())).collect(Collectors.joining(", "));
        return answer;
    }

    private static String taks5(int startYear, int endYear, List<Car> cars) {
        String answer = cars.stream()
                .filter(car -> car.getYear() >= startYear && car.getYear() <= endYear)
                .map(car -> String.valueOf(car.getYear()))
                .collect(Collectors.joining(", "));
        return answer;
    }

    private static String taks4(int targetPrice, List<Car> cars) {
        String answer = cars.stream().filter(car -> car.getPrice() > targetPrice).map(car -> String.valueOf(car.getPrice())).collect(Collectors.joining(", "));
        return answer;
    }

    private static String taks1(String color, List<Car> cars) {
        String answer = cars.stream().filter(car -> car.getColor().equals(color)).map(car -> car.toString())
                .collect(Collectors.joining(", "));
        return answer;
    }

    private static String taks2(String color, List<Car> cars) {
        Map<String, List<Car>> groups = cars.stream().filter(car -> car.getColor().equals(color))
                .collect(Collectors.groupingBy(Car::getName));
        String answer = groups.entrySet().stream().map(pair -> "Title: " + pair.getKey() + "\n tachki:" + pair.getValue())
                .collect(Collectors.joining("\n"));
        return answer;
    }

    private static String taks3(List<Car> cars) {
        Map<Double, String> groups = cars.stream().collect(Collectors.toMap(car -> car.getPrice(), car -> car.getName()));

        String answer = groups.entrySet().stream().map(pair -> pair.getKey() + " : " + pair.getValue())
                .collect(Collectors.joining("; "));
        return answer;
    }

    private static List<Car> initListOfCar() {
        ArrayList<Car> AL = new ArrayList<Car>();
        AL.add(new Car("BMW", "Black", 2018, 2.2, 18800.0));
        AL.add(new Car("Audi", "Silver", 2017, 2.3, 20500.0));
        AL.add(new Car("Renault", "Red", 2018, 1.5, 11800.0));
        AL.add(new Car("Audi", "Silver", 2016, 2.5, 22800.0));
        AL.add(new Car("Renault", "Silver", 2017, 1.3, 10250.0));
        AL.add(new Car("VW", "Red", 2017, 2.3, 15800.0));
        AL.add(new Car("Mercedes", "White", 2018, 2.5, 25800.0));
        return AL;
    }


    static class Car {
        private String name; // название автомобиля
        private int year; // год выпуска
        private String color; // цвет
        private double volume; // объем двигателя
        private double price; // стоимость

        // Конструктор
        public Car(String _name, String _color, int _year,
                   double _volume, double _price) {
            name = _name;
            year = _year;
            color = _color;
            volume = _volume;
            price = _price;
        }

        // Методы get()
        String getName() {
            return name;
        }

        int getYear() {
            return year;
        }

        String getColor() {
            return color;
        }

        double getVolume() {
            return volume;
        }

        double getPrice() {
            return price;
        }

        @Override
        public String toString() {
            return "Car{" +
                    "name='" + name + '\'' +
                    ", year=" + year +
                    ", color='" + color + '\'' +
                    ", volume=" + volume +
                    ", price=" + price +
                    '}';
        }
    }

}
