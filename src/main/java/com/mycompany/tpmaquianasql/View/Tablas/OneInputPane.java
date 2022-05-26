/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package com.mycompany.tpmaquianasql.View.Tablas;

import com.mycompany.tpmaquianasql.Controler.Conexion;
import com.mycompany.tpmaquianasql.util.Tabla;

import java.awt.Color;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import javax.swing.JOptionPane;
import javax.swing.JPanel;

/**
 *
 * @author ivanb
 */
public class OneInputPane extends javax.swing.JPanel {

    private static final int mesasAtendidasPorMozo = 0, platosConsumidosMesa = 1, cantPlatosConsumidosMesa = 2;
    private static final String[] defaultText = { "Ingrese el código del mozo", "Ingrese el código de la mesa",
            "Ingrese el código de la mesa" },
            paramName = { "Codigo del mozo", "Codigo de la mesa", "Codigo de la mesa" };

    private Color defaultFontColor = new Color(190, 190, 190);
    private Color deleteButtonFontColor = new Color(187, 187, 186);
    private Color deleteButtonFontColorOnHover = new Color(255, 255, 255);

    private Conexion conexion;
    private int option;

    /**
     * Creates new form OneInputPane
     */
    public OneInputPane(Conexion conexion, int option) {
        initComponents();

        this.conexion = conexion;
        this.option = option;

        codigoField3.setText(defaultText[option]);
        codigoLable.setText(paramName[option]);

        codigoErrMsg.setVisible(false);
    }

    private void changePane(JPanel jPanel) {
        Contenedor.setLayout(new java.awt.CardLayout());
        Contenedor.removeAll();
        Contenedor.add(jPanel);
        Contenedor.revalidate();
        Contenedor.repaint();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated
    // Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Contenedor = new javax.swing.JPanel();
        codigoErrMsg = new javax.swing.JLabel();
        codigoField3 = new javax.swing.JTextField();
        codigoLable = new javax.swing.JLabel();
        deleteButtonP = new javax.swing.JPanel();
        deleteButtonL = new javax.swing.JLabel();

        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        Contenedor.setBackground(new java.awt.Color(255, 255, 255));
        Contenedor.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        codigoErrMsg.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        codigoErrMsg.setForeground(new java.awt.Color(255, 0, 0));
        codigoErrMsg.setText("Mensaje de error");
        Contenedor.add(codigoErrMsg, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 70, 190, -1));

