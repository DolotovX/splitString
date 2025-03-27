public class Lesson1 {
    public static void main(String[] args) {
        String excellent = "Марина Голубева,Анна Ивановка,Васили Рябов,Екатерина Белых,Иван Засонин,";
        String[] splitString = excellent.split(",");
        for (String student: splitString) {
            System.out.println(student + " — отлично");
        }
    }
}
