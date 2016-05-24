/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package morsecode;

/**
 *
 * @author Richard
 */
public class decoder {
    static String [] Array0={"234567","1","28","3","42","57","576"};
    static String [] Array1={"mat","new","clob","xen","ben","glu"};
    
    
    public static void main(String [] args)
    {
    String S0="1";
    String S1="";
    String temp="";
    int start=0;
    while(start<S0.length())
    for (int j=0;j<Array0.length;j++)
    {
       
        
        System.out.printf("%s:%s\n",Array0[j],S0.substring(start,Array0[j].length()+start));
        
        System.out.println(start);
        if (Array0[j].equals(S0.substring(start,Array0[j].length()+start)))
        {
            S1+=Array1[j];
            start+=Array0[j].length();
            System.out.println(S1);
            System.out.println(start); 
            break;
        }
         
        
    }
    
}}
