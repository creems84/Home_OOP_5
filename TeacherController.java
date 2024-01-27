package Home;

import java.util.List;

class TeacherController {
    private TeacherService teacherService;
    private TeacherView teacherView;

    public TeacherController(TeacherService teacherService, TeacherView teacherView) {
        this.teacherService = teacherService;
        this.teacherView = teacherView;
    }

    public void createTeacher(String name, int age, String subject) {
        Teacher teacher = new Teacher(name, age, subject);
        this.teacherService.addTeacher(teacher);
        this.teacherView.displayTeacherDetails(teacher);
    }

    public void editTeacher(int index, String name, int age, String subject) {
        if (index >= 0 && index < this.teacherService.getAllTeachers().size()) {
            Teacher teacher = (Teacher)this.teacherService.getAllTeachers().get(index);
            teacher.setName(name);
            teacher.setAge(age);
            teacher.setSubject(subject);
            this.teacherView.displayTeacherDetails(teacher);
        } else {
            this.teacherView.displayErrorMessage("Недопустимый индекс преподавателя");
        }

    }

    public void displayTeachers() {
        List<Teacher> teachers = this.teacherService.getAllTeachers();
        this.teacherView.displayTeachers(teachers);
    }
}