        codigoField3.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        codigoField3.setForeground(new java.awt.Color(190, 190, 190));
        codigoField3.setText("Texto predeterminado");
        codigoField3.setBorder(null);
        codigoField3.setPreferredSize(new java.awt.Dimension(170, 19));
        codigoField3.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                codigoField3FocusGained(evt);
            }

            public void focusLost(java.awt.event.FocusEvent evt) {
                codigoField3FocusLost(evt);
            }
        });
        codigoField3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                codigoField3ActionPerformed(evt);
            }
        });
        Contenedor.add(codigoField3, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 70, 240, -1));

        codigoLable.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        codigoLable.setForeground(new java.awt.Color(0, 0, 0));
        codigoLable.setText("Nombre del atributo");
        Contenedor.add(codigoLable, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 40, -1, -1));

        deleteButtonP.setBackground(new java.awt.Color(18, 33, 69));
        deleteButtonP.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        deleteButtonP.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N
        deleteButtonP.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                deleteButtonPMouseClicked(evt);
            }

            public void mouseEntered(java.awt.event.MouseEvent evt) {
                deleteButtonPMouseEntered(evt);
            }

            public void mouseExited(java.awt.event.MouseEvent evt) {
                deleteButtonPMouseExited(evt);
            }
        });

        deleteButtonL.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        deleteButtonL.setForeground(new java.awt.Color(187, 187, 186));
        deleteButtonL.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        deleteButtonL.setText("Consultar");

        javax.swing.GroupLayout deleteButtonPLayout = new javax.swing.GroupLayout(deleteButtonP);
        deleteButtonP.setLayout(deleteButtonPLayout);
        deleteButtonPLayout.setHorizontalGroup(
                deleteButtonPLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING,
                                deleteButtonPLayout.createSequentialGroup()
                                        .addContainerGap()
                                        .addComponent(deleteButtonL, javax.swing.GroupLayout.DEFAULT_SIZE, 78,
                                                Short.MAX_VALUE)
                                        .addContainerGap()));
        deleteButtonPLayout.setVerticalGroup(
                deleteButtonPLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING,
                                deleteButtonPLayout.createSequentialGroup()
                                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(deleteButtonL)
                                        .addContainerGap()));

        Contenedor.add(deleteButtonP, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 150, 90, -1));

        add(Contenedor, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 540, 510));
    }// </editor-fold>//GEN-END:initComponents

    private void codigoField3FocusGained(java.awt.event.FocusEvent evt) {// GEN-FIRST:event_codigoField3FocusGained
        if (codigoField3.getText().equals(defaultText[option])) {
            codigoField3.setText("");
        } else {
            codigoField3.selectAll();
        }
        codigoField3.setForeground(Color.BLACK);
    }// GEN-LAST:event_codigoField3FocusGained

    private void codigoField3FocusLost(java.awt.event.FocusEvent evt) {// GEN-FIRST:event_codigoField3FocusLost
        if (codigoField3.getText().equals("")) {
            codigoField3.setText(defaultText[option]);
            codigoField3.setForeground(defaultFontColor);
        }
    }// GEN-LAST:event_codigoField3FocusLost

    private void codigoField3ActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_codigoField3ActionPerformed
        consultar();
    }// GEN-LAST:event_codigoField3ActionPerformed

    private void deleteButtonPMouseClicked(java.awt.event.MouseEvent evt) {// GEN-FIRST:event_deleteButtonPMouseClicked
        consultar();
    }// GEN-LAST:event_deleteButtonPMouseClicked

    private void deleteButtonPMouseEntered(java.awt.event.MouseEvent evt) {// GEN-FIRST:event_deleteButtonPMouseEntered
        deleteButtonL.setForeground(deleteButtonFontColorOnHover);
    }// GEN-LAST:event_deleteButtonPMouseEntered

    private void deleteButtonPMouseExited(java.awt.event.MouseEvent evt) {// GEN-FIRST:event_deleteButtonPMouseExited
        deleteButtonL.setForeground(deleteButtonFontColor);
    }// GEN-LAST:event_deleteButtonPMouseExited

    private void consultar() {
        deleteButtonP.requestFocus();

        int codigo = 0;
        String temp;
        boolean correcto = true;

        if ((temp = codigoField3.getText()).equals("") || temp.equals(defaultText[option])) {
            codigoErrMsg.setText("Obligatorio");
            codigoErrMsg.setVisible(true);
            correcto = false;
        } else {
            try {
                codigo = Integer.parseInt(temp);
                codigoErrMsg.setVisible(false);
            } catch (NumberFormatException e) {
                codigoErrMsg.setText("Debe ser un entero");
                codigoErrMsg.setVisible(true);
                correcto = false;
            }
        }

        if (correcto) {
            Connection con;
            PreparedStatement ps;
            ResultSet rs;
            String comprobacion = "", consulta = "", errMsg = "";

            try {
                switch (option) {
                    case mesasAtendidasPorMozo:
                        comprobacion = "SELECT * FROM Mozos WHERE Mo_Cod = ?";
                        errMsg = "No hay ningún mozo con código " + codigo;
                        consulta = "SELECT * FROM Mesas WHERE Mo_Cod_Atiende = ?";
                        break;

                    case platosConsumidosMesa:
                        comprobacion = "SELECT * FROM Mesas WHERE Me_Cod = ?";
                        errMsg = "No hay ninguna mesa con código " + codigo;
                        consulta = "SELECT P_Nombre FROM Consumos, Platos, Se_Consume WHERE Me_Cod_Realiza = ?" +
                                "AND Se_Consume.C_Cod = Consumos.C_Cod AND Se_Consume.P_Cod = Platos.P_Cod";
                        break;

                    case cantPlatosConsumidosMesa:
                        comprobacion = "SELECT * FROM Mesas WHERE Me_Cod = ?";
                        errMsg = "No hay ninguna mesa con código " + codigo;
                        consulta = "SELECT COUNT(P_Nombre) FROM Consumos, Platos, Se_Consume WHERE Me_Cod_Realiza = ?" +
                                "AND Se_Consume.C_Cod = Consumos.C_Cod AND Se_Consume.P_Cod = Platos.P_Cod";
                        break;
                }

                con = conexion.getConexion();
                // Comprobacion de que hay un mozo con el codigo ingresado
                ps = con.prepareStatement(comprobacion);
                ps.setInt(1, codigo);
                rs = ps.executeQuery();
                if (!(rs.next())) {
                    JOptionPane.showMessageDialog(null, errMsg);
                    return;
                }

                // Consulta para obtener la tabla
                ps = con.prepareStatement(consulta);
                ps.setInt(1, codigo);
                rs = ps.executeQuery();

                QueryTablePane panel = new QueryTablePane(Tabla.resultToTable(rs));

                changePane(panel);
            } catch (SQLException e) {
                JOptionPane.showMessageDialog(null, e.getMessage());
            }
        }
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel Contenedor;
    private javax.swing.JLabel codigoErrMsg;
    private javax.swing.JTextField codigoField3;
    private javax.swing.JLabel codigoLable;
    private javax.swing.JLabel deleteButtonL;
    private javax.swing.JPanel deleteButtonP;
    // End of variables declaration//GEN-END:variables
}
