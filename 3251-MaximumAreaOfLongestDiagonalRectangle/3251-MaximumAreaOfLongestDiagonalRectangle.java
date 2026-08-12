// Last updated: 12/08/2026, 11:09:06
class Solution {
    public int areaOfMaxDiagonal(int[][] dim){
        int n=dim.length;
        int max=0;
        int maxDg=0;
        for(int i = 0;i<n;i++){
            int l=dim[i][0];
            int w=dim[i][1];
            int currDg=l*l+w*w;
            if(currDg>maxDg||(currDg==maxDg&&l*w>max)){
                maxDg=currDg;
                max=l*w;
            }
        }
        return max;
    }
}