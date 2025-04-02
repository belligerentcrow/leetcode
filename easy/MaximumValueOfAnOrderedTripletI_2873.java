class Solution {
        public long maximumTripletValue(int[] nums) {
            long left;
            long center;
            long max=nums[0];
            long sol=-1;
            long temp;
            for(int j = 1; j < nums.length; j++){
                if(max <=nums[j-1]){
                    max = nums[j-1];
                }
                left = max;
                center = nums[j];
                if(left<center ||j==nums.length-1){
                }else{
                    for(int k =j+1; k<nums.length; k++){
                        temp = (left-center)*nums[k];
                        if(!(temp<0)){
                            if(temp>sol){
                                sol = temp;
                            }
                        }
                    }
                }
                
            }
            if(sol <0){
                return 0;
            }
            return sol;
        }
}

