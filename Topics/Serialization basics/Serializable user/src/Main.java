import java.io.Serializable;

class User implements Serializable {
    private final static long serialVersionUID =1L;
    String name;
    transient String password;

    @java.lang.Override
    public java.lang.String toString() {
        return "User{" +
                "serialVersionUID=" + serialVersionUID +
                ", name='" + name + '\'' +
                ", password='" + password + '\'' +
                '}';
    }

    public long getSerialVersionUID() {
        return serialVersionUID;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}