public class Solution {

    // Complete the sockMerchant function below.
    static int sockMerchant(int n, int[] ar) {
        Map<Integer, Integer> pair = new HashMap<Integer, Integer>();
        int val = 0;
        int ciftSayisi=0;
        for(int i=0; i<ar.length; i++){
            pair.put(ar[i], 0);
        }

        for(Map.Entry<Integer, Integer> entry: pair.entrySet()){

            for(int i=0; i<ar.length;i++){

                if(entry.getKey().intValue() == ar[i]){
                    val = entry.getValue();
                    pair.put(ar[i], ++val);
                }

            }

            if(entry.getValue() >= 2){
                ciftSayisi += entry.getValue() / 2;
            }

        }
    return ciftSayisi;

    }