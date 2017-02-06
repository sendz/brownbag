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

    @Before
    public void setUp() throws Exception {
        presenter = new LoginPresenter(view);
    }

    @Test
    public void testShouldDisplayUsernameAndPasswordOnTextView()
            throws Exception {
        LoginModel model = new LoginModel("username", "password");
        presenter.doLogin(model);
        verify(view).showDialog(eq(model));
    }
}