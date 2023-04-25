public class ArithmeticOperatorExercise02{
	public static void main(String[] args){
		int days = 59;
		int weeks = days / 7;
		int leftDays = days % 7;
		System.out.println("weeks = " + weeks);
		System.out.println("days = " + leftDays);
		System.out.println(days + "天 合" + weeks + "星期零"
			+ leftDays + "天");

	}
}