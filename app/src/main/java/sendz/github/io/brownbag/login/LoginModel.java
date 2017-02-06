package sendz.github.io.brownbag.login;

/**
 * Created by sendy on 2/6/17.
 */

public class LoginModel {
    public String username;
    public String password;

    public LoginModel(String username, String password) {
        this.username = username;
        this.password = password;
    }

    @Override
    public String toString() {
        return "LoginModel{" +
                "username='" + username + '\'' +
                ", password='" + password + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        LoginModel model = (LoginModel) o;

        if (username != null ? !username.equals(model.username) : model.username != null)
            return false;
        return password != null ? password.equals(model.password) : model.password == null;

    }

    @Override
    public int hashCode() {
        int result = username != null ? username.hashCode() : 0;
        result = 31 * result + (password != null ? password.hashCode() : 0);
        return result;
    }
}
