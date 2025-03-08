package hashSet;

import java.util.HashSet;

public class HashSetDemo {
    public static void main(String[] args) {
        HashSet<Integer> set = new HashSet<>();
        set.add(100);
        set.add(200);
        set.add(300);
        set.add(200);
        System.out.println(set);
        if(set.contains(100))
            System.out.println("yess, its there");

        if (!set.contains(20))
            System.out.println("not contains");
        System.out.println("+++++++++++++++++");
        HashSet<String> stringSet = new HashSet<>();
        stringSet.add("Shri");
        stringSet.add("Hari");
        stringSet.add("Janardhana");
        stringSet.add("Tri Vikrama");
        stringSet.add("Hari");
        System.out.println(stringSet);


    }
}
