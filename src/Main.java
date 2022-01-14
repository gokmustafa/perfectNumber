import java.util.Scanner;
public class Main
{
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Sayı giriniz: ");
        int sayi= input.nextInt();
        int l=0;

        for (int i=1; i<sayi; i++){
            if (sayi%i==0){
                l+=i;
            }



        }
        if (sayi==l){
            System.out.println(sayi+" Mükemmel sayıdır");
        } else {
            System.out.println(sayi+" Mükemmel değildir");

        }


    }
}
