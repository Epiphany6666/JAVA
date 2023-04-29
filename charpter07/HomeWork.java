public class HomeWork{
	public static void main(String[] args){
		Person p1 = new Person();
		MyTools tools = new MyTools();//创建一个MyTools对象
		p1.name = "jack";
		p1.age = 10;
		//p2可以直接赋值，不用再new
		Person p2 = tools.copyPerson(p1);
		System.out.println(p1 == p2);
	}
}

class Person{
	String name;
	int age;
}

/*class Person copyPerson(Person p1){
	p1 = new Person();
	p1.name = "jjjj";
	p1.age = 200;
	return p1;
}*/

class MyTools {
	public Person copyPerson(Person p1){
		Person p2 = new Person();
		p2.name = p1.name;
		p2.age = p1.age;//这里注意p1和p2中name在方法区指的是同一块空间

		return p2;
	}
}

/*//提示：可以通过对象比较看看是否为同一个对象,hashCode
System.out.println(p == p2)*/

