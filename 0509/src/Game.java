import java.util.Random;
import java.util.Scanner;

public class Game {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Random rand = new Random();
		
		System.out.println("���� ���� ��!");
		String GBB = sc.next();
		int user = 0;
		int pc = rand.nextInt(2);
		
		if(GBB.equals("����")) {
			user = 0;
			if(pc==0) {
				System.out.println("����"+"\n"+"����");
			}
			else if(pc==1) {
				System.out.println("����"+"\n"+"����");
			}
			else if(pc==2){
				System.out.println("��"+"\n"+"�̰��");
			}
		}
		else if(GBB.equals("����")) {
			user = 1;
			if(pc==0) {
				System.out.println("����"+"\n"+"�̰��");
			}
			else if(pc==1) {
				System.out.println("����"+"\n"+"����");
			}
			else if(pc==2){
				System.out.println("��"+"\n"+"����");
			}
		}
		else if(GBB.equals("��")) {
			user = 2;
			if(pc==0) {
				System.out.println("����"+"\n"+"����");
			}
			else if(pc==1) {
				System.out.println("����"+"\n"+"�̰��");
			}
			else if(pc==2){
				System.out.println("��"+"\n"+"����");
			}
		}
		
		sc.close();
	}
}