public class Lesson1 {
    public static void main(String[] args) {
        String excellent = "Акции$Облигации$Фьючерсы$";
        String[] splitString = excellent.split("\\$");
        System.out.println(splitString[0].equals("Акции"));
        System.out.println(splitString[1].equals("Облигации"));
        System.out.println(splitString[2].equals("Акции"));
        }
    }
