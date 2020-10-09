public class Problem2 {

    // Do not change signature (function name, parameters)
    public static void bubbleSort(int[] data) {
        // Add your solution

        int temp = 0;
        int arrayLength = data.length;

        //Used the geeksforgeeks template of bubble sort
        for(int i = 0; i < arrayLength -1 ; i++){
            for(int j = 0; j < arrayLength -1 -i; j++){
                if(data[j] > data[j+1]){
                    temp = data[j];
                    data[j] = data[j+1];
                    data[j+1] = temp;
                }
            }

        }

    }

    public static void printArray(int[] data){
        for(int i = 0; i < data.length; i++){
            System.out.print(data[i]+ " ");
        }
        System.out.println();
    }
}
