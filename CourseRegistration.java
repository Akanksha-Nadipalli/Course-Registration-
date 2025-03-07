import java.util.Scanner;

public class CourseRegistration {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Course[] courses = {
            new Course(1, "Java Programming", 2),
            new Course(2, "Data Structures and Algorithms", 3),
            new Course(3, "Database Management Systems", 2)
        };

        System.out.print("Enter student name: ");
        String studentName = sc.nextLine();
        Student student = new Student(101, studentName, 2);

        while (true) {
            System.out.println("\nMenu:");
            System.out.println("1. View Courses");
            System.out.println("2. Register for a Course");
            System.out.println("3. View Registered Courses");
            System.out.println("4. Exit");
            System.out.print("Enter choice: ");
            int choice = sc.nextInt();

            if (choice == 1) {
                System.out.println("\nAvailable Courses:");
                for (Course course : courses) {
                    course.display();
                }
            } else if (choice == 2) {
                System.out.print("Enter Course ID to register: ");
                int courseId = sc.nextInt();
                if (courseId < 1 || courseId > courses.length) {
                    System.out.println("Invalid course ID.");
                } else {
                    student.register(courses[courseId - 1]);
                }
            } else if (choice == 3) {
                student.displayRegisteredCourses();
            } else if (choice == 4) {
                System.out.println("Exiting...");
                break;
            } else {
                System.out.println("Invalid choice.");
            }
        }
        sc.close();
    }
}

