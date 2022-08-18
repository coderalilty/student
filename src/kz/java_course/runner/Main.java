package kz.java_course.runner;

import kz.java_course.beans.Student;
import kz.java_course.beans.enums.Faculty;
import kz.java_course.services.StudentService;

import java.time.LocalDate;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        StudentService studentService = new StudentService();
        Scanner sc = new Scanner(System.in);
        System.out.println("Input number or faculty");
        System.out.println("MATH");
        System.out.println("BIOLOGY");
        String facultyStr = sc.next();
        studentService.facultyStudentShow(getStudents(), Faculty.valueOf(facultyStr));
    }
    public static Student[] getStudents() {
        Student[] students = new Student[3];
        students[0] = new Student(1, "Reez", "Fd", "Reezede"
                , LocalDate.of(1998, 1, 1),"South nhu", "4551",
                Faculty.MATH, 2, "rfrf");
        students[1] = new Student(2, "Rescscez", "Fd", "Reezede"
                , LocalDate.of(1999, 1, 1),"South", "4551",
                Faculty.BIOLOGY, 3, "rfrf");
        students[2] = new Student(1, "Aqaza", "Fd", "Reezede"
                , LocalDate.of(1999, 1, 1),"South", "4551",
                Faculty.MATH, 1, "rfrf");

        return students;
    }
}