/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg8puzzle;

/**
 *
 * @author PC
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        	int[][] initial = { {1, 8, 2}, {0, 4, 3}, {7, 6, 5} };
		int[][] goal    = { {1, 2, 3}, {4, 5, 6}, {7, 8, 0} };
		
		// White tile coordinate
		int x = 1, y = 0;
		
		Puzzle puzzle = new Puzzle();
		if (puzzle.isSolvable(initial)) {
                    System.out.println("--- BULMACA ÇÖZÜLÜYOR ---");
			puzzle.solve(initial, goal, x, y);
                    System.out.println("--- BULMACA ÇÖZÜLDÜ ---");    
		} 
		else {
			System.out.println("Bu bulmaca çözülemez");
		}
        
        
    }
    
}
