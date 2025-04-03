import java.net.URI;
import java.net.URISyntaxException;

public class Lesson5 {
    public static void main(String[] args) {
        System.out.println(parseStringToUri("http://ya.ru"));
        System.out.println(parseStringToUri(null));
        System.out.println(parseStringToUri(":/"));

    }
    public static URI parseStringToUri(final String input) {
        try {
            return new URI(input);
        } catch (URISyntaxException exp) {
            System.out.println("Ошибка: неверный синтаксис URI");
        } catch (NullPointerException exp) {
            System.out.println("Ошибка: передан неинициализированный объект");
        }
        return null;
    }
}
