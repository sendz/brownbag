package sendz.github.io.brownbag.login;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.AppCompatButton;
import android.support.v7.widget.AppCompatEditText;
import android.view.View;
import android.widget.TextView;

import sendz.github.io.brownbag.R;

public class LoginActivity extends AppCompatActivity implements LoginView {

    private AppCompatEditText inputUsername;
    private AppCompatEditText inputPassword;
    private AppCompatButton buttonLogin;
    private TextView textUsername;

    private LoginPresenter presenter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
        presenter = new LoginPresenter(this);
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
                presenter.doLogin(new LoginModel(inputUsername.getText().toString(), inputPassword.getText().toString()));
            }
        });
    }

    @Override
    public void showDialog(LoginModel model) {
        textUsername.setText(String.format(getString(R.string.format_login_with), model.username, model.password));
        textUsername.setVisibility(View.VISIBLE);
    }
}
