// https://www.hackerrank.com/challenges/bon-appetit/

public class Solution {

    // Complete the bonAppetit function below.
    static void bonAppetit(List<Integer> bill, int k, int b) {

        int sum =0;

        for(Integer i: bill){
            sum +=i;
        }

        int perPerson = (sum - bill.get(k)) / 2;

        if(perPerson == b){
            System.out.println("Bon Appetit");
        }
        else{
            System.out.println( b - perPerson);
        }

    }