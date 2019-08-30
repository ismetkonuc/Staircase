
// https://www.hackerrank.com/challenges/strange-advertising

public class Solution {

    // Complete the viralAdvertising function below.
    static int viralAdvertising(int n) {

        int shared = 5;
        int liked = 2;
        int cumulative = 2;

        for(int i=1 ; i<n; i++){

            shared = (shared / 2) * 3;
            liked = shared/2;
            cumulative += liked;

        }

    return cumulative;

    }