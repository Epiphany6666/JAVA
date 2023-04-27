import java.util.Scanner;
public class MulForExercise01{
	public static void main(String[] args){
		Scanner myScanner = new Scanner(System.in);
		System.out.println("请输入班级个数：");
		int classes = myScanner.nextInt();//classNum
		System.out.println("请输入每个班级有多少人：");
		int people = myScanner.nextInt();//stuNum
		double sum1 = 0;
		double sum2 = 0;
		double sum3 = 0;
		double totalscore = 0;
		for(int i = 1; i <= classes; i++){
			System.out.println("请输入" + people + "个分数");
			for(int j = 0; j < people; j++){
				double grade = myScanner.nextInt();//分数应是double类型的！
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
		System.out.println("第1个班的平均分为：" + sum1 / people);
		System.out.println("第2个班的平均分为：" + sum2 / people);
		System.out.println("第3个班的平均分为：" + sum3 / people);
		System.out.println("三个班总平均分为：" + (sum1 + sum2 + sum3) / people);
	}
}