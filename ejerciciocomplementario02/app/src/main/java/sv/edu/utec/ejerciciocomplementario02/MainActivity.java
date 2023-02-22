package sv.edu.utec.ejerciciocomplementario02;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
EditText edtNumm1,edtNumm2;
CheckBox chkSumaa,chkRestaa;
TextView twResultadoo;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    public void Calcular(View v){
        edtNumm1=findViewById(R.id.edtNum1);
        edtNumm2=findViewById(R.id.edtNum2);
        chkSumaa=findViewById(R.id.chkSuma);
        chkRestaa=findViewById(R.id.chkResta);
        twResultadoo=findViewById(R.id.twResultado);
        int num1=Integer.parseInt(edtNumm1.getText().toString());
        int num2=Integer.parseInt(edtNumm2.getText().toString());
        if(chkSumaa.isChecked()==true){
            twResultadoo.setText(String.valueOf(num1+num2));
        }
        else if(chkRestaa.isChecked()==true){
            twResultadoo.setText(String.valueOf(num1-num2));
        }
    }
}