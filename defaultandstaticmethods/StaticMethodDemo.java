package defaultandstaticmethods;

interface A{
    static void hello(){
        System.out.println("hello this is hello method ");
    }
}
class Child implements A{
    
}
public class StaticMethodDemo {
    
    public static void main(String[] args) {
        // Child.hello(); this leads to error becuase the tatic method in the interface will nto bee visible in mplementation class and ou can never be able to override it 
     A.hello();
    }
}
