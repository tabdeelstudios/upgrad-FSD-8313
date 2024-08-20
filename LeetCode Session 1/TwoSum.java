class Solution{
    int[] twoSum(int[] nums, int target) {
        int i=0,j=0;
        int[] result = {0,0};
        for(i=0;i<nums.length;i++){
            for(j=i+1;j<nums.length;j++){
                if(nums[i]+nums[j]==target){
                    result[0]=i;
                    result[1]=j;
                    return result;
                }
            }
        }
        return result;
    }
}

public class TwoSum {

    public static void main(String[] args) {
        Solution mySolution = new Solution();
        int[] input = {3,2,4};
        int[] result = mySolution.twoSum(input, 6);
        for(int i=0;i<result.length;i++){
            System.out.println(result[i]);
        }

    }
     
}