package coding.insight.cleanuiloginregister;

public class user {
    String username, password, email, phonenumber;
    public user(String username, String password, String email, String address) {
        this.username = username;
        this.password = password;
        this.email = email;
        this.phonenumber = phonenumber;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPhonenumber() {
        return phonenumber;
    }

    public void setAddress(String phonenumber) {
        this.phonenumber = phonenumber;
    }
}
