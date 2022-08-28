/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package view;

import Controller.AgendaController;
import Model.DAO.Banco;
import javax.swing.JComboBox;
import javax.swing.JTable;

/**
 *
 * @author Adriano Pavaneli
 */
public class Agenda extends javax.swing.JFrame {
    private final AgendaController controller;

    /**
     * Creates new form Agenda
     */
    public Agenda() {
        initComponents();
        this.controller = new AgendaController(this);
        Banco.inicia();
        iniciar();
        
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        TableAgendamentos = new javax.swing.JTable();
        TextFormatedHora = new javax.swing.JFormattedTextField();
        LabelHora = new javax.swing.JLabel();
        ButtonAgendar = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        TextObservacao = new javax.swing.JTextArea();
        TextFormatedData = new javax.swing.JFormattedTextField();
        LabelData = new javax.swing.JLabel();
        LabelValor = new javax.swing.JLabel();
        TextValor = new javax.swing.JTextField();
        TextServico = new javax.swing.JComboBox<>();
        LabelServico = new javax.swing.JLabel();
        TextCliente = new javax.swing.JComboBox<>();
        LabelId = new javax.swing.JLabel();
        TextId = new javax.swing.JTextField();
        LabelObservacao = new javax.swing.JLabel();
        LabelAgenda = new javax.swing.JLabel();
        LblMolduraAgenda = new javax.swing.JLabel();
        LblImagemAgenda = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        TableAgendamentos.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null}
            },
            new String [] {
                "Id", "Cliente", "Serviço", "Valor", "Data", "Hora", "Observação"
            }
        ));
        jScrollPane1.setViewportView(TableAgendamentos);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 450, 1120, 170));

        TextFormatedHora.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.DateFormatter(java.text.DateFormat.getTimeInstance(java.text.DateFormat.SHORT))));
        getContentPane().add(TextFormatedHora, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 400, 280, 40));

        LabelHora.setForeground(new java.awt.Color(255, 255, 255));
        LabelHora.setText("Hora");
        getContentPane().add(LabelHora, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 410, -1, -1));

        ButtonAgendar.setBackground(new java.awt.Color(51, 51, 255));
        ButtonAgendar.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        ButtonAgendar.setForeground(new java.awt.Color(255, 255, 255));
        ButtonAgendar.setText("Agendar");
        ButtonAgendar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ButtonAgendarActionPerformed(evt);
            }
        });
        getContentPane().add(ButtonAgendar, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 390, 610, 50));

        TextObservacao.setColumns(20);
        TextObservacao.setRows(5);
        jScrollPane2.setViewportView(TextObservacao);

        getContentPane().add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 100, 610, 280));

        TextFormatedData.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.DateFormatter()));
        getContentPane().add(TextFormatedData, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 340, 280, 40));

        LabelData.setForeground(new java.awt.Color(255, 255, 255));
        LabelData.setText("Data");
        getContentPane().add(LabelData, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 350, -1, -1));

        LabelValor.setForeground(new java.awt.Color(255, 255, 255));
        LabelValor.setText("Valor R$");
        getContentPane().add(LabelValor, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 290, -1, -1));

        TextValor.setText("0");
        TextValor.setToolTipText("");
        TextValor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TextValorActionPerformed(evt);
            }
        });
        getContentPane().add(TextValor, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 280, 280, 40));

        getContentPane().add(TextServico, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 220, 280, 40));

        LabelServico.setForeground(new java.awt.Color(255, 255, 255));
        LabelServico.setText("Servico");
        getContentPane().add(LabelServico, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 230, -1, -1));

        TextCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TextClienteActionPerformed(evt);
            }
        });
        getContentPane().add(TextCliente, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 160, 280, 40));

        LabelId.setForeground(new java.awt.Color(255, 255, 255));
        LabelId.setText("Id");
        getContentPane().add(LabelId, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 110, -1, -1));

        TextId.setEditable(false);
        TextId.setText("0");
        TextId.setToolTipText("");
        TextId.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TextIdActionPerformed(evt);
            }
        });
        getContentPane().add(TextId, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 100, 280, 40));

        LabelObservacao.setForeground(new java.awt.Color(255, 255, 255));
        LabelObservacao.setText("Observação");
        getContentPane().add(LabelObservacao, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 110, -1, -1));

        LabelAgenda.setFont(new java.awt.Font("Liberation Sans", 1, 36)); // NOI18N
        LabelAgenda.setForeground(new java.awt.Color(255, 255, 255));
        LabelAgenda.setText("Agenda");
        getContentPane().add(LabelAgenda, new org.netbeans.lib.awtextra.AbsoluteConstraints(600, 30, 150, 60));

        LblMolduraAgenda.setIcon(new javax.swing.ImageIcon(getClass().getResource("/view/imagens/Agenda-PainelFundo.png"))); // NOI18N
        getContentPane().add(LblMolduraAgenda, new org.netbeans.lib.awtextra.AbsoluteConstraints(-10, -70, -1, -1));

        LblImagemAgenda.setIcon(new javax.swing.ImageIcon(getClass().getResource("/view/imagens/AgendaFundo.png"))); // NOI18N
        getContentPane().add(LblImagemAgenda, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void ButtonAgendarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ButtonAgendarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_ButtonAgendarActionPerformed

    private void TextValorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TextValorActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TextValorActionPerformed

    private void TextIdActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TextIdActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TextIdActionPerformed

    private void TextClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TextClienteActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TextClienteActionPerformed

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
            java.util.logging.Logger.getLogger(Agenda.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Agenda.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Agenda.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Agenda.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Agenda().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton ButtonAgendar;
    private javax.swing.JLabel LabelAgenda;
    private javax.swing.JLabel LabelData;
    private javax.swing.JLabel LabelHora;
    private javax.swing.JLabel LabelId;
    private javax.swing.JLabel LabelObservacao;
    private javax.swing.JLabel LabelServico;
    private javax.swing.JLabel LabelValor;
    private javax.swing.JLabel LblImagemAgenda;
    private javax.swing.JLabel LblMolduraAgenda;
    private javax.swing.JTable TableAgendamentos;
    private javax.swing.JComboBox<String> TextCliente;
    private javax.swing.JFormattedTextField TextFormatedData;
    private javax.swing.JFormattedTextField TextFormatedHora;
    private javax.swing.JTextField TextId;
    private javax.swing.JTextArea TextObservacao;
    private javax.swing.JComboBox<String> TextServico;
    private javax.swing.JTextField TextValor;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    // End of variables declaration//GEN-END:variables

    private void iniciar() {
        this.controller.atualizaTabela();
        this.controller.atualizaCliente();
        this.controller.atualizaServico();
    }

    public JTable getTableAgendamentos() {
        return TableAgendamentos;
    }

    public void setTableAgendamentos(JTable TableAgendamentos) {
        this.TableAgendamentos = TableAgendamentos;
    }

    public JComboBox<String> getTextCliente() {
        return TextCliente;
    }

    public void setTextCliente(JComboBox<String> TextCliente) {
        this.TextCliente = TextCliente;
    }

    public JComboBox<String> getTextServico() {
        return TextServico;
    }

    public void setTextServico(JComboBox<String> TextServico) {
        this.TextServico = TextServico;
    }
    
    
}
