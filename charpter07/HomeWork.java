public class HomeWork{
	public static void main(String[] args){
		Person p1 = new Person();
		MyTools tools = new MyTools();//����һ��MyTools����
		p1.name = "jack";
		p1.age = 10;
		//p2����ֱ�Ӹ�ֵ��������new
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
		p2.age = p1.age;//����ע��p1��p2��name�ڷ�����ָ����ͬһ��ռ�

		return p2;
	}
}

/*//��ʾ������ͨ������ȽϿ����Ƿ�Ϊͬһ������,hashCode
System.out.println(p == p2)*/

