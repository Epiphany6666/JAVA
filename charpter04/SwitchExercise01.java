import java.util.Scanner;
public class SwitchExercise01{
	public static void main(String[] args){
		Scanner myScanner = new Scanner(System.in);
		//System.out.println("������һ��a,b,c,d,e�е��κ�һ��Сд�ַ�");
		System.out.println("������һ��a-e�е��κ�һ��Сд�ַ�");
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