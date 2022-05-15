package NotOrtalamasiProgrami;

import java.util.Scanner;

public class NotOrtalamasi {
    public static void main(String[] args) {
        //Değişkenleri oluştur
        int mat,fizik,kimya,turkce,tarih;

        // Scanner sınıfını tanımladık
        Scanner i = new Scanner(System.in);

        //Kullanıcıdan değerleri al
        System.out.print("Matematik notunuz : ");
        mat = i.nextInt();
        System.out.println("Matematik notunuz : " +mat);

        System.out.print("Fizik notunuz : ");
        fizik = i.nextInt();
        System.out.println("Fizik notunuz : " +fizik);

        System.out.print("Kimya notunuz : ");
        kimya = i.nextInt();
        System.out.println("Kimya notunuz : " +kimya);

        System.out.print("Türkçe notunuz : ");
        turkce = i.nextInt();
        System.out.println("Türkçe notunuz : " +turkce);

        System.out.print("Tarih notunuz : ");
        tarih = i.nextInt();
        System.out.println("Tarih notunuz : " +tarih);

        int toplam = (mat + fizik + kimya + tarih + turkce);
        double sonuc = toplam / 5.0;

        System.out.println("Ortalamanız : " +sonuc);


    }
}
