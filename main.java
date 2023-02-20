import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class hmaphash {
    public static void main(String[] args) {
        HashMap<String, Integer> map =new HashMap<>();
        map.put("India",120);
        map.put("Us",40);
        map.put("Canada",34);
        System.out.println(map);
        map.put("India",890);
        System.out.println(map);
        map.remove("Us");
        System.out.println(map);
        if(map.containsKey("Iniiid")){
            System.out.println("Exists");
        }else{
            System.out.println("Not existing");
        }
        ArrayList<String> arr = new ArrayList<>();
        arr.add("Gokul");
        arr.add("Python");
        arr.add("Java");
        for(String u : arr){
            System.out.println(u);
        }

        for(Map.Entry<String, Integer> e : map.entrySet()){
            System.out.println(e.getKey());
            System.out.println(e.getValue());
        }

    }
}

