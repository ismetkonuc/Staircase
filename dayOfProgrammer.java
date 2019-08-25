// https://www.hackerrank.com/challenges/day-of-the-programmer

public class Solution {

    // Complete the dayOfProgrammer function below.
    static String dayOfProgrammer(int year) {
        int convert = year;
        String day ="";
        String convertedYear = Integer.toString(year);

        if(year == 1918){

            day = "26.09.1918";

        }

        else if(year>1918){

            if( (year % 400 == 0) || (year % 4 == 0 && year % 100 != 0) ){
                day = "12.09."+convertedYear;
            }
            else{
                day = "13.09."+convertedYear;
            }

        }
        else{
            if(year % 4 == 0){
                day = "12.09."+convertedYear;
            }
            else{
                day = "13.09."+convertedYear;
            }
        }

    return day;

    }