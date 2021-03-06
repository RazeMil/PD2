package sg.edu.rp.c346.letspaydabillz;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
//import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.TextView;

import java.text.DecimalFormat;
import java.text.NumberFormat;

public class MainActivity extends AppCompatActivity {
    EditText etNo;
    EditText etTotal;
    Button btnCal;
    Button btnReset;
    TextView tvEnd;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        etNo = findViewById(R.id.etNum);
        etTotal = findViewById(R.id.etCost);
        btnCal = findViewById(R.id.btnCal);
        btnReset = findViewById(R.id.btnReset);
        tvEnd = findViewById(R.id.tvResult);

     //   String[] items = new String[]{"Cost Splitter", "Who Pay the Bill", "Group"};
     //   ArrayAdapter<String> adapter = new ArrayAdapter<>(this, android.R.layout.simple_spinner_dropdown_item, items);

        btnCal.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
              float a=Float.parseFloat(etNo.getText().toString());
              float b=Float.parseFloat(etTotal.getText().toString());
                float f = (b/a);
                DecimalFormat decimalFormat = new DecimalFormat("#.##");
                float twoDigitsF = Float.valueOf(decimalFormat.format(f));
                tvEnd.setText("Each Person pays : "+(twoDigitsF));
            }


    //create an adapter to describe how the items are displayed, adapters are used in several places in android.
//There are multiple variations of this, but this is the basic variant.

//set the spinners adapter to the previously created one.     dropdown.setAdapter(adapter);
});

        btnReset.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                    tvEnd.setText("");
                    etNo.setText("");
                    etTotal.setText("");
            }
        });
    }
}