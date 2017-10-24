package main.java;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

/**
 * Created by dryous on 24/10/2017.
 */
public class RechercheWord {

public int rechercheWord (String path, String word) throws FileNotFoundException {

        int result=0;
        ArrayList<String> Ytrouve =new ArrayList<>();
        int count =0;
        BufferedReader br = new BufferedReader(new FileReader(path));
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
                if (line.contains(" "+word+" ")){
                    Ytrouve.add(String.valueOf(count));
                    result++;
                    sb.append(line);
                    sb.append(System.lineSeparator());
                }

                try {
                    line = br.readLine();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }


        return result;
    }
}
