import java.util.*;
import java.util.stream.*;

public class Main {
    public static void main(String[] args) {
        String paragraph = "hello world hello java streams world java";
        String[] words = paragraph.split(" ");

        Map<String, Integer> wordCount = Arrays.stream(words)
            .collect(Collectors.toMap(
                word -> word,   // key
                word -> 1,      // initial value
                Integer::sum    // merge function if key repeats
            ));

        System.out.println(wordCount);
    }
}
