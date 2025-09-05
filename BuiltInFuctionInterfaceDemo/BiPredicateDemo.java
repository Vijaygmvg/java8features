package BuiltInFuctionInterfaceDemo;

import java.util.function.BiPredicate;

public class BiPredicateDemo {
   
    public static void main(String[] args) {
        BiPredicate<Integer,Integer> isEqual=(a,b)->a==b;
        System.out.println(isEqual.test(10,20));
        System.out.println(isEqual.test(100,100));
    }
}
