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
        System.out.println("Vous avez saisi : " + str);

        PathsRepertoire pr = new PathsRepertoire();
       RechercheWord rw = new RechercheWord();
       ArrayList<String> listeDesPaths = pr.pathRep("src/main/resources");
       for(int i=0; i<listeDesPaths.size();i++){
           int res = rw.rechercheWord(listeDesPaths.get(i), str);

           if (res!=0){
               System.out.println(str+" "+res+" "+listeDesPaths.get(i));
           }
       }
    }
}
