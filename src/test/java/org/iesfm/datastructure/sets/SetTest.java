package org.iesfm.datastructure.sets;


import org.junit.Assert;
import org.junit.Test;

import java.util.*;

public class SetTest {
    @Test
    public void checkNameTest() {
        ListWihtSet listWihtSet = new ListWihtSet();
        Set<String> names = new HashSet<>();

        names.add("Jose");
        names.add("Carlos");
        names.add("Ana");

        boolean expected = listWihtSet.checkNames(names, "Jose");

        Assert.assertTrue(expected);
    }

    @Test
    public void insertNameTest() {
        ListWihtSet listWihtSet = new ListWihtSet();
        Set<String> names = new HashSet<>();

        names.add("Jose");
        names.add("Carlos");

        listWihtSet.insertNames(names, "Ana");

        Set<String> expected = new HashSet<>();

        expected.add("Jose");
        expected.add("Carlos");
        expected.add("Ana");


        Assert.assertEquals(expected, names);

    }

    @Test
    public void insertNameSameNameTest() {
        ListWihtSet listWihtSet = new ListWihtSet();
        Set<String> names = new HashSet<>();

        names.add("Jose");


        listWihtSet.insertNames(names, "Jose");

        Set<String> expected = new HashSet<>();

        expected.add("Jose");


        Assert.assertEquals(expected, names);

    }

    @Test
    public void toListTreeSetTest() {
        ListWihtSet listWihtSet = new ListWihtSet();


        Set<String> names = new TreeSet<>();

        names.add("Charlyno");
        names.add("Albarran");
        names.add("Balvario");
        names.add("Dedario");
        names.add("Federico");
        names.add("Eustaquio");

        List<String> list = listWihtSet.toList(names);

        List<String> expected = new ArrayList<>();

        expected.add("Albarran");
        expected.add("Balvario");
        expected.add("Charlyno");
        expected.add("Dedario");
        expected.add("Eustaquio");
        expected.add("Federico");


        Assert.assertEquals(expected, list);

    }

    @Test
    public void toListHashSetTest() {
        ListWihtSet listWihtSet = new ListWihtSet();


        Set<String> names = new HashSet<>();

        names.add("Charlyno");
        names.add("Albarran");
        names.add("Balvario");
        names.add("Dedario");
        names.add("Federico");
        names.add("Eustaquio");

        List<String> list = listWihtSet.toList(names);

        List<String> expected = new ArrayList<>();

        expected.add("Albarran");
        expected.add("Balvario");
        expected.add("Charlyno");
        expected.add("Dedario");
        expected.add("Eustaquio");
        expected.add("Federico");


        Assert.assertEquals(expected, list);

    }

    @Test
    public void toSetTest() {
        ListWihtSet listWihtSet = new ListWihtSet();


        List<String> names = new ArrayList<>();

        names.add("Charlyno");
        names.add("Albarran");
        names.add("Balvario");
        names.add("Dedario");
        names.add("Federico");
        names.add("Eustaquio");

        Set<String> list = listWihtSet.toListReverse(names);

        TreeSet<String> expected = new TreeSet<>();

        expected.add("Albarran");
        expected.add("Balvario");
        expected.add("Charlyno");
        expected.add("Dedario");
        expected.add("Eustaquio");
        expected.add("Federico");


        Assert.assertEquals(expected, list);

    }

}
