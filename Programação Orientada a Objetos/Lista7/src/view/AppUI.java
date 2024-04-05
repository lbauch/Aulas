/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package view;

import questao2.Bairro;
import questao2.Finalidade;
import questao2.Imovel;

/**
 *
 * @author evand
 */
public class AppUI extends javax.swing.JFrame {

    /**
     * Creates new form AppUI
     */
    public AppUI() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        jPanelImovel = new javax.swing.JPanel();
        jLabelEndereco = new javax.swing.JLabel();
        jTextfieldEndereco = new javax.swing.JTextField();
        jLabelArea = new javax.swing.JLabel();
        jTextFieldArea = new javax.swing.JTextField();
        jLabelFinalidade = new javax.swing.JLabel();
        jRadioButtonResidencial = new javax.swing.JRadioButton();
        jRadioButtonComercial = new javax.swing.JRadioButton();
        jRadioButtonIndustrial = new javax.swing.JRadioButton();
        jPanelBairro = new javax.swing.JPanel();
        jLabelNomeBairro = new javax.swing.JLabel();
        jLabelCoeficienteBairro = new javax.swing.JLabel();
        jTextFieldNomeBairro = new javax.swing.JTextField();
        jTextFieldCoeficienteBairro = new javax.swing.JTextField();
        jPanelIptu = new javax.swing.JPanel();
        jButtonCalcular = new javax.swing.JButton();
        jLabelIptu = new javax.swing.JLabel();
        jLabelCalculoIptu = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Controle IPTU");

        jPanelImovel.setBorder(javax.swing.BorderFactory.createTitledBorder("Imóvel"));

        jLabelEndereco.setText("Endereço:");

        jLabelArea.setText("Área:");

        jLabelFinalidade.setText("Finalidade:");

        buttonGroup1.add(jRadioButtonResidencial);
        jRadioButtonResidencial.setText("Residencial");

        buttonGroup1.add(jRadioButtonComercial);
        jRadioButtonComercial.setText("Comercial");

        buttonGroup1.add(jRadioButtonIndustrial);
        jRadioButtonIndustrial.setText("Industrial");

