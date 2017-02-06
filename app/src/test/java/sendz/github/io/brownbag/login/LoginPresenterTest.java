package sendz.github.io.brownbag.login;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.junit.MockitoJUnitRunner;

import static org.mockito.ArgumentMatchers.eq;
import static org.mockito.Mockito.verify;

/**
 * Created by sendy on 2/6/17.
 */
@RunWith(MockitoJUnitRunner.class)
public class LoginPresenterTest {

    private LoginPresenter presenter;

    @Mock
    private LoginView view;

    private LoginViewModel viewModel;

    @Before
    public void setUp() throws Exception {
        viewModel = new LoginViewModel();
        presenter = new LoginPresenter(view, viewModel);
    }

    @Test
    public void testShouldDisplayUsernameAndPasswordOnTextView()
            throws Exception {
        viewModel.setUsername("username");
        viewModel.setPassword("password");
        LoginModel model = new LoginModel("username", "password");
        presenter.doLogin();
        verify(view).showDialog(eq(model));
    }
}