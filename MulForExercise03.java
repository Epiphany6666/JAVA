import java.util.Scanner;
public class MulForExercise03{
	public static void main(String[] args){
		Scanner myScanner = new Scanner(System.in);
		System.out.println("�����뼸���˷���");
		int row = myScanner.nextInt();
		int col = myScanner.nextInt();
		for(int i = 1; i <= row; i++){
			for(int j = 1; j <= i; j++){
				System.out.print(j + " * " + i + " = " + (i*j) + "  ");
			}
			System.out.println();
		}
	}
}