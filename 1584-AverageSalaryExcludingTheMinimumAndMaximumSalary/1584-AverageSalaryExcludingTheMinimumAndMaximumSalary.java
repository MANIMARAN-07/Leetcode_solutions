// Last updated: 12/08/2026, 11:11:04
class Solution {
    public double average(int[] salary) {
       int min=salary[0];
       int max=salary[0];

       for(int sal:salary){
        if(sal<min) min=sal;
        if(sal>max) max=sal;
       }
       int sum=0;
       for(int i=0;i<salary.length;i++){
          sum+=salary[i];
       }
       
       return (double)(sum-max-min)/(salary.length-2);
    }
}