
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;

public class MainProgram {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<Book> books = new ArrayList<>();
        while (true) {
            System.out.print("Input the name of the book, empty stops: ");
            String bookName = scanner.nextLine();
            if (bookName.equals("")) {
                break;
            }
            System.out.print("Input the age recommendation: ");
            int ageRating = Integer.valueOf(scanner.nextLine());
            System.out.println("");
            books.add(new Book(bookName, ageRating));
        }
        System.out.println("");

        System.out.println(books.stream().count() + " books in total.");
        System.out.println("");
        System.out.println("Books:");

        Comparator<Book> comparator = Comparator
                .comparing(Book::getAgeRating)
                .thenComparing(Book::getBookName);
        Collections.sort(books, comparator);

        for (Book book : books) {
            System.out.println(book);
        }

//        books.stream()
//                .sorted()
//                .forEach(book -> System.out.println(book));
    }

}
