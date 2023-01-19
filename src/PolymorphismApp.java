public class PolymorphismApp {
  public static void main(String[] args) {


    Employee employee = new Employee("Ucup");
    employee.sayHello("Icip");

    employee = new Manager("Ucup");
    employee.sayHello("Icip");

    employee = new VicePresident("Ucup");
    employee.sayHello("Icip");

    sayHello(new Employee("Ucup"));
    sayHello(new Manager("Icip"));
    sayHello(new VicePresident("Acap"));
  }

  static void sayHello(Employee employee) {
    if (employee instanceof VicePresident) {
      VicePresident vicePresident = (VicePresident) employee;
      System.out.println("Hello VP " + vicePresident.name);
    } else if (employee instanceof Manager) {
      Manager manager = (Manager) employee;
      System.out.println("Hello Manager " + manager.name);
    } else {
      System.out.println("Hello " + employee.name);
    }
  }
}
