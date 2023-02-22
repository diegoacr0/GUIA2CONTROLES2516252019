package sv.edu.utec.ejercicio04;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
TextView twDatoo1,twDatoo2,twDatoo3,twDatoo4;
int N=4;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        twDatoo1=findViewById(R.id.twDato1);
        twDatoo2=findViewById(R.id.twDato2);
        twDatoo3=findViewById(R.id.twDato3);
        twDatoo4=findViewById(R.id.twDato4);
        twDatoo1.setText("El valor inicial de N es: "+N);
        N=N+77;
        twDatoo2.setText("N + 77: "+N);
        N=N-3;
        twDatoo3.setText("N - 3: "+N);
        N=N*2;
        twDatoo4.setText("N * 2: "+N);
    }
}