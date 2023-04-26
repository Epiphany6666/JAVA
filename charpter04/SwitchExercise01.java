import java.util.Scanner;
public class SwitchExercise01{
	public static void main(String[] args){
		Scanner myScanner = new Scanner(System.in);
		//System.out.println("请输入一个a,b,c,d,e中的任何一个小写字符");
		System.out.println("请输入一个a-e中的任何一个小写字符");
		char c = myScanner.next().charAt(0);
		switch(c){
		case 'a':
		case 'b':
		case 'c':
		case 'd':
		case 'e':
			System.out.println((char)(c - 32));
			break;
		default:
			System.out.println("other");
		}
	}
}