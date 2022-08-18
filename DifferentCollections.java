import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class DifferentCollections {

    public static void main(String[] args) {
        // collections: list, set, map

        // List: allows duplicates
        // keeps it in order by index
        // can add null to value
        // common implementations: ArrayList, LinkedList, Vector
        List<String> students = new ArrayList<>();
        students.add("robb");
        students.add("robb");
        students.add("steve");
        students.add(null);
        System.out.println(students);

        // Set: does not allow duplicates = a map is a dictionary
        // unordered
        // does allow null value
        // common implementations: HashSet, LinkedHashSet, TreeSet
        Set<String> states = new HashSet<String>();
        states.add("minnesota");
        states.add("michigan");
        states.add("california");
        states.add("alaska");
        System.out.println(states);

        System.out.println("contains: " + states.contains("florida"));
        // states.remove("michigan");

        if (states.contains("florida")) {
            states.remove("michigan");
        }

        // Map = Map<K, V> where K is the key and V is the value
        // has key/value pairs dictionary
        // values can be duplicated but NOT KEYS
        // key : value
        // word : "this is a value of the key 'word'"
        // common implementations: HashMap, LinkedHashMap, TreeUp, HashTable
        Map<Integer, String> racerPlacements = new HashMap<Integer, String>();
        racerPlacements.put(1, "billy");
        racerPlacements.put(2, "billy idol");
        racerPlacements.put(3, "billie ellish");
        System.out.println(racerPlacements);
        System.out.println(racerPlacements.get(2));
        racerPlacements.remove(1);

        Map<String, String> aMapThing = new HashMap<String, String>();
        aMapThing.put("location", "miami beach");
        aMapThing.put("instructor", "ms peach");
        aMapThing.put("sign", "capricorn");
        System.out.println(aMapThing);
        System.out.println(aMapThing.get("location"));
        // if the key data type does not match, it will return null

        // keySet() returns a set of keys contained in the map
        Set<Integer> racerKeys = racerPlacements.keySet();
        Set<String> mapKeys = aMapThing.keySet();
        // System.out.println(racerKeys);
        // System.out.println(mapKeys);

        for (String key : mapKeys) {
            System.out.println(key + ": " + aMapThing.get(key));
        }

        for (Integer racer : racerKeys) {
            System.out.println(racer + ": " + racerPlacements.get(racer));
        }

        // values() returns a set of values contained in the map
        Collection<String> racers = racerPlacements.values();
        // System.out.println(racers);
        for (String racer : racers) {
            System.out.println(racer);
        }

        System.out.println("contains: " + states.contains("michigan"));
    }
}
