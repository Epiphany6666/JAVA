//��дһ����A02�����巽��find��ʵ�ֲ���ĳ�ַ����Ƿ����ַ��������У�����������������Ҳ���������-1
public class HomeWork01 {
	public static void main(String[] args) {
		String str1 = "avc";//findStr
		String[] str = {"avc","abc"};
		A02 t = new A02();
		int ret = t.find(str1, str);
		if(ret != -1) {
			if(ret == 1)
				System.out.println(str + "���ַ�������" + str+"���" + ret + "��");
			else{
				System.out.println("û�ҵ�");
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
					return 0;//ֱ�ӷ���-1
				}
			}
		} else {
			return -1;
		}
			return -1;
	
}
}