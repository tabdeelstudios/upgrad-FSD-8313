public class LinearSearch {
    public static void main(String[] args) {
        int[] myArray = {4, 8, -9, 3, 0, 26, 1, 3};
        int target = 3;
        boolean flag = false;
        int indexFound = 0;
        int count = 0;
        // linear search
        for(int i=0;i<myArray.length; i++){
            if(myArray[i]==target){
                flag = true;
                indexFound = i;
                count++;
                // break;
            } 
        }
        if(flag){
            System.out.println("Element found in the array "+count+" times.");
        } else {
            System.out.println("Element not found in the array!");
        }
    }
}