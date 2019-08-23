// https://www.hackerrank.com/challenges/the-birthday-bar/

import java.util.*;

public class Solution {

    static int birthday(List<Integer> s, int d, int m) {
        int sayac=0;
        for(int i=0 ; i<s.size(); i++){
            int toplam = 0;
            for(int j=0; j<m; j++){
                if( (i+j) < s.size()){
                    toplam += s.get(i+j);
                }
            }

            if(toplam == d){
                sayac++;
            }

        }

        return sayac;


    }

    // ...
