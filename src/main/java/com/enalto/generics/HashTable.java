package com.enalto.generics;

public class HashTable<K, V> {
    private final K key;
    private final V value;

    public HashTable(K key, V value) {
        this.key = key;
        this.value = value;
    }

    @Override
    public String toString() {
        return "HashTable{" +
                "key=" + key +
                ", value=" + value +
                '}';
    }
}
