package String;

import org.testng.annotations.Test;

import static org.testng.Assert.*;

public class TasksFrom_1_To_10Test {



    @Test
    public void testPrintChar() {
        TasksFrom_1_To_10.printChar("This method works!");
    }

    @Test
    public void testPrintBytes() {
        TasksFrom_1_To_10.printBytes("This method works!");
    }

    @Test
    public void testStringComparison() {
        TasksFrom_1_To_10.stringComparison();
    }

    @Test
    public void testPalindrome() {
        assertTrue(TasksFrom_1_To_10.palindrome("level"));
        assertFalse(TasksFrom_1_To_10.palindrome("levels"));
    }

    @Test
    public void testStringComparisonIgnoreCase() {
        assertTrue(TasksFrom_1_To_10.stringComparisonIgnoreCase("string", "STRING"));
        assertFalse(TasksFrom_1_To_10.stringComparisonIgnoreCase("string", null));
        assertFalse(TasksFrom_1_To_10.stringComparisonIgnoreCase("string", "STRINGS"));
        assertTrue(TasksFrom_1_To_10.stringComparisonIgnoreCase("string", "StRiNg"));
    }

    @Test
    public void testStudyingScreening() {
        TasksFrom_1_To_10.studyingScreening();
    }

    @Test
    public void testIndexOfTheOccurrence() {
        assertEquals(TasksFrom_1_To_10.indexOfTheOccurrence("Class", "s"), 3);
        assertEquals(TasksFrom_1_To_10.indexOfTheOccurrence("Class", "b"), -1);
    }

    @Test
    public void testFirstIndexOfTheOccurrenceHalf() {
        assertEquals(TasksFrom_1_To_10.firstIndexOfTheOccurrenceHalf("Levels", "l"), 4);
        assertEquals(TasksFrom_1_To_10.firstIndexOfTheOccurrenceHalf("LevelsLevels", "Levels"), 6);
        assertEquals(TasksFrom_1_To_10.firstIndexOfTheOccurrenceHalf("Class", "cl"), -1);
    }

    @Test
    public void testLastIndexOfTheOccurrenceHalf() {
        assertEquals(TasksFrom_1_To_10.lastIndexOfTheOccurrenceHalf("Levels", "e"), 1);
        assertEquals(TasksFrom_1_To_10.lastIndexOfTheOccurrenceHalf("Levels", "n"), -1);
        assertEquals(TasksFrom_1_To_10.lastIndexOfTheOccurrenceHalf("Class", "Cl"), 0);
        assertEquals(TasksFrom_1_To_10.lastIndexOfTheOccurrenceHalf("LevelsLevels", "ls"), 4);
    }

    @Test
    public void testCountOfLines() {
        assertEquals(TasksFrom_1_To_10.countOfLines(new String[]{"This method works!"}, "This", "works!"), 1);
        assertEquals(TasksFrom_1_To_10.countOfLines(new String[]{"This method works!"}, "This", "method"), 0);
        assertEquals(TasksFrom_1_To_10.countOfLines(new String[]{"This method works!", "This method works again!", "This method again works!"}, "This", "works!"), 2);
    }

}