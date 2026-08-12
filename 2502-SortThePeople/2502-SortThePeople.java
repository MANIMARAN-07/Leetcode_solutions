// Last updated: 12/08/2026, 11:09:38
class Solution {
    public String[] sortPeople(String[] names, int[] heights) {
        HashMap<Integer,String> map = new HashMap<>();

        for(int i=0;i<heights.length;i++){
            map.put(heights[i],names[i]);
        }
      Arrays.sort(heights);
        int index=0;
        for(int j=heights.length-1;j>=0;j--){
           names[index]=map.get(heights[j]);
           index++;
        }
        return names;
    }
}