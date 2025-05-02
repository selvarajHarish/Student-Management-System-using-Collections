package collection.studentsystem;

public class StudentView {
    public static void main(String[] args) {
        while (true) {
            System.out.println("***** Student Management System *****");
            System.out.println("1. Add Student\n2. View Student\n3. Update Phone\n4. Remove Student\n5. Update Status\n6. Exit");
            int choice = StudentController.sc.nextInt();
            switch (choice) {
                case 1 -> StudentController.addStudent();
                case 2 -> StudentController.displayStudent();
                case 3 -> StudentController.updateStudentPhone();
                case 4 -> StudentController.removeStudent();
                case 5 -> StudentController.updatePlacementStatus();
                case 6 -> {
                    System.out.println("Exited successfully!");
                    return;
                }
                default -> System.out.println("Invalid choice! Try again.");
            }
        }
    }
}
