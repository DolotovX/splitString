public class Lesson2 {
    public static void main(String[] args) {
        String dollarAssets = "Акции$Облигации$Фонды$";

        String[] split = dollarAssets.split("\\$");
        System.out.println(split[0]);
        System.out.println(split[1]);
        System.out.println(split[2]);
    }
}
