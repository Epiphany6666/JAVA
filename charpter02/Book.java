public class Book{
	public static void main(String[] args){
		String book1 = "书1"；
		String book2 = "书2"；
		char n3 = '女'；
		char n4 = '男'；
		//保存两本书的价格
		double price1 = 123.56;
		double price2 = 100.11;
		System.out.println(book1 + book2);
		System.out.println(n3 + n4);//得到的是ASCII码值相加，字符相加时是以整数相加的
		System.out.println(price1 + price2);//此时是两个数相加
		System.out.println("姓名\t年龄\t成绩\t性别\t爱好\n" + name);
		System.out.println("n4 = "+ n4);
	}
}