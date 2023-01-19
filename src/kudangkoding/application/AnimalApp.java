package kudangkoding.application;


import kudangkoding.annotation.Fancy;
import kudangkoding.data.Animal;
import kudangkoding.data.Cat;

@Fancy(name = "AnimalApp", tags = {"application", "java"})
public class AnimalApp {
  public static void main(String[] args) {


    Animal animal = new Cat();
    animal.name = "Puss";
    animal.run();

  }
}
