package solid.openclosed;

import java.util.List;

public class OpenClosedMain {

    public static void main(String... args){
        List<Car> cars = List.of(new Renault(), new Audi(), new Chevrolet());

        cars.forEach(System.out::println);
    }
}

class Renault implements Car{
    @Override
    public double getPrice() {
        return 40;
    }

    @Override
    public String toString() {
        return String.format("Renault{%f}", getPrice());
    }
}

class Audi implements Car{
    @Override
    public double getPrice() {
        return 90;
    }
    @Override
    public String toString() {
        return String.format("Audi{%f}", getPrice());
    }
}

class Chevrolet implements Car{
    @Override
    public double getPrice() {
        return 50;
    }
    @Override
    public String toString() {
        return String.format("Chevrolet{%f}", getPrice());
    }
}