import java.util.Scanner;

public class Faktoriyel {

    public static void main(String[] Args){
        Scanner input = new Scanner(System.in);
        int n,r;
        System.out.println("Eleman sayısını giriniz:");
        n = input.nextInt();
        System.out.println("Seçim sayısını giriniz:");
        r = input.nextInt();
        int ntotal = 1;
        int rtotal = 1;
        int nMinusR = 1;
        for(int i=1 ; i<=n ; i++){
            ntotal *= i;
        }
        for(int h=1 ; h<=r; h++){
            rtotal *= h ;
        }
        for(int k=1; k<=(n-r); k++){
            nMinusR *= k;
        }

        double combination = ntotal / (rtotal * nMinusR);

        System.out.println("C("+n+","+r+") kombinasyonu = "+combination);










    }

}
