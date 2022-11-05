/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Utils;

import Vistas.DesktopAdmin;
import static Vistas.DesktopAdmin.getId;
import static Vistas.DesktopAdmin.getPwd;
import static Vistas.DesktopAdmin.getUsuari;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.net.Socket;
import java.util.ArrayList;

/**
 *
 * @author aigardo
 */
public class ObtenirTaulesBBDD {
    
    public void getLlistaRols(){
        DesktopAdmin da = new DesktopAdmin();
        //Rols rols = new Rols();
        
        Socket sc;
        try {
            sc = new Socket("127.0.0.1", 5000);
            DataInputStream in = new DataInputStream(sc.getInputStream());
            DataOutputStream out = new DataOutputStream(sc.getOutputStream());
            
            //Llegir la resposta del servidor al establir la connexió
            String resposta_svr = in.readUTF();

            //Enviem resposta al servidor amb el usuari i la contrasenya i el ID obtingut login
            out.writeUTF("LOGIN," + da.getUsuari() + "," + da.getPwd() + "," + da.getId());
            
            //Executem la crida per llistar usuaris
            out.writeUTF("USER_QUERY,SELECT * FROM rols");
            
            // Llegir la resposta del servidor del nombre de registres trobats
            int registres_trobats = in.readInt();
             
            String[] camps;
            Object[][] registresGrid = new Object[registres_trobats][2];
            
            for (int i = 0; i < registres_trobats; i++) {
                String rol = in.readUTF();
                camps = rol.split(",");
                
                for (int j = 0; j < 0; j++) {
                    registresGrid[i][j] = camps[j];
                }
            }
            
            //da.jComboBoxAddRole.addItem(new Rols(,""));          
        } catch (Exception e) {
        }
    }    
}
