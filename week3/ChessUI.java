package week3;

import java.util.Scanner;

/**
 *
 * @author Sydney Carl
 */
public class ChessUI {
    public static void main(String[] args) {
        ChessBoard chess = new ChessBoard();
        Scanner sc = new Scanner(System.in);
        
        String myMove;
        int count = 0;
        
        
        outerLoop:
        while (true) {
            if (count % 2 == 0) {
                System.out.println("White's move.");
            } else {
                System.out.println("Black's move");
            }
            
            while (true) {
                System.out.println("Enter from / to locations seperated by a space i.e. 2h 4h");
                myMove = sc.nextLine();
                System.out.println("You want to move " + myMove + "?");
                System.out.println("Enter y for yes or r to redo or q to quit game: ");
                String choice = sc.nextLine();
                
            }
        }
    }
}
