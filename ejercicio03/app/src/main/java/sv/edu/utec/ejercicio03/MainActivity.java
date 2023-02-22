package sv.edu.utec.ejercicio03;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Switch;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
EditText edtNume1,edtNume2,edtOperacion;
TextView twRes;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void Calcular(View v){
        edtNume1=findViewById(R.id.edtNum1);
        edtNume2=findViewById(R.id.edtNum2);
        edtOperacion=findViewById(R.id.edtOperacion);
        twRes=findViewById(R.id.twResultado);
        int num1=Integer.parseInt(edtNume1.getText().toString());
        int num2=Integer.parseInt(edtNume2.getText().toString());
        String resultado="";

        switch(edtOperacion.getText().toString()){

            case "+":
                resultado=String.valueOf(num1+num2);
                break;
            case "-":
                resultado=String.valueOf(num1-num2);
                break;
            case "*":
                resultado=String.valueOf(num1*num2);
                break;
            case "/":
                if(num2 >0){
                    double valor1,valor2;
                    valor1=num1;valor2=num2;
                    resultado=String.valueOf(valor1/valor2);
                }
                else {
                    resultado="Invalido";
                }
                break;
            default:
                resultado="Invalido";
                break;

        }
        twRes.setText("El resultado es: "+resultado);
    }
}