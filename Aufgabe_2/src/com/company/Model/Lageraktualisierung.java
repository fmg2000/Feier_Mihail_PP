package com.company.Model;

import java.util.Date;
import java.util.List;

public class Lageraktualisierung {
    Date Datum;
    List<Produse> Liste_Produkt;

    public Lageraktualisierung(Date datum, List<Produse> liste_Produkt) {
        Datum = datum;
        Liste_Produkt = liste_Produkt;
    }

    public Date getDatum() {
        return Datum;
    }

    public void setDatum(Date datum) {
        Datum = datum;
    }

    public List<Produse> getListe_Produkt() {
        return Liste_Produkt;
    }

    public void setListe_Produkt(List<Produse> liste_Produkt) {
        Liste_Produkt = liste_Produkt;
    }

    @Override
    public String toString() {
        return "Lageraktualisierung{" +
                "Datum=" + Datum +
                ", Liste_Produkt=" + Liste_Produkt +
                '}';
    }
}
