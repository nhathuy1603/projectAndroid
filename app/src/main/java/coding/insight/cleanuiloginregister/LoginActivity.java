package coding.insight.cleanuiloginregister;

import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import android.service.controls.Control;
import android.service.controls.templates.ControlButton;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;


public class LoginActivity extends AppCompatActivity {
    EditText editTextEmail, editTextPassword;
    Button cirLoginButton;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        //for changing status bar icon colors
        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.M) {
            getWindow().getDecorView().setSystemUiVisibility(View.SYSTEM_UI_FLAG_LIGHT_STATUS_BAR);
        }
        setContentView(R.layout.activity_login);
        Anhxa();

        cirLoginButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String passUname = getIntent().getStringExtra("username");
                String passPword = getIntent().getStringExtra("password");
                if(editTextEmail.getText().toString().equals("") || editTextPassword.getText().toString().equals("")) {
                    Toast.makeText(LoginActivity.this, "Vui lòng nhập thông tin!", Toast.LENGTH_SHORT).show();
                } else if((editTextEmail.getText().toString().equals("admin") && editTextPassword.getText().toString().equals("admin"))
                        || (editTextEmail.getText().toString().equals(passUname) && editTextPassword.getText().toString().equals(passPword)))         {
                    Intent intent = new Intent(LoginActivity.this, Home.class);
                    startActivity(intent);
                } else {
                    Toast.makeText(LoginActivity.this, "Tài khoản hoặc mật khẩu chưa chính xác!", Toast.LENGTH_SHORT).show();
                }

            }
        });


    }


    private void Anhxa() {
        editTextEmail = (EditText) findViewById(R.id.editTextEmail);
        editTextPassword = (EditText) findViewById(R.id.editTextPassword);
        cirLoginButton = (Button) findViewById(R.id.cirLoginButton);
    }

    public void onLoginClick(View View){
        startActivity(new Intent(this,RegisterActivity.class));
        overridePendingTransition(R.anim.slide_in_right,R.anim.stay);

    }
}
