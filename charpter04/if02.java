import java.util.Scanner;
public class if02{
	public static void main(String[] args){
		Scanner myScanner = new Scanner(System.in);
		int num1 = myScanner.nextInt();
		int num2 = myScanner.nextInt();
		int sum = num1 + num2;
		if(sum % 3 == 0 && sum % 5 == 0){
			System.out.println("���ܱ�3��5ͬʱ����");
		}else if(sum % 3 == 0 && sum % 5 != 0){
			System.out.println("���ܱ�3���������ܱ�5����");
		}else{
			System.out.println("�Ͳ��ܱ�3�������ܱ�5����");
		}
	}
}