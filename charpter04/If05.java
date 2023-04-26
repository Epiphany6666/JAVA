import java.util.Scanner;
public class If05{
	public static void main(String[] args){
		System.out.println("请输入月份：");
		Scanner myScanner = new Scanner(System.in);
		int month = myScanner.nextInt();
		System.out.println("请输入年龄");
		int age = myScanner.nextInt();
		if(month >= 4 && month <= 10){
			if(age >= 16 && age <= 60)
			{
				System.out.println("购买成人票，60");
			}else if(age >= 0 && age < 18){
				System.out.println("购买儿童票：半价");
			}else if(age > 60){
				System.out.println("购买老人票，1 / 3的价格");
			}else{
				System.out.println("年龄输入错误");
			}
		}else{
			if(age >= 16 && age <= 60){
				System.out.println("购买成人票，40");
			}else if((age >= 0 && age < 18) || age > 60){
				System.out.println("20元");
			}else{
				System.out.println("年龄输入错误");
		}
	}
	}
}