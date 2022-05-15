import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        //Boy ve kilo değişkenlerini belirleyelim
        double boy,kg,indeks;

        //Kullanıcının boy ve kilo değerlerini alalım
        Scanner i = new Scanner(System.in);
        System.out.print("Boyunuzu metre cinsinden giriniz : ");
        boy = i.nextDouble();

        System.out.print("Kilonuzu kg cinsinden giriniz : ");
        kg = i.nextDouble();

        indeks = kg / (boy * boy);
        System.out.println("Vücut Kitle İndeksiniz : " +indeks);


    }
}
