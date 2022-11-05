package Utils;

import Vistas.DesktopAdmin;
import static Vistas.DesktopAdmin.getId;
import static Vistas.DesktopAdmin.getPwd;
import static Vistas.DesktopAdmin.getUsuari;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.net.Socket;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author aigardo
 */
public class GestioUsuarisUtils {
    //Atributs
    private String user;
    private String password;
    private String name;
    private String lastname;
    private String department;
    private String role;
    private String state;

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
    
    //Métode Creació Usuari
    public void altaUsuari() {
        DesktopAdmin da = new DesktopAdmin();
        
        Socket sc;
        try {
            sc = new Socket("127.0.0.1", 5000);
            DataInputStream in = new DataInputStream(sc.getInputStream());
            DataOutputStream out = new DataOutputStream(sc.getOutputStream());

            //Llegir la resposta del servidor al establir la connexió
            String resposta_svr = in.readUTF();
            
            //Enviem resposta al servidor amb el usuari i la contrasenya i el ID obtingut login
            out.writeUTF("LOGIN," + da.getUsuari() + "," + da.getPwd() + "," + da.getId());
            
            //Executem la crida per donar d’alta un nou usuari
            out.writeUTF("USER_NEW," + user + "," + password + "," + name + "," + lastname + "," + department + "," + role + "," + state);
            
            int resposta_alta = in.readInt();
            
            if (resposta_alta == 1) {
                JOptionPane.showMessageDialog(da, name + " " + lastname + " ha sigut donat d'alta amb el nom d'usuari " + user);
            } else {
                JOptionPane.showMessageDialog(da, "Dades introduides incorrectament");
            }
        } catch (Exception e) {
        }
    }
    
    //Métode per llistar Usuaris
    public void llistarUsuaris() {
        
    }
}
