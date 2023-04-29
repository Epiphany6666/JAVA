import java.util.Scanner;
public class Homework02{
	public static void main(String[] args){
		int arr[] = {1,2,6,7,8};
		System.out.println("请输入要插入的数");
		Scanner myScanner = new Scanner(System.in);
		int InsertNum = myScanner.nextInt();
		int index = -1;
		for(int i = 0; i < arr.length; i++){
			if(arr[i] >= InsertNum){
				index = i;
				break;
			}
		}
		int[] arrNew = new int[arr.length + 1];
		for(int i = 0, j = 0; i < arrNew.length; i++){
			if(i != index){
				arrNew[i] = arr[j];
				j++;
			}else{
				arrNew[i] = InsertNum;
			}
		}
		arr = arrNew;
		for(int i = 0; i < arr.length; i++){
			System.out.print(arr[i] + " ");
		}
	}
}