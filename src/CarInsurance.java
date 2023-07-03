import java.util.Date;

public class CarInsurance extends Insurance {
    public CarInsurance(String insuranceName, double insurancePrice, Date insuranceStart, Date insuranceFinish) {
        super(insuranceName, insurancePrice, insuranceStart, insuranceFinish);
    }

    @Override
    public double calculate() {
        return getInsurancePrice()*0.7;
    }
}
