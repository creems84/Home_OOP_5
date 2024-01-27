package Home;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
        ArrayList<Teacher> teachers = new ArrayList();
        TeacherService teacherService = new TeacherService(teachers);
        TeacherView teacherView = new TeacherView();
        TeacherController teacherController = new TeacherController(teacherService, teacherView);
        teacherController.createTeacher("Кадышева", 35, "ИЗО");
        teacherController.createTeacher("Зворыкин", 40, "Химия");

        for (Teacher teacher : teachers) {
            System.out.println("Имя: " + teacher.getName());
            System.out.println("Возраст: " + teacher.getAge());
            System.out.println("Предмет: " + teacher.getSubject());
            System.out.println();
        }


    }
}
