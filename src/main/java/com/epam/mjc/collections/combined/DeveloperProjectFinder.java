package com.epam.mjc.collections.combined;

import java.util.*;

public class DeveloperProjectFinder {
    public List<String> findDeveloperProject(Map<String, Set<String>> projects, String developer) {
        List<String> p = new ArrayList<>();

        for (String project : projects.keySet()) {
            if (projects.get(project).contains(developer)) {
                p.add(project);
            }
        }

        p.sort(new ProjectNameComparator());

        return p;
    }
}

class ProjectNameComparator implements Comparator<String> {

    @Override
    public int compare(String s1, String s2) {

        int s1Length = s1.length();
        int s2Length = s2.length();

        if (s1Length > s2Length) {
            return -1;
        } else if (s1Length == s2Length) {
            return s2.compareTo(s1);
        } else {
            return 1;
        }
    }
}
