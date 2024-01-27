package Home;

import java.util.List;

class TeacherService {
    private List<Teacher> teachers;

    public TeacherService(List<Teacher> teachers) {
        this.teachers = teachers;
    }

    public void addTeacher(Teacher teacher) {
        this.teachers.add(teacher);
    }

    public void editTeacher(int index, Teacher updatedTeacher) {
        if (index >= 0 && index < this.teachers.size()) {
            this.teachers.set(index, updatedTeacher);
        }

    }

    public List<Teacher> getAllTeachers() {
        return this.teachers;
    }
}

