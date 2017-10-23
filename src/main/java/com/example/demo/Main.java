package com.example.demo;

import java.io.FileNotFoundException;
import java.util.ArrayList;

/**
 * Created by dryous on 07/10/2017.
 */
public class Main {

    public static void main(String[] args) throws FileNotFoundException {

        ArrayList<String> touslesMots = new ArrayList<>();
        ArrayList<String> motsUniques = new ArrayList<>();
        ArrayList<ArrayList<String>> motsUNiques2 = new ArrayList<>();
        ArrayList<ArrayList<String>> listeAvcRedon = new ArrayList<>();

        compteur comp=new compteur();
        touslesMots=comp.DecoupeTxt("src/main/resources/file.txt");
        motsUniques= comp.ListeUnique(touslesMots);
        motsUNiques2=comp.DecoupeListeVirgule(touslesMots);


        System.out.println("tous les mots sont :" + touslesMots);
        System.out.println("les mots uniques sont :" + motsUniques);
        System.out.println("Dans ce document vous avez :" + touslesMots.size()+" Mots");
        System.out.println("Dans ce document vous avez :" + motsUNiques2.size()+" Mots Uniques");


    }

}
