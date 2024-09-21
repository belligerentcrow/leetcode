class Solution {
    public List<Integer> lexicalOrder(int n) {
        List<Integer> myList = new ArrayList<>();
        int current = 1;
        for(int i =0; i < n; i++){
            myList.add(current);
            if(current *10 <=n){
                current = current *10;}
            else{
                while(current%10==9 || current >= n){
                    current = current /10;
                }
                current = current +1;
            }
        }
        return myList;
    }
}
