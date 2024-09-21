class Solution {
    public int maximumWealth(int[][] accounts) {
        int max = accounts[0][0];
        int tmp = 0;
        for(int i = 0;i<accounts.length;i++){
            for(int j = 0;j<accounts[i].length;j++){
                tmp += accounts[i][j];
            }
            if(max<tmp){max = tmp;}
            tmp = 0;
        }
        return max;
    }
}
