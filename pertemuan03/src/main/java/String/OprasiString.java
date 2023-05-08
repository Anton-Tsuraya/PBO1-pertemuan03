/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package String;

/**
 *
 * @author ANTON TSURAYA
 */
public class OprasiString {
    public static void main(String[] args) {
        string kota = 'Banjarbaru';
        
        System.out.println("kota");
        
        char[]uniskaChar = { 'U','N','I','S','K','A' };
        string uniskaString= new String(uniskaChar);
        System.out.println("uniskaString");
        
        System.out.println(kota.toUpperCase());
        System.out.println(kota.toLowerCase());
        System.out.println(kota.substring(5));
        System.out.println(kota.substring(0,4));
    }
    
}
