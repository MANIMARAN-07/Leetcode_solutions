// Last updated: 12/08/2026, 11:12:53
class Solution {
    public int calPoints(String[] operations) {
        Stack<Integer> stack = new Stack<>();
        for(String op : operations){ 
            if(op.equals("C")){
                stack.pop();
            }
            else if(op.equals("D")){
                stack.push(2*stack.peek());
            }
            else if(op.equals("+")){
                int last=stack.pop();
                int latest = last + stack.peek();
                stack.push(last);
                stack.push(latest);
            }
            else{
                stack.push(Integer.parseInt(op));
            }
        }
        int sum=0;
        for(int res:stack){
            sum+=res;
        }
        return sum;
    }
}