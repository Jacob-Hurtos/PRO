package com.company;

public class Bojovnik {
    private String jmeno;
    private int zivot;
    private int maxZivot;
    private int utok;
    private int obrana;
    private Kocka kocka;

    public Bojovnik(String jmeno, int zivot, int utok, int obrana, Kocka kocka){
        this.jmeno = jmeno;
        this.zivot = zivot;
        this.maxZivot = zivot;
        this.utok = utok;
        this.obrana = obrana;
        this.kocka = kocka;
    }
    @Override
    public String toString(){
        return jmeno;
    }
    public boolean nazivu(){
        return(zivot>0);
        }
        public String grafickyZivot(){
        String s= "[";
        int celkom = 20;
        double pocet = Math.round((double) zivot/maxZivot*celkom);

        if(pocet == 0 && nazivu()){
            pocet = 1;
        }

        for(int i = 0;i<pocet;i++){
            s+= "#";
        }

        for(int i=0;i<celkom-pocet;i++){
            s+=" ";
        }
        s += "]";
        return  s;

        }
    }


