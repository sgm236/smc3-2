import java.util.*;
public class sum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int start_n=0;
		int last_n=0;
		int sum=0;
		
		
		System.out.print("���� ����: ");
		start_n = sc.nextInt();
		System.out.print("������ ����: ");
		last_n = sc.nextInt();
		
		for(int i=start_n; i<=last_n; i++) {
			sum += i;
		}
		
		System.out.println(start_n+"���� "+last_n+"������ ���� "+sum);
		
	}

}
