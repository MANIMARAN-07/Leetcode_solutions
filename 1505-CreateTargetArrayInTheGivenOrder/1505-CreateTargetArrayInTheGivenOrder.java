// Last updated: 12/08/2026, 11:11:09
class Solution {
    public int[] createTargetArray(int[] nums, int[] index) {
        int n=index.length;
        int[] target = new int[n];
        int size=0;
        for(int i=0;i<nums.length;i++){
            int insertPos = index[i];
            int value = nums[i];

           for(int j=size;j>insertPos;j--){
               target[j] = target[j-1];
           }

           target[insertPos]=value;
           size++;

        }
        return target;
        
    }}