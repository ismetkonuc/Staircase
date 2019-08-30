
// https://www.hackerrank.com/challenges/picking-numbers

public static int pickingNumbers(List<Integer> a) {
    // Write your code here

         int max = 0;
         List<Integer> list = new ArrayList<Integer>();
        
        for (int i = 0; i < a.size(); i++) {
            int tempMax = list.size();
            list.clear();
            
            for (int j = 0; j < a.size(); j++) {
                
                if (a.get(i) - a.get(j) <= 1 && a.get(i) - a.get(j) >= 0) {
                    list.add(i);
                }
                
                if (tempMax >= max) {
                    max = tempMax;
                }
            }
        }
        
        return max;
        

    }