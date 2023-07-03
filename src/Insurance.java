import java.util.Date;

 abstract class Insurance {
    private String insuranceName;
    private double insurancePrice;
    private Date insuranceStart;
    private Date insuranceFinish;

    public Insurance(String insuranceName, double insurancePrice, Date insuranceStart, Date insuranceFinish) {
        this.insuranceName = insuranceName;
        this.insurancePrice = insurancePrice;
        this.insuranceStart = new Date();
        this.insuranceFinish = new Date();
    }
    public abstract double calculate();

     public String getInsuranceName() {
         return insuranceName;
     }

     public void setInsuranceName(String insuranceName) {
         this.insuranceName = insuranceName;
     }

     public double getInsurancePrice() {
         return insurancePrice;
     }

     public void setInsurancePrice(double insurancePrice) {
         this.insurancePrice = insurancePrice;
     }

     public Date getInsuranceStart() {
         return insuranceStart;
     }

     public void setInsuranceStart(Date insuranceStart) {
         this.insuranceStart = insuranceStart;
     }

     public Date getInsuranceFinish() {
         return insuranceFinish;
     }

     public void setInsuranceFinish(Date insuranceFinish) {
         this.insuranceFinish = insuranceFinish;
     }
 }
