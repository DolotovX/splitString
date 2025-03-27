public class Lesson1 {
    public static void main(String[] args) {
        String[] arrayOfcurrency = new String[] {
            "USD","EUR","GBP"
        };

        String currency = String.join(",", arrayOfcurrency);
        System.out.println("Валюты: " + currency);
    }
    }
