import java.util.Scanner;
public class MulForExercise01{
	public static void main(String[] args){
		Scanner myScanner = new Scanner(System.in);
		System.out.println("������༶������");
		int classes = myScanner.nextInt();//classNum
		System.out.println("������ÿ���༶�ж����ˣ�");
		int people = myScanner.nextInt();//stuNum
		double sum1 = 0;
		double sum2 = 0;
		double sum3 = 0;
		double totalscore = 0;
		for(int i = 1; i <= classes; i++){
			System.out.println("������" + people + "������");
			for(int j = 0; j < people; j++){
				double grade = myScanner.nextInt();//����Ӧ��double���͵ģ�
				switch(i){
				case 1:
					sum1+=grade;
					break;
				case 2:
					sum2 += grade;
					break;
				case 3:
					sum3 += grade;
					break;
				}
				totalscore+=sum
			}
		}
		System.out.println("��1�����ƽ����Ϊ��" + sum1 / people);
		System.out.println("��2�����ƽ����Ϊ��" + sum2 / people);
		System.out.println("��3�����ƽ����Ϊ��" + sum3 / people);
		System.out.println("��������ƽ����Ϊ��" + (sum1 + sum2 + sum3) / people);
	}
}