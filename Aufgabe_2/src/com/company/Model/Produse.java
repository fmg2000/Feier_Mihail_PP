package com.company.Model;

public class Produse {
    String Name;
    int Preis;

    public Produse(String name, int preis) {
        Name = name;
        Preis = preis;
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

    @Override
    public String toString() {
        return "Produse{" +
                "Name='" + Name + '\'' +
                ", Preis=" + Preis +
                '}';
    }
}
