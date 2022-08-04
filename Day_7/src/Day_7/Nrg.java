package Day_7;

// int , float 형태의 비정규직 급여관련 정보 클래스
class Nrgtime{
	private int nrgtime;
	
	public Nrgtime() {
		nrgtime = 0;
	}
	public Nrgtime(int nrgtime) {
		nrgtime = nrgtime;
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
public class Nrg {
	private Name nrgname;
	private Password password;
	private Account nrgaccount;
	private Phone nrgphone;
	private int nrgpay;
	private Nrgtime nrgtime;
	private Nrgday nrgday;
	private int weekpay;

	public Nrg() {
		nrgname = new Name();
		password = new Password();
		nrgaccount = new Account();
		nrgphone = new Phone();
		nrgpay = 9200;
		nrgtime = new Nrgtime();
		nrgday = new Nrgday();
		weekpay = 0;
	}
	
	public Nrg(String nrgname, String password, String account, String phone, int nrgtime, int nrgday) {
		this.nrgname = new Name(nrgname);
		this.password = new Password(password);
		this.nrgaccount = new Account(account);
		this.nrgphone = new Phone(phone);
		this.nrgtime = new Nrgtime(nrgtime);
		this.nrgday = new Nrgday(nrgday);
		weekpay = 1 * this.nrgtime.getNrgtime() * 4;
		nrgpay = 1 * this.nrgday.getNrgday() * this.nrgtime.getNrgtime() + weekpay;
	}
	
	public void setNrgName(String name) {
		this.nrgname.setName(name);
	}
	
	public void setPassword(String password) {
		this.password.setPassword(password);
	}
	
	public void setNrgAccount(String account) {
		this.nrgaccount.setAccount(account);
	}
	
	public void setNrgPhone(String phone) {
		this.nrgphone.setPhone(phone);
	}
	
	public void setNrgtime(int nrgtime) {
		this.nrgtime.setNrgtime(nrgtime);
	}
	
	public void setNrgday(int nrgday) {
		this.nrgday.setNrgday(nrgday);
	}
	
	
	public String getNrgName() {
		return nrgname.getName();
	}
	public String getNrgAccount() { 
		return nrgaccount.getAccount();
	}
	public String getNrgPhone() {
		return nrgphone.getPhone();
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
}
	
