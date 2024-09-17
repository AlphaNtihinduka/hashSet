import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        HashSet<String> set1 = new HashSet<>();
        set1.add("Monday");
        set1.add("Tuesday");
        set1.add("Wednesday");
        set1.add("Thursday");
        set1.add("Friday");
        set1.add("Saturday");
        set1.add("Sunday");

        System.out.println(set1);
        Set<String> set2 = new LinkedHashSet<>();
        set2.add("Monday");
        set2.add("Tuesday");
        set2.add("Wednesday");
        set2.add("Thursday");
        set2.add("Friday");
        set2.add("Saturday");
        set2.add("Sunday");

        System.out.println(set2);

        boolean equal = set1.equals(set2);

        System.out.println("Is the first Set equal to the second one? :"+equal);
    }
}