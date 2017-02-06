package css.hcarlson1.parttipcalc;

/**
 * Created by hcarlson1 on 2/6/2017.
 */
public interface IntfTipCalculator {
    Double CalcTotalTip(Double bill);

    Double CalcTipPerPerson(Double bill, Integer people);
}
