import java.util.Scanner;
public class if04{
	public static void main(String[] args){
		Scanner myScanner = new Scanner(System.in);
		System.out.println("������ø��ֵĳɼ�");
		int score = myScanner.nextInt();
		if(score > 8.0){
			char gender = myScanner.next().charAt(0);
			if(gender == 'Ů'){
				System.out.println("��ѡ�ֽ�����Ů����");
			}
			else if(gender == '��'){
				System.out.println("��ѡ�ֽ�����������");
			}
			else{
				System.out.println("����Ա����󣬲��ܲμӱ���");
			}
		}else{
			System.out.println("sorry���㱻��̭��");
		}
	}
}