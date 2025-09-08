package StreamschallengeProlems;

//given a string need to remove the duplicates and return the string in same order 
public class ProblemTwo {
    public static void main(String[] args) {
        String s="dabcdefgfsjhvsjv";

        s.chars().distinct().mapToObj(x->(char)x).forEach(x->System.out.println(x));

    }
    
}
