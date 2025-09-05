package BuiltInFuctionInterfaceDemo;

import java.util.*;
import java.util.Arrays;
import java.util.function.Predicate;
public class PredicateDemo {
    public static void main(String[] args) {
        Predicate<Integer> isEven=a->a%2==0;
        for(int i=0;i<100;i++){
            System.out.println(isEven.test(i)==true?i+"isEven":i+"is odd");
        }

        Predicate<Integer> salaryGreaterthan=x->x>100;

        List<Integer> salaries=Arrays.asList(100,232,453,12,43,543,5323,4323,2112,33,4232,3113,12,232,32,41,66,88,64);
        System.out.println(salaries.stream().filter(salaryGreaterthan).toList());

    }
}
