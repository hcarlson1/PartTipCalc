package css.hcarlson1.parttipcalc;

/**
 * Created by hcarlson1 on 2/6/2017.
 */
public class TipCalculator implements IntfTipCalculator {

    private Double result;
    private Double resultPP;
    final Double BASIC_TIP = 0.1;

    @Override
    public Double CalcTotalTip(Double bill){
        result = bill * BASIC_TIP;
        return result;
    }
    @Override
    public Double CalcTipPerPerson(Double bill, Integer people){
        resultPP = CalcTotalTip(bill) / people;
        return resultPP;

    }

}
