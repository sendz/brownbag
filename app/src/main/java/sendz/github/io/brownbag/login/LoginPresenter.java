package sendz.github.io.brownbag.login;

/**
 * Created by sendy on 2/6/17.
 */

public class LoginPresenter {

    private LoginView view;

    public LoginPresenter(LoginView view) {
        this.view = view;
    }

    public void doLogin(LoginModel model) {
        view.showDialog(model);
    }
}
