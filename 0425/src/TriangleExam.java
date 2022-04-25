import java.util.*;
public class TriangleExam {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("밑변과 높이를 입력해주세요: ");
		double line = sc.nextInt();
		double high = sc.nextInt();
		sc.close();
		
		Triangle t = new Triangle(line, high);
		System.out.println("밑변이 "+line+"이고 높이가 "+high+"인 삼각형의 넓이는 "+t.T_size()+"입니다.");
		t.T_setsize(2, 5);
		System.out.println("밑변이 "+t.line+"이고 높이가 "+t.high+"인 삼각형의 넓이는 "+t.T_size()+"입니다.");
		
	}

}


class Triangle{
	double line;
	double high;
	
	public Triangle(double line,double high) {
		this.line = line;
		this.high = high;
	}
	
	public void T_setsize(double a, double b){
		line = a;
		high = b;
	}
	
	
	public double T_size() {
		return (line*high)/2;
	}
}