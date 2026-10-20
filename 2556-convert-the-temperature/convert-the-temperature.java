class Solution {
    public double[] convertTemperature(double celsius) {
       double kelvin=celsius+273.15;
       double farenhit=celsius*1.8+32;
       return new double[]{kelvin,farenhit}; 
    }
}