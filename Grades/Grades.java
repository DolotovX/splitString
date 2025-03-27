package Grades;

public class Grades {
    private String capitalize(String str) {
        return str.substring(0,1).toUpperCase() + str.substring(1);
    }

    private String gradeToString(String grade) {
        switch (grade) {
            case "5": {
                return "Безупречно";
            }
            case "4": {
                return "Потрясающе";
            }
            case "3": {
                return "Восхитительно";
            }
            case "2": {
                return "Прекрасно";
            }
            default:
                return "Очаровательно";

        }

    }

    // grades - строка вида "имя,фамилия,предмет,оценка;имя,фамилия,предмет,оценка;"
    public void gradeBeautifier(String grades) {
        StringBuilder resultString = new StringBuilder();
        String[] arraysStudents = grades.split(";");
        for (String name: arraysStudents) {
            String[] dataStudent = name.split(",");
            resultString.append(capitalize(dataStudent[0]) + " ");
            resultString.append(capitalize(dataStudent[1]) + " ");
            resultString.append(dataStudent[2].toLowerCase());
            resultString.append(" — ");
            resultString.append(gradeToString(dataStudent[3]));
            resultString.append("\n");

        }
        System.out.println(resultString);
    }

    public String serializeGrades(String[] grades) {

        for (String name: grades) {
            String[] dataStudent = name.split(" ");
            String list = String.join(",",dataStudent[0],dataStudent[1],dataStudent[2],dataStudent[4]);
            String result = String.join(";",list);
            return result;
        }
        return "";
    }
}
