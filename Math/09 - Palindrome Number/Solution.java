class Solution {

    public static boolean isPalindrome(int x) {
        int num = x;
        int reversed = 0;
        while(num > 0){
            int remainder = num % 10;
             reversed =  reversed*10+ remainder ;
             num = num/10;
            
        }
        if(reversed == x)
            return true;
        else
        return false;
    }
}