package faguilar.ejerciciouno;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    TextView lblMensaje;
    ImageView imgImagen;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        lblMensaje = (TextView) findViewById(R.id.lblMensaje);
        lblMensaje.setText("Hola Fernando !!");

        imgImagen = (ImageView) findViewById(R.id.imgLogo);
    }
}
