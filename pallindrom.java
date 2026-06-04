class Solution {
    public boolean isPalindrome(int x) {
        int copy=x, rev=0;

        while(copy>0){
            int lastDigit = copy % 10;
            rev = rev * 10 + lastDigit;
            copy = copy/10;
        }
        if(rev == x) return true;
        else return false;
    }
}