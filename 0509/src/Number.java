import java.util.Random;
import java.util.Scanner;

public class Number {
	public static void main(String[] args) {
		Random rand = new Random();
		int []arr=new int[10];
		
        for(int i=0; i<10; i++) {
        	arr[i] = rand.nextInt(50);
        }
        
        for(int i=0; i<10; i++) {
        	System.out.print(arr[i]+" ");
        }
        
        System.out.print("\n");
        System.out.print("10���� ���� ���� �� �ϳ��� ���纸����(1~50����): ");

        Scanner sc=new Scanner(System.in);
        
        int num=sc.nextInt();
        sc.close();
       
        int r = 0;
        
        for(int i=0; i<10; i++) {
        	if(arr[i]==num){
        		r = 1;
        		break;
        	}
        	else {
        		r = 0;
        	}
        }
        
        if(r == 1) {
        	System.out.println("��÷! ��ġ�ϴ� ���ڰ� �ֽ��ϴ�.");
        }
        else {
        	System.out.println("��! ������ȸ��~");
        }
        
	}
}


