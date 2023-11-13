package TYBBACA;

public class student {
    int Rno; 
    String SName; 
    double Per; 

    public student(int Rno, String SName, double Per) {
        this.Rno = Rno;
        this.SName = SName;
        this.Per = Per;
    }

    public void disp() {
        System.out.println("Roll number: " + Rno);
        System.out.println("Student name: " + SName);
        System.out.println("Percentage: " + Per);
    }

    protected void finalize() throws Throwable {
        System.out.println("Student object is garbage collected");
    }
}
