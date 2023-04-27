import java.util.Scanner;
public class MulForExercise04{
	public static void main(String[] args){
		Scanner myScanner = new Scanner(System.in);
		System.out.println("ÇëÊäÈëËşµ×¸öÊı£º");
		int towelLayer = myScanner.nextInt();
		for(int i = 1; i <= towelLayer; i++)
			for(int j = 0; j < i; j++){
				System.out.print("*");
			}
			System.out.println("\n");
	}
}