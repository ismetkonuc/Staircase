
// https://www.hackerrank.com/challenges/beautiful-days-at-the-movies

public class Solution {

    static int reverseNumber(int num){

        int newNum = 0;
        int sizeOfNum = -1;
        int gecici = num;
        while (gecici!=0){
            gecici /= 10;
            sizeOfNum++;
        }
        

        while(num != 0){

            int kalan = num % 10;
            num /=10;
            newNum += Math.pow(10, sizeOfNum--)*kalan;

        }

    return newNum;

    }

    // Complete the beautifulDays function below.
    static int beautifulDays(int i, int j, int k) {

        int numberOfBDs = 0;

        for(int foo=i; foo<=j; foo++){

            if(Math.abs(foo-reverseNumber(foo)) % k == 0){
                numberOfBDs++;
            }

        }

        return numberOfBDs;


    }