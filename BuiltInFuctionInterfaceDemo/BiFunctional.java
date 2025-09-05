package BuiltInFuctionInterfaceDemo;

import java.util.function.BiFunction;
import java.util.function.Consumer;
import java.util.zip.Inflater;

public class BiFunctional {
  
    public static void main(String[] args) {
        BiFunction<Integer,String,Integer> total=(a,b)->a+b.length();
        Consumer<Integer> consume=a->System.out.println(a);

       consume.accept(total.apply(10,"kbkjfsbkjb"));
    }
}
