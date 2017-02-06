package sendz.github.io.brownbag.login;

/**
 * Created by sendy on 2/6/17.
 */

public class LoginPresenter {

    private LoginView view;
    private LoginViewModel viewModel;

    public LoginPresenter(LoginView view, LoginViewModel viewModel) {
        this.view = view;
        this.viewModel = viewModel;
    }

    public void doLogin() {
        view.showDialog(new LoginModel(viewModel.getUsername(), viewModel.getPassword()));
    }
}
