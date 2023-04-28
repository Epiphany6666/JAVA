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
			System.out.println(num + "是水仙花数");
		}else{
			System.out.println(num + "不是水仙花数");
		}
	}
}

//n的百位：n /100;
//n的十位：n % 100 /10
//n的个位：n % 10

/*int n = 153;
int n1 = n / 100;
int n2 = n % 100 / 10;
int n3 = n % 10;*/