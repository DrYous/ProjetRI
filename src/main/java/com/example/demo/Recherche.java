package com.example.demo;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

/**
 * Created by dryous on 29/09/2017.
 */
public class Recherche {

    public static void main(String[] args) throws FileNotFoundException {

        Scanner sc = new Scanner(System.in);
        System.out.println("Veuillez saisir un mot :");
        ArrayList<String> mots = new ArrayList<>();
        String str = sc.nextLine();
        System.out.println("Vous avez saisi : " + str);

        ArrayList<String> Ytrouve =new ArrayList<>();
        int count =0;
    BufferedReader br = new BufferedReader(new FileReader("src/main/resources/file.txt"));
    {


        StringBuilder sb = new StringBuilder();
        String line = null;
        try {
            line = br.readLine();
        } catch (IOException e) {
            e.printStackTrace();
        }

        while (line != null) {
            count++;
            if (line.contains(" "+str+" ")){
                Ytrouve.add(String.valueOf(count));
                sb.append(line);
                sb.append(System.lineSeparator());
            }

            try {
                line = br.readLine();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
        System.out.println("votre mot se trouve dans les lignes : "+Ytrouve+" qui sont le (les suivants  : ");

        String everything = sb.toString();
        System.out.println(everything);
    }

}
}

