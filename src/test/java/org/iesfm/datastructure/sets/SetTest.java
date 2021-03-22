package org.iesfm.datastructure.sets;


import org.junit.Assert;
import org.junit.Test;

import java.util.HashSet;
import java.util.Set;

public class SetTest {
    @Test
    public void checkNameTest() {
        ListWihtSet listWihtSet = new ListWihtSet();
        Set<String> names = new HashSet<>();

        names.add("Jose");
        names.add("Carlos");
        names.add("Ana");

        boolean expected = listWihtSet.checkNames(names,"Jose");

        Assert.assertTrue(expected);
    }
}