        javax.swing.GroupLayout jPanelImovelLayout = new javax.swing.GroupLayout(jPanelImovel);
        jPanelImovel.setLayout(jPanelImovelLayout);
        jPanelImovelLayout.setHorizontalGroup(
            jPanelImovelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelImovelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanelImovelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanelImovelLayout.createSequentialGroup()
                        .addComponent(jLabelEndereco)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jTextfieldEndereco))
                    .addGroup(jPanelImovelLayout.createSequentialGroup()
                        .addComponent(jLabelArea)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jTextFieldArea))
                    .addGroup(jPanelImovelLayout.createSequentialGroup()
                        .addComponent(jLabelFinalidade)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jRadioButtonResidencial)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jRadioButtonComercial)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jRadioButtonIndustrial)
                        .addGap(0, 60, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanelImovelLayout.setVerticalGroup(
            jPanelImovelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelImovelLayout.createSequentialGroup()
                .addGroup(jPanelImovelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelEndereco)
                    .addComponent(jTextfieldEndereco, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanelImovelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelArea)
                    .addComponent(jTextFieldArea, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanelImovelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabelFinalidade)
                    .addGroup(jPanelImovelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jRadioButtonResidencial)
                        .addComponent(jRadioButtonComercial)
                        .addComponent(jRadioButtonIndustrial)))
                .addGap(0, 8, Short.MAX_VALUE))
        );

        jPanelBairro.setBorder(javax.swing.BorderFactory.createTitledBorder("Bairro"));

        jLabelNomeBairro.setText("Nome:");

        jLabelCoeficienteBairro.setText("Coeficiente: ");

        javax.swing.GroupLayout jPanelBairroLayout = new javax.swing.GroupLayout(jPanelBairro);
        jPanelBairro.setLayout(jPanelBairroLayout);
        jPanelBairroLayout.setHorizontalGroup(
            jPanelBairroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelBairroLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanelBairroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanelBairroLayout.createSequentialGroup()
                        .addComponent(jLabelNomeBairro)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jTextFieldNomeBairro))
                    .addGroup(jPanelBairroLayout.createSequentialGroup()
                        .addComponent(jLabelCoeficienteBairro)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jTextFieldCoeficienteBairro)))
                .addContainerGap())
        );
        jPanelBairroLayout.setVerticalGroup(
            jPanelBairroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelBairroLayout.createSequentialGroup()
                .addGroup(jPanelBairroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelNomeBairro)
                    .addComponent(jTextFieldNomeBairro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanelBairroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelCoeficienteBairro)
                    .addComponent(jTextFieldCoeficienteBairro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(0, 8, Short.MAX_VALUE))
        );

        jPanelIptu.setBorder(javax.swing.BorderFactory.createTitledBorder(""));

        jButtonCalcular.setText("Calcular");
        jButtonCalcular.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonCalcularActionPerformed(evt);
            }
        });

        jLabelIptu.setText("IPTU:");

        javax.swing.GroupLayout jPanelIptuLayout = new javax.swing.GroupLayout(jPanelIptu);
        jPanelIptu.setLayout(jPanelIptuLayout);
        jPanelIptuLayout.setHorizontalGroup(
            jPanelIptuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelIptuLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanelIptuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanelIptuLayout.createSequentialGroup()
                        .addComponent(jButtonCalcular)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(jPanelIptuLayout.createSequentialGroup()
                        .addComponent(jLabelIptu)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabelCalculoIptu, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanelIptuLayout.setVerticalGroup(
            jPanelIptuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelIptuLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jButtonCalcular)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanelIptuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelIptu)
                    .addComponent(jLabelCalculoIptu))
                .addContainerGap(11, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanelImovel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanelBairro, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanelIptu, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanelImovel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanelBairro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jPanelIptu, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(32, 32, 32))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jButtonCalcularActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonCalcularActionPerformed
        Bairro bairro = new Bairro();
        bairro.setNome(jTextFieldNomeBairro.getText());
        bairro.setCoeficienteIptu(Double.parseDouble(jTextFieldCoeficienteBairro.getText()));
        
        Imovel imovel = new Imovel();
        imovel.setEndereco(jTextfieldEndereco.getText());
        imovel.setArea(Integer.parseInt(jTextFieldArea.getText()));
        imovel.setBairro(bairro);
        
        if(jRadioButtonComercial.isSelected()) {
            imovel.setFinalidade(Finalidade.COMERCIAL);
        } else if (jRadioButtonResidencial.isSelected()) {
            imovel.setFinalidade(Finalidade.RESIDENCIAL);
        } else if (jRadioButtonIndustrial.isSelected()) {
           imovel.setFinalidade(Finalidade.INDUSTRIAL);
        }
        
        jLabelCalculoIptu.setText(imovel.calcularIptu() + "");
        
    }//GEN-LAST:event_jButtonCalcularActionPerformed

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
            java.util.logging.Logger.getLogger(AppUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(AppUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(AppUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(AppUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new AppUI().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JButton jButtonCalcular;
    private javax.swing.JLabel jLabelArea;
    private javax.swing.JLabel jLabelCalculoIptu;
    private javax.swing.JLabel jLabelCoeficienteBairro;
    private javax.swing.JLabel jLabelEndereco;
    private javax.swing.JLabel jLabelFinalidade;
    private javax.swing.JLabel jLabelIptu;
    private javax.swing.JLabel jLabelNomeBairro;
    private javax.swing.JPanel jPanelBairro;
    private javax.swing.JPanel jPanelImovel;
    private javax.swing.JPanel jPanelIptu;
    private javax.swing.JRadioButton jRadioButtonComercial;
    private javax.swing.JRadioButton jRadioButtonIndustrial;
    private javax.swing.JRadioButton jRadioButtonResidencial;
    private javax.swing.JTextField jTextFieldArea;
    private javax.swing.JTextField jTextFieldCoeficienteBairro;
    private javax.swing.JTextField jTextFieldNomeBairro;
    private javax.swing.JTextField jTextfieldEndereco;
    // End of variables declaration//GEN-END:variables
}
