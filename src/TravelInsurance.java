import java.util.Date;

public class TravelInsurance extends Insurance{
    public TravelInsurance(String insuranceName, double insurancePrice, Date insuranceStart, Date insuranceFinish) {
        super(insuranceName, insurancePrice, insuranceStart, insuranceFinish);
    }

    @Override
    public double calculate() {
        return getInsurancePrice()*0.8;
    }
}
