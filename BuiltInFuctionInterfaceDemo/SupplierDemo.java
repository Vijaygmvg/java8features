package BuiltInFuctionInterfaceDemo;

import java.util.function.Supplier;

public class SupplierDemo {
  public static void main(String[] args) {
    
    Supplier<Integer> integerSupply=()->100;
    Supplier<String> helloSupplier=()->"hello";
    System.out.println(integerSupply.get());
    System.out.println(helloSupplier.get());


  }  
}