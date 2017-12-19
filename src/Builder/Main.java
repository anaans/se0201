/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Builder;

/**
 *
 * @author ana
 */
public class Main {
    
    public static void main(String[] args) {
    
        new Main ();    
     
    }
    
    public Main() {
        
     Sluzbenik sluzbenik1 = new Sluzbenik.SluzbenikBuilder("Pera", "Peric")
    .email("pera@gmail.com")
    .telefon("1234567")
    .adresa("Vodovodska 12")
    .build();
 
    System.out.println(sluzbenik1);
    
    Sluzbenik sluzbenik2 = new Sluzbenik.SluzbenikBuilder("Ana", "Sajic")
    .email("ana96@gmail.com")
    .telefon("235689")
    .adresa("Kirovljeva 15")
    .build();
    
    System.out.println(sluzbenik2);
    }
}
