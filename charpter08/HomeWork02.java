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
		//��������У�û��price�ֲ�������this.price �ȼ�price
		if (this.price > 150) {
			this.price = 150;
		} else if (this.price > 100) {//����дȫ && this.price < 150
			this.price = 100;
		}
	}

	//��ʾ�鼮���
	public void info() {
		System.out.println("����" + this.name + " �۸�" + this.price);
	}
}