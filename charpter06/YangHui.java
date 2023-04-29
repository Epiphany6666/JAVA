import java.util.Scanner;
public class YangHui{
	public static void main(String[] args){
		int arr[][];
		Scanner myScanner = new Scanner(System.in);
		int layer = myScanner.nextInt();
		arr = new int[layer][];//YangHui
		for (int i = 0; i < layer; i++){
			arr[i] = new int[i + 1];
			// for (int j = 0; j < i + 1; j++){
			for (int j = 0; j < arr[i].length + 1; j++){
				if(j == 0 || j == i){
					arr[i][j] = 1;
					System.out.print(arr[i][j] + " ");
				}else{
					arr[i][j] = arr[i - 1][j - 1] + arr[i - 1][j];
					System.out.print(arr[i][j] + " ");
				}
			}
			System.out.println();
		}
	}
}