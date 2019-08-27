
// https://www.hackerrank.com/challenges/electronics-shop

public class Solution {

    /*
     * Complete the getMoneySpent function below.
     */
    static int getMoneySpent(int[] keyboards, int[] drives, int b) {
        int sonuc=-1, eb=0;
        for(int i=0; i<keyboards.length;i++){
            for(int j=0; j<drives.length;j++){
                if( (keyboards[i] + drives[j] <= b) && (keyboards[i] + drives[j] >= eb) ){
                    sonuc = keyboards[i] + drives[j];
                    eb = sonuc;
                
                }
            }
        }

        return sonuc;

    }