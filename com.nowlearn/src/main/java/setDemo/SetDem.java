package setDemo;

import java.util.*;

public class SetDem {

    public static void main(String[] args) {

        List<String> l = new ArrayList<>();
        l.add("Six");
        l.add("Nine");
        l.add("Eight");
        l.add("Three");

        System.out.println(l);


        Set<String> s = new LinkedHashSet<>(l);
        s.add("Five");
        s.add("Nine");
        s.add("Four");
        System.out.println(s.size());

        System.out.println(s);

        boolean flag = s.isEmpty();
        System.out.println(s.isEmpty());
        s.clear();
        System.out.println(s.isEmpty());

    }
}

