import java.util.*;

class program2 {
    public static void main(String args[]) {
        LinkedList<String> list = new LinkedList<>();
        list.add("CPP");
        list.add("Java");
        list.add("Python");
        list.add("PHP");
        ListIterator<String> iterator = list.listIterator();
        System.out.println("Forward iteration:");
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }
        System.out.println("\nBackward iteration:");
        while (iterator.hasPrevious()) {
            System.out.println(iterator.previous());
        }
    }
}
