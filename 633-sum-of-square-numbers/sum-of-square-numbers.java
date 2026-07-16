class Solution {
    public boolean judgeSquareSum(int c) {
        long ll = 0, ul = (long)Math.sqrt(c);
        while (ll <= ul){
            if(ll*ll + ul*ul < c) ll++;
            else if(ll*ll + ul*ul > c) ul--;
            else return true;
        }
        return false;
    }
}