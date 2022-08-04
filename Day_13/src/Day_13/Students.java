package Day_13;

import java.util.Comparator;

class Students {
	private String name;
	private int classnum;
	private int cla;
	private int kor;
	private int eng;
	private int math;
	private int total;
	private int avg;
	private String grade;
		
	public Students() {};
	
	public Students(String name, int classnum, int cla, int kor, int eng, int math) {
		this.name = name;
		this.classnum = classnum;
		this.cla = cla;
		this.kor = kor;
		this.eng = eng;
		this.math = math;
		total = kor + eng + math;
		avg = total/3;
	}
	
	
	public void setName(String name) {
		this.name = name;
	}
	public void setClassnum(int classnum) {
		this.classnum = classnum;
	}
	public void setCla(int cla) {
		this.cla = cla;
	}
		
	public String getName() {
		return name;
	}
	public int getClassnum() {
		return classnum;
	}
	public int getCla() {
		return cla;
	}
	
	
	public void setKor(int kor) {
		this.kor = kor;
	}
	public void setEng(int eng) {
		this.eng = eng;
	}
	public void setMath(int math) {
		this.math = math;
	}
	public void setGrade(String grade) {
		this.grade = grade;
	}
	
	public int getKor() {
		return kor;
	}
	public int getEng() {
		return eng;
	}
	public int getMath() {
		return math;
	}
	public int getTotal() {
		return kor+eng+math;
	}
	public float getAvg() {
		return (kor+eng+math)/3.f;
	}
	
	
	public void dp() {
		System.out.println("반: " + this.getCla());
		System.out.print(" |이름: " + this.getName());
		System.out.print(" |학번: " + this.getClassnum());
		System.out.print(" |국어: " + this.getKor());
		System.out.print(" |영어: " + this.getEng());
		System.out.print(" |수학: " + this.getMath());
		System.out.print(" |총점: " + this.getTotal());
		System.out.print(" |평균: " + this.getAvg()+"\n");
	}
}

class ClassnumComparator implements Comparator<Students> {
    @Override
    public int compare(Students f1, Students f2) {
        if (f1.getClassnum() < f2.getClassnum()) {
            return 1;
        } else if (f1.getClassnum() > f2.getClassnum()) {
            return -1;
        }
        return 0;
    }
}

class KorComparator implements Comparator<Students> {
    @Override
    public int compare(Students f1, Students f2) {
        if (f1.getKor() < f2.getKor()) {
            return 1;
        } else if (f1.getKor() > f2.getKor()) {
            return -1;
        }
        return 0;
    }
}
class EngComparator implements Comparator<Students> {
    @Override
    public int compare(Students f1, Students f2) {
        if (f1.getEng() < f2.getEng()) {
            return 1;
        } else if (f1.getEng() > f2.getEng()) {
            return -1;
        }
        return 0;
    }
}
class MathComparator implements Comparator<Students> {
    @Override
    public int compare(Students f1, Students f2) {
        if (f1.getMath() < f2.getMath()) {
            return 1;
        } else if (f1.getMath() > f2.getMath()) {
            return -1;
        }
        return 0;
    }
}
class TotalComparator implements Comparator<Students> {
    @Override
    public int compare(Students f1, Students f2) {
        if (f1.getTotal() < f2.getTotal()) {
            return 1;
        } else if (f1.getTotal() > f2.getTotal()) {
            return -1;
        }
        return 0;
    }
}

