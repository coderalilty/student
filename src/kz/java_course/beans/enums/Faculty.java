package kz.java_course.beans.enums;

public enum Faculty {

    MATH("Математикалық"), BIOLOGY("Биологиялық");
    private String name;
    private int id;

    Faculty(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

}
