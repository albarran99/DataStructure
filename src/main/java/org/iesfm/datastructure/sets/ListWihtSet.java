package org.iesfm.datastructure.sets;

import java.util.*;

public class ListWihtSet {
    public boolean checkNames(Set<String> names, String name) {

        return names.contains(name);
    }

    public Set<String> insertNames(Set<String> names, String name) {
        names.add(name);

        return names;
    }

    public List<String> toList(Set<String> names) {
        List<String> list = new ArrayList<>(names);

        return list;
    }

    public TreeSet<String> toListReverse(List<String> names) {
        Comparator<String> comparator = new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                return o2.compareTo(o1);
            }
        };
        TreeSet<String> newSet = new TreeSet<>(comparator);
        newSet.addAll(names);
        return newSet;
    }

}
