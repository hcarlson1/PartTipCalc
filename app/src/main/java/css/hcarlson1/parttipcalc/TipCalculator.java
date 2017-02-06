package css.hcarlson1.parttipcalc;

/**
 * Created by hcarlson1 on 2/6/2017.
 */
public class TipCalculator {

    private Double result;
    private Double resultPP;

    public Double CalcTotalTip(Double bill){
        result = bill * 0.1;
        return result;
    }
    public Double CalcTipPerPerson(Double bill, Integer people){
        resultPP = CalcTotalTip(bill) / people;
        return resultPP;

    }

}
