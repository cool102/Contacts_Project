import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

class UserProfile implements Serializable {
    private static final long serialVersionUID = 26292552485L;

    private String login;
    private String email;
    private transient String password;

    public UserProfile(String login, String email, String password) {
        this.login = login;
        this.password = password;
        this.email = email;
    }

    private static String encrypt(String password) {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < password.length(); i++) {
            char modifedChar = (char) (password.charAt(i) + 1);
            sb.append(modifedChar);
        }
        return sb.toString();
    }

    private static String decrypt(String password) {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < password.length(); i++) {
            char modifedChar = (char) (password.charAt(i) - 1);
            sb.append(modifedChar);
        }
        return sb.toString();
    }

    private void writeObject(ObjectOutputStream oos) throws Exception {
        oos.defaultWriteObject();
        String encryptPassword = encrypt(password);
        oos.writeObject(encryptPassword);
    }

    private void readObject(ObjectInputStream ois) throws Exception {
        ois.defaultReadObject();
        String decryptPassword =  decrypt((String) ois.readObject());
        this.password = decryptPassword;
    }

    // implement readObject and writeObject properly

    public String getLogin() {
        return login;
    }

    public String getPassword() {
        return password;
    }

    public String getEmail() {
        return email;
    }
}