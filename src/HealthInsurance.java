import java.util.Date;

public class HealthInsurance extends Insurance{
    public HealthInsurance(String insuranceName, double insurancePrice, Date insuranceStart, Date insuranceFinish) {
        super(insuranceName, insurancePrice, insuranceStart, insuranceFinish);
    }

    @Override
    public double calculate() {
        return getInsurancePrice()*0.5;
    }
}
