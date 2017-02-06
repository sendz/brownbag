package sendz.github.io.brownbag.login;

import android.databinding.DataBindingUtil;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

import sendz.github.io.brownbag.R;
import sendz.github.io.brownbag.databinding.ActivityLoginBinding;

public class LoginActivity extends AppCompatActivity implements LoginView {

    private LoginViewModel viewModel;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        viewModel = new LoginViewModel();
        LoginPresenter presenter = new LoginPresenter(this, viewModel);
        ActivityLoginBinding loginBinding = DataBindingUtil.setContentView(this, R.layout.activity_login);
        loginBinding.setPresenter(presenter);
        loginBinding.setViewModel(viewModel);
    }

    @Override
    public void showDialog(LoginModel model) {
        viewModel.setMessage(String.format(getString(R.string.format_login_with), model.username, model.password));
    }
}
