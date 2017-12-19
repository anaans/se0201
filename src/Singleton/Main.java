/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Singleton;

/**
 *
 * @author ana
 */
public class Main {
    
    public static void main(String[] args) {
        
		FileLogger sluzbenik1 = FileLogger.getInstance();
                FileLogger sluzbenik2 = FileLogger.getInstance(); 
                sluzbenik1.addUser("Pera", "Peric", "pera@gmail.com");
                sluzbenik2.addUser("Ana", "Sajic", "ana@gmail.com");
                
}
}