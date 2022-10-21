/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package Plantillas;

//import Vistas.Login1;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.net.Socket;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author garci
 */
public class DesktopPlantillaClar extends javax.swing.JFrame {

     static int id;
     static String usuari;
     static int rol;

    public static int getRol() {
        return rol;
    }

    public static void setRol(int rol) {
        DesktopPlantillaClar.rol = rol;
    }

    public static String getUsuari() {
        return usuari;
    }

    public static void setUsuari(String usuari) {
        DesktopPlantillaClar.usuari = usuari;
    }
     static String pwd;

    public static String getPwd() {
        return pwd;
    }

    public static void setPwd(String pwd) {
        DesktopPlantillaClar.pwd = pwd;
    }

    public static int getId() {
        return id;
    }

    public static void setId(int id) {
        DesktopPlantillaClar.id = id;
    }
    /**
     * Creates new form DesktopPrincipal
     */
    public DesktopPlantillaClar() {
        initComponents();
        this.setLocationRelativeTo(null);
    }
   
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanelMenuLeft = new javax.swing.JPanel();
        jSeparator1 = new javax.swing.JSeparator();
        jLabelHome = new javax.swing.JLabel();
        jLabelIssues = new javax.swing.JLabel();
        jLabelTickets = new javax.swing.JLabel();
        jLabelStadictics = new javax.swing.JLabel();
        jLabelNewUser = new javax.swing.JLabel();
        jLabelMessage = new javax.swing.JLabel();
        jLabelSettings = new javax.swing.JLabel();
        jPaneMenuRight = new javax.swing.JPanel();
        jLabelTittle = new javax.swing.JLabel();
        jLabelUserIcon = new javax.swing.JLabel();
        jLabelUserConnected = new javax.swing.JLabel();
        jLabelMinimize = new javax.swing.JLabel();
        jLabelClose = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanelMenuLeft.setBackground(new java.awt.Color(245, 245, 245));

        jSeparator1.setBackground(new java.awt.Color(204, 204, 204));
        jSeparator1.setForeground(new java.awt.Color(204, 204, 204));

