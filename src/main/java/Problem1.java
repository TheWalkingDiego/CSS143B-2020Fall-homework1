public class Problem1 {

    // Do not change signature (function name, parameters)
    public static int binarySearch(int[] data, int target) {
        // Add your solution
         int arrayLength = data.length;
         int index = 0;
        for(int i = 0; i < arrayLength; i++){
            if(data[i] == target){
                return index;
            }
            index++;
        }
        return -1; // Only works assuming int array is only positive numbers
    }
}
