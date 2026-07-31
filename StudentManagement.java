import java.util.ArrayList;

class Student {

    private int id;
    private String name;

    public Student(int id, String name) {
        this.id = id;
        this.name = name;
    }

    @Override
    public String toString() {
        return "Student ID: " + id + ", Name: " + name;
    }
}

public class StudentManagement {

    public static void main(String[] args) {

        ArrayList<Student> students = new ArrayList<>();

        students.add(new Student(1, "Aman"));
        students.add(new Student(2, "Riya"));

        System.out.println("Student Details:");

        students.forEach(System.out::println);
    }
}
