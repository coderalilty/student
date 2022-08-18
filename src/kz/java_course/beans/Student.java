package kz.java_course.beans;

import kz.java_course.beans.enums.Faculty;

import java.time.LocalDate;
import java.util.Objects;

public class Student {
    private int id;
    private String firstName;
    private String middleName;
    private String surName;
    private LocalDate birthDate;
    private String address;
    private String phoneNumber;
    private Faculty faculty;
    private int course;
    private String group;

    public Student(int id, String firstName, String middleName, String surName, LocalDate birthDate, String address, String phoneNumber, Faculty faculty, int course, String group) {
        this.id = id;
        this.firstName = firstName;
        this.middleName = middleName;
        this.surName = surName;
        this.birthDate = birthDate;
        this.address = address;
        this.phoneNumber = phoneNumber;
        this.faculty = faculty;
        this.course = course;
        this.group = group;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getMiddleName() {
        return middleName;
    }

    public void setMiddleName(String middleName) {
        this.middleName = middleName;
    }

    public String getSurName() {
        return surName;
    }

    public void setSurName(String surName) {
        this.surName = surName;
    }

    public LocalDate getBirthDate() {
        return birthDate;
    }

    public void setBirthDate(LocalDate birthDate) {
        this.birthDate = birthDate;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public Faculty getFaculty() {
        return faculty;
    }

    public void setFaculty(Faculty faculty) {
        this.faculty = faculty;
    }

    public int getCourse() {
        return course;
    }

    public void setCourse(int course) {
        this.course = course;
    }

    public String getGroup() {
        return group;
    }

    public void setGroup(String group) {
        this.group = group;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Student student = (Student) o;

        if (id != student.id) return false;
        if (course != student.course) return false;
        if (!Objects.equals(firstName, student.firstName)) return false;
        if (!Objects.equals(middleName, student.middleName)) return false;
        if (!Objects.equals(surName, student.surName)) return false;
        if (!Objects.equals(birthDate, student.birthDate)) return false;
        if (!Objects.equals(address, student.address)) return false;
        if (!Objects.equals(phoneNumber, student.phoneNumber)) return false;
        if (faculty != student.faculty) return false;
        return Objects.equals(group, student.group);
    }

    @Override
    public int hashCode() {
        int result = id;
        result = 31 * result + (firstName != null ? firstName.hashCode() : 0);
        result = 31 * result + (middleName != null ? middleName.hashCode() : 0);
        result = 31 * result + (surName != null ? surName.hashCode() : 0);
        result = 31 * result + (birthDate != null ? birthDate.hashCode() : 0);
        result = 31 * result + (address != null ? address.hashCode() : 0);
        result = 31 * result + (phoneNumber != null ? phoneNumber.hashCode() : 0);
        result = 31 * result + (faculty != null ? faculty.hashCode() : 0);
        result = 31 * result + course;
        result = 31 * result + (group != null ? group.hashCode() : 0);
        return result;
    }

    @Override
    public String toString() {
        return "Student{" +
                "id=" + id +
                ", firstName='" + firstName + '\'' +
                ", middleName='" + middleName + '\'' +
                ", surName='" + surName + '\'' +
                ", birthDate=" + birthDate +
                ", address='" + address + '\'' +
                ", phoneNumber='" + phoneNumber + '\'' +
                ", faculty=" + faculty +
                ", course=" + course +
                ", group='" + group + '\'' +
                '}';
    }
}
