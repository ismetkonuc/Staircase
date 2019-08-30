
// https://www.hackerrank.com/challenges/designer-pdf-viewer

static int designerPdfViewer(int[] h, String word) {

        Map<Character, Integer> map = new TreeMap<Character, Integer>();
        int sayac = 0;
        char[] cumle = word.toCharArray();
        for (char z = 'a' ; z<='z'; z++){
            map.put(z, h[sayac++]);
        }
        int eb = 0;

        for(Map.Entry<Character, Integer> entry : map.entrySet()){

            for(int i=0; i<cumle.length; i++){

                if(entry.getKey() == cumle[i] && entry.getValue() >= eb){
                        eb = entry.getValue();
                }
            }
        }

        return eb * word.length();

    }