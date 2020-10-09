import org.junit.Test;

import static org.junit.Assert.*;

public class Problem2Test {

    // Example test
    // Okay to change
    @Test
    public void testBubbleSort() {
        //assertTrue(false);
        Problem2 object = new Problem2();
        // add your tests here
        int[] test1 = {10,2,3,7};
        int[] test2 ={9,1,4};

        System.out.println("Pre sort");
        object.printArray(test1);
        object.bubbleSort(test1);
        System.out.println("Post sort");
        object.printArray(test1);

        System.out.println("Pre sort");
        object.printArray(test2);
        object.bubbleSort(test2);
        System.out.println("Post sort");
        object.printArray(test2);

    }
}
