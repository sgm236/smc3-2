import java.util.*;

public class GradeExam {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		Grade g = new Grade();
		
		System.out.print("����, ����, ���� ������ 3���� ���� �Է�>>");
		g.math = sc.nextInt();
		g.science = sc.nextInt();
		g.english = sc.nextInt();
		sc.close();
		
		System.out.println("����� "+g.average());
	}

}

class Grade{
	int math;
	int science;
	int english;
	public int average() {
		return (math+science+english)/3;
	}
}
