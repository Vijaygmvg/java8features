package BuiltInFuctionInterfaceDemo;

import java.util.function.UnaryOperator;

public class UnaryOperatorDemo {

    public static void main(String[] args) {
        UnaryOperator<Integer> addOne=x->x+1;
        System.out.println(addOne.apply(100));
    }
}