class IntegerConverter {
    public static int convert(final String input) {
        try {
            return Integer.parseInt(input, 10);
        } catch (Throwable throwable) {
            return 0; // если поймано исключение - вернется 0
        }

    }
}

public class Lesson4 {
    public static void main(String[] args) {
        System.out.println(IntegerConverter.convert("abc10"));
    }
}
