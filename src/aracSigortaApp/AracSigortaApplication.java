package aracSigortaApp;

/*
Proje: Araç Sigorta Prim Hesaplama
       Araç tipleri:otomobil, kamyon, otobüs, motosiklet
                    -otobüs: 18-30 koltuk veya 31 ve üstü koltuk
       Tarife dönemi:Aralık 2023,Haziran 2023
          1.dönem :Haziran 2023               2.dönem:Aralık 2023
          otomobil: 2000                       otomobil: 2500
          kamyon:   3000                       kamyon:   3500
          otobüs: tip1: 4000 tip2: 5000        otobüs: tip1: 4500 tip2: 5500
          motosiklet: 1500                     motosiklet: 1750

        1-Tekrar tekrar kullanılan bir seçim menüsü(form) gösterelim.
        2-Tarife dönemi bilgisi,araç tipi bilgilerini kullanıcıdan alalım.
        3-Hatalı girişte hesaplama başarısız uyarısı verip tekrar menü(form) gösterilsin.
        4-Menüde yeni işlem veya çıkış için seçenek sunulsun .
        5-tarife dönemi ve araç tipine göre sigorta primi hesaplansın.
 */

import java.util.Scanner;

public class AracSigortaApplication {

    public static void main(String[] args) {
    //1.adım- Uygulamayı başlatan bir method

        start ();

    }
public static void start (){

        Scanner input =new Scanner(System.in);
        boolean isAgain;

        do{
            System.out.println("Zorunlu araç sigorta primi hesaplama...");
            System.out.println("Tarife dönemi seçiniz");
            System.out.println("1. Haziran 2023");
            System.out.println("2. Aralık 2023");
            int term=input.nextInt();
            String termNAme = term == 1 ? "Haziran 2023" : "Aralık 2023";

            int select;
            if(term==1 || term==2){

                Arac arac=new Arac();
                System.out.println("Araç tipini giriniz..");
                System.out.println("Otomobil, kamyon, otobüs, motosiklet");
                arac.type = input.next();
                arac.countPrim(term);
                if(arac.prim>0){

                    System.out.println("-----------------------------");
                    System.out.println("Araç type : "+arac.type);
                    System.out.println("Tarife dönem : " + termNAme);
                    System.out.println("Aracınız ilgili dönem sigorta primi : " + arac.prim);
                    System.out.println("--------------------------");

                    System.out.println("Yeni işlem için 1, çıkış için 0 tuşlayınız..");
                    select=input.nextInt();

                    isAgain= select==1 ? true : false;

                }else{
                    System.out.println("Hesaplama başarısız");
                    System.out.println("Yeni işlem için 1, çıkış için 0 tuşlayınız..");
                    select=input.nextInt();

                    isAgain= select==1 ? true : false;
                }

            }else {
                System.out.println("Hatalı giriş yapıldı");
                isAgain=true;

            }

        }while(isAgain);

}






}
