// Last updated: 12/08/2026, 11:19:03
class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
      
        int[] mer=new int[nums1.length + nums2.length];
        for(int i=0; i<nums1.length;i++){
           mer[i] = nums1[i];
    }
    for(int j=0;j<nums2.length;j++){
        mer[nums1.length + j] = nums2[j];
    }
    Arrays.sort(mer);
   
   double mid;
    int n=mer.length;
    if(n%2==0){
        mid = ( mer[n/2-1] + mer[n/2] ) / 2.0;
    }
    else{
       mid = mer[n/2];
    }
    return mid;
}
}