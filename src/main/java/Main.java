import java.util.HashMap;
import java.util.Map;

public class Main {

    public static void main(String[] args) {
        Generyka <String> generyka= new Generyka<String> ("Test");
        System.out.println(generyka.getField());
        Generyka <Integer> generyka1= new Generyka <Integer>(5);
        System.out.println(generyka1.getField());

        Map<Integer, String> map= new HashMap<Integer, String>();
        map.put (1, "Jan");
        map.put (2,"Iwo");
        map.put(3, "III");
        map.put(4, "Ola");
        System.out.println(map);


        for (Map.Entry<Integer, String> entry : map.entrySet())
        {
            System.out.println(entry.getKey() + "/" + entry.getValue());
        }
    }


    }
