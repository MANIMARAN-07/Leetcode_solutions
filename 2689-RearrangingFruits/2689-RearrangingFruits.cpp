// Last updated: 12/08/2026, 11:09:26
class Solution {
public:
    long long minCost(vector<int>& basket1, vector<int>& basket2) {
        map <int,int> count;
        for(int  num:basket1){
            count[num]++;
        }
        for(int num:basket2){
            count[num]--;
        }
        vector<int> excess;
        for(auto& [val,freq] : count){
            if(freq%2!=0) return -1; 

            for(int i=0;i<abs(freq/2);i++){
                excess.push_back(val); 
            }
        }
        
        long long cost=0;
        int minVal=min(*min_element(basket1.begin(),basket1.end()),*min_element(basket2.begin(),basket2.end()));
        int n=excess.size();
        for(int i=0;i<n/2;i++){
            cost+=min( excess[i],2*minVal);
        }return cost;
        
    }
};