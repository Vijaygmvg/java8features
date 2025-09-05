package BuiltInFuctionInterfaceDemo;

import java.util.function.Predicate;

public class PredicateStaticMethodsDemo {
    
    public static void main(String[] args) {
        Predicate<String> startWithV=x->x.charAt(0)=='v';
        Predicate<String> endsWitha=x->x.charAt(x.length()-1)=='a';
        Predicate<String> combinedAnd=startWithV.and(endsWitha);
        System.out.println(combinedAnd.test("vijaya"));
        System.out.println(combinedAnd.test("vijay"));
        Predicate<String> combinedOr=startWithV.or(endsWitha);
        System.out.println(combinedOr.test("vijaya"));
        System.out.println(combinedOr.test("akshata"));
        System.out.println(combinedOr.test("vijay"));

        Predicate<String> notStartsWithv=startWithV.negate();
        System.out.println(notStartsWithv.test("vinayaka"));
         System.out.println(notStartsWithv.test("dinayaka"));

         Predicate<String> isEqual=Predicate.isEqual("hello");
         System.out.println(isEqual.test("hello"));

    }
}
