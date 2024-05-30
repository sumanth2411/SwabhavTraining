package com.monocept.streamreading;

import java.io.FileInputStream;
import java.io.IOException;

public class FileReading {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			FileInputStream fileinputstream=new FileInputStream("C:\\Users\\devel\\OneDrive\\Documents\\Monojava\\06-stream-app\\src\\com\\monocept\\streamreading\\demo.txt");
			String ch;
			int characterCount = 0;
	        int wordCount = 0;
	        int lineCount = 0;
			while((ch=fileinputstream.read())!=null) {
				if((ch<0){
					
				}
				lineCount++;
				
				
			}
			 System.out.println("Number of characters: " + characterCount);
		     System.out.println("Number of words: " + wordCount);
		     System.out.println("Number of lines: " + lineCount);
		}
		catch (IOException e) {
            e.printStackTrace();
        }
		catch (Filenotfound)

	}

}
