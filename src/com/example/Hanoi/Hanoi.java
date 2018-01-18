package com.example.Hanoi;

/**
 * Tower of Hanoi
 * 
 * @author SreeramVasudevan *
 */
public class Hanoi {
	
	static int numberOfMoves = 0;
	
	void towerOfHanoiIterative() {
		//XXX: to implement later.
	}
	
	
	void towerOfHanoiRecursive(int numberOfDisks, String start, String temp, String end) {
		numberOfMoves ++;
		if(numberOfDisks == 1) {
			System.out.println("Move disk 1 from " +  start + " to " + end);
			return;
		} 		
		towerOfHanoiRecursive(numberOfDisks - 1, start, end, temp);
		System.out.println("Move disk " + numberOfDisks + " from " +  start + " to " + end);
		towerOfHanoiRecursive(numberOfDisks - 1, temp, start, end);
	}
	
	public static void main(String args[]) {
		Hanoi tower = new Hanoi();		
		try {
			if(Integer.parseInt(args[0]) < 1) {
				throw new Exception("Input number of disks cannot be less than 1");
			}
			System.out.println("Number of disks: " + args[0]);
			tower.towerOfHanoiRecursive(Integer.parseInt(args[0]), "start", "mid", "end");
			System.out.println("Number of moves: " + numberOfMoves);
		} catch(NumberFormatException ne) {
			System.err.println("Argument Number of disks "+ args[0] +" must be an integer.");
			System.exit(0);
		} catch (Exception e) {
			e.printStackTrace();
		}		
	}
}
