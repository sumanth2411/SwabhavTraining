package com.techlabs.test;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

import com.techlabs.model.Movies;

public class MovieTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 Movies[] movies = new Movies[5];
	        movies[0] = new Movies(1, "The Shawshank Redemption", "Drama", 1994);
	        movies[1] = new Movies(2, "The Godfather", "Crime", 1972);
	        movies[2] = new Movies(3, "The Dark Knight", "Action", 2008);
	        movies[3] = new Movies(4, "Pulp Fiction", "Crime", 1994);
	        movies[4] = new Movies(5, "Forrest Gump", "Drama", 1994);

	        // Serialization
	        try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("movies.ser"))) {
	            oos.writeObject(movies);
	            System.out.println("Movies have been serialized to movies.ser");
	        } catch (IOException e) {
	            e.printStackTrace();
	        }

	        // Deserialization
	        try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream("movies.ser"))) {
	            Movies[] deserializedMovies = (Movies[]) ois.readObject();
	            System.out.println("Movies have been deserialized from movies.ser");
	            for (Movies movie : deserializedMovies) {
	                System.out.println(movie);
	            }
	        } catch (IOException | ClassNotFoundException e) {
	            e.printStackTrace();
	        }

	}

}
