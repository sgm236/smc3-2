import java.util.*;
public class TriangleExam {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("밑변과 높이를 입력해주세요: ");
		int line = sc.nextInt();
		int high = sc.nextInt();
		sc.close();
		
		Triangle t = new Triangle(line, high);
		System.out.println("밑변이 "+line+"이고 높이가 "+high+"인 삼각형의 넓이는 "+t.T_size()+"입니다.");
	}

}


class Triangle{
	int line;
	int high;
	
	public Triangle(int line,int high) {
		this.line = line;
		this.high = high;
	}
	
	public double T_size() {
		return (line*high)/2;
	}
}