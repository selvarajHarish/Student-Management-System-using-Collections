package collection.studentsystem;

import java.util.*;

public class StudentController {
    static Scanner sc = new Scanner(System.in);
    static ArrayList<Student> students = new ArrayList<>();

    // CREATE
    public static void addStudent() {
        Student s = new Student();
        System.out.print("Name: "); s.setName(sc.next());
        System.out.print("Phone: "); s.setPhone(sc.nextLong());
        System.out.print("Email: "); s.setEmail(sc.next());
        System.out.print("Gender: "); s.setGender(sc.next());
        System.out.print("Degree: "); s.setDegree(sc.next());
        System.out.print("Stream: "); s.setStream(sc.next());
        System.out.print("YOP: "); s.setYop(sc.nextInt());
        System.out.print("CGPA: "); s.setCgpa(sc.nextDouble());
        s.setStatus("Not placed");
        s.setDoj(new Date());
        students.add(s);
        System.out.println("Student added successfully!");
    }

    // READ
    public static void displayStudent() {
        if (students.size() != 0) {
            System.out.print("Phone: ");
            long phone = sc.nextLong();
            for (Student s : students) {
                if (s.getPhone() == phone) {
                    System.out.println(s);
                    return;
                }
            }
            System.err.println("Student not found!");
        } else {
            System.err.println("No students in the system!");
        }
    }

    // UPDATE
    public static void updateStudentPhone() {
        if (students.size() != 0) {
            System.out.print("Phone: ");
            long phone = sc.nextLong();
            for (Student s : students) {
                if (s.getPhone() == phone) {
                    System.out.print("New phone: ");
                    s.setPhone(sc.nextLong());
                    System.out.println("Phone updated successfully!");
                    return;
                }
            }
            System.err.println("Student not found!");
        } else {
            System.err.println("No students in the system!");
        }
    }

    // DELETE
    public static void removeStudent() {
        if (students.size() != 0) {
            System.out.print("Phone: ");
            long phone = sc.nextLong();
            Iterator<Student> itr = students.iterator();
            while (itr.hasNext()) {
                if (itr.next().getPhone() == phone) {
                    itr.remove();
                    System.out.println("Student removed successfully!");
                    return;
                }
            }
            System.err.println("Student not found!");
        } else {
            System.err.println("No students in the system!");
        }
    }

    // UPDATE status
    public static void updatePlacementStatus() {
        if (students.size() != 0) {
            System.out.print("Phone: ");
            long phone = sc.nextLong();
            for (Student s : students) {
                if (s.getPhone() == phone) {
                    System.out.print("New status: ");
                    s.setStatus(sc.next());
                    System.out.println("Status updated successfully!");
                    return;
                }
            }
            System.err.println("Student not found!");
        } else {
            System.err.println("No students in the system!");
        }
    }
}
