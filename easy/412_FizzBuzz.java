class Solution {
    public List<String> fizzBuzz(int n) {
        List<String> myStr = new ArrayList<>();
        if(n>0){
            myStr.add("1");
            for(int i =2; i<=n;i++){
                if(i%3==0 && i%5==0){
                    myStr.add("FizzBuzz");
                }else if(i%3==0){
                    myStr.add("Fizz");
                }else if(i%5==0){
                    myStr.add("Buzz");
                }else{
                    myStr.add(Integer.toString(i));
                }
            }
        }
    return myStr;
    }

}
