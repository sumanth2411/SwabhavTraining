package com.techlabs.tresurehunt;

import java.util.Scanner;

public class TresureHunt {

	public static void main(String[] args) {
		System.out.println("Welcome to the Tresure Island.");
		System.out.println("Your mission is to find the treasure.");
		
		Scanner input = new Scanner(System.in);
		System.out.println("choose left or right:");
		String path=input.nextLine().toLowerCase();
		if(path.equals("right")) {
			System.out.println("Fall into the hole.Game over.");
		}
		else if(path.equals("left")) {
			System.out.println("choose swim or wait:");
			String secondpath=input.nextLine().toLowerCase();
			if(secondpath.equals("swim")) {
				System.out.println("Attacked by trout.Gamer over.");
			}
			else if(secondpath.contentEquals("wait")) {
				System.out.println("choose the red or bule or yellow door");
				String lastpath=input.nextLine().toLowerCase();
				if(lastpath.equals("blue")) {
					System.out.println("Eaten by beasts.Game over");
				}
				else if(lastpath.contentEquals("red")) {
					System.out.println("Burned by fire.Game over.");
				}
				else if(lastpath.contentEquals("yellow")) {
					System.out.println("You Win!");
				}
			}
			
		}
		else {
			System.out.println("Game Over");
		}

	}

}
