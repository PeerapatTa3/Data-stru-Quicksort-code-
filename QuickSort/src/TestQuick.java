import java.util.Scanner;

public class TestQuick {
	private static Scanner NUM = new Scanner(System.in);
	private static int SIZE;
	private static int[] DATA;
	private static Quick quick;

	public static void main(String[] args) {
		int con = 1;
		do {
			inputData();
			quick = new Quick(DATA);
			quick.sort(0, SIZE-1);
			System.out.println(quick);
			System.out.print("\nDo you want to continue? (1/0) : ");
			con = NUM.nextInt();
		}while(con==1);
		
		System.exit(0);
		
	}
	
	public static void inputData() {
		
		System.out.print("Array size : ");
		SIZE = NUM.nextInt();
		DATA = new int[SIZE];
		System.out.print("Input Data : ");
		for(int i = 0; i < SIZE; i++) {
			DATA[i] = NUM.nextInt();
		}
	}

}
