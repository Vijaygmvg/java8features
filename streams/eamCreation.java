package streams;

import java.util.Arrays;
import java.util.List;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class eamCreation {

    public static void main(String[] args) {
        List<Integer> list=Arrays.asList(1,2,4,5,7,8,9,5,5,4,4,3,3,5,5,6);
        Stream<Integer> listStream=list.stream();

        List<String> stringList=Arrays.asList("vijay","ravi","naveen","Akash");
        Stream<String> stringStream=stringList.stream();

        Integer arr[]={1,3,5,6,8,9,0,5,4,4};
         Stream<Integer> arrStream=Arrays.stream(arr);

         Stream<Integer> iteratedStrem=Stream.iterate(10, x->x+1).limit(90);
    }
}
