import java.util.Scanner;
public class MulForExercise02{
	public static void main(String[] args){
		System.out.println("������༶����");
		Scanner myScanner = new Scanner(System.in);
		int classes = myScanner.nextInt();
		System.out.println("�����ÿ���༶������");
		int people = myScanner.nextInt();
		int count1 = 0;
		int count2 = 0;
		int count3 = 0;
		for (int i = 1; i <= classes; i++){
			System.out.println("������" + i+ "��" + people + "���ɼ�");
			for(int j = 0; j < people; j++){
				int grade = myScanner.nextInt();
				if(grade >= 60){
					switch(i){
					case 1:
						count1++;//passNum
						break;
					case 2:
						count2++;
						break;
					case 3:
						count3++;
						break;
					}
				}
			}
		}
		System.out.println("1����" + count1 + "����");
		System.out.println("2����" + count2 + "����");
		System.out.println("3����" + count3 + "����");
	}
}