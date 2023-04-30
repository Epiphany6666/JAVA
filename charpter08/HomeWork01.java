//编写一个类A02，定义方法find，实现查找某字符串是否在字符串数组中，并返回索引，如果找不到，返回-1
public class HomeWork01 {
	public static void main(String[] args) {
		String str1 = "avc";//findStr
		String[] str = {"avc","abc"};
		A02 t = new A02();
		int ret = t.find(str1, str);
		if(ret != -1) {
			if(ret == 1)
				System.out.println(str + "在字符串数组" + str+"里，第" + ret + "个");
			else{
				System.out.println("没找到");
			}
		}
	}
}

class A02 {
	public int find (String str1,String[] str) {
		if (str != null && str.length > 0) {
			for(int i = 0; i < str.length; i++) {
				if(str1.equals(str[i])) {
					return i;
				} else {
					return 0;//直接返回-1
				}
			}
		} else {
			return -1;
		}
			return -1;
	
}
}