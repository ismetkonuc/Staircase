import java.util.*;

public class plusMinus {

    public static void main(String[] args) {

        int[] arr = {-4, 3, -9, 0, 4, 1};

        //starts for hackerrank editor.
        int pozCounter=0, negCounter=0, zeroCounter=0;
        int size = arr.length;

        for(int i = 0; i<size;i++){

            if(arr[i] > 0){

                pozCounter++;

            }
            else if(arr[i] == 0){
                zeroCounter++;
            }
            else{
                negCounter++;
            }

        }

        System.out.println((double)pozCounter/size);
        System.out.println((double)negCounter/size);
        System.out.println((double)zeroCounter/size);

        //end

    }


}