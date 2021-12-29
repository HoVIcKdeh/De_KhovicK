package String;

import TypeOfData.Point;
import org.testng.annotations.Test;
import ru.ssau.tk.Person;

import java.nio.charset.StandardCharsets;

import static org.testng.Assert.*;

public class TasksFrom11_To_24Test {
    @Test
    public void testCountOfLinesIgnoreTheSpace() {
        assertEquals(TasksFrom11_To_24.countOfLinesIgnoreTheSpace(new String[]{" This method  works!  "}, "This", "works!"), 1);
        assertEquals(TasksFrom11_To_24.countOfLinesIgnoreTheSpace(new String[]{"This method works!"}, "This", "method"), 0);
        assertEquals(TasksFrom11_To_24.countOfLinesIgnoreTheSpace(new String[]{"  This  method works!  ", "  This method works again! ", "This method again   works! "}, "This", "works!"), 2);
    }

    @Test
    public void testReplacementTheString() {
        assertEquals(TasksFrom11_To_24.replacementTheString("ороророро", "оро", "ро"), "роррро");
        assertEquals(TasksFrom11_To_24.replacementTheString("This method works!", "This", "And this"), "And this method works!");
    }

    @Test
    public void testSubstringOfString() {
        assertEquals(TasksFrom11_To_24.substringOfString("This method works!", 5, 19), "method works!");
    }

    @Test
    public void testDescriptionOfObjects() {
        Person human = new Person("Jane", "Austen", 234567);
        System.out.println(TasksFrom11_To_24.descriptionOfObjects(human));

        Point firstPoint = new Point(12, -29, 52.3);
        System.out.println(TasksFrom11_To_24.descriptionOfObjects(firstPoint));


    }

    @Test
    public void testSplittingTheString() {
        assertEquals(TasksFrom11_To_24.splittingTheString("This method works!"), new String[]{"This", "Method", "Works!"});
    }

    @Test
    public void testCreateOneString() {
        assertEquals(TasksFrom11_To_24.createOneString(new String[]{"This", "method", "works!"}), "This, method, works!");
    }

    @Test
    public void testCreateObject() {
        assertEquals(TasksFrom11_To_24.createObject("This works!"), "01s8r6w4s2h0");
    }

    @Test
    public void testFormTheString() {
        assertEquals(TasksFrom11_To_24.formTheString(10), "0 1 2 3 4 5 6 7 8 9 ");
        System.out.println(TasksFrom11_To_24.formTheString(10000));
    }

    public static void main(String[] args) {
        System.out.println(java.nio.charset.Charset.defaultCharset());
    }

    @Test
    public void testChangingTheEncoding() {
        System.out.println(TasksFrom11_To_24.changingTheEncoding("This method works!", StandardCharsets.UTF_8, StandardCharsets.UTF_16));

    }

}