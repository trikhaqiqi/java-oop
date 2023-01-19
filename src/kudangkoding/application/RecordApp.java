package kudangkoding.application;

import kudangkoding.data.*;

public class RecordApp {
  public static void main(String[] args) {

    LoginRequest loginRequest = new LoginRequest("ilyas", "rahasia");

    System.out.println(loginRequest.username());
    System.out.println(loginRequest.password());
    System.out.println(loginRequest);

    System.out.println(new LoginRequest());
    System.out.println(new LoginRequest("ilyas"));
    System.out.println(new LoginRequest("ilyas", "rahasia"));

  }
}
