package Home;

import java.util.Iterator;
import java.util.List;

class TeacherView {
    TeacherView() {
    }

    public void displayTeachers(List<Teacher> teachers) {
        System.out.println("Список преподавателей:" + teachers);

    }

    public void displayTeacherDetails(Teacher teacher) {
        System.out.println("Информация о преподавателе:" + teacher.getName() );
    }

    public void displayErrorMessage(String message) {
        System.out.println("Ошибка: " + message);
    }

}
