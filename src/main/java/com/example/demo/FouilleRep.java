package com.example.demo;

import java.io.*;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Scanner;

/**
 * Created by dryous on 23/10/2017.
 */
public class FouilleRep {

    private static void findFilesRecursively(File file, Collection<File> all, final String extension) {
        //Liste des fichiers correspondant a l'extension souhaitee
        final File[] children = file.listFiles(new FileFilter() {
            public boolean accept(File f) {
                return f.getName().endsWith(extension) ;
            }}
        );
        if (children != null) {
            //Pour chaque fichier recupere, on appelle a nouveau la methode
            for (File child : children) {
                all.add(child);
                findFilesRecursively(child, all, extension);
            }
        }
    }
    public static void main(String[] args) {


        Scanner sc = new Scanner(System.in);
        System.out.println("Veuillez saisir un mot :");
        ArrayList<String> mots = new ArrayList<>();
        String str = sc.nextLine();
        System.out.println("Vous avez saisi : " + str);

        try {
            final Collection<File> all = new ArrayList<File>();
            findFilesRecursively(new File("src/main/resources"), all, ".txt");
            for (File file : all) {
               // System.out.println(file.getPath());
                FileInputStream fis = new FileInputStream(file);

                ////////////////////////////////////////////////////////////////////////////////////////////
                ArrayList<String> Ytrouve =new ArrayList<>();
                int count =0;
                BufferedReader br = new BufferedReader(new FileReader(file.getPath()));



                    StringBuilder sb = new StringBuilder();
                    String line = null;
                    try {
                        line = br.readLine();
                    } catch (IOException e) {
                        e.printStackTrace();
                    }

                    while (line != null) {
                        count++;
                        if ((line.contains(" " + str + " "))||(line.contains(" " + str)||(line.contains(str + " ")) ) ){
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
                String everything = sb.toString();
                if (!everything.equals("")) {
                        System.out.println("Votre mot se trouve dans le fichier : " + file.getPath());
                        System.out.println("votre mot se trouve dans les lignes : " + Ytrouve + " qui sont le (les suivants  : ");
                        System.out.println(everything);
                    }
                ///////////////////////////////////////////////////////////////////////////////////////////

                fis.close();
            }
        } catch (FileNotFoundException e) {
            System.err.println("FileStreamsTest: " + e);
        } catch (IOException e) {
            System.err.println("FileStreamsTest: " + e);
        }
    }
}
