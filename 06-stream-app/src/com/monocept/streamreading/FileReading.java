package com.monocept.streamreading;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class FileReading {
	public static void main(String[] args) {
		try {
			FileReader fileReader=new FileReader("C:\\Users\\devel\\OneDrive\\Documents\\Monojava\\06-stream-app\\src\\com\\monocept\\streamreading\\demo.txt");
			int ch;
			int charCount=0,wordsCount=0,lineCount=0;
			String s="";
			while((ch=fileReader.read())!=-1) {
				if(ch!=' ' && ch!='\n') {
					s+=ch;
				}
				else if(ch==' ' || ch=='\n'){
					if(s!="") wordsCount++;
					s="";
				}
				
				
				if(ch!=' ' && ch!='\n') charCount++;
				
				if(ch=='\n') {
					lineCount++;
					
				}
			}
			if(s!="") wordsCount++;
			System.out.println("Total Number of Charachers are "+charCount);
			System.out.println("Total Number of words are "+(wordsCount));
			System.out.println("Total Number of lines are "+ (1+lineCount));
			
		} catch (FileNotFoundException e1) {
				e1.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
