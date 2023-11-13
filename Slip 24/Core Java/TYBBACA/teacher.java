package TYBBACA;

public class teacher {
    int TID;
    String TName;
    public String Subject;

    public teacher(int TID, String TName, String Subject) {
        this.TID = TID;
        this.TName = TName;
        this.Subject = Subject;
    }

    public void disp() {
        System.out.println("Teacher ID: " + TID);
        System.out.println("Teacher name: " + TName);
        System.out.println("Subject: " + Subject);
    }

    protected void finalize() throws Throwable {
        System.out.println("Teacher object is garbage collected");
    }
}
