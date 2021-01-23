package mcm.edu.ph.gabor_basiccal;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button btnAddition, btnSubtraction, btnDivision, btnMultiplication, btnModulo;
        EditText txtOperand1, txtOperand2;
        TextView txtAnswer;

        btnAddition = findViewById(R.id.btnAddition);
        btnSubtraction = findViewById(R.id.btnSubtraction);
        btnDivision = findViewById(R.id.btnDivision);
        btnMultiplication = findViewById(R.id.btnMultiplication);
        btnModulo = findViewById(R.id.btnModulo);


        btnAddition.setOnClickListener(this);
        btnSubtraction.setOnClickListener(this);
        btnDivision.setOnClickListener(this);
        btnMultiplication.setOnClickListener(this);
        btnModulo.setOnClickListener(this);
    }

    @Override
    public void onClick(View V) {
        EditText txtOperand1, txtOperand2;
        TextView txtAnswer;

        txtOperand1 = findViewById(R.id.txtOperand1);
        txtOperand2 = findViewById(R.id.txtOperand2);
        txtAnswer = findViewById(R.id.txtAnswer);

        Double op1 = 0.0;
        Double op2 = 0.0;
        Double answer = 0.0;

        op1 = Double.parseDouble(txtOperand1.getText().toString());
        op2 = Double.parseDouble(txtOperand2.getText().toString());

        switch (V.getId()) {
            case R.id.btnAddition:
                answer = op1 + op2;
                txtAnswer.setText(Double.toString(answer));

                break;
            case R.id.btnSubtraction:
                answer = op1 - op2;
                txtAnswer.setText(Double.toString(answer));
                break;

            case R.id.btnDivision:
                answer = op1 / op2;
                txtAnswer.setText(Double.toString(answer));

                break;


        }
    }
}