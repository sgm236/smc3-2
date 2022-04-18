import java.util.*;

public class scan {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int i,num,sum=0;
		
		System.out.println("1000 이하의 자연수를 입력하세요.");
		num = sc.nextInt();
		
		for(i=1; i<=num; i++) {
			if(i%4==0) {
				sum+=i;
				System.out.println(i);
			}
		}
		
		System.out.print("1~"+num+"까지 4의 배수의 합은 "+sum+"입니다.");
		sc.close();
	}

}
