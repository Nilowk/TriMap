package fr.nilowk.tuto.utils;

import java.util.*;
import java.util.ArrayList;

public class TriMap<K, V, X> {

    private List<K> keys = new ArrayList<>();
    private List<V> values = new ArrayList<>();
    private List<X> secondValues = new ArrayList<>();

    public X put(K key, V value, X secondValue) throws Exception {
        if (keys.contains(key)) {
            throw new Exception();
        }
        System.out.println("caca");
        this.keys.add(key);
        this.values.add(value);
        this.secondValues.add(secondValue);
        return secondValue;
    }

    public V getValue(K key) {
        if (this.values.contains(key)) {
            int index = 0;
            for (V v : values) {
                if (v == key) {
                    return values.get(index);
                }
                index++;
            }
        }
        return null;
    }

}
