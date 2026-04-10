package com.bootcampexcercise.module8;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class CollectionLearnTest {
    private CollectionLearn cl;

    @Before
    public void setup() {
        cl = new CollectionLearn();
        // Add 10 values initially
        for (int i = 1; i <= 10; i++) {
            cl.addToList("Item " + i);
            cl.addToSet("Item " + i);
            cl.addToMap(i, "Item " + i);
        }
    }

    @Test
    public void testDuplicatePrevention() {
        // Attempt to add a duplicate to List
        boolean listResult = cl.addToList("Item 1");
        Assert.assertFalse("List should not allow duplicate values", listResult);

        // Attempt to add a duplicate to Set
        boolean setResult = cl.addToSet("Item 1");
        Assert.assertFalse("Set should not allow duplicate values", setResult);

        // Attempt to add a duplicate Key to Map
        boolean mapResult = cl.addToMap(1, "New Item");
        Assert.assertFalse("Map should not allow duplicate keys", mapResult);
    }

    @Test
    public void testReplacementLogic() {
        // Replace "Item 2" with "Updated Item"
        boolean replaceSuccess = cl.replaceInList("Item 2", "Updated Item");
        Assert.assertTrue(replaceSuccess);
        Assert.assertTrue(cl.list.contains("Updated Item"));

        // Try replacing with an existing value (Should fail)
        boolean replaceFail = cl.replaceInList("Item 3", "Updated Item");
        Assert.assertFalse("Should not replace if new value is a duplicate", replaceFail);
    }

    @Test
    public void testCollectionSizes() {
        Assert.assertEquals(10, cl.list.size());
        Assert.assertEquals(10, cl.set.size());
        Assert.assertEquals(10, cl.map.size());
    }
}


