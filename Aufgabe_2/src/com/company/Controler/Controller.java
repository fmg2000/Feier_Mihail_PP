package com.company.Controler;

import com.company.Repository.RepoLageraktualisierung;
import com.company.Repository.RepoProduse;

public class Controller {
    private RepoLageraktualisierung LagerakRepository;
    private RepoProduse produseRepository;

    public Controller(RepoLageraktualisierung lagerakRepository) {
        LagerakRepository = lagerakRepository;
    }

    public RepoLageraktualisierung getLagerakRepository() {
        return LagerakRepository;
    }

    public void setLagerakRepository(RepoLageraktualisierung lagerakRepository) {
        LagerakRepository = lagerakRepository;
    }

    public RepoProduse getProduseRepository() {
        return produseRepository;
    }

    public void setProduseRepository(RepoProduse produseRepository) {
        this.produseRepository = produseRepository;
    }
}
