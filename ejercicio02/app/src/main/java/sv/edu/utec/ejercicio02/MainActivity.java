package sv.edu.utec.ejercicio02;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
EditText edtCosto;
TextView twResultado;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void Calcularprecio(View v){
        edtCosto=findViewById(R.id.edtPrecio);
        twResultado=findViewById(R.id.twSalida);
        double iva=Double.parseDouble(edtCosto.getText().toString())*0.134;
        double precio=iva+Double.parseDouble(edtCosto.getText().toString());
        twResultado.setText("");
        twResultado.setText(String.valueOf("$ "+precio));
    }
}