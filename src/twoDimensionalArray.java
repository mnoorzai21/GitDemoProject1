import java.util.Random;
import java.util.Scanner;

public class twoDimensionalArray {

		public static void main(String[] args) {
		
			System.out.println("Enter the number of rows.");
			
			Scanner scnr = new Scanner(System.in);
			
			int x = scnr.nextInt();
			
			System.out.println("Enter the number of columns.");
			
			int y = scnr.nextInt();
			
			int[][] array = new int[x][y];
			
			Random rand = new Random();
			
			System.out.println("Enter " +x+ "x" +y+ " two dimensional array: ");
			
			for (int r=0; r<x; r++)
				for (int c=0; c<r; c++)
					array[r][c] = scnr.nextInt();
			
			printArr(array, x, y);
			
		}
			public static void printArr (int[][] array, int x, int y) {
				
				for (int r=0; r<x; r++) {
					for (int c=0; c<y; c++) {
						System.out.printf("%-5s", array[r][c] + " ");
					}
					System.out.println(" ");
					
				}
		}

}
