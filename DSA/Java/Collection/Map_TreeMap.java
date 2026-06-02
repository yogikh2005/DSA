
import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;


public  class Map_TreeMap
{
    public static void main(String[] args) {
        
        Map<String,String>map = new TreeMap<>();

        map.put("en", "England");
        map.put("in", "India");
        map.put("us", "unisted States");

        System.out.println(map);


        Map<String,String>table = new HashMap<>();

        table.putAll(map);

        System.out.println(table);

        table.remove("en");

        System.out.println(table);

        System.out.println(table.get("en"));

        System.out.println(table.getOrDefault("usa", "NONE"));

        System.out.println(table.containsKey("in"));

        System.out.println(table.containsValue("India"));

        table.replace("in", "Indonesia");

        System.out.println(table);

        Set<String>kset = table.keySet();

        System.err.println(kset);

        Collection<String> value = table.values();
        System.err.println(value);

        Set<Map.Entry<String,String>> st = table.entrySet();
        System.err.println(st);


        for(Map.Entry<String,String> st2 : table.entrySet())
        {
            System.out.println("Key : " + st2.getKey()+" Value : "+st2.getValue());
        }
}
}