        jLabelHome.setBackground(new java.awt.Color(60, 210, 75));
        jLabelHome.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabelHome.setForeground(new java.awt.Color(255, 255, 0));
        jLabelHome.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/01 Inici Selected.png"))); // NOI18N
        jLabelHome.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        jLabelIssues.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/02 Incidencies NoSelected TC.png"))); // NOI18N
        jLabelIssues.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        jLabelTickets.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/03 Tiquets NoSelected TC.png"))); // NOI18N
        jLabelTickets.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        jLabelStadictics.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/04 Estadistiques NoSelected TC.png"))); // NOI18N
        jLabelStadictics.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        jLabelNewUser.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/05 Alta Usuari NoSelected TC.png"))); // NOI18N
        jLabelNewUser.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        jLabelMessage.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/06 Missatges NoSelected TC.png"))); // NOI18N
        jLabelMessage.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        jLabelSettings.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/07 Configuracio NoSelected TC.png"))); // NOI18N
        jLabelSettings.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        javax.swing.GroupLayout jPanelMenuLeftLayout = new javax.swing.GroupLayout(jPanelMenuLeft);
        jPanelMenuLeft.setLayout(jPanelMenuLeftLayout);
        jPanelMenuLeftLayout.setHorizontalGroup(
            jPanelMenuLeftLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jSeparator1, javax.swing.GroupLayout.Alignment.TRAILING)
            .addComponent(jLabelHome, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanelMenuLeftLayout.createSequentialGroup()
                .addGroup(jPanelMenuLeftLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabelIssues)
                    .addComponent(jLabelTickets)
                    .addComponent(jLabelStadictics)
                    .addComponent(jLabelNewUser)
                    .addComponent(jLabelMessage)
                    .addComponent(jLabelSettings))
                .addGap(0, 0, Short.MAX_VALUE))
        );
        jPanelMenuLeftLayout.setVerticalGroup(
            jPanelMenuLeftLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelMenuLeftLayout.createSequentialGroup()
                .addGap(99, 99, 99)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabelHome, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabelIssues)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabelTickets)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabelStadictics)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabelNewUser)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabelMessage)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabelSettings)
                .addContainerGap(209, Short.MAX_VALUE))
        );

        getContentPane().add(jPanelMenuLeft, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 200, 600));

        jPaneMenuRight.setBackground(new java.awt.Color(204, 204, 204));
        jPaneMenuRight.setPreferredSize(new java.awt.Dimension(1000, 600));

        jLabelTittle.setBackground(new java.awt.Color(73, 181, 172));
        jLabelTittle.setFont(new java.awt.Font("Segoe UI Light", 1, 18)); // NOI18N
        jLabelTittle.setForeground(new java.awt.Color(73, 181, 172));
        jLabelTittle.setText("Dashboard");

        jLabelUserIcon.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/icons8-male-user-24.png"))); // NOI18N

        jLabelUserConnected.setBackground(new java.awt.Color(204, 204, 204));
        jLabelUserConnected.setFont(new java.awt.Font("Segoe UI Light", 1, 18)); // NOI18N
        jLabelUserConnected.setForeground(new java.awt.Color(73, 181, 172));

        jLabelMinimize.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/icons8-subtract-24.png"))); // NOI18N
        jLabelMinimize.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabelMinimize.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabelMinimizeMouseClicked(evt);
            }
        });

        jLabelClose.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/icons8-close-24.png"))); // NOI18N
        jLabelClose.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabelClose.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabelCloseMouseClicked(evt);
            }
        });

        jPanel1.setBackground(new java.awt.Color(245, 245, 245));

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 500, Short.MAX_VALUE)
        );

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/icons8-logout-40.png"))); // NOI18N
        jLabel1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel1MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPaneMenuRightLayout = new javax.swing.GroupLayout(jPaneMenuRight);
        jPaneMenuRight.setLayout(jPaneMenuRightLayout);
        jPaneMenuRightLayout.setHorizontalGroup(
            jPaneMenuRightLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPaneMenuRightLayout.createSequentialGroup()
                .addGroup(jPaneMenuRightLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPaneMenuRightLayout.createSequentialGroup()
                        .addGap(206, 206, 206)
                        .addGroup(jPaneMenuRightLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(jPaneMenuRightLayout.createSequentialGroup()
                                .addComponent(jLabelTittle)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 381, Short.MAX_VALUE)
                                .addComponent(jLabelUserIcon)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabelUserConnected, javax.swing.GroupLayout.PREFERRED_SIZE, 216, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(19, 19, 19)
                                .addComponent(jLabelMinimize)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabelClose))))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPaneMenuRightLayout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel1)))
                .addContainerGap())
        );
        jPaneMenuRightLayout.setVerticalGroup(
            jPaneMenuRightLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPaneMenuRightLayout.createSequentialGroup()
                .addGroup(jPaneMenuRightLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPaneMenuRightLayout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPaneMenuRightLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabelClose)
                            .addComponent(jLabelTittle)
                            .addGroup(jPaneMenuRightLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(jLabelUserIcon)
                                .addGroup(jPaneMenuRightLayout.createSequentialGroup()
                                    .addComponent(jLabelUserConnected, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(3, 3, 3)))))
                    .addGroup(jPaneMenuRightLayout.createSequentialGroup()
                        .addGap(13, 13, 13)
                        .addComponent(jLabelMinimize)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel1)
                .addGap(33, 33, 33))
        );

        getContentPane().add(jPaneMenuRight, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1000, 600));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jLabelCloseMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabelCloseMouseClicked

        logOut();
        System.exit(0);

    }//GEN-LAST:event_jLabelCloseMouseClicked

    private void jLabelMinimizeMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabelMinimizeMouseClicked
        this.setExtendedState(ICONIFIED);
    }//GEN-LAST:event_jLabelMinimizeMouseClicked

    private void jLabel1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel1MouseClicked
        LoginPlantilla window = new LoginPlantilla();
        window.setVisible(true);
        logOut();
        this.dispose();
    }//GEN-LAST:event_jLabel1MouseClicked

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(DesktopPlantillaClar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(DesktopPlantillaClar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(DesktopPlantillaClar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(DesktopPlantillaClar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new DesktopPlantillaClar().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabelClose;
    private javax.swing.JLabel jLabelHome;
    private javax.swing.JLabel jLabelIssues;
    private javax.swing.JLabel jLabelMessage;
    private javax.swing.JLabel jLabelMinimize;
    private javax.swing.JLabel jLabelNewUser;
    private javax.swing.JLabel jLabelSettings;
    private javax.swing.JLabel jLabelStadictics;
    private javax.swing.JLabel jLabelTickets;
    private javax.swing.JLabel jLabelTittle;
    public javax.swing.JLabel jLabelUserConnected;
    private javax.swing.JLabel jLabelUserIcon;
    private javax.swing.JPanel jPaneMenuRight;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanelMenuLeft;
    private javax.swing.JSeparator jSeparator1;
    // End of variables declaration//GEN-END:variables

private void logOut(){
 
    Socket sc;
    try {
        sc = new Socket("127.0.0.1", 5000);
        DataInputStream in = new DataInputStream(sc.getInputStream());
        DataOutputStream out = new DataOutputStream(sc.getOutputStream());

        // Llegir la resposta del servidor al establir la connexió
        String resposta_svr = in.readUTF();
        //Enviem resposta al servidor amb el usuari i la contrasenya
        out.writeUTF("LOGIN," + getUsuari() + "," + getPwd() + "," + getId());
        //Executo la consulta de la crida per sortir
        out.writeUTF("EXIT");
        System.out.println("Valor getId: " + getId());

    } catch (IOException ex) {
        Logger.getLogger(DesktopPlantillaClar.class.getName()).log(Level.SEVERE, null, ex);
    }

    //System.exit(0);

    //System.exit(0);

    //System.exit(0);

    //System.exit(0);

    //System.exit(0);

    //System.exit(0);

    //System.exit(0);

    //System.exit(0);

    //System.exit(0);

    //System.exit(0);

    //System.exit(0);

    //System.exit(0);

    //System.exit(0);

    //System.exit(0);

    //System.exit(0);

    //System.exit(0);
}
    
}





