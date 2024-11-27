import java.util.*;

public class arrayList {
    public static void main(String[] args) {
        ArrayList<String> animals = new ArrayList<>();
        animals.add("dog");
        animals.add("cat");
        animals.add("camel");
        System.out.println("ArrayList :" + animals);
        System.out.println(animals.size());
        String a = animals.get(2);
        System.out.println("accessed element :" + a);
        String b = animals.remove(0);
        System.out.println("removed element :" + b);
        System.out.println("ArrayList :" + animals);
    }
}
