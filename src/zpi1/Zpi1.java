/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package zpi1;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.io.UnsupportedEncodingException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author student
 */
public class Zpi1 {

    //public static final String validString = "validString";
    //public static final String invalidString = "invalidString";
    //public static final String fileName = "fileName.txt";
    public static void main(String[] args) throws IOException {
        Caller caller = new Caller();
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        
        System.out.println("provide valid String");
        String validString = reader.readLine();
        System.out.println("provide invalid String");
        String invalidString = reader.readLine();
        System.out.println("provide file name");
        String fileName = reader.readLine();
        
        System.out.println(validString);
        CallBack callBack = new CallBackImpl();
        writeToFile(validString, invalidString, fileName, callBack);
        while(!callBack.getResult()){
            System.out.println("error "+invalidString);
            System.out.println("zmien sciezke");
            fileName = reader.readLine();
            writeToFile(validString, invalidString, fileName, callBack);
        }
        System.out.println("sucess "+ validString);
    }
    
    public static void writeToFile(String validString, String invalidString, String fileName, CallBack callBack){
        try {
            File file = new File(fileName);
            PrintWriter writer = new PrintWriter(file, "UTF-8");
            writer.println("Hello World");
            System.out.println("writing to file ..." +fileName);
            writer.close();
            callBack.methodToCall(true);

        } catch (Exception ex){
            System.out.println(ex.getMessage());
            callBack.methodToCall(false);
        }
    }
}
