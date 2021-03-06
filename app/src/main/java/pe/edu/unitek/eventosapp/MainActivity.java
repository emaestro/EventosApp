package pe.edu.unitek.eventosapp;

import android.graphics.Color;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import org.w3c.dom.Text;

public class MainActivity extends AppCompatActivity {
    private Button mi_boton;
    private TextView mi_texto;
    private EditText mi_mensaje;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mi_texto = (TextView) findViewById(R.id.textView);
        mi_mensaje = (EditText) findViewById(R.id.editText);

        mi_boton = (Button) findViewById(R.id.button);
        mi_boton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String temporal;
                temporal = mi_mensaje.getText().toString();
                mi_texto.setTextColor(Color.RED);
                mi_texto.setText(temporal);
            }
        });
    }
}
