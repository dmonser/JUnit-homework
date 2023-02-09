import org.example.Book;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

public class BookTests {

    @ParameterizedTest
    @MethodSource("addSource")
    public void testGetTitle(Book book, String expectedTitle, int expectedDeadline, boolean expectedStatus) {
        System.out.println("Start getUserName test");

        //act
        String result = book.getTitle();

        //assert
        Assertions.assertEquals(expectedTitle, result);
    }

    @ParameterizedTest
    @MethodSource("addSource")
    public void testGetMaxDeadline(Book book, String expectedTitle, int expectedDeadline, boolean expectedStatus) {
        System.out.println("Start getMaxDeadline test");

        //act
        int result = book.getMaxDeadline();

        //assert
        Assertions.assertEquals(expectedDeadline, result);
    }

    @ParameterizedTest
    @MethodSource("addSource")
    public void testGetInLibrary(Book book, String expectedTitle, int expectedDeadline, boolean expectedStatus) {
        System.out.println("Start getInLibrary test");

        //act
        boolean result = book.getInLibrary();

        //assert
        Assertions.assertEquals(expectedStatus, result);
    }



    public static Stream<Arguments> addSource() {
        Book book1 = new Book("Война и Мир", "Л.Н. Толстой", 30, true);
        Book book2 = new Book("1984", "Дж. Оруэлл", 14, false);
        Book book3 = new Book("Метро 2033", "Дмитрий Глуховский", 20, false);
        Book book4 = new Book("Метро 2034", "Дмитрий Глуховский", 20, false);

        return Stream.of(
                Arguments.of(book1, "Война и Мир", 30, true),
                Arguments.of(book2, "1984", 14, false),
                Arguments.of(book3, "Метро 2033", 20, false),
                Arguments.of(book4, "Метро 2034", 20, false)
        );
    }
}
