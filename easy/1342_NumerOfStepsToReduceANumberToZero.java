class Solution {
    public int numberOfSteps(int num) {
        int axe =0;
        while(num>0){
        if(num%2==0){
            num=num/2;
            axe++;
        }else{
            num-=1;
            axe++;
        }
    }
    return axe;
    }
}
