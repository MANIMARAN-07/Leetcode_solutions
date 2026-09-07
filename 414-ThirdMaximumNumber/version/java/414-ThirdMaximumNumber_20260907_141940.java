// Last updated: 07/09/2026, 14:19:40
1import java.util.*;
2class Solution {
3    public int thirdMax(int[] nums) {
4        Set<Integer> s=new HashSet<>();
5        for(int n:nums)s.add(n);
6        if(s.size()<3)
7        return Collections.max(s);
8        s.remove(Collections.max(s));
9        s.remove(Collections.max(s));
10        
11        return Collections.max(s);
12    }
13}