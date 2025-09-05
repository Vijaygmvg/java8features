package BuiltInFuctionInterfaceDemo;

import java.util.function.Function;

public class FunctionInterfaceDemo {
  public static void main(String[] args) {
    
    Function<Integer,Integer> increseOne=i->i+1;
    System.out.println();
    System.out.println(increseOne.apply(100));
    Function<String,Integer> getStringLength=x->x.length();
    System.out.println(getStringLength.apply("vijay"));
    System.out.println(getStringLength.apply("avinash"));
    System.out.println(getStringLength.apply("raghavendra"));
    System.out.println(getStringLength.apply(""));
     System.out.println(getStringLength.apply("jbda"));
  }
}
