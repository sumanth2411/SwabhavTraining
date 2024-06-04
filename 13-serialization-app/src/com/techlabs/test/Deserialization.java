package com.techlabs.test;

import java.io.FileInputStream;
import java.io.ObjectInputStream;

import com.techlabs.model.Student;

public class Deserialization {
	public static void main(String args[]){  
		  try{  
		  //Creating stream to read the object  
		  ObjectInputStream in=new ObjectInputStream(new FileInputStream("C:\\Users\\devel\\OneDrive\\Documents\\Monojava\\13-serialization-app\\src\\com\\techlabs\\model\\demo.text"));  
		  Student s=(Student)in.readObject();  
		  //printing the data of the serialized object  
		  System.out.println(s.id+" "+s.name);  
		  //closing the stream  
		  in.close();  
		  }catch(Exception e){System.out.println(e);}  
		 }  
		}  
