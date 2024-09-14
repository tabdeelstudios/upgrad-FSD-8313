import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamExample {

    public static void main(String[] args) {
        int[] numbers = {1,2,3,4,5,6,7,8,9,10};

        Stream<Integer> numberStream = Arrays.stream(numbers).boxed();

        numberStream = numberStream.filter(n->n%2==0).map(n->n*2);

        List<Integer> resultList = numberStream.collect(Collectors.toList());
        
        System.out.println(resultList);
    }
}