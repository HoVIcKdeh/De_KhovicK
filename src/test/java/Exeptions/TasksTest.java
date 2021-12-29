package Exeptions;

import org.testng.annotations.Test;
import ru.ssau.tk.Person;

import java.io.*;

import static org.testng.Assert.*;

public class TasksTest {
    @Test
    public void testDataOutput() {
        Person human = new Person("Jane", "Austen", 234567);
        assertEquals(Tasks.dataOutput(human), "Jane Austen");

        assertThrows(NullPointerException.class, () -> Tasks.dataOutput(null));
    }

    @Test
    public void testArrayOfCharactersByIndex() {
        assertEquals(Tasks.arrayOfCharactersByIndex(new String[]{"яблоко", "лёд", "груша"}, 2), new char[]{'л', 'д', 'у'});

        assertThrows(NullPointerException.class, () -> Tasks.arrayOfCharactersByIndex(null, 2));
        assertThrows(NullPointerException.class, () -> Tasks.arrayOfCharactersByIndex(new String[]{null, "лёд", "груша"}, 2));
        assertThrows(StringIndexOutOfBoundsException.class, () -> Tasks.arrayOfCharactersByIndex(new String[]{"яблоко", "лёд", "груша"}, 10));
        assertThrows(StringIndexOutOfBoundsException.class, () -> Tasks.arrayOfCharactersByIndex(new String[]{"яблоко", "лёд", "груша"}, -1));
    }

    @Test
    public void testCharactersByIndex() {
        assertEquals(Tasks.charactersByIndex(new String[]{"яблоко", "лёд", "груша"}, 2, 3), 'ш');

        assertThrows(NullPointerException.class, () -> Tasks.charactersByIndex(null, 2, 3));
        assertThrows(ArrayIndexOutOfBoundsException.class, () -> Tasks.charactersByIndex(new String[]{"яблоко", "лёд", "груша"}, 3, 3));
        assertThrows(ArrayIndexOutOfBoundsException.class, () -> Tasks.charactersByIndex(new String[]{"яблоко", "лёд", "груша"}, -1, 4));
        assertThrows(StringIndexOutOfBoundsException.class, () -> Tasks.charactersByIndex(new String[]{"яблоко", "лёд", "груша"}, 1, 3));
    }

    @Test
    public void testDividingFromStrings() {
        assertEquals(Tasks.dividingFromStrings("6", "2"), 3);
        assertEquals(Tasks.dividingFromStrings("5", "2"), 2);

        assertThrows(NumberFormatException.class, () -> Tasks.dividingFromStrings("6", null));
        assertThrows(NumberFormatException.class, () -> Tasks.dividingFromStrings(null, "2"));
        assertThrows(NumberFormatException.class, () -> Tasks.dividingFromStrings("six", "2"));
        assertThrows(ArithmeticException.class, () -> Tasks.dividingFromStrings("6", "0"));
    }

    @Test
    public void testSerialization() {
        try {
            Person human = new Person("Jane", "Austen", 234567);
            Tasks.serialization(new ByteArrayOutputStream(), human);
            System.out.println(human);
        } catch (IOException e) {
            e.printStackTrace();
        }

        assertThrows(FileNotFoundException.class, () -> Tasks.serialization(new FileOutputStream(""), new Person()));
        assertThrows(NotSerializableException.class, () -> Tasks.serialization(new ByteArrayOutputStream(), new Object()));
    }

}