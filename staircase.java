import java.util.*;

public class Staircase {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter a number: ");
        int n = scanner.nextInt();

        //starts for hackerrank editor.

        String kare = "";

        for(int i=0;i<n;i++){
            for(int j=(n-1);j>i;j--){
                System.out.print(" ");
            }
            kare = kare.concat("#");
            System.out.println(kare);
        }

        //end

    }


}