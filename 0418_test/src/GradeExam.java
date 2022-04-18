import java.util.*;

public class GradeExam {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		Grade g = new Grade();
		
		System.out.print("수학, 과학, 영어 순으로 3개의 점수 입력>>");
		g.math = sc.nextInt();
		g.science = sc.nextInt();
		g.english = sc.nextInt();
		sc.close();
		
		System.out.println("평균은 "+g.average());
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
