/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package labx;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author ash
 */
public class Labx {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        BufferedReader bfr = null;
        
        try {
            bfr = new BufferedReader(new FileReader("C:\\Users\\ash\\Desktop\\wordlist\\words.txt"));
            
            String str;
            
            String line = "";
            
            while((str = bfr.readLine()) != null){
                  line = line+""+str;
            }
            //print(line);
            wordsCounter(line);
        } catch (FileNotFoundException ex) {
            Logger.getLogger(Labx.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(Labx.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        
        
    }
    
    public static void print(Object ob){
        System.out.print(ob);
    }
    public static void println(Object ob){
        System.out.println(ob);
    }
    
    
    public static void wordsCounter(String words){
        
        String newString = words.replace(".", "");
        //print(newString);
        String arr[] = newString.split(" ");
        
        
        HashMap<String , Integer> map = new HashMap<>();
        
        for(String word : arr){
            if(map.containsKey(word)){
                map.put(word, map.get(word)+1);
            }
            else map.put(word , 1);
        }
        
        for (Map.Entry<String , Integer> entry : map.entrySet()) {
            println(entry.getKey()+"  "+entry.getValue());
        }
    }
    
}
