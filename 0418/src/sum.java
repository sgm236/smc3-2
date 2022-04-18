import java.util.*;
public class sum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int start_n=0;
		int last_n=0;
		int sum=0;
		
		
		System.out.print("시작 숫자: ");
		start_n = sc.nextInt();
		System.out.print("마지막 숫자: ");
		last_n = sc.nextInt();
		
		for(int i=start_n; i<=last_n; i++) {
			sum += i;
		}
		
		System.out.println(start_n+"부터 "+last_n+"까지의 합은 "+sum);
		
	}

}
