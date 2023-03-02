/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package coversordemonedas;

import java.text.DecimalFormat;
import javax.swing.JOptionPane;

public class panelTemperatura extends javax.swing.JPanel {

    double temperatura = 0;
    double conversion = 0;
    String de = "°C";
    String a = "°F";

    public panelTemperatura() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        btnCalcular = new javax.swing.JButton();
        btnLimpiar = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        cDe = new javax.swing.JComboBox<>();
        cA = new javax.swing.JComboBox<>();
        jLabel3 = new javax.swing.JLabel();
        txtTemperatura = new javax.swing.JTextField();
        txtResultados = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();

        setPreferredSize(new java.awt.Dimension(600, 295));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Lato", 1, 14)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Conversor de Temperatura");
        add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 10, -1, -1));

        btnCalcular.setText("Calcular");
        btnCalcular.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCalcularActionPerformed(evt);
            }
        });
        add(btnCalcular, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 240, -1, -1));

        btnLimpiar.setText("Limpiar");
        btnLimpiar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLimpiarActionPerformed(evt);
            }
        });
        add(btnLimpiar, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 240, -1, -1));

        jLabel2.setFont(new java.awt.Font("Lato", 1, 12)); // NOI18N
        jLabel2.setText("De:");
        add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 50, -1, -1));

        cDe.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "°C", "°F", "°K", "°R" }));
        cDe.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cDeActionPerformed(evt);
            }
        });
        add(cDe, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 70, 80, -1));

        cA.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "°F", "°C", "°K", "°R" }));
        cA.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cAActionPerformed(evt);
            }
        });
        add(cA, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 70, 80, -1));

        jLabel3.setFont(new java.awt.Font("Lato", 1, 12)); // NOI18N
        jLabel3.setText("A:");
        add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 50, -1, -1));

        txtTemperatura.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtTemperaturaActionPerformed(evt);
            }
        });
        add(txtTemperatura, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 140, 220, -1));

        txtResultados.setEditable(false);
        txtResultados.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtResultadosActionPerformed(evt);
            }
        });
        add(txtResultados, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 200, 140, -1));

        jLabel4.setFont(new java.awt.Font("Lato", 1, 12)); // NOI18N
        jLabel4.setText("Resultado");
        add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 180, -1, -1));

        jLabel5.setFont(new java.awt.Font("Lato", 1, 12)); // NOI18N
        jLabel5.setText("Temperatura");
        add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 120, 80, -1));

        jLabel6.setText("°C = Celsius  °F = Fahrenheit °K = Kelvin °R = Rankine");
        add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 280, -1, -1));
    }// </editor-fold>//GEN-END:initComponents

    private void txtTemperaturaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtTemperaturaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtTemperaturaActionPerformed

    private void txtResultadosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtResultadosActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtResultadosActionPerformed

    private void btnCalcularActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCalcularActionPerformed

        if (txtTemperatura.getText().equals("")) {
            JOptionPane.showMessageDialog(null, "Ingrese un valor");
        } else {
            temperatura = Double.parseDouble(txtTemperatura.getText());
            convertir();
            DecimalFormat df = new DecimalFormat("0.00");
            String numCadena = String.valueOf(df.format(conversion));
            txtResultados.setText(numCadena);
        }


    }//GEN-LAST:event_btnCalcularActionPerformed

    private void btnLimpiarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLimpiarActionPerformed
        txtTemperatura.setText(null);
        txtResultados.setText(null);
        txtTemperatura.requestFocus();
    }//GEN-LAST:event_btnLimpiarActionPerformed

    private void cDeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cDeActionPerformed
        de = cDe.getSelectedItem().toString();
        convertir();
    }//GEN-LAST:event_cDeActionPerformed

    private void cAActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cAActionPerformed
        a = cA.getSelectedItem().toString();
        convertir();
    }//GEN-LAST:event_cAActionPerformed

    public void convertir() {
        switch (de) {
            case "°C" ->
                conversion = switch (a) {
                    case "°F" ->
                        temperatura = (temperatura * 9 / 5) + 32;
                    case "°K" ->
                        temperatura = temperatura + 273.15;
                    case "°R" ->
                        temperatura = (temperatura * 9 / 5) + 491.67;
                    default ->
                        temperatura;
                };
            case "°F" ->
                conversion = switch (a) {
                    case "°C" ->
                        temperatura = (temperatura - 32) * 5 / 9;
                    case "°K" ->
                        temperatura = (temperatura - 32) * 5 / 9 + 273.15;
                    case "°R" ->
                        temperatura = temperatura + 459.67;
                    default ->
                        temperatura;
                };
            case "°K" ->
                conversion = switch (a) {
                    case "°C" ->
                        temperatura = temperatura - 273.15;
                    case "°F" ->
                        temperatura = (temperatura - 273.15) * 9 / 5 + 32;
                    case "°R" ->
                        temperatura = temperatura * 9 / 5;
                    default ->
                        temperatura;
                };
            case "°R" ->
                conversion = switch (a) {
                    case "°C" ->
                        temperatura = temperatura - 491.67 * 5 / 9;
                    case "°F" ->
                        temperatura = temperatura - 459.67;
                    case "°K" ->
                        temperatura = temperatura * 5 / 9;
                    default ->
                        temperatura;
                };
        }
    }


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCalcular;
    private javax.swing.JButton btnLimpiar;
    private javax.swing.JComboBox<String> cA;
    private javax.swing.JComboBox<String> cDe;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JTextField txtResultados;
    private javax.swing.JTextField txtTemperatura;
    // End of variables declaration//GEN-END:variables
}
