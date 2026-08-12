// Last updated: 12/08/2026, 11:09:34
class Solution {
    public double[] convertTemperature(double celsius) {
        double[] res = new double[2];
        for(int i=0;i<2;i++){
            res[0]= celsius + 273.15;
            res[1]= celsius  * 1.80 + 32.00;
        }return res;
    }
}