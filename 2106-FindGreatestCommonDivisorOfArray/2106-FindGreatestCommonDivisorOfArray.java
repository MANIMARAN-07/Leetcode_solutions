// Last updated: 12/08/2026, 11:10:10
class Solution{
    public int findGCD(int[] nums){
        int min=Integer.MAX_VALUE;
        int max=Integer.MIN_VALUE;
        for(int num:nums)
        {
            min=num<min?num:min;
            max=num>max?num:max;
        }
        int a=min,b=max;
        while(b!=0){
            int temp=b;
            b=a%b;
            a=temp;
        }
        return a;
    }
}