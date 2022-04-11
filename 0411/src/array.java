import java.util.*;
public class array {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		int[] arr = new int[5];
		
		for(int i=0; i<5; i++) {
			System.out.println((i+1)+"번 입력 :");
			arr[i] = sc.nextInt();
		}
		
		int max = 0;
		int test = 1;
		
		for(int i=0; i<5; i++) {
			if(max<=arr[i]) {
				max = arr[i];
			}
		}
		
		for(int i=0; i<5; i++) {
			if(max==arr[i]) {
				break;
			}
			else {
				test++;
			}
		}
		
		System.out.println("가장 큰 수는 "+test+"번째 숫자인"+max);
	}

}




