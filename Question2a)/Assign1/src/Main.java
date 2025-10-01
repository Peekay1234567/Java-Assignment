import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class Main {
    public static void main(String[] args) {
        List<Integer> numbers = new ArrayList<>(Arrays.asList(1, 4, 5, 20, 30, 6));

        
        Stream<Integer> stream = numbers.stream();

        
        Stream<Integer> divisibleByFive = stream.filter(n -> n % 5 == 0);

       
        divisibleByFive.forEach(n -> System.out.println(n));


    }
}
