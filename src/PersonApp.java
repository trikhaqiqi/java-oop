public class PersonApp {
  public static void main(String[] args) {

    var person1 = new Person("Ucup", "Bandung");

    System.out.println(person1.name);
    System.out.println(person1.address);
    System.out.println(person1.country);

    person1.sayHello("Maman");

    Person person2 = new Person("Maman");

    Person person3;
    person3 = new Person();
    person3.name = "Ucup";
    person3.sayHello("Maman");

  }
}
