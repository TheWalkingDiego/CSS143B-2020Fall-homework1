import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class Problem1Test {

    // Example test
    // DO NOT CHANGE
    @Test
    public void testBinarySearch() {
       int[] test1 = {1,2,3,4,5};
       int target1 = 3;
       int targetNotInArray = 100;

       Problem1 object = new Problem1();
       System.out.println(object.binarySearch(test1,targetNotInArray));
       System.out.println("Target " + target1 + " was found in index "+
               object.binarySearch(test1,target1)); //Should return 2



        int inputs[][] = {
                {},
                {3},
                {3},
                {1,3},
                {1,3},
                {4,6,8},
                {4,6,8},
                {4,6,8},
                {3,5,7,9,20},
                {3,5,7,9,20},
        };
        int targets[] = {9, 1, 3, 1, 3, 4, 6, 8, 3, 9};
        int answer[] = {-1, -1, 0, 0, 1, 0, 1, 2, 0, 3};

        assertEquals(inputs.length, targets.length);
        assertEquals(inputs.length, answer.length);

        for (int i=0; i<inputs.length; i++) {
            int actual = Problem1.binarySearch(inputs[i], targets[i]);
            int expected = answer[i];
            assertEquals(expected, actual);
        }
    }
}
