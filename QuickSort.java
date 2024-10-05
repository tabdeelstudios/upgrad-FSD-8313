import java.util.Arrays;

public class QuickSort {
    
    public static int partition(int[] array, int low, int high){
        int pivot = array[high];

        int i = low-1;

        for(int j=low;j<high;j++){
            if(array[j]<=pivot){
                i++;
                int temp = array[i];
                array[i] = array[j];
                array[j] = temp;
            }
        }

        int temp = array[i+1];
        array[i+1] = array[high];
        array[high] = temp;

        return i+1;
    }

    public static void quickSort(int[] array, int low, int high){
        if(low<high){
            int pivotIndex = partition(array, low, high);

            quickSort(array, low, pivotIndex-1);
            quickSort(array, pivotIndex+1, high);
        }
    }


    public static void main(String[] args) {
        int[] array = {12,11,13,5,6,7};
        System.out.println("Original Array: "+Arrays.toString(array));
        quickSort(array, 0, array.length-1);
        System.out.println("Sorted Array: "+Arrays.toString(array));
    }
}
