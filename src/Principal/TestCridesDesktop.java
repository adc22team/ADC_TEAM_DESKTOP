/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Principal;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.net.Socket;

/**
 *
 * @author garci
 */
public class TestCridesDesktop {
    
    public static void main(String[] args) throws IOException{
        //loginAdmin();
        //loginTecnic();
        //loginUsuari();
    }
    
    public static void loginAdmin(){
        Socket sc;
        try {
            sc = new Socket("127.0.0.1", 5000);
            DataInputStream in = new DataInputStream(sc.getInputStream());
            DataOutputStream out = new DataOutputStream(sc.getOutputStream());
            
            //Llegir la resposta del servidor al establir la connexió
            String resposta_svr = in.readUTF();
            //Enviem resposta al servidor amb el usuari i la contrasenya
            out.writeUTF("LOGIN," + "aitor" + "," + "pwdaitor" + ",0");
            System.out.println("LOGIN," + "aitor" + "," + "pwdaitor" + ",0");
            
            int resposta_svr_id = in.readInt();
            System.out.println("resposta servidor: " + resposta_svr);
            
            if (resposta_svr_id != 0) {
                int rol = 1;
                System.out.println("Benvingut aitor");
                System.out.println("Obrim client d'administrador");
                System.out.println("aitor - #" + resposta_svr_id + " - # rol: " + rol);
                System.out.println("Test Admin Completat");
            }
            
        } catch (Exception ex) {
            System.out.println("No es pot establir connexió amb el servidor");
        }
    }
    
    public static void loginTecnic(){
        Socket sc;
        try {
            sc = new Socket("127.0.0.1", 5000);
            DataInputStream in = new DataInputStream(sc.getInputStream());
            DataOutputStream out = new DataOutputStream(sc.getOutputStream());
            
            //Llegir la resposta del servidor al establir la connexió
            String resposta_svr = in.readUTF();
            //Enviem resposta al servidor amb el usuari i la contrasenya
            out.writeUTF("LOGIN," + "manel" + "," + "pwdmanel" + ",0");
            System.out.println("LOGIN," + "manel" + "," + "pwdmanel" + ",0");
            
            int resposta_svr_id = in.readInt();
            System.out.println("resposta servidor: " + resposta_svr);
            
            if (resposta_svr_id != 0) {
                int rol = 2;
                System.out.println("Benvingut manel");
                System.out.println("Obrim client tècnic");
                System.out.println("manel - #" + resposta_svr_id + " - # rol: " + rol);
                System.out.println("Test Tècnic Completat");
            }
            
        } catch (Exception ex) {
            System.out.println("No es pot establir connexió amb el servidor");
        }
    }
    
    public static void loginUsuari(){
        Socket sc;
        try {
            sc = new Socket("127.0.0.1", 5000);
            DataInputStream in = new DataInputStream(sc.getInputStream());
            DataOutputStream out = new DataOutputStream(sc.getOutputStream());
            
            //Llegir la resposta del servidor al establir la connexió
            String resposta_svr = in.readUTF();
            //Enviem resposta al servidor amb el usuari i la contrasenya
            out.writeUTF("LOGIN," + "martina" + "," + "pwdmartina" + ",0");
            System.out.println("LOGIN," + "martina" + "," + "pwdmartina" + ",0");
            
            int resposta_svr_id = in.readInt();
            System.out.println("resposta servidor: " + resposta_svr);
            
            if (resposta_svr_id != 0) {
                int rol = 3;
                System.out.println("Rol: " + rol);
                System.out.println("Aquest rol d'usuari no te permisos per entrar en aquest aplicatiu");
            }
            
        } catch (Exception ex) {
            System.out.println("No es pot establir connexió amb el servidor");
        }
    }
    
}
