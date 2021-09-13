package lesson_7.task_2;

import java.util.Map;
import java.util.Set;
import java.util.Collection;
import java.util.HashMap;

public class ThreeHashMap<K, V1, V2> extends HashMap<K, V1> {
    private Map<K, V1> map1 = new HashMap<>();
    private Map<K, V2> map2 = new HashMap<>();

    @Override
    public int size() {
        return map1.size();
    }

    @Override
    public boolean isEmpty() {
        return map1.isEmpty();
    }

    public boolean containsValue1(Object value) {
        return map1.containsValue(value);
    }

    public boolean containsValue2(Object value) {
        return map2.containsValue(value);
    }

    public Object getFirst(Object key) {
        return map1.get(key);
    }

    public Object getSecond(Object key) {
        return map2.get(key);
    }

    @Override
    public V1 remove(Object key) {
        map1.remove(key);
        map2.remove(key);
        return null;
    }

    @Override
    public Set<K> keySet() {
        return map1.keySet();
    }

    public Collection<V1> values1() {
        return map1.values();
    }

    public Collection<V2> values2() {
        return map2.values();
    }

    public void putAll(Map<K, V1> map1, Map<K, V2> map2) {
        for (K key : map1.keySet()) {
            if (map2.containsKey(key)) {
                this.map1.put(key, map1.get(key));
                this.map2.put(key, map2.get(key));
            }
        }
    }

    public void put(K key, V1 value1, V2 value2) {
        map1.put(key, value1);
        map2.put(key, value2);
    }

    @Override
    public void clear() {
        map1.clear();
        map2.clear();
    }

    public void printAll() {
        for (K key : map1.keySet()) {
            System.out.println(key.toString() + ' ' + map1.get(key).toString() + ' ' + map2.get(key).toString() + '\n');
        }
    }
}