package com.company.Repository;

import com.company.Model.Lageraktualisierung;
import com.company.Model.Produse;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class RepoProduse {
    List<Produse> ListProdus;

    public RepoProduse(List<Produse> listProdus) {
        ListProdus = listProdus;
    }

    public List<Produse> getListProdus() {
        return ListProdus;
    }

    public void setListProdus(List<Produse> listProdus) {
        ListProdus = listProdus;
    }
    public Produse save(Produse p) {
        if (this.ListProdus.contains(p)) {
            return p;
        } else {
            this.ListProdus.add(p);
            return null;
        }
    }


    public Produse delete(String Name) {
        for (Produse c : ListProdus) {
            if (c.getName() == Name) {
                ListProdus.remove(c);
                return c;
            }
        }
        return null;
    }


    public Produse update(Produse p, String name) {

        for (Produse c : ListProdus) {
            if (c.getName() == name) {
                this.delete(p.getName());
                this.save(p);
                return null;
            }
        }
        return p;
    }
}
