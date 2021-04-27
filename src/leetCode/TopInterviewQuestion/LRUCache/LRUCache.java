package leetCode.TopInterviewQuestion.LRUCache;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;

public class LRUCache {

    int capacity=0;
    LinkedHashMap<Integer,Integer> map;
    LRUCache(int capacity){
        this.capacity=capacity;
        this.map = new LinkedHashMap<Integer, Integer>(capacity,0.75f,true);
    }

    public int get(int key) {
            return map.getOrDefault(key,-1);
        }


    public void put(int key, int value) {
        if(!map.containsKey(key) && map.size()==capacity){
            int firstKey = map.keySet().iterator().next();
            map.remove(firstKey);
        }
        map.put(key,value);
    }
}
