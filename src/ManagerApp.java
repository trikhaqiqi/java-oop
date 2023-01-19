public class ManagerApp {
  public static void main(String[] args) {


    var manager = new Manager("Ucup");
    manager.sayHello("Maman");

    var vp = new VicePresident("Icip");
    vp.sayHello("Maman");

    System.out.println(manager);
    System.out.println(manager.toString());
    System.out.println(vp);
    System.out.println(vp.toString());
  }
}
