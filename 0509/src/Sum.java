import java.util.*;
public class Sum {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int a, b, i, sum = 0;
		
		System.out.print("���� ����: ");
		a = sc.nextInt();
		System.out.print("������ ����: ");
		b = sc.nextInt();
		sc.close();
		
		for(i=a; i<=b; i++) {
			sum+=i;
		}
		
		System.out.println(a+"���� "+b+"������ ���� "+sum);
	}

}
