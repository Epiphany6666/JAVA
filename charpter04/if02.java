import java.util.Scanner;
public class if02{
	public static void main(String[] args){
		Scanner myScanner = new Scanner(System.in);
		int num1 = myScanner.nextInt();
		int num2 = myScanner.nextInt();
		int sum = num1 + num2;
		if(sum % 3 == 0 && sum % 5 == 0){
			System.out.println("和能被3和5同时整数");
		}else if(sum % 3 == 0 && sum % 5 != 0){
			System.out.println("和能被3整数但不能被5整除");
		}else{
			System.out.println("和不能被3整数但能被5整除");
		}
	}
}