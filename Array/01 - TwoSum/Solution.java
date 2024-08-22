class Solution {

    // public static void main(String[] args) {
    //     int[] arr = {2,11,15,7};
    //     int target = 9;
    //     Solution.twoSum(arr,target);
    // }
    public static int[] twoSum(int[] nums, int target) {
         int[] output = {-1,-1};
         for(int i = 0; i < nums.length; i++){
            for(int j = i + 1; j <nums.length; j++){
                if (nums[i] + nums[j] == target) {
                    System.out.println(nums[i] +"  "+ nums[j]);
                    output[0] = nums[i];
                    output[1] = nums[j];
                    return output;

                }

            }
         }
         return output;

     } 
    }
