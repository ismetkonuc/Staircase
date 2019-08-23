
// https://www.hackerrank.com/challenges/divisible-sum-pairs

public class Solution {

    // Complete the divisibleSumPairs function below.
    static int divisibleSumPairs(int n, int k, int[] arr) {
        int toplam =0, sayac=0 ;
        for(int i=0 ;i < n ; i++){
            for(int j=(i+1); j<n; j++){
                toplam = arr[i] + arr[j];
                    if(toplam % k == 0 ){
                        sayac++;
                    }
                toplam = 0;
            }
        }

        return sayac;


    }