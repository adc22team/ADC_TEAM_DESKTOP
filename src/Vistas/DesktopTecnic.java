/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package Vistas;

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
public class DesktopTecnic extends javax.swing.JFrame {

    static int id;
    static String usuari;
    static int rol;

    public static int getRol() {
        return rol;
    }

    public static void setRol(int rol) {
        DesktopTecnic.rol = rol;
    }

    public static String getUsuari() {
        return usuari;
    }

    public static void setUsuari(String usuari) {
        DesktopTecnic.usuari = usuari;
    }
    static String pwd;

    public static String getPwd() {
        return pwd;
    }

    public static void setPwd(String pwd) {
        DesktopTecnic.pwd = pwd;
    }

    public static int getId() {
        return id;
    }

    public static void setId(int id) {
        DesktopTecnic.id = id;
    }

    /**
     * Creates new form DesktopPrincipal
     */
    public DesktopTecnic() {
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

        jPanelTop = new javax.swing.JPanel();
        jLabelTittle = new javax.swing.JLabel();
        jLabelUserIcon = new javax.swing.JLabel();
        jLabelUserConnected = new javax.swing.JLabel();
        jLabelMinimize = new javax.swing.JLabel();
        jLabelClose = new javax.swing.JLabel();
        jPanelMenuLeft = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jSeparator1 = new javax.swing.JSeparator();
        jLabelHomeMenu = new javax.swing.JLabel();
        jLabelTicketsMenu = new javax.swing.JLabel();
        jLabelStadisticsMenu = new javax.swing.JLabel();
        jLabelMessageMenu = new javax.swing.JLabel();
        jLabelDisconnect = new javax.swing.JLabel();
        jLabelSettingsMenu = new javax.swing.JLabel();
        jPaneMenuRight = new javax.swing.JPanel();
        jPanelHome = new javax.swing.JPanel();
        jLabelHome = new javax.swing.JLabel();
        jPanelTickets = new javax.swing.JPanel();
        jLabelTickets = new javax.swing.JLabel();
        jPanelStadistics = new javax.swing.JPanel();
        jLabelStadistics = new javax.swing.JLabel();
        jPanelMessage = new javax.swing.JPanel();
        jLabelMessage = new javax.swing.JLabel();
        jPanelSettings = new javax.swing.JPanel();
        jLabelSettings = new javax.swing.JLabel();
        jLabelTheme = new javax.swing.JLabel();
        jLabelLight = new javax.swing.JLabel();
        jLabelDark = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanelTop.setBackground(new java.awt.Color(55, 55, 55));

        jLabelTittle.setBackground(new java.awt.Color(73, 181, 172));
        jLabelTittle.setFont(new java.awt.Font("Segoe UI Light", 1, 18)); // NOI18N
        jLabelTittle.setForeground(new java.awt.Color(73, 181, 172));
        jLabelTittle.setText("Dashboard");

        jLabelUserIcon.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/icons8-male-user-24.png"))); // NOI18N

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

        javax.swing.GroupLayout jPanelTopLayout = new javax.swing.GroupLayout(jPanelTop);
        jPanelTop.setLayout(jPanelTopLayout);
        jPanelTopLayout.setHorizontalGroup(
            jPanelTopLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelTopLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabelTittle)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 376, Short.MAX_VALUE)
                .addComponent(jLabelUserIcon)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabelUserConnected, javax.swing.GroupLayout.PREFERRED_SIZE, 216, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabelMinimize)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabelClose)
                .addContainerGap())
        );
        jPanelTopLayout.setVerticalGroup(
            jPanelTopLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelTopLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanelTopLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabelTittle)
                    .addComponent(jLabelUserIcon)
                    .addComponent(jLabelClose)
                    .addComponent(jLabelUserConnected, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(9, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelTopLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabelMinimize)
                .addContainerGap())
        );

        getContentPane().add(jPanelTop, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 0, 800, 40));

        jPanelMenuLeft.setBackground(new java.awt.Color(55, 55, 55));

        jPanel2.setBackground(new java.awt.Color(55, 55, 55));
        jPanel2.setPreferredSize(new java.awt.Dimension(200, 93));

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 93, Short.MAX_VALUE)
        );

        jSeparator1.setBackground(new java.awt.Color(204, 204, 204));
        jSeparator1.setForeground(new java.awt.Color(51, 51, 51));

        jLabelHomeMenu.setBackground(new java.awt.Color(51, 51, 51));
        jLabelHomeMenu.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabelHomeMenu.setForeground(new java.awt.Color(255, 255, 0));
        jLabelHomeMenu.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/01 Inici Selected.png"))); // NOI18N
        jLabelHomeMenu.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabelHomeMenu.setOpaque(true);
        jLabelHomeMenu.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabelHomeMenuMouseClicked(evt);
            }
        });

        jLabelTicketsMenu.setBackground(new java.awt.Color(55, 55, 55));
        jLabelTicketsMenu.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/02 Tiquets NoSelected.png"))); // NOI18N
        jLabelTicketsMenu.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabelTicketsMenu.setOpaque(true);
        jLabelTicketsMenu.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabelTicketsMenuMouseClicked(evt);
            }
        });

        jLabelStadisticsMenu.setBackground(new java.awt.Color(55, 55, 55));
        jLabelStadisticsMenu.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/04 Estadistiques NoSelected.png"))); // NOI18N
        jLabelStadisticsMenu.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabelStadisticsMenu.setOpaque(true);
        jLabelStadisticsMenu.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabelStadisticsMenuMouseClicked(evt);
            }
        });

        jLabelMessageMenu.setBackground(new java.awt.Color(55, 55, 55));
        jLabelMessageMenu.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/06 Missatges NoSelected.png"))); // NOI18N
        jLabelMessageMenu.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabelMessageMenu.setOpaque(true);
        jLabelMessageMenu.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabelMessageMenuMouseClicked(evt);
            }
        });

        jLabelDisconnect.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/icons8-logout-40.png"))); // NOI18N
        jLabelDisconnect.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabelDisconnect.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabelDisconnectMouseClicked(evt);
            }
        });

        jLabelSettingsMenu.setBackground(new java.awt.Color(55, 55, 55));
        jLabelSettingsMenu.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/07 Configuracio NoSelected.png"))); // NOI18N
        jLabelSettingsMenu.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabelSettingsMenu.setOpaque(true);
        jLabelSettingsMenu.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabelSettingsMenuMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanelMenuLeftLayout = new javax.swing.GroupLayout(jPanelMenuLeft);
        jPanelMenuLeft.setLayout(jPanelMenuLeftLayout);
        jPanelMenuLeftLayout.setHorizontalGroup(
            jPanelMenuLeftLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabelHomeMenu, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanelMenuLeftLayout.createSequentialGroup()
                .addGroup(jPanelMenuLeftLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabelDisconnect)
                    .addGroup(jPanelMenuLeftLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addComponent(jSeparator1, javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jLabelTicketsMenu, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabelStadisticsMenu, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabelMessageMenu, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jPanel2, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabelSettingsMenu, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addGap(0, 0, Short.MAX_VALUE))
        );
        jPanelMenuLeftLayout.setVerticalGroup(
            jPanelMenuLeftLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelMenuLeftLayout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabelHomeMenu, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabelTicketsMenu)
                .addGap(12, 12, 12)
                .addComponent(jLabelStadisticsMenu)
                .addGap(12, 12, 12)
                .addComponent(jLabelMessageMenu)
                .addGap(12, 12, 12)
                .addComponent(jLabelSettingsMenu)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 253, Short.MAX_VALUE)
                .addComponent(jLabelDisconnect))
        );

        getContentPane().add(jPanelMenuLeft, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 200, 600));

        jPaneMenuRight.setBackground(new java.awt.Color(51, 51, 51));
        jPaneMenuRight.setPreferredSize(new java.awt.Dimension(1000, 600));
        jPaneMenuRight.setLayout(new java.awt.CardLayout());

        jPanelHome.setBackground(new java.awt.Color(51, 51, 51));

        jLabelHome.setBackground(new java.awt.Color(55, 55, 55));
        jLabelHome.setFont(new java.awt.Font("Segoe UI Light", 0, 18)); // NOI18N
        jLabelHome.setForeground(new java.awt.Color(204, 204, 204));
        jLabelHome.setText("Inici");

        javax.swing.GroupLayout jPanelHomeLayout = new javax.swing.GroupLayout(jPanelHome);
        jPanelHome.setLayout(jPanelHomeLayout);
        jPanelHomeLayout.setHorizontalGroup(
            jPanelHomeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelHomeLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabelHome)
                .addContainerGap(764, Short.MAX_VALUE))
        );
        jPanelHomeLayout.setVerticalGroup(
            jPanelHomeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelHomeLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabelHome)
                .addContainerGap(529, Short.MAX_VALUE))
        );

        jPaneMenuRight.add(jPanelHome, "card2");

        jPanelTickets.setBackground(new java.awt.Color(51, 51, 51));

        jLabelTickets.setBackground(new java.awt.Color(55, 55, 55));
        jLabelTickets.setFont(new java.awt.Font("Segoe UI Light", 0, 18)); // NOI18N
        jLabelTickets.setForeground(new java.awt.Color(204, 204, 204));
        jLabelTickets.setText("Tiquets");

        javax.swing.GroupLayout jPanelTicketsLayout = new javax.swing.GroupLayout(jPanelTickets);
        jPanelTickets.setLayout(jPanelTicketsLayout);
        jPanelTicketsLayout.setHorizontalGroup(
            jPanelTicketsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelTicketsLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabelTickets)
                .addContainerGap(740, Short.MAX_VALUE))
        );
        jPanelTicketsLayout.setVerticalGroup(
            jPanelTicketsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelTicketsLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabelTickets)
                .addContainerGap(529, Short.MAX_VALUE))
        );

        jPaneMenuRight.add(jPanelTickets, "card3");

        jPanelStadistics.setBackground(new java.awt.Color(51, 51, 51));

        jLabelStadistics.setBackground(new java.awt.Color(55, 55, 55));
        jLabelStadistics.setFont(new java.awt.Font("Segoe UI Light", 0, 18)); // NOI18N
        jLabelStadistics.setForeground(new java.awt.Color(204, 204, 204));
        jLabelStadistics.setText("Estadístiques");

        javax.swing.GroupLayout jPanelStadisticsLayout = new javax.swing.GroupLayout(jPanelStadistics);
        jPanelStadistics.setLayout(jPanelStadisticsLayout);
        jPanelStadisticsLayout.setHorizontalGroup(
            jPanelStadisticsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelStadisticsLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabelStadistics)
                .addContainerGap(698, Short.MAX_VALUE))
        );
        jPanelStadisticsLayout.setVerticalGroup(
            jPanelStadisticsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelStadisticsLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabelStadistics)
                .addContainerGap(529, Short.MAX_VALUE))
        );

        jPaneMenuRight.add(jPanelStadistics, "card5");

        jPanelMessage.setBackground(new java.awt.Color(51, 51, 51));

        jLabelMessage.setBackground(new java.awt.Color(55, 55, 55));
        jLabelMessage.setFont(new java.awt.Font("Segoe UI Light", 0, 18)); // NOI18N
        jLabelMessage.setForeground(new java.awt.Color(204, 204, 204));
        jLabelMessage.setText("Missatges");

        javax.swing.GroupLayout jPanelMessageLayout = new javax.swing.GroupLayout(jPanelMessage);
        jPanelMessage.setLayout(jPanelMessageLayout);
        jPanelMessageLayout.setHorizontalGroup(
            jPanelMessageLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelMessageLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabelMessage)
                .addContainerGap(721, Short.MAX_VALUE))
        );
        jPanelMessageLayout.setVerticalGroup(
            jPanelMessageLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelMessageLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabelMessage)
                .addContainerGap(529, Short.MAX_VALUE))
        );

        jPaneMenuRight.add(jPanelMessage, "card7");

        jPanelSettings.setBackground(new java.awt.Color(51, 51, 51));

        jLabelSettings.setBackground(new java.awt.Color(55, 55, 55));
        jLabelSettings.setFont(new java.awt.Font("Segoe UI Light", 0, 18)); // NOI18N
        jLabelSettings.setForeground(new java.awt.Color(204, 204, 204));
        jLabelSettings.setText("Configuració");

        jLabelTheme.setFont(new java.awt.Font("Segoe UI Light", 0, 14)); // NOI18N
        jLabelTheme.setForeground(new java.awt.Color(204, 204, 204));
        jLabelTheme.setText("Tema del aplicatiu");

        jLabelLight.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/ModeClar.png"))); // NOI18N
        jLabelLight.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        jLabelDark.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/ModeFosc.png"))); // NOI18N
        jLabelDark.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        javax.swing.GroupLayout jPanelSettingsLayout = new javax.swing.GroupLayout(jPanelSettings);
        jPanelSettings.setLayout(jPanelSettingsLayout);
        jPanelSettingsLayout.setHorizontalGroup(
            jPanelSettingsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelSettingsLayout.createSequentialGroup()
                .addGroup(jPanelSettingsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanelSettingsLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabelSettings))
                    .addGroup(jPanelSettingsLayout.createSequentialGroup()
                        .addGap(30, 30, 30)
                        .addGroup(jPanelSettingsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanelSettingsLayout.createSequentialGroup()
                                .addComponent(jLabelLight)
                                .addGap(18, 18, 18)
                                .addComponent(jLabelDark))
                            .addComponent(jLabelTheme))))
                .addContainerGap(652, Short.MAX_VALUE))
        );
        jPanelSettingsLayout.setVerticalGroup(
            jPanelSettingsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelSettingsLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabelSettings)
                .addGap(25, 25, 25)
                .addComponent(jLabelTheme)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanelSettingsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabelLight)
                    .addComponent(jLabelDark))
                .addContainerGap(422, Short.MAX_VALUE))
        );

        jPaneMenuRight.add(jPanelSettings, "card8");

        getContentPane().add(jPaneMenuRight, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 40, 800, 560));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jLabelCloseMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabelCloseMouseClicked

        logOut();
        System.exit(0);

    }//GEN-LAST:event_jLabelCloseMouseClicked

    private void jLabelMinimizeMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabelMinimizeMouseClicked
        this.setExtendedState(ICONIFIED);
    }//GEN-LAST:event_jLabelMinimizeMouseClicked

    private void jLabelDisconnectMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabelDisconnectMouseClicked
        Login window = new Login();
        window.setVisible(true);
        logOut();
        this.dispose();
    }//GEN-LAST:event_jLabelDisconnectMouseClicked

    private void jLabelHomeMenuMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabelHomeMenuMouseClicked
        jLabelHomeMenu.setBackground(new java.awt.Color(51, 51, 51));
        jLabelHomeMenu.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/01 Inici Selected.png")));
        jPanelHome.setVisible(true);

        jLabelTicketsMenu.setBackground(new java.awt.Color(55, 55, 55));
        jLabelTicketsMenu.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/02 Tiquets NoSelected.png")));
        jPanelTickets.setVisible(false);
        jLabelStadisticsMenu.setBackground(new java.awt.Color(55, 55, 55));
        jLabelStadisticsMenu.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/04 Estadistiques NoSelected.png")));
        jPanelStadistics.setVisible(false);
        jLabelMessageMenu.setBackground(new java.awt.Color(55, 55, 55));
        jLabelMessageMenu.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/06 Missatges NoSelected.png")));
        jPanelMessage.setVisible(false);
        jLabelSettingsMenu.setBackground(new java.awt.Color(55, 55, 55));
        jLabelSettingsMenu.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/07 Configuracio NoSelected.png")));
        jPanelSettings.setVisible(false);
    }//GEN-LAST:event_jLabelHomeMenuMouseClicked

    private void jLabelTicketsMenuMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabelTicketsMenuMouseClicked
        jLabelHomeMenu.setBackground(new java.awt.Color(55, 55, 55));
        jLabelHomeMenu.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/01 Inici NoSelected.png")));
        jPanelHome.setVisible(false);

        jLabelTicketsMenu.setBackground(new java.awt.Color(51, 51, 51));
        jLabelTicketsMenu.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/02 Tiquets Selected.png")));
        jPanelTickets.setVisible(true);

        jLabelStadisticsMenu.setBackground(new java.awt.Color(55, 55, 55));
        jLabelStadisticsMenu.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/04 Estadistiques NoSelected.png")));
        jPanelStadistics.setVisible(false);
        jLabelMessageMenu.setBackground(new java.awt.Color(55, 55, 55));
        jLabelMessageMenu.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/06 Missatges NoSelected.png")));
        jPanelMessage.setVisible(false);
        jLabelSettingsMenu.setBackground(new java.awt.Color(55, 55, 55));
        jLabelSettingsMenu.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/07 Configuracio NoSelected.png")));
        jPanelSettings.setVisible(false);
    }//GEN-LAST:event_jLabelTicketsMenuMouseClicked

    private void jLabelStadisticsMenuMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabelStadisticsMenuMouseClicked
        jLabelHomeMenu.setBackground(new java.awt.Color(55, 55, 55));
        jLabelHomeMenu.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/01 Inici NoSelected.png")));
        jPanelHome.setVisible(false);
        jLabelTicketsMenu.setBackground(new java.awt.Color(55, 55, 55));
        jLabelTicketsMenu.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/02 Tiquets NoSelected.png")));
        jPanelTickets.setVisible(false);

        jLabelStadisticsMenu.setBackground(new java.awt.Color(51, 51, 51));
        jLabelStadisticsMenu.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/04 Estadistiques Selected.png")));
        jPanelStadistics.setVisible(true);

        jLabelMessageMenu.setBackground(new java.awt.Color(55, 55, 55));
        jLabelMessageMenu.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/06 Missatges NoSelected.png")));
        jPanelMessage.setVisible(false);
        jLabelSettingsMenu.setBackground(new java.awt.Color(55, 55, 55));
        jLabelSettingsMenu.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/07 Configuracio NoSelected.png")));
        jPanelSettings.setVisible(false);
    }//GEN-LAST:event_jLabelStadisticsMenuMouseClicked

    private void jLabelMessageMenuMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabelMessageMenuMouseClicked
        jLabelHomeMenu.setBackground(new java.awt.Color(55, 55, 55));
        jLabelHomeMenu.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/01 Inici NoSelected.png")));
        jPanelHome.setVisible(false);
        jLabelTicketsMenu.setBackground(new java.awt.Color(55, 55, 55));
        jLabelTicketsMenu.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/02 Tiquets NoSelected.png")));
        jPanelTickets.setVisible(false);
        jLabelStadisticsMenu.setBackground(new java.awt.Color(55, 55, 55));
        jLabelStadisticsMenu.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/04 Estadistiques NoSelected.png")));
        jPanelStadistics.setVisible(false);

        jLabelMessageMenu.setBackground(new java.awt.Color(51, 51, 51));
        jLabelMessageMenu.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/06 Missatges Selected.png")));
        jPanelMessage.setVisible(true);

        jLabelSettingsMenu.setBackground(new java.awt.Color(55, 55, 55));
        jLabelSettingsMenu.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/07 Configuracio NoSelected.png")));
        jPanelSettings.setVisible(false);
    }//GEN-LAST:event_jLabelMessageMenuMouseClicked

    private void jLabelSettingsMenuMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabelSettingsMenuMouseClicked
        jLabelHomeMenu.setBackground(new java.awt.Color(55, 55, 55));
        jLabelHomeMenu.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/01 Inici NoSelected.png")));
        jPanelHome.setVisible(false);
        jLabelTicketsMenu.setBackground(new java.awt.Color(55, 55, 55));
        jLabelTicketsMenu.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/02 Tiquets NoSelected.png")));
        jPanelTickets.setVisible(false);
        jLabelStadisticsMenu.setBackground(new java.awt.Color(55, 55, 55));
        jLabelStadisticsMenu.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/04 Estadistiques NoSelected.png")));
        jPanelStadistics.setVisible(false);
        jLabelMessageMenu.setBackground(new java.awt.Color(55, 55, 55));
        jLabelMessageMenu.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/06 Missatges NoSelected.png")));
        jPanelMessage.setVisible(false);

        jLabelSettingsMenu.setBackground(new java.awt.Color(51, 51, 51));
        jLabelSettingsMenu.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/07 Configuracio Selected.png")));
        jPanelSettings.setVisible(true);
    }//GEN-LAST:event_jLabelSettingsMenuMouseClicked

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
            java.util.logging.Logger.getLogger(DesktopTecnic.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(DesktopTecnic.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(DesktopTecnic.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(DesktopTecnic.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new DesktopTecnic().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabelClose;
    private javax.swing.JLabel jLabelDark;
    private javax.swing.JLabel jLabelDisconnect;
    private javax.swing.JLabel jLabelHome;
    private javax.swing.JLabel jLabelHomeMenu;
    private javax.swing.JLabel jLabelLight;
    private javax.swing.JLabel jLabelMessage;
    private javax.swing.JLabel jLabelMessageMenu;
    private javax.swing.JLabel jLabelMinimize;
    private javax.swing.JLabel jLabelSettings;
    private javax.swing.JLabel jLabelSettingsMenu;
    private javax.swing.JLabel jLabelStadistics;
    private javax.swing.JLabel jLabelStadisticsMenu;
    private javax.swing.JLabel jLabelTheme;
    private javax.swing.JLabel jLabelTickets;
    private javax.swing.JLabel jLabelTicketsMenu;
    private javax.swing.JLabel jLabelTittle;
    public javax.swing.JLabel jLabelUserConnected;
    private javax.swing.JLabel jLabelUserIcon;
    private javax.swing.JPanel jPaneMenuRight;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanelHome;
    private javax.swing.JPanel jPanelMenuLeft;
    private javax.swing.JPanel jPanelMessage;
    private javax.swing.JPanel jPanelSettings;
    private javax.swing.JPanel jPanelStadistics;
    private javax.swing.JPanel jPanelTickets;
    private javax.swing.JPanel jPanelTop;
    private javax.swing.JSeparator jSeparator1;
    // End of variables declaration//GEN-END:variables

    private void logOut() {

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
            out.writeUTF("USER_EXIT");
            System.out.println("Valor getId: " + getId());

        } catch (IOException ex) {
            Logger.getLogger(DesktopTecnic.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}