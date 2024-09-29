public class BinarySearchRecursive {
    
    public static int binarySearch(int[] arr, int left, int right, int target){
        if(left<=right){
            int mid = (left+right)/2;

            if(arr[mid]==target){
                return mid;
            }

            if(arr[mid]<target){
                return binarySearch(arr, mid+1, right, target);
            } else {
                return binarySearch(arr, left, mid-1, target);
            }
        }
        return -1;
    }
   
    public static void main(String[] args) {
        int[] searchData = {2,3,4,10,30};
        int target = 30;

        int result = binarySearch(searchData,0, searchData.length-1, target);

        if(result==-1){
            System.out.println("Element not found!");
        } else {
            System.out.println("Element found at index: "+result);
        }
    }

}
