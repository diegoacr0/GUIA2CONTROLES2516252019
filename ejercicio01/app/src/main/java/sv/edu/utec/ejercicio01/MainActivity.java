package sv.edu.utec.ejercicio01;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
String nombre="Diego Alejandro Ceron Rodriguez";
TextView twSalida;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        twSalida=findViewById(R.id.twResultado);
        twSalida.setText("Bienvenido "+nombre);
    }
}