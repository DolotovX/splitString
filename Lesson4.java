class IntegerConverter {
    public static int convert(final String input) {
        return Integer.parseInt(input, 10);
    }
}

public class Lesson4 {
    public static void main(String[] args) {
        System.out.println(IntegerConverter.convert("10"));
    }
}
