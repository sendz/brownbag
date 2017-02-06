package sendz.github.io.brownbag.login;

import android.databinding.BaseObservable;
import android.databinding.Bindable;
import android.view.View;

import com.android.databinding.library.baseAdapters.BR;

/**
 * Created by sendy on 2/6/17.
 */

public class LoginViewModel extends BaseObservable {
    private String username;
    private String password;
    private String message;

    @Bindable
    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
        notifyPropertyChanged(BR.username);
    }

    @Bindable
    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
        notifyPropertyChanged(BR.password);
    }

    @Bindable
    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
        notifyPropertyChanged(BR.message);
        notifyPropertyChanged(BR.visibility);
    }

    @Bindable
    public int getVisibility() {
        if (this.message != null) return View.VISIBLE;
        return View.GONE;
    }
}
