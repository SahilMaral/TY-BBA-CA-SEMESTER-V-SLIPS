import TYBBACA.*;

class program2 {
    public static void main(String args[]) {
        student[] students = new student[3];
        students[0] = new student(101, "Sahil", 85.5);
        students[1] = new student(102, "Tejas", 90.0);
        students[2] = new student(103, "Aniket", 88.0);
        teacher[] teachers = new teacher[2];
        teachers[0] = new teacher(201, "Komal", "Java");
        teachers[1] = new teacher(202, "Shraddha", "Python");
        System.out.println("Details of the students:");
        for (student s : students) {
            s.disp();
            System.out.println();
        }
        System.out.println("Details of the teacher who is teaching Java subject:");
        for (teacher t : teachers) {
            if (t.Subject.equals("Java")) {
                t.disp();
                System.out.println();
            }
        }
    }
}
