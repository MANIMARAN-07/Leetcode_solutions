// Last updated: 12/08/2026, 11:09:22
class Solution {
    public String finalString(String s) {
      StringBuilder maran = new StringBuilder();
      for(char ch:s.toCharArray()){
        if(ch=='i'){
            maran.reverse();
        }
        else{
            maran.append(ch);
        }
       
      } return maran.toString();
    }
}