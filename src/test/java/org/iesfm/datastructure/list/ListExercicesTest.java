package org.iesfm.datastructure.list;

import org.junit.Assert;
import org.junit.Test;

import java.util.LinkedList;
import java.util.List;

public class ListExercicesTest {

    @Test
    public void getFirtsTest() {
        ListExercices listExercices = new ListExercices();
        List<String> names = new LinkedList<>();
        names.add("Jose");
        names.add("Sergio");
        names.add("Halso");

        String firstName = listExercices.getFirts(names);


        Assert.assertEquals("Jose", firstName);

    }

    @Test
    public void FirtElementEmptyListTest() {
        ListExercices listExercices = new ListExercices();
        List<String> name = new LinkedList<>();

        String firstName = listExercices.getFirts(name);

        Assert.assertNull(firstName);
    }

    @Test
    public void getLastTest() {
        ListExercices listExercices = new ListExercices();
        List<String> names = new LinkedList<>();
        names.add("Jose");
        names.add("Sergio");
        names.add("Halso");

        String lastName = listExercices.getLast(names);

        Assert.assertEquals("Halso", lastName);

    }

    @Test
    public void LastElementEmptyListTest() {
        ListExercices listExercices = new ListExercices();
        List<String> name = new LinkedList<>();

        String firstName = listExercices.getLast(name);

        Assert.assertNull(firstName);
    }

    @Test
    public void insertInFirstTest() {
        ListExercices listExercices = new ListExercices();
        List<String> names = new LinkedList<>();
        names.add("Carlos");


        List<String> insertFisrt = listExercices.insertInFirst(names, "Jose");

        List<String> expected = new LinkedList<>();
        expected.add("Jose");
        expected.add("Carlos");

        Assert.assertEquals(expected, insertFisrt);
    }

    @Test
    public void insertInFirstEmptyListTest() {
        ListExercices listExercices = new ListExercices();
        List<String> names = new LinkedList<>();


        List<String> insertFisrt = listExercices.insertInFirst(names, "Jose");

        List<String> expected = new LinkedList<>();
        expected.add("Jose");

        Assert.assertEquals(expected, insertFisrt);
    }

    @Test
    public void repalceNameInFirst() {
        ListExercices listExercices = new ListExercices();
        List<String> names = new LinkedList<>();

        names.add("Jose");
        names.add("Carlos");

        List replaceName = listExercices.repalceInposition(names, 1, "Ana");

        List<String> expected = new LinkedList<>();
        expected.add("Jose");
        expected.add("Ana");

        Assert.assertEquals(expected, replaceName);

    }

    @Test(expected = IndexOutOfBoundsException.class)
    public void replaceNameInvalidPosition()throws IndexOutOfBoundsException {
        ListExercices listExercices = new ListExercices();
        List<String> names = new LinkedList<>();

        names.add("Jose");
        names.add("Carlos");

        List replaceName = listExercices.repalceInposition(names, 1, "Ana");

        List<String> expected = new LinkedList<>();
        expected.add("Jose");
        expected.add("Ana");

        Assert.assertEquals(expected, replaceName);
    }

}
