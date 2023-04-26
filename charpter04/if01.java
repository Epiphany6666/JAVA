import java.util.Scanner;
public class if01{
	public static void main(String[] args){
		Scanner myScanner = new Scanner(System.in);
		double n1 = myScanner.nextDouble();
		double n2 = myScanner.nextDouble();
		if(n1 > 10.0 && n2 < 20.0){
			System.out.println(n1 + n2);
		}
	}
}