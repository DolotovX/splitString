package Grades;

public class Main {
    public static void main(String[] args) {
        Grades grades = new Grades();
        String gradesStudents = "Вероника,чехова,ФИЗИКА,5;анна,строкова,МАТЕМАТИКА,4;иван,петров,ГЕОМЕТРИЯ,5";
        grades.gradeBeautifier(gradesStudents);
    }
}
