public class Login {

    private String username;
    private String password;

    public Login() {
    }

    public Login(String username, String password) {
        this.username = username;
        this.password = password;
    }

    public boolean loginStatus(String inputUsername, String inputPassword) {
        if (this.username.equals(inputUsername) &&
                this.password.equals(inputPassword)) {
            return true;
        } else {
            return false;
        }
    }
}
