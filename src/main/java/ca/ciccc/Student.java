package ca.ciccc;

import java.util.Objects;

public class Student {
    private String id;
    private String name;
    private int absenceCount;

    public Student(String id, String name) {
        this(id, name, 0);
    }

    public Student(String name, int absenceCount) {
        this("#TEST", name, absenceCount);
    }

    public Student(String id, String name, int absenceCount) {
        this.id = id;
        this.name = name;
        this.absenceCount = absenceCount;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAbsenceCount() {
        return absenceCount;
    }

    public void setAbsenceCount(int absenceCount) {
        this.absenceCount = absenceCount;
    }

    @Override
    public String toString() {
        return name + "(" + absenceCount + ")";
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Student student = (Student) o;
        return Objects.equals(id, student.id);
    }
}
