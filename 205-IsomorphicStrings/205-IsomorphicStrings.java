// Last updated: 12/08/2026, 11:15:39
class Solution {
    public boolean isIsomorphic(String s, String t) {
        if(s.length() != t.length()) return false;
        HashMap<Character , Character> map=new HashMap<>();
        int n=s.length();
        for (int i = 0; i < n; i++){

            char c1 =s.charAt(i);
            char c2 =t.charAt(i);

            if(map.containsKey(c1)){
                if(map.get(c1) != c2)
                return false;
            }
            else if(map.containsValue(c2)){
                return false;
            }
            else{
                map.put(c1,c2);
            }
           

        } return true;
        
    }
}