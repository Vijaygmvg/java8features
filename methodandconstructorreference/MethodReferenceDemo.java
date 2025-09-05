package methodandconstructorreference;

import java.util.Arrays;
import java.util.List;

public class MethodReferenceDemo {
    
    public static void print(Integer x){
        System.out.println(x);
    }
    public static void main(String[] args) {
        List<Integer> list=Arrays.asList(2,3,4,5,6,32,2,2,1,3,4,5,6);
        list.forEach(MethodReferenceDemo::print);

        System.out.println(list.stream().map(Math::decrementExact).toList());
        
    }
}
