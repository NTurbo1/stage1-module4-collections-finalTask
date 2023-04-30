package com.epam.mjc.collections.combined;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import java.util.TreeSet;
import java.util.stream.Collectors;

public class MapFromKeysCreator {
    public Map<Integer, Set<String>> createMap(Map<String, Integer> sourceMap) {
        Map<Integer, Set<String>> map = new HashMap<>();

        Set<String> values = sourceMap.keySet();

        Set<Integer> keySet = values
                                    .stream()
                                    .map(key -> key.length())
                                    .collect(Collectors.toSet());

        for (int keyLength : keySet) {
            Set<String> value = new TreeSet<>();

            for (String k : values) {
                if (k.length() == keyLength) {
                    value.add(k);
                }
            }

            map.put(keyLength, value);
        }

        return map;
    }
}
