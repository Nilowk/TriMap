package fr.nilowk.tuto.utils;

import java.util.*;
import java.util.ArrayList;

public class TriMap<K, V, X> {

    private List<K> keys = new ArrayList<>();
    private List<V> values = new ArrayList<>();
    private List<X> secondValues = new ArrayList<>();

    public void put(K key, V value, X secondValue) {
        if (keys.contains(key)) {
            try {
                throw new Exception();
            } catch (Exception e) {
                e.printStackTrace();
                return;
            }
        }
        this.keys.add(key);
        this.values.add(value);
        this.secondValues.add(secondValue);
    }

    public void replace(K key, V newValue) {
        if (keys.contains(key)) {
            int index = getIndex(key);
            values.set(index, newValue);
        }
    }

    public void replaceS(K key, X newSecondValue) {
        if (keys.contains(key)) {
            int index = getIndex(key);
            secondValues.set(index, newSecondValue);
        }
    }

    public V getValue(K key) {
        if (this.keys.contains(key)) {
            int index = getIndex(key);
            return values.get(index);
        }
        return null;
    }

    public X getSecondValue(K key) {
        if (this.keys.contains(key)) {
            int index = getIndex(key);
            return secondValues.get(index);
        }
        return null;
    }

    public void remove(K key) {
        if (keys.contains(key)) {
            int index = getIndex(key);
            keys.remove(key);
            values.remove(index);
            secondValues.remove(index);
        }
    }

    public void clear() {
        keys.clear();
        values.clear();
        secondValues.clear();
    }

    public int getSize() {
        return keys.size();
    }

    private Integer getIndex(K key) {
        int index = 0;
        for (K k : keys) {
            if (k == key) {
                return index;
            }
            index++;
        }
        return null;
    }

}
