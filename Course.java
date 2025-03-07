public class Course {  
    int id;
    String cname;
    int enrolled;
    int capacity;

    public Course(int id, String cname, int capacity) {
        this.id = id;
        this.cname = cname;
        this.capacity = capacity;
        this.enrolled = 0;
    }

    public boolean isFull() {
        return enrolled >= capacity;
    }

    public void enrollingStudent() {
        if (!isFull()) {
            enrolled++;
        }
    }

    public void display() {
        System.out.println(id + ". " + cname + " (" + enrolled + "/" + capacity + " enrolled)");
    }
}

