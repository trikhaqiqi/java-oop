package kudangkoding.application;

import kudangkoding.data.Avanza;
import kudangkoding.data.Car;

public class CarApp {
  public static void main(String[] args) {

    Car car = new Avanza();
    System.out.println(car.getTier());
    car.drive();

  }
}
