package log;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.PrintWriter;

public class Log {
	
	PrintWriter writer;
	String route = "/home/tiw/Desktop/log.txt";
	
	public Log(){
		
		try {
			writer = new PrintWriter(new FileOutputStream(new File(route),true /* append = true */)); 
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	
	public void write(String message){
		
		writer.append(message+"\n");
		writer.close();
		
	}
	
}
