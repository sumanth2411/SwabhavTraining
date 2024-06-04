package com.techlabs.test;

import java.io.FileOutputStream;
import java.io.ObjectOutputStream;

import com.techlabs.model.Student;

class Serialization{    
	 public static void main(String args[]){    
	  try{      
	  Student s1 =new Student(24,"Sumanth");    
	     
	  FileOutputStream fout=new FileOutputStream("C:\\Users\\devel\\OneDrive\\Documents\\Monojava\\13-serialization-app\\src\\com\\techlabs\\model\\demo.text");    
	  ObjectOutputStream out=new ObjectOutputStream(fout);    
	  out.writeObject(s1);    
	  out.flush();    
	    
	  out.close();    
	  System.out.println("success");
	  }catch(Exception e){
		  System.out.println(e);
		  }    
	 }    
	}    