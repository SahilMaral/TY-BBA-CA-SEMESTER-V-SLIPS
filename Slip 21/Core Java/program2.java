import java.util.*;

class program2 {
    public static void main(String args[]) {
        Hashtable<String, String> obj = new Hashtable<>();
        obj.put("Pune", "020");
        obj.put("Mumbai", "022");
        obj.put("Chennai", "044");
        obj.put("Kolkata", "033");
        System.out.println("Hashtable: " + obj);
        String city = "Mumbai";
        if (obj.containsKey(city)) {
            System.out.println("The STD code of " + city + " is " + obj.get(city));
        } else {
            System.out.println("The city " + city + " is not in the hashtable.");
        }
    }
}
