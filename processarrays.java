import java.util.Scanner;

public class ProcessArrays {
	public static void main(String[] args) {
		int[] array1 = {1, 2, 3, 4, 5, 6, 7, 8, 9};
		int[] array2 = new int[5];

		Scanner scan = new Scanner(System.in);
		System.out.print("Enter five values in the array and separarte them with a space: ");
		for(int i = 0; i < 5; i++) {
			array2[i] = scan.nextInt();

		}
		System.out.print("\nFirst array: ");
		for (int i = 0; i < 10; i++)
			System.out.print(array1[i] + " ");

		System.out.print("\nSecond array: ");
		for (int i = 0; i < 5; i++)
			System.out.print(array2[i] + " ");
	}	
	

}