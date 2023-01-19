package kudangkoding.application;

import kudangkoding.data.Country;
import kudangkoding.util.MathUtil;

import static kudangkoding.data.Application.PROCESSORS;
import static kudangkoding.data.Constant.APPLICATION;
import static kudangkoding.data.Constant.VERSION;

public class StaticApp {
  public static void main(String[] args) {

    System.out.println(APPLICATION);
    System.out.println(VERSION);

    System.out.println(
        MathUtil.sum(1,1,1,1,1)
    );

    Country.City city = new Country.City();
    city.setName("Subang");

    System.out.println(city.getName());

    System.out.println(PROCESSORS);
  }
}
