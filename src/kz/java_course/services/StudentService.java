package kz.java_course.services;

import kz.java_course.beans.enums.Faculty;
import kz.java_course.beans.Student;

public class StudentService {

    public void facultyStudentShow (Student[] students, Faculty faculty) {
        for (Student student: students) {
            if (student.getFaculty() == faculty) {
                System.out.println(student);
            }
        }
    }
}
