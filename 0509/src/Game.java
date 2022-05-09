import java.util.Random;
import java.util.Scanner;

public class Game {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Random rand = new Random();
		
		System.out.println("가위 바위 보!");
		String GBB = sc.next();
		int user = 0;
		int pc = rand.nextInt(2);
		
		if(GBB.equals("가위")) {
			user = 0;
			if(pc==0) {
				System.out.println("가위"+"\n"+"비겼다");
			}
			else if(pc==1) {
				System.out.println("바위"+"\n"+"졌다");
			}
			else if(pc==2){
				System.out.println("보"+"\n"+"이겼다");
			}
		}
		else if(GBB.equals("바위")) {
			user = 1;
			if(pc==0) {
				System.out.println("가위"+"\n"+"이겼다");
			}
			else if(pc==1) {
				System.out.println("바위"+"\n"+"비겼다");
			}
			else if(pc==2){
				System.out.println("보"+"\n"+"졌다");
			}
		}
		else if(GBB.equals("보")) {
			user = 2;
			if(pc==0) {
				System.out.println("가위"+"\n"+"졌다");
			}
			else if(pc==1) {
				System.out.println("바위"+"\n"+"이겼다");
			}
			else if(pc==2){
				System.out.println("보"+"\n"+"비겼다");
			}
		}
		
		sc.close();
	}
}