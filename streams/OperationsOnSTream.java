package streams;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collector;
import java.util.stream.Collectors;

public class OperationsOnSTream {

    public static void main(String[] args) {
        List<Integer> list=Arrays.asList(1,3,4,6,7,9,8,7,6,5,5,4);
        List<Integer> evenNumberList=list.stream().filter(x->x%2==0).toList();
        List<Integer> evenDevidedTen=evenNumberList.stream().map(x->x/10).collect(Collectors.toList());
       List<Integer> distinctEvenDevideTen= evenDevidedTen.stream().distinct().toList();
      List<Integer> sortedDistinceEvenDevideTen= distinctEvenDevideTen.stream().sorted().toList();
    }
}
