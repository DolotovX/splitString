public class Lesson1 {
    public static void main(String[] args) {
        String excellent = "Марина Голубева,Анна Ивановка,Васили Рябов,Екатерина Белых,Иван Засонин,";
        int lastNameStart = 0;
        for (int i = 0; i < excellent.length(); i++) {
            if(excellent.charAt(i) == ',') {
                System.out.println(excellent.substring(lastNameStart,i) + " — отлично");
                lastNameStart = i + 1;
            }
        }
    }
}
