package com.company.Repository;

import com.company.Model.Lageraktualisierung;
import com.company.Model.Produse;

import java.util.Date;
import java.util.List;

public class RepoLageraktualisierung {
    private List<Lageraktualisierung> ListLake;

    public RepoLageraktualisierung(List<Lageraktualisierung> listLake) {
        ListLake = listLake;
    }

    public List<Lageraktualisierung> getListLake() {
        return ListLake;
    }

    public void setListLake(List<Lageraktualisierung> listLake) {
        ListLake = listLake;
    }

    public Lageraktualisierung save(Lageraktualisierung lageraktualisierung) {
        if (this.ListLake.contains(lageraktualisierung)) {
            return lageraktualisierung;
        } else {
            this.ListLake.add(lageraktualisierung);
            return null;
        }
    }


    public Lageraktualisierung delete(Date datum) {
        for (Lageraktualisierung c : ListLake) {
            if (c.getDatum() == datum) {
                ListLake.remove(c);
                return c;
            }
        }
        return null;
    }


    public Lageraktualisierung update(Lageraktualisierung lageraktualisierung, Date datum) {

        for (Lageraktualisierung c : ListLake) {
            if (c.getDatum() == datum) {
                this.delete(lageraktualisierung.getDatum());
                this.save(lageraktualisierung);
                return null;
            }
            return lageraktualisierung;
        }

        return lageraktualisierung;
    }
}

