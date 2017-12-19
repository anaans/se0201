/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Singleton;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

/**
 *
 * @author ana
 */
public class FileLogger {
    
    private static FileLogger logger = null;
	
	private final String logFile = "Primerlog.txt";
	private PrintWriter writer;
	
	public FileLogger() {
		try {
			FileWriter fw = new FileWriter(logFile);
		    writer = new PrintWriter(fw, true);
		} catch (IOException e) {}
	}
	
	public static synchronized FileLogger getInstance(){
		if(logger == null)
			logger = new FileLogger();
		return logger;
	}
	public void addUser (String ime, String prezime, String email) {
		writer.println("DODAT SLUZBENIK: " + ime + " | " + prezime + " | " + email + " | ");
	}

}

