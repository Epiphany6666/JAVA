import java.util.Scanner;
public class SwitchExercise02{
	public static void main(String[] args){
		Scanner myScanner = new Scanner(System.in);
		System.out.println("������ɼ���");
		double score = myScanner.nextInt();
		int num = (int)score/ 60;
		if( score >= 0 && score <= 100){
			switch(num){
				case 0:
					System.out.println("���ϸ�");
					break;
				case 1:
					System.out.println("�ϸ�");
					break;
				}
			}else{
				System.out.println("��������");
			}
	}
}