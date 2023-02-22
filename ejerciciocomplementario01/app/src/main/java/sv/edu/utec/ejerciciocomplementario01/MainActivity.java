package sv.edu.utec.ejerciciocomplementario01;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
EditText edtVal1,edtVal2;
RadioButton rbSuma,rbResta;
TextView twRes;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    public void Calcular(View v){
        edtVal1=findViewById(R.id.edtNum1);
        edtVal2=findViewById(R.id.edtNum2);
        rbSuma=findViewById(R.id.rbSuma);
        rbResta=findViewById(R.id.rbResta);
        twRes=findViewById(R.id.twResultado);
        int num1=Integer.parseInt(edtVal1.getText().toString());
        int num2=Integer.parseInt(edtVal2.getText().toString());

        if(rbSuma.isChecked()==true){
            twRes.setText(String.valueOf(num1+num2));
        } else if (rbResta.isChecked()==true) {
            twRes.setText(String.valueOf(num1-num2));
        }
    }
}