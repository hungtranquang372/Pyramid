package Baitapthuchanh;
import java.util.Scanner;
public class Pyramid {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("Enter the number of lines : ");
		int number = input.nextInt();
		
		for( int rows = 1; rows <= number ; rows++){
			for (int s = number - rows; s >= 1; s-- ){
				System.out.print("  ");
				//System.out.print(s);
			}
		for (int l = rows ; l >= 2; l-- ) {
			//System.out.print("" + l + " ");
		}
		for (int r = 1; r <= rows ; r++){
			System.out.print("" + r + " ");
		}
		System.out.println();
		}

	}

}
