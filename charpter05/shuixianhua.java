import java.util.Scanner;
public class shuixianhua{
	public static void main(String[] args){
		Scanner myScanner = new Scanner(System.in);
		int num = myScanner.nextInt();
		int sum = 0;
		int i = num;
		while(true){
			sum += (i % 10) * (i % 10) * (i % 10);
			i /= 10;
			if(i / 10 == 0){
				break;
			}
		}
		if(sum == i){
			System.out.println(num + "��ˮ�ɻ���");
		}else{
			System.out.println(num + "����ˮ�ɻ���");
		}
	}
}

//n�İ�λ��n /100;
//n��ʮλ��n % 100 /10
//n�ĸ�λ��n % 10

/*int n = 153;
int n1 = n / 100;
int n2 = n % 100 / 10;
int n3 = n % 10;*/