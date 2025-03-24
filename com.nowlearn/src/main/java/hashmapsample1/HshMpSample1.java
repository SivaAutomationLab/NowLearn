package hashmapsample1;

import io.cucumber.java.sl.In;

import java.util.HashMap;

public class HshMpSample1 {
    public static void main(String [] args){
        HashMap<Integer, String> map = new HashMap<>();
        map.put(1001, "Siva");
        map.put(1002, "Siva");
        map.get("first");
        map.put(null, "Siva");
        System.out.println(map.keySet());
        System.out.println(map.values());
        map.put(1002, "Siva");
        map.put(null, "Arun");
       // System.out.println(map.remove(null));
        System.out.println(map);


    }
}
