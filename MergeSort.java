import java.util.Arrays;

public class MergeSort {
    // Function to merge the subarrays
    public static void merge(int[] array, int left, int mid, int right){
        int n1 = mid-left+1;
        int n2 = right-mid;

        // Calculating the size of subarrays
        int[] leftArray = new int[n1];
        int[] rightArray = new int[n2];

        // Copying items to the left subarray
        for(int i=0;i<n1;i++){
            leftArray[i]=array[left+i];
        }
        // Copying items to the right subarray
        for(int i=0; i<n2;i++){
            rightArray[i]=array[mid+1+i];
        }

        // Merging subarrays back to the original array
        int i=0, j=0, k=left;
        while(i<n1 && j<n2){
            if(leftArray[i]<=rightArray[j]){
                array[k] = leftArray[i];
                i++;
            } else {
                array[k]=rightArray[j];
                j++;
            }
            k++;
        }

        // Copying the remaining items from left subarray
        while(i<n1){
            array[k]=leftArray[i];
            i++;
            k++;
        }
        
        // Copying the remaining items from right subarray
        while(j<n2){
            array[k]=rightArray[j];
            j++;
            k++;
        }

    }

    public static void mergeSort(int[] array, int left, int right){
        if(left<right){
            int mid = left+(right-left)/2;

            // Recursive call to mergeSort
            mergeSort(array, left, mid);
            mergeSort(array, mid+1, right);

            merge(array, left, mid, right);
        }
    }

    public static void main(String[] args) {
        int[] array = {12,11,13,5,6,7};
        System.out.println("Original Array: "+Arrays.toString(array));
        mergeSort(array, 0, array.length-1);
        System.out.println("Sorted Array: "+Arrays.toString(array));
    }
}