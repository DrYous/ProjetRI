package main.java;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

public class Main  {


    public static void main(String[] args) throws FileNotFoundException {

        Scanner sc = new Scanner(System.in);
        System.out.println("Veuillez saisir un mot :");
        ArrayList<String> mots = new ArrayList<>();
        String str = sc.nextLine();

        PathsRepertoire pr = new PathsRepertoire();
       RechercheWord rw = new RechercheWord();
       CountAllWords cal = new CountAllWords();

       ArrayList<String> listeDesPaths = pr.pathRep("src/main/resources");
       for(int i=0; i<listeDesPaths.size();i++){
           int res = rw.rechercheWord(listeDesPaths.get(i), str);
        mots=cal.DecoupeTxt(listeDesPaths.get(i));
        int nombreDeMots= mots.size();
           if (res!=0){
               System.out.println(str+" "+res+" "+listeDesPaths.get(i)+"Sur un totale de : "+nombreDeMots);
           }
       }
    }
}
