/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package view;

import controller.CadastroClienteController;
import controller.CadastroUsuarioController;
import java.text.ParseException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JFormattedTextField;

import javax.swing.JTextField;



/**
 *
 * @author Didi
 */
public class CadastroClienteView extends javax.swing.JFrame {

    private final CadastroClienteController controller;

    /**
     * Creates new form FormCadastroView
     */
    public CadastroClienteView() {
        initComponents();
        controller = new CadastroClienteController(this);
        TxtCadCliId.setEnabled(false);
        TxtCadCliNome.setFocusable(true);
        
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        LblId = new javax.swing.JLabel();
        TxtCadCliId = new javax.swing.JTextField();
        LblRg = new javax.swing.JLabel();
        TxtCadCliRg = new javax.swing.JTextField();
        LblNome = new javax.swing.JLabel();
        TxtCadCliNome = new javax.swing.JTextField();
        LblEndereco = new javax.swing.JLabel();
        TxtCadCliEndereco = new javax.swing.JTextField();
        LblCep = new javax.swing.JLabel();
        TxtCadCliCep = new javax.swing.JTextField();
        LblTelefone = new javax.swing.JLabel();
        TxtCadCliTelefone = new javax.swing.JFormattedTextField();
        LblEmail = new javax.swing.JLabel();
        TxtCadCliEmail = new javax.swing.JTextField();
        LblSexo = new javax.swing.JLabel();
        TxtCadcliSexo = new javax.swing.JTextField();
        LblNascimento = new javax.swing.JLabel();
        BtnSalvar = new javax.swing.JButton();
        TxtCadCliNascimento = new javax.swing.JFormattedTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Cadastro de Clientes");
        setLocation(new java.awt.Point(550, 250));

        LblId.setText("Id");

        LblRg.setText("RG:");

        LblNome.setText("Nome:");

        LblEndereco.setText("Endereço:");

        LblCep.setText("CEP:");

        LblTelefone.setText("Telefone:");

        try {
            TxtCadCliTelefone.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("(##)#####-####")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }

        LblEmail.setText("Email:");

        LblSexo.setText("Sexo(M/F):");

        LblNascimento.setText("Data Nascimento:");

        BtnSalvar.setText("Salvar");
        BtnSalvar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnSalvarActionPerformed(evt);
            }
        });

        try {
            TxtCadCliNascimento.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("##/##/####")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(BtnSalvar)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addGroup(layout.createSequentialGroup()
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(LblId)
                                    .addComponent(LblNome)
                                    .addComponent(LblEndereco)
                                    .addComponent(LblCep))
                                .addGroup(layout.createSequentialGroup()
                                    .addGap(28, 28, 28)
                                    .addComponent(LblEmail)))
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(TxtCadCliId, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(LblRg)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(TxtCadCliRg, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(TxtCadCliCep, javax.swing.GroupLayout.PREFERRED_SIZE, 113, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(LblTelefone)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(TxtCadCliTelefone))
                                .addComponent(TxtCadCliEndereco, javax.swing.GroupLayout.DEFAULT_SIZE, 286, Short.MAX_VALUE)
                                .addComponent(TxtCadCliNome)
                                .addComponent(TxtCadCliEmail)))
                        .addGroup(layout.createSequentialGroup()
                            .addGap(28, 28, 28)
                            .addComponent(LblSexo)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(TxtCadcliSexo, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(51, 51, 51)
                            .addComponent(LblNascimento)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(TxtCadCliNascimento, javax.swing.GroupLayout.DEFAULT_SIZE, 84, Short.MAX_VALUE))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(59, 59, 59)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(TxtCadCliId, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(LblId)
                    .addComponent(LblRg)
                    .addComponent(TxtCadCliRg, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(LblNome)
                    .addComponent(TxtCadCliNome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(LblEndereco)
                    .addComponent(TxtCadCliEndereco, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(LblCep)
                    .addComponent(TxtCadCliCep, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(LblTelefone)
                    .addComponent(TxtCadCliTelefone, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(LblEmail)
                    .addComponent(TxtCadCliEmail, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(LblSexo)
                    .addComponent(TxtCadcliSexo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(LblNascimento)
                    .addComponent(TxtCadCliNascimento, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(BtnSalvar)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void BtnSalvarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnSalvarActionPerformed
        
        try {
            controller.salvaCliente();
        } catch (ParseException ex) {
            Logger.getLogger(CadastroClienteView.class.getName()).log(Level.SEVERE, null, ex);
        }
      
      
        
        
        
    }//GEN-LAST:event_BtnSalvarActionPerformed

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
            java.util.logging.Logger.getLogger(CadastroClienteView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(CadastroClienteView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(CadastroClienteView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(CadastroClienteView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new CadastroClienteView().setVisible(true);
            }
        });
    }

    public JTextField getTxtCadCliCep() {
        return TxtCadCliCep;
    }

    public void setTxtCadCliCep(JTextField TxtCadCliCep) {
        this.TxtCadCliCep = TxtCadCliCep;
    }

    public JTextField getTxtCadCliEmail() {
        return TxtCadCliEmail;
    }

    public void setTxtCadCliEmail(JTextField TxtCadCliEmail) {
        this.TxtCadCliEmail = TxtCadCliEmail;
    }

    public JTextField getTxtCadCliEndereco() {
        return TxtCadCliEndereco;
    }

    public void setTxtCadCliEndereco(JTextField TxtCadCliEndereco) {
        this.TxtCadCliEndereco = TxtCadCliEndereco;
    }

    public JTextField getTxtCadCliId() {
        return TxtCadCliId;
    }

    public void setTxtCadCliId(JTextField TxtCadCliId) {
        this.TxtCadCliId = TxtCadCliId;
    }

    public JFormattedTextField getTxtCadCliNascimento() {
        return TxtCadCliNascimento;
    }

  

    public void setTxtCadCliNascimento(JFormattedTextField TxtCadCliNascimento) {
        this.TxtCadCliNascimento = TxtCadCliNascimento;
    }

    

    public JTextField getTxtCadCliNome() {
        return TxtCadCliNome;
    }

    public void setTxtCadCliNome(JTextField TxtCadCliNome) {
        this.TxtCadCliNome = TxtCadCliNome;
    }

    public JTextField getTxtCadCliRg() {
        return TxtCadCliRg;
    }

    public void setTxtCadCliRg(JTextField TxtCadCliRg) {
        this.TxtCadCliRg = TxtCadCliRg;
    }

    public JFormattedTextField getTxtCadCliTelefone() {
        return TxtCadCliTelefone;
    }

    public void setTxtCadCliTelefone(JFormattedTextField TxtCadCliTelefone) {
        this.TxtCadCliTelefone = TxtCadCliTelefone;
    }

  
    

    public JTextField getTxtCadcliSexo() {
        return TxtCadcliSexo;
    }

    public void setTxtCadcliSexo(JTextField TxtCadcliSexo) {
        this.TxtCadcliSexo = TxtCadcliSexo;
    }

 
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BtnSalvar;
    private javax.swing.JLabel LblCep;
    private javax.swing.JLabel LblEmail;
    private javax.swing.JLabel LblEndereco;
    private javax.swing.JLabel LblId;
    private javax.swing.JLabel LblNascimento;
    private javax.swing.JLabel LblNome;
    private javax.swing.JLabel LblRg;
    private javax.swing.JLabel LblSexo;
    private javax.swing.JLabel LblTelefone;
    private javax.swing.JTextField TxtCadCliCep;
    private javax.swing.JTextField TxtCadCliEmail;
    private javax.swing.JTextField TxtCadCliEndereco;
    private javax.swing.JTextField TxtCadCliId;
    private javax.swing.JFormattedTextField TxtCadCliNascimento;
    private javax.swing.JTextField TxtCadCliNome;
    private javax.swing.JTextField TxtCadCliRg;
    private javax.swing.JFormattedTextField TxtCadCliTelefone;
    private javax.swing.JTextField TxtCadcliSexo;
    // End of variables declaration//GEN-END:variables
}
