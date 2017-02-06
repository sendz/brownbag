package sendz.github.io.brownbag.login;

import android.content.DialogInterface;
import android.os.Bundle;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.AppCompatButton;
import android.support.v7.widget.AppCompatEditText;
import android.view.View;
import android.widget.TextView;

import sendz.github.io.brownbag.R;

public class LoginActivity extends AppCompatActivity {

    private AppCompatEditText inputUsername;
    private AppCompatEditText inputPassword;
    private AppCompatButton buttonLogin;
    private TextView textUsername;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
        initView();
        initLogin();
    }

    private void initView() {
        inputUsername = (AppCompatEditText) findViewById(R.id.username);
        inputPassword = (AppCompatEditText) findViewById(R.id.password);
        buttonLogin = (AppCompatButton) findViewById(R.id.login);
        textUsername = (TextView) findViewById(R.id.text_username);
    }

    private void initLogin() {
        buttonLogin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String message = String.format(getString(R.string.format_login_with), inputUsername.getText().toString(), inputPassword.getText().toString());
                doLogin(message);
            }
        });
    }

    private void doLogin(String message) {
        showDialog(message);
    }

    private void showDialog(String message) {
        textUsername.setText(message);
        textUsername.setVisibility(View.VISIBLE);
    }
}
