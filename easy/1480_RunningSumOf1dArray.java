class Solution {
    public int[] runningSum(int[] nums) {
        int [] myArr = new int [nums.length];
        myArr[0] = nums[0];
        for(int i =1;i<nums.length; i++){
            myArr[i]=nums[i]+myArr[i-1];
        }
        return myArr;
    }
}
