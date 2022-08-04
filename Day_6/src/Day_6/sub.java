package Day_6;


// 데이터 클래스
class Name{
	
	// 필드
	private String name;
	
	//생성자
	public Name() {}
	public Name(String name) {
		this.name =name;
		
	//메서드
	}
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
}

class Subject{
	private int score;

	public Subject() {
		score =0;
	}
	public Subject(int score) {
		this.score =score;
	}
	
	public int getScore() {
		return score;
	}
	public void setScore(int score) {
		this.score = score;
	}
}

public class sub {

	private Name name;
	private Subject kor;
	private Subject eng;
	private Subject math;
	private int total;
	private float avg;
	
	public sub() {
		name = new Name();
		kor = new Subject();
		eng = new Subject();
		math = new Subject();
		total = 0;
		avg = 0.f;
	}
	
	public sub(String name, int kor, int eng, int math) {
		this.name = new Name(name);
		this.kor = new Subject(kor);
		this.eng = new Subject(eng);
		this.math = new Subject(math);
		total = this.kor.getScore() +this.eng.getScore() +this.math.getScore();
		avg = total/3.f;
	}
	
	public void setName(String name) {
		this.name.setName(name);
	}
	public void setkor(int kor) {
		this.kor.setScore(kor);
	}
	public void seteng(int eng) {
		this.eng.setScore(eng);
	}
	public void setmath(int math) {
		this.math.setScore(math);
	}
	
	public String getName() {
		return name.getName();
	}
	public int getkor() { //현기ho
		return kor.getScore();
	}
	public int geteng() {
		return eng.getScore();
	}
	public int getmath() {
		return math.getScore();
	}
	public int getTotal() {
		return kor.getScore()+eng.getScore()+math.getScore();
	}
	public float getAvg() {
		return avg = getTotal()/3.f;
	}
}
