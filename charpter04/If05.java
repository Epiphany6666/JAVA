import java.util.Scanner;
public class If05{
	public static void main(String[] args){
		System.out.println("�������·ݣ�");
		Scanner myScanner = new Scanner(System.in);
		int month = myScanner.nextInt();
		System.out.println("����������");
		int age = myScanner.nextInt();
		if(month >= 4 && month <= 10){
			if(age >= 16 && age <= 60)
			{
				System.out.println("�������Ʊ��60");
			}else if(age >= 0 && age < 18){
				System.out.println("�����ͯƱ�����");
			}else if(age > 60){
				System.out.println("��������Ʊ��1 / 3�ļ۸�");
			}else{
				System.out.println("�����������");
			}
		}else{
			if(age >= 16 && age <= 60){
				System.out.println("�������Ʊ��40");
			}else if((age >= 0 && age < 18) || age > 60){
				System.out.println("20Ԫ");
			}else{
				System.out.println("�����������");
		}
	}
	}
}