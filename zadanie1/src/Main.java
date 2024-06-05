import java.util.*;
public class Main {
    public static void main(String[] args) {
        List<Car> cars = new ArrayList<>();
        cars.add(new Car("BLA1", 2001));
        cars.add(new Car("BLA2", 2002));
        cars.add(new Car("BLA3", 2003));
        cars.add(new Car("BLA4", 2004));
        cars.add(new Car("BLA5", 2005));
        cars.add(new Car("BLA6", 2006));
        cars.add(new Car("BLA7", 2007));
        cars.add(new Car("BLA8", 2008));
        cars.add(new Car("BLA9", 2009));
        cars.add(new Car("BLA10", 2010));

        Collections.sort(cars);
        for (Car car : cars) {
            System.out.println(car);
        }
    }
}