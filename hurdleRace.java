
// https://www.hackerrank.com/challenges/the-hurdle-race

public class Solution {

    // Complete the hurdleRace function below.
    static int hurdleRace(int k, int[] height) {

        Arrays.sort(height);
        int jump = 0;
        if(k<height[height.length-1]){
            jump = height[height.length-1] - k;
        } 

        return jump;

    }