package arraylist;

import java.util.ArrayList;

public class ArayList {
    public static void main(String []args){
        ArrayList<Integer> al= new ArrayList();
        al.add(2);
        al.add(4);
        al.add(1, 41);
        int secondIndex = al.get(2);
        System.out.println("Sec Index " + secondIndex);
        System.out.println("full arraylist integer" + al);
        al.removeFirst();
        al.remove(Integer.valueOf(41));
        System.out.println("after removing index 0 " + al);
        System.out.println(al);
        ArrayList<String> st = new ArrayList<>();
        st.add("Si");
        st.add("va");
        st.add(2, "s");
        System.out.println("String Array LIst is " + st);
        st.remove("s");

        System.out.println("After removing String object s " + st);
        System.out.println("This is Integer ArrayList size " + al.size());
        System.out.println("This is String ArrayList size " + st.size());
        al.clear();
        st.clear();
        System.out.println(al.size() + " and " + st.size());

    }
}
