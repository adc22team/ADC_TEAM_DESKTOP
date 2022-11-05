package Utils;

/**
 *
 * @author aigardo
 */
public class Usuaris {
    private static String user;
    private static String password;
    private static String name;
    private static String lastname;
    private static String department;
    private static String role;
    private static String state;

    public Usuaris() {
    }
    
    public Usuaris(String user, String password, String name, String lastname, String department, String role, String state){
        this.user = user;
        this.password = password;
        this.name = name;
        this.lastname = lastname;
        this.department = department;
        this.role = role;
        this.state = state;
    }

    public String getUser() {
        return user;
    }

    public void setUser(String user) {
        this.user = user;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLastname() {
        return lastname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public String getRole() {
        return role;
    }

    public void setRole(String role) {
        this.role = role;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }
    
}
