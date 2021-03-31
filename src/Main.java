import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        int sistemnumber = (int)(Math.random() * 100);

        // KULLANICIDAN TAHMİN ETTİĞİ SAYIYI ALINIZ
        Scanner input = new Scanner(System.in);
        System.out.print("AKLINIZDAN GEÇEN SAYIYI YAZINIZ (iki rakamlı) ");
        int tahmin = input.nextInt();


        System.out.println("SİSTEMDEN ALINAN SAYI " + sistemnumber );

        // TAHMİN EDİLEN SAYIYI KONTROL EDİNİZ
        if (tahmin == sistemnumber )
            System.out.println("SAYIYI  TAMAMEN DOĞRU TAHMİN ETTİNİZ");

        else
            System.out.println(" SAYIYI TUTTURAMADINIZ");
    }
}
