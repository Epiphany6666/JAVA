public class Recursion01{
	public static void main(String[] args){
		int days = 1;
		//Test(days);
		MyTool tool = new MyTool();
		int peachNum = Test(days);
		if(peachNum != -1){
			System.out.println("第" + days "天共有" +  peachNum + "个桃子");
		}else{
			System.out.println("要求输入的day>=1的整数")；
		}
		


		public int peach(int day) {
			if(day == 10) {
				return 1;
			}else if(day >= 1 && day <= 9){
				return (peach(day + 1) + 1) * 2;
			}else{
				System.out.println("day在1-10")；
				return  -1;
			}
		}
	}
}

/*class MyTool{
	public int Test(int days){
		int count = 1;
		if(days == 1){
			return 1;
		}else{
			//return 1 + 2 * Test(days - 1);
			return  2 * (1 + Test(days - 1));
		}
		
	}
}*/

