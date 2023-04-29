/*import java.util.Scanner;
public class Homework01{
	public static void main(String[] args){
		int arr[] = {1,2,6,7,8};
		System.out.println("ÇëÊäÈëÏëÒª²åÈëµÄÖµ");
		Scanner myScanner = new Scanner(System.in);
		int InsertNum = myScanner.nextInt();
		int[] arr2 = new int[arr.length + 1];
		int index = -1;
		for(int i = 0; arr[i] < InsertNum; i++){
				arr2[i] = arr[i];
				index = i;
			}
		if(index != -1){
			arr2[index] = InsertNum;
			for(int i = index; i < arr.length; i++){
				arr2[i + 1] = arr[i];
			}
		}else{
			for(int i = 0; i < arr.length; i++){
				arr2[i + 1] = arr[i];
				index = i;
		}
			arr2[index] = InsertNum;
		}arr = arr2;
		for(int i = 0; i < arr.length; i++){
			System.out.print(arr2[i] + " ");
		}
}
}
*/
/*import java.util.Scanner;
public class Homework01{
	public static void main(String[] args){
		int arr[] = {1,2,6,7,8};
		System.out.println("ÇëÊäÈëÏëÒª²åÈëµÄÖµ");
		Scanner myScanner = new Scanner(System.in);
		int InsertNum = myScanner.nextInt();
		int index = -1;//index¾ÍÊÇÒª²åÈëµÄÎ»ÖÃ
		for(int i = 0; i < arr.length; i++){
			if(InsertNum >= arr[i]){
				index = i;
				break;//记得break跳出
			}
		}
		if(index == -1){
			for(i = 0; i < arr.length; i++){
				arr2[i] = arr[i];
			}
		}else{
			int arr2[arr.length + 1];
			for(i = 0; i < index; i++){
				if(i == index){
					for(; i < arr2.length; i++){
						arr2[i + 1] = arr[i];
					}
				}
				arr2[i] = arr[i];
			}
			arr2[index] = InsetNum;
		}
	}
}
*/

import java.util.Scanner;
public class Homework01{
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
			if(index != -1){
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