package main.java;

/**
 * Created by dryous on 24/10/2017.
 */
public class PtsClean {

    public String ptsClean(String str){

        str= str.replace(";","");
        str= str.replace(".","");
        str= str.replace(",","");
        str= str.replace("?","");
        str= str.replace("!","");
        str= str.replace("'"," ");
        str= str.replace("_"," ");
        str= str.replace("-"," ");
        str= str.replace(";"," ");


        return str;
    }


}
