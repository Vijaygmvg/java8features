package defaultandstaticmethods;

interface Parent {

    default void sayHello(){
        System.out.println("hello this is say hello method");
    }


    public String sayBye();
    
}

interface Child extends Parent{

    
}
public class DefaultMethodDemo {
    
   public static void main(String[] args) {
    Child parent=()->"this is say Bye Method";
    System.out.println(parent.sayBye());
    parent.sayHello();
    Child.goodDay();

    
} 
   }
