package StreamschallengeProlems;

import java.util.Arrays;

// given a sentence find the word has 2nd highest length
public class ProblemThree {
    public static void main(String[] args) {
        String s="I'm student who is the learningt of the streams";
        System.out.println("hello");
        Arrays.stream(s.split(" ")).sorted((b,a)->a.length()-b.length()).skip(1).limit(1).forEach(x->System.out.println(x));
    }
    
}
