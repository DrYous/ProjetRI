package main.java;

import java.io.*;
import java.util.ArrayList;
import java.util.Scanner;
import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;
/**
 * Created by dryous on 24/10/2017.
 */
public class CountAllWords {





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

                for( String ret : line.split(" ")){
                    mots.add(ret);

                }
            } catch (IOException e) {
                e.printStackTrace();
            }

            while (line != null) {
                try {
                    line = br.readLine();
                    if (line!=null){
                        line= line.replace(";","");
                        line= line.replace(".","");
                        line= line.replace(",","");
                        line= line.replace("?","");
                        line= line.replace("!","");
                        line= line.replace("'"," ");

                        for( String ret2 : line.split(" ")){
                            String sans = ret2;
                            mots.add(sans);

                        }
                    }
                }
                catch (IOException e) {
                    e.printStackTrace(); }

            }
            return mots;
        }


    }



