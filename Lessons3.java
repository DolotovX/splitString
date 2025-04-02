public class Lessons3 {
    public static void main(String[] args) {
        String[] charachtersArray = new String[] {
                "Кот Бегемот",
                "Воланд",
                "Фагот"
        };

        String charachters = String.join(",", charachtersArray);
        System.out.println(charachters);
    }
}
