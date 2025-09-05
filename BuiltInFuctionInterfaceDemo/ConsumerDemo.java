package BuiltInFuctionInterfaceDemo;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

public class ConsumerDemo {
    public static void main(String[] args) {
        Consumer<List<Integer>> consumerOne=(x)->{
            for(int i:x)
             System.out.println(i*i);
        };
     consumerOne.accept(Arrays.asList(1,2,3,4,5,6,7,9));
     
    }
}
