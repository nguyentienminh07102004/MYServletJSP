package MODEL;

public class Admin {
   private String useName;
   private String Password;
   private int role;

    public Admin() {
    }

    public Admin(String useName, String Password, int role) {
        this.useName = useName;
        this.Password = Password;
        this.role = role;
    }

    public String getUseName() {
        return useName;
    }

    public void setUseName(String useName) {
        this.useName = useName;
    }

    public String getPassword() {
        return Password;
    }

    public void setPassword(String Password) {
        this.Password = Password;
    }

    public int getRole() {
        return role;
    }

    public void setRole(int role) {
        this.role = role;
    }
   
}
