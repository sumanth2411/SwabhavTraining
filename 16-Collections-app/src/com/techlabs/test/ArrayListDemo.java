package com.techlabs.test;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import com.techlabs.model.Person;

public class ArrayListDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Person> persons=new ArrayList<Person>();
		
		persons.add(new Person("Sumanth",22,"Hyderabad"));
		persons.add(new Person("Himanshu",23,"Delhi"));
		persons.add(new Person("Kumar",25,"Haryana"));
		persons.add(new Person("Sumeet",22,"Karnataka"));
		persons.add(new Person("Hari",24,"AndhraPredhesh"));
		
		Iterator person1Iterator=persons.iterator();
		while(person1Iterator.hasNext()) {
			System.out.println(person1Iterator.next());
		}
		System.out.println("\n");
		
		persons.add(0, new Person("Sai",22,"Telangana"));
		persons.add(6,new Person("Krishna",24,"Tamilnadu"));
		persons.add(2, new Person("Raju",25,"Jammu&Kashmir"));
		
		Iterator person2Iterator=persons.iterator();
		while(person2Iterator.hasNext()) {
			System.out.println(person2Iterator.next());
		}
		
		System.out.println("\nfifth position: " + persons.get(4));
        System.out.println("First Person: " + persons.get(0));
        System.out.println("Last Person: " + persons.get(7));
        
        //update
        persons.get(1).setName("Sumanth Updated");
        persons.get(1).setAge(26);
        persons.get(1).setAddress("Hyderabad Updated");
        System.out.println("\nAfter updating the second person:");
        Iterator person3Iterator=persons.iterator();
		while(person3Iterator.hasNext()) {
			System.out.println(person3Iterator.next());
		}
		
		//Remove
		 persons.remove(0); // Remove the first Person object
	     System.out.println("\nAfter removing the first person:");
	     Iterator person4Iterator=persons.iterator();
			while(person4Iterator.hasNext()) {
				System.out.println(person4Iterator.next());
			}

	     persons.remove(2); // Remove the Person object at the third position
	     System.out.println("\nAfter removing the third person:");
	     Iterator person5Iterator=persons.iterator();
			while(person5Iterator.hasNext()) {
				System.out.println(person5Iterator.next());
			}
			
			 // Searching Elements
	        Person searchPerson = new Person("Charlie", 35, "Lahore");
	        boolean exists = persons.contains(searchPerson);
	        System.out.println("\nDoes Charlie exist in the list? " + exists);

	        int index = persons.indexOf(searchPerson);
	        System.out.println("Index of Charlie: " + index);

	        // Traversing the ArrayList with a for-loop
	        System.out.println("\nTraversing with a for-loop:");
	        for (int i = 0; i < persons.size(); i++) {
	            System.out.println(persons.get(i));
	        }

	        // Traversing the ArrayList with an enhanced for-loop (for-each loop)
	        System.out.println("\nTraversing with an enhanced for-loop:");
	        for (Person person : persons) {
	            System.out.println(person);
	        }

	        // Clearing the ArrayList
	        persons.clear();
	        System.out.println("\nAfter clearing the list, the ArrayList is: " + persons);
	    
        
        

		

	}

}
