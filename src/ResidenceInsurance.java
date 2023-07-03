import java.util.Date;

public class ResidenceInsurance extends Insurance {

    public ResidenceInsurance(String insuranceName, double insurancePrice, Date insuranceStart, Date insuranceFinish) {
        super(insuranceName, insurancePrice, insuranceStart, insuranceFinish);
    }

    @Override
    public double calculate() {
        return getInsurancePrice()*0.4;
    }
}
