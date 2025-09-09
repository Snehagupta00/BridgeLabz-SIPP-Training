import java.util.*;
import java.util.stream.*;

class Book {
    String genre;
    int pages;

    Book(String genre, int pages) {
        this.genre = genre;
        this.pages = pages;
    }

    String getGenre() { return genre; }
    int getPages() { return pages; }
}

public class Main {
    public static void main(String[] args) {
        List<Book> books = Arrays.asList(
            new Book("Fiction", 300),
            new Book("Fiction", 250),
            new Book("Science", 400),
            new Book("History", 500),
            new Book("Science", 350)
        );

        Map<String, IntSummaryStatistics> statsByGenre = books.stream()
            .collect(Collectors.groupingBy(
                Book::getGenre,
                Collectors.summarizingInt(Book::getPages)
            ));

        statsByGenre.forEach((genre, stats) -> {
            System.out.println(genre + " -> " + stats);
        });
    }
}
