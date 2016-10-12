/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package inandout;

import java.io.*;

/**
 *
 * @author Eric
 */
public class InAndOut {

    public String inData(String text) throws IOException {
        String klar = "";

        PrintWriter utFil = new PrintWriter(new BufferedWriter(new FileWriter("text.txt")));

        utFil.println(text);
        utFil.close();

        return klar;
    }

    public String outData() throws FileNotFoundException, IOException {
        String rad = "";
        String returText = "";
        
        BufferedReader inFil = new BufferedReader(new FileReader("text.txt"));
        
        while(true){
            rad = inFil.readLine();            
           if(rad == null)
                break;
            returText += rad + "\n";
        }
        
        inFil.close();

        return returText;
    }

}
