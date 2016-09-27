/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package zpi1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

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
        
        String validString = reader.readLine();
        String invalidString = reader.readLine();
        String fileName = reader.readLine();
        
        System.out.println(validString);
        //CallBack callBack = new CallBackImpl();
        //caller.register(callBack);
    }
}
