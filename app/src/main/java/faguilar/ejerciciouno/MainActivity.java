package faguilar.ejerciciouno;

import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    public final static String EMAIL_VALIDO = "faguilar@fundapro.org.bo";
    public final static String CONTRASEÑA_VALIDO = "5974610";

    private LinearLayout lyLogin;
    private EditText txtEmail;
    private EditText txtPassword;
    private Button btnLogin;
    private TextView lblMensaje;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        lyLogin = (LinearLayout) findViewById(R.id.lyLogin);
        txtEmail = (EditText) findViewById(R.id.txtEmail);
        txtPassword = (EditText) findViewById(R.id.txtPassword);
        btnLogin = (Button) findViewById(R.id.btnLogin);

        btnLogin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String email = txtEmail.getText().toString();
                String password = txtPassword.getText().toString();

                if (email.equals(EMAIL_VALIDO) && password.equals(CONTRASEÑA_VALIDO)) {
                    //Toast.makeText(getApplicationContext(), "Bienvenido", Toast.LENGTH_SHORT).show();
                    Toast.makeText(getApplicationContext(), getString(R.string.login_ok, email), Toast.LENGTH_SHORT).show();
                } else {
                    //Toast.makeText(getApplicationContext(), "Email o Password inválidos", Toast.LENGTH_SHORT).show();
                    Toast.makeText(getApplicationContext(), getString(R.string.login_error), Toast.LENGTH_SHORT).show();
                    txtEmail.requestFocus();
                }
            }
        });
    }
}
