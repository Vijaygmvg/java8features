package BuiltInFuctionInterfaceDemo;


import java.util.function.Function;




public class FunctionCaning {

    public static void main(String[] args) {
        System.out.println();
    Function<String,String> upperCase=x->x.toUpperCase();
    Function<String,String> startThreeChars=x->x.substring(0,3);
    Function<String,String> upperThree=upperCase.andThen(startThreeChars);
    System.out.println(upperThree.apply("vijaykumar"));
   
    }
}
