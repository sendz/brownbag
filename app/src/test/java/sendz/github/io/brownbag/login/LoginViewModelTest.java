package sendz.github.io.brownbag.login;

import android.view.View;

import org.junit.Before;
import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.*;

/**
 * Created by sendy on 2/6/17.
 */
public class LoginViewModelTest {
    LoginViewModel viewModel;

    @Before
    public void setUp() throws Exception {
        viewModel = new LoginViewModel();
    }

    @Test
    public void testShouldReturnCorrectUsername() throws Exception {
        viewModel.setUsername("udin");
        assertThat(viewModel.getUsername(), is("udin"));
    }

    @Test
    public void testShouldReturnCorrectPassword() throws Exception {
        viewModel.setPassword("Password");
        assertThat(viewModel.getPassword(), is("Password"));
    }

    @Test
    public void testShouldReturnCorrectMessage() throws Exception {
        viewModel.setMessage("This is our message");
        assertThat(viewModel.getMessage(), is("This is our message"));
    }

    @Test
    public void testShouldSetMessageVisibilityAsGoneIfMessageIsNull() throws Exception {
        assertThat(viewModel.getVisibility(), is(View.GONE));
    }

    @Test
    public void testShouldSetMessageVisibilityAsVisibleIfMessageIsNotNull() throws Exception {
        viewModel.setMessage("Hi");
        assertThat(viewModel.getVisibility(), is(View.VISIBLE));
    }
}