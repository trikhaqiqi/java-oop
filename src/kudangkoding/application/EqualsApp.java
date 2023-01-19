package kudangkoding.application;

public class EqualsApp {
  public static void main(String[] args) {

    String first = "Ilyas";
    first = first + " " + "Tri";

    System.out.println(first);

    String second = "Ilyas Tri";
    System.out.println(second);

    System.out.println(first == second);
    System.out.println(first.equals(second));

    String third = "Ilyas Tri";

    System.out.println(second == third);
    System.out.println(second.equals(third));

  }
}
