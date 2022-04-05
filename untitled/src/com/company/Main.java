package com.company;

public class Main {
    public static void main(String[] args) {
        /*Kocka desatStennaKocka = new Kocka(10);
        Kocka sestStennaKocka = new Kocka(6);
        Kocka dpStennaKocka = new Kocka(25);
        System.out.println(desatStennaKocka.vratPocetStien());
        System.out.println(sestStennaKocka.vratPocetStien());

        System.out.println("desat-stenna kocka hody: ");
        for (int i=0;i<10;i++){
            System.out.println(desatStennaKocka.hod()+" ");
        }
        System.out.println();
        System.out.println("set-stenna kocka hody: ");
        for (int i=0;i<10;i++){
            System.out.println(sestStennaKocka.hod()+" ");

        }
        System.out.println();
        System.out.println("25-stenna kocka hody: ");
        for(int i = 0;i<10;i++){
            System.out.println(dpStennaKocka.hod()+" ");
        }
    }
}*/
        Kocka desatStennaKocka = new Kocka();
        Bojovnik bojovnik = new Bojovnik("DubkyXD", 100, 20, 10, desatStennaKocka);
        System.out.println(bojovnik);
        System.out.println("nazivu: "+ bojovnik.nazivu() );
        System.out.println(bojovnik.grafickyZivot());
    }}

