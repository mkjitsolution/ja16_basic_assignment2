package p1;

import java.util.Scanner;

public class MyPattern1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);// scanf or cin 
		int choice = 0;
		do
		{
			System.out.println(" Enter rows :- ");
			
			int row = sc.nextInt();
			
			int currentRow = 1;
			
			while(currentRow <= row)
			{
				int star = 1;
				while(star<=currentRow)
				{
					System.out.print(" * ");
					star++;
				}
			
				System.out.print("\n");
				currentRow++;
			}//end of while outter
			
			System.out.println(" Do u want to exe more <0 for exit>");
			choice = sc.nextInt();
		}while(choice!=0);
		
	}
}
