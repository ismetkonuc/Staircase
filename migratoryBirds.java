// https://www.hackerrank.com/challenges/migratory-birds/

public class Solution {

    // Complete the migratoryBirds function below.
    static int migratoryBirds(List<Integer> arr) {

            HashMap<Integer, Integer> map = new HashMap<Integer, Integer>();

        for (int i=0; i<arr.size();i++){

            map.put(arr.get(i), 0);

        }

        int enBuyuk=-1;
        int result=0;
        for (Map.Entry<Integer, Integer> entry: map.entrySet()){

            for (int i=0 ; i<arr.size(); i++){

                if (arr.get(i) == entry.getKey()){
                    map.put(arr.get(i), (entry.getValue()+1) );
                }

            }


            if (entry.getValue() > enBuyuk){
                enBuyuk = entry.getValue();
                    if(entry.getValue().intValue() == enBuyuk){
                        result = entry.getKey();
                    }

            }


        }


        return result;

    }