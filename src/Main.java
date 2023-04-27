import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
        int sayi;
        int asalMi=1;
        System.out.println("Sayıyı Giriniz :");
        Scanner scan=new Scanner(System.in);
        sayi=scan.nextInt();

        for(int i=2;i<sayi;i++){

            if(sayi%i==0){
                asalMi=0;
            }

        }
        if(asalMi==0){System.out.println("Asal Değil");}
        else{System.out.println("Asal");}


}}