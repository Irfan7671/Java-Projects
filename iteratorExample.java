package demo;
import java.util.*;

public class iteratorExample {
    public static void main(String[] args) {
        List<String> names = new ArrayList<>(List.of("A", "B", "C"));
        ListIterator<String> it = names.listIterator();

        while (it.hasNext()) {
            String name = it.next();
            System.out.println("Forward: " + name);
        }

        while (it.hasPrevious()) {
            String name = it.previous();
            System.out.println("Backward: " + name);
        }
    }
}
