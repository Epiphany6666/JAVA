import java.util.Scanner;
public class SwitchExercise02{
	public static void main(String[] args){
		Scanner myScanner = new Scanner(System.in);
		System.out.println("请输入成绩：");
		double score = myScanner.nextInt();
		int num = (int)score/ 60;
		if( score >= 0 && score <= 100){
			switch(num){
				case 0:
					System.out.println("不合格");
					break;
				case 1:
					System.out.println("合格");
					break;
				}
			}else{
				System.out.println("输入有误");
			}
	}
}