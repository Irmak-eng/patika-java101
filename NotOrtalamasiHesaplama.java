package TemelKavramlarVeDegiskenler;

/*
Java ile Matematik, Fizik, Kimya, Türkçe, Tarih, Müzik derslerinin sınav puanlarını
kullanıcıdan alan ve ortalamalarını hesaplayıp geçme/kalma durumunu ekrana yazdıran program
(Ortalama 60 ve üstü ise GEÇTİ, 60 altında ise KALDI)
*/

import java.util.Scanner;

public class NotOrtalamasiHesaplama {
    public static void main(String[] args) {
        // Değişkenleri oluştur
        int mat, fizik, kimya, turkce, tarih, muzik;
        Scanner inp = new Scanner(System.in);   // Scanner sınıfı tanımlandı

        // Kullanıcıdan verileri al
        System.out.print("Matematik Notu: ");
        mat = inp.nextInt();

        System.out.print("Fizik Notu: ");
        fizik= inp.nextInt();

        System.out.print("Kimya Notu: ");
        kimya = inp.nextInt();

        System.out.print("Türkçe Notu: ");
        turkce = inp.nextInt();

        System.out.print("Tarih Notu: ");
        tarih = inp.nextInt();

        System.out.print("Müzik Notu: ");
        muzik = inp.nextInt();

        // Kullanıcının girmiş olduğu verileri topla ve ders sayısına bölerek ortalamalarını al
        int toplam = (mat + fizik + kimya + turkce + tarih + muzik);
        double sonuc = toplam / 6.0;
        System.out.println("Ortalama: "+sonuc);

        // Ortalama 60 ve üstü ise ekrana SINIFI GEÇTİ ; 60 ın altında ise SINIFTA KALDI yazdır
        boolean gecmeKosulu = sonuc >= 60;
        String gecmeDurumu = gecmeKosulu ? "Sınıfı Geçti" : "Sınıfta Kaldı";

        System.out.print(gecmeDurumu);

    }

}
