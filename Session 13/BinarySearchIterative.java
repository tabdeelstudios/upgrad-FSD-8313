public class BinarySearchIterative {
    
    public static int binarySearch(int arr[], int target){
        int left = 0;
        int right = arr.length-1;

        while(left<=right){
            int mid = left+right/2;
            if(arr[mid]==target){
                return mid;
            }
            if(arr[mid]<target){
                left = mid+1;
            } else {
                right = mid-1;
            }
        }

        return -1;
    }
    
    public static void main(String[] args) {
        int[] searchData = {2,3,4,10,30};
        int target = 20;

        int result = binarySearch(searchData, target);

        if(result==-1){
            System.out.println("Element not found!");
        } else {
            System.out.println("Element found at index: "+result);
        }
    }

    
}
