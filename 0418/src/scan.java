import java.util.*;

public class scan {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int i,num,sum=0;
		
		System.out.println("1000 ������ �ڿ����� �Է��ϼ���.");
		num = sc.nextInt();
		
		for(i=1; i<=num; i++) {
			if(i%4==0) {
				sum+=i;
				System.out.println(i);
			}
		}
		
		System.out.print("1~"+num+"���� 4�� ����� ���� "+sum+"�Դϴ�.");
		sc.close();
	}

}
