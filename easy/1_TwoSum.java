class Solution {
    public int[] twoSum(int[] nums, int target) {
        List<Integer> myList = Arrays.stream(nums).boxed().collect(Collectors.toList());
        int [] ret = new int[2];
        for(Integer i : myList){
            if(myList.contains(target-i)){
                if(myList.indexOf(i) != myList.lastIndexOf(target-i)){
                    ret[0] = myList.indexOf(i);
                    ret[1] = myList.lastIndexOf(target-i);
                }
                
            }
        }
        return ret;
    }
}
