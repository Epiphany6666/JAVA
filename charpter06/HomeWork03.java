public class HomeWork03{
	public static void main(String[] args){
		int sum = 0;
		int[] arr = new int[10];
		for(int i = 0; i < 10; i++){
			arr[i] = (int)(Math.random() * 100) + 1;
			sum += arr[i];
		}
		int max = arr[0];
		int maxIndex = 0;
		int flag = -1;
		int findNum = 8;
		for(int i = arr.length - 1; i >= 0; i--){
			System.out.print(arr[i] + " ");
			if(max < arr[i]){
				max = arr[i];
				maxIndex = i;
			}
			if(arr[i] == findNum){
				flag = i;
			}
		}
		System.out.println("\nƽ��ֵΪ��" + sum / 10.0);
		System.out.println("\n���ֵΪ��" + max + "�±�Ϊ" + maxIndex);
		if(flag != -1){
			System.out.println("��" + findNum + "���±�Ϊ��" + flag);
		}else{
			System.out.println("�Ҳ���");
		}
	}
}