package kudangkoding.application;

import kudangkoding.data.HelloWorld;

public class HelloWorldApp {
  public static void main(String[] args) {


    HelloWorld english = new HelloWorld(){

      @Override
      public void sayHello() {
        System.out.println("Hello");
      }

      @Override
      public void sayHello(String name) {
        System.out.println("Hello " + name);
      }
    };

    HelloWorld indonesia = new HelloWorld(){

      public void sayHello() {
        System.out.println("Halo");
      }

      public void sayHello(String name) {
        System.out.println("Halo " + name);
      }
    };

    english.sayHello();
    english.sayHello("Ilyas");

    indonesia.sayHello();
    indonesia.sayHello("Ilyas");

  }
}
