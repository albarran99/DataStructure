package org.iesfm.datastructure.list;

import java.util.List;

public class ListExercices {

    public String getFirts(List<String> names) {
        if (names.isEmpty()) {
            return null;
        } else {

            return names.get(0);
        }

    }


    public String getLast(List<String> names) {
        if (names.isEmpty()) {
            return null;
        } else {
            int LastIndex = names.size() - 1;
            return names.get(LastIndex);
        }

    }

    public List<String> insertInFirst(List<String> names, String name) {
        names.add(0, name);

        return names;
    }

    public List<String> repalceInposition (List<String> names, int position, String name){
        names.set(1, name);

        return names;
    }


}
