import java.util.Scanner;
public class if03{
	public static void main(String[] args){
		Scanner myScanner = new Scanner(System.in);
		int year = myScanner.nextInt();
		if((year % 400 == 0) || (year % 4 == 0 && year % 100 != 0)){
			System.out.println(year + "是闰年");
		}else{
			System.out.println(year + "不是闰年");
		}
	}
}