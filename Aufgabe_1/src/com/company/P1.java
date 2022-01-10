package com.company;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.*;
import java.util.stream.Collectors;


public class P1{

    public static List<offerten> Listofferten = new ArrayList<>();
    enum Ort{
        TH("Thurgau"),
        ZU("Zürich"),
        STG("St. Gallen");

        public String getCode() {
            return id;
        }

        private final String id;

        Ort(String id) {
            this.id = id;
        }
    }
    static class offerten{
        int Id;
        String Unternehmensname;
        int Preis;
        double Mehrwertsteuer;
        String Adresse;
        Ort Ort;

        public offerten(int id, String unternehmensname, int preis, double mehrwertsteuer, String adresse, Ort ort) {
            Id = id;
            Unternehmensname = unternehmensname;
            Preis = preis;
            Mehrwertsteuer = mehrwertsteuer;
            Adresse = adresse;
            Ort = ort;
        }

        @Override
        public String toString() {
            return  Id +" " + Unternehmensname+ " " + Preis + " " + Mehrwertsteuer + " " + Adresse + "" + Ort;
        }

    }

    public static void constructObject(String[] row)
    {

        offerten Object = new offerten(Integer.parseInt(row[0]),row[1],Integer.parseInt(row[2]), Double.parseDouble(row[3]),row[4], functOrt(row[5]));
        Listofferten.add(Object);


    }

    public static Ort functOrt (String x)
    {
        for(Ort i : Ort.values())
            if (i.getCode().equals(x))
                return i;
        return null;
    }

    public static void readFile(File file)
    {
        try (Scanner sc = new Scanner(file)) {

            while (sc.hasNextLine()){
                String line = sc.nextLine();
                String[] row = line.split("&");
                constructObject(row);
            }

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }

    public static void writefile(File file, List<offerten> newList) {
        try {
            FileWriter myWriter = new FileWriter(file);
            for(offerten i : newList)
                myWriter.write(i.Id + '%' + i.Unternehmensname + '%'+i.Preis + '%'+i.Mehrwertsteuer + '%'+ i.Adresse+ '%'+ i.Ort.getCode());
            myWriter.close();
            System.out.println("Successfully wrote to the file.");
        } catch (IOException e) {
            System.out.println("An error occurred.");
            e.printStackTrace();
        }
    }

    public static void sortPraise()
    {
        List<offerten> newList = Listofferten;
        newList = newList.stream().sorted(Comparator.comparing(c ->c.Preis*c.Mehrwertsteuer)).collect(Collectors.toList());
        writefile(new File("offertensortiert.txt"),newList);
    }

    public static void Statistic(){
        Map<String, Integer> statistic = new HashMap<>();

        int nr = 0;
        for(offerten f : Listofferten){
            statistic.put(f.Unternehmensname, f.Preis);
        }
        try {
            FileWriter myWriter = new FileWriter(new File("statistik.txt"));
            for(String i : statistic.keySet())
                myWriter.write(i + '%' + statistic.get(i));
            myWriter.close();
            System.out.println("Successfully wrote to the file.");
        } catch (IOException e) {
            System.out.println("An error occurred");
            e.printStackTrace();
        }

    }


    public static void main(String[] args ) {
        readFile(new File("C:\\Users\\Mihai\\Documents\\GitHub\\Feier_Mihail_PP\\Aufgabe_1\\src\\com\\company\\offerten"));
        for (offerten i : Listofferten)
            System.out.println(i);
        System.out.println("\n");
        sortPraise();
        Statistic();



    }
}

