package String;

public class TasksFrom_1_To_10 {
    public static void printChar(String s) {
        for (int i = 0; i < s.length(); ++i) {
            System.out.print(s.charAt(i) + " ");
        }
        System.out.println();
    }

    public static void printBytes(String s) {
        byte[] array = s.getBytes();
        for (byte v : array) {
            System.out.print(v + " ");
        }
        System.out.println();
    }

    public static void stringComparison() {
        String s1 = "First string!";
        String s2 = new String(s1);
        System.out.print("==: ");
        System.out.print(s1 == s2);            //сравнивает ссылки на объект
        System.out.print("  equals: ");
        System.out.print(s1.equals(s2));       //сравнивает набор символов
        System.out.println();
    }

    public static boolean palindrome(String string) {
        for (int i = 0; i < string.length() / 2; ++i) {
            if (string.charAt(i) != string.charAt(string.length() - i - 1)) {
                return false;
            }
        }
        return true;
    }

    public static boolean stringComparisonIgnoreCase(String s1, String s2) {
        if (s1 == null || s2 == null) {
            return false;
        } else return !s2.equals(s1) & s2.equalsIgnoreCase(s1);
    }

    public static void studyingScreening() {
        int i = 0;
        System.out.println("Символ\t№" + ++i);   //табуляция
        System.out.println("Символ\b№" + ++i);   //удаление последнего символа
        System.out.println("Символ\n№" + ++i);   //перевод на новую строку
        System.out.println("Символ\r№" + ++i);   //заменяет предыдущий текст на следующий
        System.out.println("Символ\'№" + ++i);   // '
        System.out.println("Символ\"№" + ++i);   // "
        System.out.println("Символ\\№" + ++i);   // \, компилятор выдаёт ошибку, если оставить один \
        System.out.println();
    }

    public static int indexOfTheOccurrence(String s1, String s2) {
        return s1.indexOf(s2);
    }

    public static int firstIndexOfTheOccurrenceHalf(String s1, String s2) {
        return s1.indexOf(s2, s1.length() / 2);
    }

    public static int lastIndexOfTheOccurrenceHalf(String s1, String s2) {
        String s3 = s1.substring(0, s1.length() / 2);
        return s3.lastIndexOf(s2);
    }

    public static int countOfLines(String[] array, String prefix, String postfix) {
        int count = 0;
        for (String s : array) {
            if (s.startsWith(prefix) && s.endsWith(postfix)) {
                count++;
            }
        }
        return count;
    }
}
