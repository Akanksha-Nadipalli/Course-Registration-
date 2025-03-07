public class Student {
    int id;
    String sname;
    Course[] registeredCourses;
    int count;

    public Student(int id, String sname, int maxCourses) {
        this.id = id;
        this.sname = sname;
        this.registeredCourses = new Course[maxCourses];
        this.count = 0;
    }

    public boolean register(Course course) {
        if (count >= registeredCourses.length) {
            System.out.println("Cannot register for courses anymore");
            return false;
        }
        if (course.isFull()) {
            System.out.println("Course is full, try another course.");
            return false;
        }
        registeredCourses[count++] = course;
        course.enrollingStudent();
        return true;
    }

    public void displayRegisteredCourses() {
        System.out.println("\n" + sname + "'s Registered Courses:");
        if (count == 0) {
            System.out.println("No courses registered.");
        } else {
            for (int i = 0; i < count; i++) {
                System.out.println((i + 1) + ". " + registeredCourses[i].cname);
            }
        }
    }
}

