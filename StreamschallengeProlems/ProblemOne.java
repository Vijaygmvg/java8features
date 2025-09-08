package StreamschallengeProlems;

import java.util.Arrays;

//given a sentence find the word has  longest length
public class ProblemOne {
    public static void main(String[] args) {
        
        String s="I'm leraning the java Streams API";
        Arrays.stream(s.split(" ")).max((a,b)->a.length()-b.length()).ifPresent(x->System.out.println(x));
    }
}
