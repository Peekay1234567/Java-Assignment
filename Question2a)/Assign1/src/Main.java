import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class Main {
    public static void main(String[] args) {
        List<Integer> numbers = new ArrayList<>(Arrays.asList(1, 4, 5, 20, 30, 6));

        // Step 2: Get the stream of numbers
        Stream<Integer> stream = numbers.stream();

        // Step 3: Filter numbers divisible by 5
        Stream<Integer> divisibleByFive = stream.filter(n -> n % 5 == 0);

        // Step 4: Print each filtered number
        divisibleByFive.forEach(n -> System.out.println(n));


        //TIP Press <shortcut actionId="ShowIntentionActions"/> with your caret at the highlighted text
        // to see how IntelliJ IDEA suggests fixing it.


    }
}