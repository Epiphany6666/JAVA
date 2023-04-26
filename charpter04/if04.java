import java.util.Scanner;
public class if04{
	public static void main(String[] args){
		Scanner myScanner = new Scanner(System.in);
		System.out.println("请输入该歌手的成绩");
		int score = myScanner.nextInt();
		if(score > 8.0){
			char gender = myScanner.next().charAt(0);
			if(gender == '女'){
				System.out.println("该选手进入了女子组");
			}
			else if(gender == '男'){
				System.out.println("该选手进入了男子组");
			}
			else{
				System.out.println("你的性别有误，不能参加比赛");
			}
		}else{
			System.out.println("sorry，你被淘汰了");
		}
	}
}