public class HomeWork02 {
	public static void main(String[] args) {
		Book b1 = new Book("xiaoao", 300);
		/*b1.updaterPrice();
		System.out.println(b1.price);*/
		b1.info();
		b1.updaterPrice();
		b1.info();
	}
}

class Book {
	String name;
	double price;

	public Book(String name, double price) {
		this.name = name;
		this.price = price;
	}

	// public void updaterPrice(String name, double price) {
	public void updaterPrice() {
		//如果方法中，没有price局部变量，this.price 等价price
		if (this.price > 150) {
			this.price = 150;
		} else if (this.price > 100) {//不用写全 && this.price < 150
			this.price = 100;
		}
	}

	//显示书籍情况
	public void info() {
		System.out.println("书名" + this.name + " 价格" + this.price);
	}
}