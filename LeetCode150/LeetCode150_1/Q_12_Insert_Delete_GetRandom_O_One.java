package LeetCode150.LeetCode150_1;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Random;

public class Q_12_Insert_Delete_GetRandom_O_One {
    public static void main(String[] args) {
        // Instantiate the object
        RandomizedSet rs = new RandomizedSet();

        System.out.println("Insert 1: " + rs.insert(1));
        System.out.println("Insert 2: " + rs.insert(2));
        System.out.println("Insert 2: " + rs.insert(2)); // Should be false, duplicate
        System.out.println("Remove 1: " + rs.remove(1));
        
        // At this point, only '2' is in the set
        System.out.println("GetRandom: " + rs.getRandom());

        rs.insert(3);
        // Will randomly return 2 or 3
        System.out.println("GetRandom (after insert 3): " + rs.getRandom());
    }
}

// FAANG Standard Object-Oriented Class Design
class RandomizedSet {
    private final HashMap<Integer, Integer> map;
    private final ArrayList<Integer> list;
    private final Random rand;

    // Correct constructor syntax
    public RandomizedSet() {
        map = new HashMap<>();
        list = new ArrayList<>();
        rand = new Random();
    }

    // Instance methods (no 'static' keyword)
    public boolean insert(int val) {
        if (map.containsKey(val)) {
            return false;
        }
        
        // Value maps to its current index in the array
        map.put(val, list.size());
        list.add(val);
        return true;
    }

    public boolean remove(int val) {
        if (!map.containsKey(val)) {
            return false;
        }

        // 1. Get the index of the element to remove, and the value of the last element
        int indexToRemove = map.get(val);
        int lastVal = list.get(list.size() - 1);

        // 2. Move the last element into the gap created by the removed element
        list.set(indexToRemove, lastVal);
        
        // 3. Update the map to reflect the new location of the swapped element
        map.put(lastVal, indexToRemove);

        // 4. Pop the duplicate last element and remove the original target from the map
        list.remove(list.size() - 1);
        map.remove(val);
        
        return true;
    }

    public int getRandom() {
        int randomIndex = rand.nextInt(list.size());
        return list.get(randomIndex);
    }
}