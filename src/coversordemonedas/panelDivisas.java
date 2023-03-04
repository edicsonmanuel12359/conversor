/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package coversordemonedas;

import java.text.DecimalFormat;
import javax.swing.JOptionPane;

public class panelDivisas extends javax.swing.JPanel {

    double cantidad = 0;
    double conversion = 0;
    String de = "Peso Dominicano";
    String a = "Dólar Estadounidense";

    public panelDivisas() {
        initComponents();
        this.txtCantidad.requestFocus();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        comboDe = new javax.swing.JComboBox<>();
        comboA = new javax.swing.JComboBox<>();
        txtCantidad = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        btnLimpiar = new javax.swing.JButton();
        btnCalcular = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        txtResultados = new javax.swing.JTextField();

        setMinimumSize(new java.awt.Dimension(412, 273));
        setPreferredSize(new java.awt.Dimension(600, 295));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Lato", 1, 14)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Conversor de Divisas");
        jLabel1.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jLabel1.setPreferredSize(new java.awt.Dimension(167, 17));
        add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 20, -1, -1));

        jLabel2.setFont(new java.awt.Font("Lato", 1, 14)); // NOI18N
        jLabel2.setText("De:");
        add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(102, 50, -1, -1));

        jLabel3.setFont(new java.awt.Font("Lato", 1, 14)); // NOI18N
        jLabel3.setText("A:");
        add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(322, 50, -1, -1));

        comboDe.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Peso Dominicano", "Dólar Estadounidense", "Euros", "Libras Esterlinas", "Yen Japonés", "Won Sur-Coreano" }));
        comboDe.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                comboDeActionPerformed(evt);
            }
        });
        add(comboDe, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 65, -1, -1));

        comboA.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Dólar Estadounidense", "Peso Dominicano", "Euros", "Libras Esterlinas", "Yen Japonés", "Won Sur-Coreano" }));
        comboA.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                comboAActionPerformed(evt);
            }
        });
        add(comboA, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 65, -1, -1));

        txtCantidad.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtCantidadKeyTyped(evt);
            }
        });
        add(txtCantidad, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 130, 230, -1));

        jLabel4.setText("Cantidad");
        add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 110, -1, -1));

        btnLimpiar.setText("Limpiar");
        btnLimpiar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLimpiarActionPerformed(evt);
            }
        });
        add(btnLimpiar, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 220, 110, 30));

        btnCalcular.setText("Calcular");
        btnCalcular.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCalcularActionPerformed(evt);
            }
        });
        add(btnCalcular, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 220, 110, 30));

        jLabel5.setText("Resultado");
        add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 160, -1, -1));

        txtResultados.setEditable(false);
        txtResultados.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtResultadosActionPerformed(evt);
            }
        });
        add(txtResultados, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 180, 150, -1));
    }// </editor-fold>//GEN-END:initComponents

    private void txtResultadosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtResultadosActionPerformed
    }//GEN-LAST:event_txtResultadosActionPerformed

    private void btnCalcularActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCalcularActionPerformed

        if (txtCantidad.getText().equals("")) {
            JOptionPane.showMessageDialog(null, "Ingrese un valor");
        } else {
            cantidad = Double.parseDouble(txtCantidad.getText());
            convertir();
            DecimalFormat df = new DecimalFormat("0.00");
            String numCadena = String.valueOf(df.format(conversion));
            txtResultados.setText(numCadena);
        }

    }//GEN-LAST:event_btnCalcularActionPerformed

    private void comboDeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_comboDeActionPerformed
        de = comboDe.getSelectedItem().toString();
        convertir();

    }//GEN-LAST:event_comboDeActionPerformed

    private void comboAActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_comboAActionPerformed
        a = comboA.getSelectedItem().toString();
        convertir();

    }//GEN-LAST:event_comboAActionPerformed

    private void btnLimpiarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLimpiarActionPerformed
        txtCantidad.setText(null);
        txtResultados.setText(null);
        txtCantidad.requestFocus();
    }//GEN-LAST:event_btnLimpiarActionPerformed

    private void txtCantidadKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtCantidadKeyTyped
        int key = evt.getKeyChar();

        boolean punto = key == 46;
        boolean numeros = key >= 48 && key <= 57;

        if (!numeros && !punto) {
            evt.consume();
        }

        if (txtCantidad.getText().trim().length() == 20) {
            evt.consume();
        }
    }//GEN-LAST:event_txtCantidadKeyTyped

    public void convertir() {
        switch (de) {
            case "Peso Dominicano" ->
                conversion = switch (a) {
                    case "Dólar Estadounidense" ->
                        cantidad * 0.018;
                    case "Euros" ->
                        cantidad * 0.017;
                    case "Libras Esterlinas" ->
                        cantidad * 0.015;
                    case "Yen Japonés" ->
                        cantidad * 2.47;
                    case "Won Sur-Coreano" ->
                        cantidad * 23.66;
                    default ->
                        cantidad;
                };
            case "Dólar Estadounidense" ->
                conversion = switch (a) {
                    case "Peso Dominicano" ->
                        cantidad * 55.45;
                    case "Euros" ->
                        cantidad * 0.94;
                    case "Libras Esterlinas" ->
                        cantidad * 0.84;
                    case "Yen Japonés" ->
                        cantidad * 136.70;
                    case "Won Sur-Coreano" ->
                        cantidad * 1312.23;
                    default ->
                        cantidad;
                };
            case "Euros" ->
                conversion = switch (a) {
                    case "Peso Dominicano" ->
                        cantidad * 58.84;
                    case "Dólar Estadounidense" ->
                        cantidad * 1.06;
                    case "Libras Esterlinas" ->
                        cantidad * 0.88;
                    case "Yen Japonés" ->
                        cantidad * 144.65;
                    case "Won Sur-Coreano" ->
                        cantidad * 1377.44;
                    default ->
                        cantidad;
                };
            case "Libras Esterlinas" ->
                conversion = switch (a) {
                    case "Peso Dominicano" ->
                        cantidad * 66.49;
                    case "Dólar Estadounidense" ->
                        cantidad * 1.20;
                    case "Euros" ->
                        cantidad * 1.13;
                    case "Yen Japonés" ->
                        cantidad * 163.49;
                    case "Won Sur-Coreano" ->
                        cantidad * 1559.47;
                    default ->
                        cantidad;
                };
            case "Yen Japonés" ->
                conversion = switch (a) {
                    case "Peso Dominicano" ->
                        cantidad * 0.41;
                    case "Dólar Estadounidense" ->
                        cantidad * 0.0074;
                    case "Euros" ->
                        cantidad * 0.0069;
                    case "Libras Esterlinas" ->
                        cantidad * 0.0061;
                    case "Won Sur-Coreano" ->
                        cantidad * 9.54;
                    default ->
                        cantidad;
                };
            case "Won Sur-Coreano" ->
                conversion = switch (a) {
                    case "Peso Dominicano" ->
                        cantidad * 0.043;
                    case "Dólar Estadounidense" ->
                        cantidad * 0.00077;
                    case "Euros" ->
                        cantidad * 0.00072;
                    case "Libras Esterlinas" ->
                        cantidad * 0.00064;
                    case "Yen Japonés" ->
                        cantidad * 0.11;
                    default ->
                        cantidad;
                };
        }
    }


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCalcular;
    private javax.swing.JButton btnLimpiar;
    private javax.swing.JComboBox<String> comboA;
    private javax.swing.JComboBox<String> comboDe;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JTextField txtCantidad;
    private javax.swing.JTextField txtResultados;
    // End of variables declaration//GEN-END:variables
}
