import java.util.Scanner;
public class MulForExercise02{
	public static void main(String[] args){
		System.out.println("请输出班级个数");
		Scanner myScanner = new Scanner(System.in);
		int classes = myScanner.nextInt();
		System.out.println("请输出每个班级人数：");
		int people = myScanner.nextInt();
		int count1 = 0;
		int count2 = 0;
		int count3 = 0;
		for (int i = 1; i <= classes; i++){
			System.out.println("请输入" + i+ "班" + people + "个成绩");
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
		System.out.println("1班有" + count1 + "及格");
		System.out.println("2班有" + count2 + "及格");
		System.out.println("3班有" + count3 + "及格");
	}
}