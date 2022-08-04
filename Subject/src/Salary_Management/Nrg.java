
package Salary_Management;

// int , float 형태의 비정규직 급여관련 정보 클래스
class Nrgtime{
	private int nrgtime;
	
	public Nrgtime() {
		nrgtime = 0;
	}
	public Nrgtime(int nrgtime) {
		this.nrgtime = nrgtime;
	}
	public int getNrgtime() {
		return nrgtime;
	}
	public void setNrgtime(int nrgtime) {
		this.nrgtime = nrgtime;
	}
}
class Nrgday{
	private int nrgday;
	
	public Nrgday() {
		nrgday = 0;
	}
	public Nrgday(int nrgday) {
		this.nrgday = nrgday;
	}
	public int getNrgday() {
		return nrgday;
	}
	public void setNrgday(int nrgday) {
		this.nrgday = nrgday;
	}
}

// Pay_Nrg 
public class Nrg extends User{
	
	private Password nrgpassword;
	private int nrgpay;
	private Nrgtime nrgtime;
	private Nrgday nrgday;
	private int weekpay;

	public Nrg() {
		
		nrgpassword = new Password();
		nrgpay = 9200;
		nrgtime = new Nrgtime();
		nrgday = new Nrgday();
		weekpay = 0;
	}
	
	public Nrg(String name, String phone, String account) {
		super(name, phone, account);
	}
	
	public Nrg(int nrgpassword, int nrgtime, int nrgday) {
		this.nrgpassword = new Password(nrgpassword);
		this.nrgtime = new Nrgtime(nrgtime);
		this.nrgday = new Nrgday(nrgday);
		weekpay = 9200 * this.nrgtime.getNrgtime() * 4;
		nrgpay = 9200 * this.nrgday.getNrgday() * this.nrgtime.getNrgtime() + weekpay;
	}
	
	public void setPassword(int password) {
		this.nrgpassword.setPassword(password);
	}
	
	public void setNrgtime(int nrgtime) {
		this.nrgtime.setNrgtime(nrgtime);
	}
	
	public void setNrgday(int nrgday) {
		this.nrgday.setNrgday(nrgday);
	}

	public int getNrgtime() {
		return nrgtime.getNrgtime();
	}
	public int getNrgday() {
		return nrgday.getNrgday();
	}
	public int getweekpay() {
		return this.nrgtime.getNrgtime() * 4 * 9200;
	}
	public int getnrgpay() {
		return 9200 * this.nrgday.getNrgday() * this.nrgtime.getNrgtime() + weekpay;
	}

	public int getNrgPassword() {
		return nrgpassword.getPassword();
	}
}
	
