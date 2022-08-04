package Salary_Management;

class RgYear {
   private int rgYear;
   private int rgYearp;
   
   public RgYear() {}
   public RgYear(int rgYear, int rgYearp) {
      this.rgYear = rgYear;
      this.rgYearp = rgYearp;
   }
   public void setRgYearp(int rgYearp) {
      this.rgYearp = rgYearp;
   }
   public void setRgYear(int rgYear) {
      this.rgYear = rgYear;
   }
   public int getRgYear() {
      return rgYear;
   }
   public int getRgYearp() {
      if(rgYear > 3) {
         rgYearp += 10;
      }else if(rgYear > 5) {
         rgYearp += 30;
      }
      return rgYearp;
   }
}

class RgPosition{
   private float rgPosition;
   
   public RgPosition() {}
   public RgPosition(float rgPosition) {
      this.rgPosition = rgPosition;
   }
   
   public float getRgPosition() {
      return rgPosition;
   }
   
   public void setRgPosition(float rgPosition) {
      this.rgPosition = rgPosition;
   }
   public float getRgPositionp() {
      if(rgPosition ==1) {
    	  rgPosition = 0;
      }
      else if(rgPosition ==2) {
    	  rgPosition = 0.2f;
      }
      else if(rgPosition ==3) {
    	  rgPosition = 0.4f;
      }
      else if(rgPosition ==4) {
    	  rgPosition = 0.6f;
      }
      else if(rgPosition ==5) {
    	  rgPosition = 0.8f;
      }
      return rgPosition;
   }
}

class RgGrade{
    private float rgGrade;
    private float rgGradep;
    
    public RgGrade() {}
    public RgGrade(float rgGrade, float rgGradep) {
      this.rgGrade = rgGrade;
    }
    
    public void setRgGrade(float rgGrade) {
       this.rgGrade = rgGrade;
    }
    public float getRgGrade() {
       if(rgGrade == 1) {
          rgGradep = 0.5f;
       }
       else if(rgGrade == 2) {
          rgGradep = 0.2f;
       }
       else if(rgGrade == 3) {
          rgGradep = 0.0f;
       }
       return rgGradep;
    }
   public void setRgGradep(float rgGradep) {
      this.rgGradep = rgGradep;
   }
   public float getRgGradep() {
      return rgGradep;
   }
}

public class RG extends User{
    
    private RgYear rgYear;
    private RgYear rgYearp;
    private RgPosition rgPosition;
    private RgPosition rgPositionp;
    private RgGrade rgGrade;
    private RgGrade rgGradep;
    private float rgpay;
    private Password rgPassword;

    public RG() {
      rgYear = new RgYear();
      rgYearp = new RgYear();
      rgPosition = new RgPosition();
      rgPositionp = new RgPosition();
      rgGrade = new RgGrade();
      rgGradep = new RgGrade();
      rgpay = 200;
      rgPassword = new Password();
    }
    
     public RG(String name, String phone, String account) {
    	super(name, phone, account);
    }
    
    public RG(int rgYear,int rgYearp, float rgPosition, float rgGrade,float rgGradep, int rgPassword) {
       this.rgYearp = new RgYear(rgYearp, rgYear);
       this.rgPositionp = new RgPosition(rgPosition);
       this.rgGradep = new RgGrade(rgGrade, rgGradep);
       rgpay = 200 + (this.rgGradep.getRgGradep()* 200 + this.rgYearp.getRgYearp() + this.rgPositionp.getRgPositionp()*200);
       this.rgPassword = new Password();
    }
    
//    public void setRgYear(int rgYear) {
//       this.rgYear.setRgYear(rgYear);
//    }
//    public void setRgYearp(int rgYearp) {
//       this.rgYearp.setRgYearp(rgYearp);
//    }
//    public void setRgPosition(float rgPosition) {
//       this.rgPosition.setRgPosition(rgPosition);
//    }
//    public void setRgGrade(float rgGrade) {
//       this.rgGrade.setRgGrade(rgGrade);
//    }
//    public void setRgGradep(float rgGradep) {
//       this.rgGradep.setRgGradep(rgGradep);
//    }
//    public void setRgPassword(int rgPassword) {
//       this.rgPassword.setPassword(rgPassword);
//    }
//    public int getRgYear() {
//       return rgYear.getRgYear() ;
//    }
//    public int getRgYearp() {
//       return rgYearp.getRgYearp();
//    }
//    public float getRgPosition(){
//       return rgPosition.getRgPosition();
//    }
//    public float getRgGrade() {
//       return rgGrade.getRgGrade();
//    }
//    public float getRgGradep() {
//        return rgGradep.getRgGradep();
//    }
//    public int getRgPassword() {
//       return rgPassword.getPassword();
//    }
//    public float getRgpay() {
//       return rgpay = 200 + (this.rgGradep.getRgGradep()* 200 + this.rgYearp.getRgYearp() + this.rgPosition.getRgPosition()*200);
?    }
    
}
