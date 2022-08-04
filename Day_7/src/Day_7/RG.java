package Day_7;

class RgYear {
	private int rgYear;
	
	public RgYear() {};
	public RgYear(int rgYear) {
		this.rgYear = rgYear;
	}
	
	public void setRgYear(int rgYear) {
		this.rgYear = rgYear;
	}
	
	public int getRgYear() {
		if(rgYear > 3) {
	         rgYear += 10;
	      }else if(rgYear > 5) {
	         rgYear += 30;
	      }
		return rgYear;
	}
}

class RgPosition{
	private String rgPosition;
	
	public RgPosition() {}
	public RgPosition(String rgPosition) {
		this.rgPosition = rgPosition;
	}
	
	public void setRgPosition(String rgPosition) {
		this.rgPosition = rgPosition;
	}
	
	public float getRgPosition() {
		if(rgPosition.equals("사원")) {
			rgPosition = "0.0";
			Float.parseFloat(rgPosition);
		}
		else if(rgPosition.equals("대리")) {
			rgPosition = "0.2";
			Float.parseFloat(rgPosition);
		}
		else if(rgPosition.equals("과장")) {
			rgPosition = "0.4";
			Float.parseFloat(rgPosition);
		}
		else if(rgPosition.equals("차장")) {
			rgPosition = "0.6";
			Float.parseFloat(rgPosition);
		}
		else if(rgPosition.equals("부장")) {
			rgPosition = "0.8";
			Float.parseFloat(rgPosition);
		}
			return Float.parseFloat(rgPosition);
	}
}

class RgGrade{
	 private float rgGrade;
	 
	 public RgGrade() {}
	 public RgGrade(float rgGrade) {
		this.rgGrade = rgGrade;
	 }
	 
	 public void setRgGrad(float rgGrade) {
		 this.rgGrade = rgGrade;
	 }
	 public float getRgGrade() {
		 if(rgGrade == 1) {
			 rgGrade = 0.5f;
		 }
		 else if(rgGrade == 2) {
			 rgGrade = 0.2f;
		 }
		 else if(rgGrade == 3) {
			 rgGrade = 0.0f;
		 }
		 return rgGrade;
	 }
}

public class RG {
	 
	 private RgYear rgYear;
	 private RgPosition rgPosition;
	 private float rgPay;
	 private RgGrade rgGrade;
	 
	 private Name rgName;
	 private Password rgPassword;
	 private Phone rgPhone;
	 private Account rgAccount;
	 
	 
	 public RG() {
		rgYear = new RgYear();
		rgPosition = new RgPosition();
		rgGrade = new RgGrade();
		rgPay = 200;
	
		rgName = new Name();
		rgPassword = new Password();
		rgPhone = new Phone();
		rgAccount = new Account();
	 }
	 
	 public RG(int rgYear, String rgPosition, float rgGrade) {
		 this.rgYear = new RgYear(rgYear);
		 this.rgPosition = new RgPosition(rgPosition);
		 this.rgGrade = new RgGrade(rgGrade);
		 rgPay = 200 + (this.rgGrade.getRgGrade()* 200 + this.rgYear.getRgYear() + this.rgPosition.getRgPosition()*200); 
	 }
	 public RG(String rgName, String rgPassword, String rgPhone, String rgAccount) {
		 this.rgName = new Name();
		 this.rgPassword = new Password();
		 this.rgPhone = new Phone();
		 this.rgAccount = new Account();
	 }
	 public void setRgYear(int rgYear) {
		 this.rgYear.setRgYear(rgYear);
	 }
	 public void setRgPosition(String rgPosition) {
		 this.rgPosition.setRgPosition(rgPosition);
	 }
	
	 public void setRgGrade(float rgGrade) {
		 this.rgGrade.setRgGrad(rgGrade);
	 }
	 
	 public void setRgName(String rgName) {
		 this.rgName.setName(rgName);
	 }
	 public void setRgPassword(String rgPassword) {
		 this.rgPassword.setPassword(rgPassword);
	 }
	 public void setRgPhone(String rgPhone) {
		 this.rgPassword.setPassword(rgPhone);
	 }
	 public void setRgAccount(String rgAcccount) {
		 this.rgAccount.setAccount(rgAcccount);
	 }
	 
	 public int getRgYear() {
		 return rgYear.getRgYear();
	 }
	 public float getRgPosition(){
		 return rgPosition.getRgPosition();
	 }
	
	 public float getRgGrade() {
		 return rgGrade.getRgGrade();
	 }
	 
	 public String getRgName() {
		 return rgName.getName();
	 }
	 public String getRgPassword() {
		 return rgPassword.getPassword();
	 }
	 public String getRgPhone() {
		 return rgPhone.getPhone();
	 }
	 public String getRgAccount() {
		 return rgAccount.getAccount();
	 }
}	


