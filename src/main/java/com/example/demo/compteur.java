package com.example.demo;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

/**
 * Created by dryous on 06/10/2017.
 */
public class compteur {

public ArrayList<String> DecoupeTxt(String file) throws FileNotFoundException {

    BufferedReader br = new BufferedReader(new FileReader(file));
    Scanner sc = new Scanner(System.in);
    ArrayList<String> mots = new ArrayList<>();
    StringBuilder sb = new StringBuilder();
    int count=0;
    String line = null;

    try {
        line = br.readLine();

        line= line.replace(";","");
        line= line.replace(".","");
        line= line.replace(",","");
        line= line.replace("?","");
        line= line.replace("!","");
        line= line.replace("'"," ");
        line= line.replace("  "," ");

        System.out.println("1 "+count++);
        System.out.println("2 "+"This line in the first : "+line);

        for( String ret : line.split(" ")){
            mots.add(ret);
            System.out.println("ret: "+ret);

        }
    } catch (IOException e) {
        e.printStackTrace();
    }

    while (line != null) {
        try {
            line = br.readLine();
            if (line!=null){
                System.out.println("3 "+count++);
                System.out.println("4 "+"This line in the while : "+line);
                line= line.replace(";","");
                line= line.replace(".","");
                line= line.replace(",","");
                line= line.replace("?","");
                line= line.replace("!","");
                line= line.replace("'"," ");

                for( String ret2 : line.split(" ")){
                    String sans = ret2;
                    mots.add(sans);
                    System.out.println("5 "+"ret boucle : "+sans);

            }
            }
            }
        catch (IOException e) {
            e.printStackTrace(); }

    }
        return mots;
}
    public ArrayList<String> ListeUnique(ArrayList<String> touteListe){

        ArrayList<String> listeunique = new ArrayList<>();

        for(int i=0; i<touteListe.size();i++){
            String  stri = touteListe.get(i);
            listeunique.add(stri+","+i);
            for (int j=i+1;j<touteListe.size();j++){
                    String strj=touteListe.get(j);

                    if (strj.equals(stri)) {
                        listeunique.add(listeunique.get(i)+","+j);
                        listeunique.remove(i);
                    }
                }
        }

    return listeunique;
    }
    public ArrayList<ArrayList<String>> DecoupeListeVirgule (ArrayList<String> liste){
        ArrayList<String> maPetiteListe = new ArrayList<>();
        ArrayList<ArrayList<String>> maGrandeListe = new ArrayList<>();
        for (int i=0;i<liste.size();i++){
            String str = liste.get(i);
            for( String ret : str.split(",")){
                maPetiteListe.add(ret);
            }
            maGrandeListe.add(maPetiteListe);
        }
        System.out.println("maGrandeListe 1: "+ maGrandeListe.get(0));
        return maGrandeListe;
    }
    }


