package main.java;

import java.io.*;
import java.util.ArrayList;
import java.util.Collection;

/**
 * Created by dryous on 24/10/2017.
 */
public class PathsRepertoire {

    private static void findFilesRecursively(File file, Collection<File> all, final String extension) {
        //Liste des fichiers correspondant a l'extension souhaitee
        final File[] children = file.listFiles(new FileFilter() {
                                                   public boolean accept(File f) {
                                                       return f.getName().endsWith(extension);
                                                   }
                                               }
        );
        if (children != null) {
            //Pour chaque fichier recupere, on appelle a nouveau la methode
            for (File child : children) {
                all.add(child);
                findFilesRecursively(child, all, extension);
            }
        }
    }

    public ArrayList<String> pathRep(String repAbs) {
        ArrayList<String> pathListe = new ArrayList<>();



    final Collection<File> all = new ArrayList<File>();

        findFilesRecursively(new File("src/main/resources"),all, ".txt");
        for(File file :all)
    {
        pathListe.add(file.getPath());

    }
        return pathListe;

}
}