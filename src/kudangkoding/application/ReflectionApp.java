package kudangkoding.application;

import kudangkoding.data.CreateUserRequest;
import kudangkoding.util.ValidationUtil;

public class ReflectionApp {
  public static void main(String[] args) {

    CreateUserRequest request = new CreateUserRequest();
    request.setUsername("ilyas");
    request.setPassword("ilyas");
    request.setName("ilyas");

    ValidationUtil.validationReflection(request);

  }
}
