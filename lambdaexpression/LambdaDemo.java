package lambdaexpression;

 interface Math{
    
    public int done(int a,int b);

     default String className(){
        return "Math";
     }
      static void sayHello(){
        System.out.println("helo");
     }

    
}
public class LambdaDemo {

    public static void main(String[] args) {
        Math addition=(a,b)->a+b;
        Math subtraction=(a,b)->a-b;
        Math multiplication=(a,b)->a*b;
        Math division =(a,b)->b!=0?a/b:b/a;
     System.out.println();
        System.out.println(addition.done(4,5));
        System.out.println(subtraction.done(4,5));
        System.out.println(multiplication.done(4,5));
        System.out.println(division.done(4,5));
        System.out.println(addition.className());
        Math.sayHello();
    }
}