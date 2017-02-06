package css.hcarlson1.parttipcalc;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
   //Step 1: always initilize variables in main class
    EditText billAmount;
    EditText numParty;
    TextView totalTip;
    TextView totalPP;
    IntfTipCalculator tipCalc;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //Step 2 always link the variables to the UI in this method
        billAmount = (EditText) findViewById(R.id.editTextBillAmount);
        numParty = (EditText) findViewById(R.id.editTextNumPPL);
        totalTip = (TextView) findViewById(R.id.textViewTotalTip);
        totalPP = (TextView) findViewById(R.id.textViewTotalPP);

    }

    public void OnClickCalcButton(View view) {
        Double bill = Double.parseDouble(billAmount.getText().toString());
        Integer people = Integer.parseInt(numParty.getText().toString());

        totalTip.setText("Total tip: " + tipCalc.CalcTotalTip(bill).toString());
        totalPP.setText("Tip per person: " + tipCalc.CalcTipPerPerson(bill,people).toString());

    }
}
