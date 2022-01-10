package com.company.View;

import com.company.Controler.Controller;
import com.company.Model.Lageraktualisierung;
import com.company.Model.Produse;

import javax.swing.plaf.synth.SynthOptionPaneUI;
import java.util.Date;
import java.util.Map;
import java.util.Scanner;

public class View {
    Controller controller;

    public View(Controller controller) {
        this.controller = controller;
    }

    public void showProduse() {
        for(Produse a : controller.getProduseRepository().getListProdus())
            System.out.println(a);
    }

    public void showLage() {
        for(Lageraktualisierung c : controller.getLagerakRepository().getListLake())
            System.out.println(c);
    }
    public void CRUDLage(Lageraktualisierung l, Date date)
    {
        Scanner sc = new Scanner(System.in);
        boolean ok = true;
        while(ok){

            String option = sc.next();;
            System.out.println("Add 1");
            System.out.println("Remove 2");
            System.out.println("Update 3");
            System.out.println("Exit 0");
            switch(option)
            {
                case "1":
                    controller.getLagerakRepository().save(l);
                    break;
                case "2":
                    controller.getLagerakRepository().delete(date);
                    break;
                case "3":
                    controller.getLagerakRepository().update(l,date);
                    break;
                case "0":
                        ok= false;
                        break;

            }
        }
    }
    public void CRUDProduct(Produse p, String name)
    {
        Scanner sc = new Scanner(System.in);
        boolean ok = true;
        while(ok){

            String option = sc.next();;
            System.out.println("Add 1");
            System.out.println("Remove 2");
            System.out.println("Update 3");
            System.out.println("Exit 0");
            switch(option)
            {
                case "1":
                    controller.getProduseRepository().save(p);
                    break;
                case "2":
                    controller.getProduseRepository().delete(name);
                    break;
                case "3":
                    controller.getProduseRepository().update(p,name);
                    break;
                case "0":
                    ok= false;
                    break;

            }
        }
    }
}
