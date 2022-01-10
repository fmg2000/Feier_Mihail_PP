package com.company.Model;

public class Produse {
    String Name;
    int Preis;
    int SKU;
    String Initiale_Anzahl;

    public Produse(String name, int preis, int SKU, String initiale_Anzahl) {
        Name = name;
        Preis = preis;
        this.SKU = SKU;
        Initiale_Anzahl = initiale_Anzahl;
    }

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    public int getPreis() {
        return Preis;
    }

    public void setPreis(int preis) {
        Preis = preis;
    }

    public int getSKU() {
        return SKU;
    }

    public void setSKU(int SKU) {
        this.SKU = SKU;
    }

    public String getInitiale_Anzahl() {
        return Initiale_Anzahl;
    }

    public void setInitiale_Anzahl(String initiale_Anzahl) {
        Initiale_Anzahl = initiale_Anzahl;
    }

    @Override
    public String toString() {
        return "Produse{" +
                "Name='" + Name + '\'' +
                ", Preis=" + Preis +
                ", SKU=" + SKU +
                ", Initiale_Anzahl='" + Initiale_Anzahl + '\'' +
                '}';
    }
}
