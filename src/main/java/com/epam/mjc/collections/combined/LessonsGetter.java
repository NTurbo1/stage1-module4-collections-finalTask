package com.epam.mjc.collections.combined;

import java.util.*;

public class LessonsGetter {
    public Set<String> getLessons(Map<String, List<String>> timetable) {
        Set<String> subjects = new TreeSet<>();

        for (String key : timetable.keySet()) {
            subjects.addAll(timetable.get(key));
        }

        return subjects;
    }
}
