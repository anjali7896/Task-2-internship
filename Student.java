import java.sql.SQLOutput;
import java.util.ArrayList;
import java.util.Scanner;

public class Student {
    private int id;
    private String name;
    private double grade;

    public Student(int id, String name, double grade) {
        this.id = id;
        this.name = name;
        this.grade = grade;


    }

    public int getId() {
        return id;
    }

    @Override
    public String toString() {
        return "Student{" + "grade=" + grade +
                ", id=" + id +
                ", name='" + name + '\'' + '}';

    }
}

