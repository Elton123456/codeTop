package com.jd.yibo.hash;

import java.util.LinkedHashMap;

public class LRUCacheSolution_146 {
    LinkedHashMap<Integer,Integer> map;
    int capacity;

    public LRUCacheSolution_146(int capacity) {
        map = new LinkedHashMap<>();
        this.capacity = capacity;
    }

    public int get(int key) {
        if(map.containsKey(key)){
            int value = map.get(key);
            map.remove(key);
            map.put(key,value);
            return value;
        }else {
            return -1;
        }
    }

    public void put(int key, int value) {
        if (map.containsKey(key)){
            map.remove(key);
        }
        while (map.size() >= capacity){
            map.remove(map.entrySet().iterator().next().getKey());
        }
        map.put(key,value);
    }

}
