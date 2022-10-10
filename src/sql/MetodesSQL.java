/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package sql;

import java.sql.*;

/**
 *
 * @author garci
 */
public class MetodesSQL {

    public static ConnectionSQL connect = new ConnectionSQL();

    public static PreparedStatement sentence_ready;
    public static ResultSet result;
    String sql;
    int result_number = 0;

    //Crear usuaris
    public int crearUser(String user, String passwd, String nom, String cognom, String departament) {
        int result = 0;
        Connection conexio = null;

        String sentenciaCrear = ("INSERT INTO usuaris (\"ID\",\"Usuari\",\"Contrasenya\",\"Nom\",\"Cognom\",\"Departament\") VALUES (default,?,?,?,?,?)");

        try {
            conexio = ConnectionSQL.establirConexio();
            sentence_ready = conexio.prepareStatement(sentenciaCrear);
            sentence_ready.setString(1, user);
            sentence_ready.setString(2, passwd);
            sentence_ready.setString(3, nom);
            sentence_ready.setString(4, cognom);
            sentence_ready.setString(5, departament);

            result = sentence_ready.executeUpdate();
            sentence_ready.close();

            conexio.close();

        } catch (Exception e) {
            System.out.println(e);
        }
        return result;
    }

    public static String searchName(String user) {

        String search_name = null;
        Connection conexio = null;

        try {
            conexio = ConnectionSQL.establirConexio();
            String sentenciaBuscar = ("SELECT Nom,Cognom FROM usuaris WHERE Usuari = '" + user + "'");
            sentence_ready = conexio.prepareStatement(sentenciaBuscar);
            result = sentence_ready.executeQuery();

            if (result.next()) {
                String nom = result.getString("Nom");
                String cognom = result.getString("Cognom");
                search_name = (nom + " " + cognom);
            }
            conexio.close();
        } catch (Exception e) {
            System.out.println(e);
        }
        return search_name;
    }

    public static String searchUserRegistered(String user, String passwd) {
        String search_user = null;
        Connection conexio = null;

        try {
            conexio = ConnectionSQL.establirConexio();
            String sentenciaBuscarUser = ("SELECT Nom,Usuari,Contrasenya FROM usuaris WHERE Usuari = '" + user + "' && Contrasenya = '" + passwd + "'");
            sentence_ready = conexio.prepareStatement(sentenciaBuscarUser);
            result = sentence_ready.executeQuery();

            if (result.next()) {
                search_user = "Usuario encontrado";
                //search_user = user;
            } else {
                search_user = "Usuario no encontrado";
            }
            conexio.close();
        } catch (Exception e) {
            System.out.println(e);
        }

        return search_user;
    }

}
