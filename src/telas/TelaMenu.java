/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package telas;

/**
 *
 * @author Evandro Teruel
 */
public class TelaMenu extends javax.swing.JFrame {

    /**
     * Creates new form TelaMenu
     */
    public TelaMenu() {
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

        jButton1 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jMenuBar1 = new javax.swing.JMenuBar();
        mnuDepartamentos = new javax.swing.JMenu();
        itmCadastrarDepartamentos = new javax.swing.JMenuItem();
        itmConsultarDepartamentos = new javax.swing.JMenuItem();
        itmAlterarDepartamentos = new javax.swing.JMenuItem();
        mnuRelatoriosDepartamentos = new javax.swing.JMenu();
        itmRelatorioGeralDepartamentos = new javax.swing.JMenuItem();
        itmRelatorioPorCidadeDepartamentos = new javax.swing.JMenuItem();
        jMenuItem4 = new javax.swing.JMenuItem();
        jSeparator1 = new javax.swing.JPopupMenu.Separator();
        itmSair = new javax.swing.JMenuItem();
        mnuFuncionarios = new javax.swing.JMenu();
        itmCadastrarFuncionarios = new javax.swing.JMenuItem();
        itmAlterarFuncionarios = new javax.swing.JMenuItem();
        itmConsultarFuncionarios = new javax.swing.JMenuItem();
        itmExcluirFuncionarios = new javax.swing.JMenuItem();
        itmRelatorioFuncionarios = new javax.swing.JMenuItem();
        mnuUsuarios = new javax.swing.JMenu();
        mnuAjuda = new javax.swing.JMenu();
        itmManualUsuario = new javax.swing.JMenuItem();
        itmSobre = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Menu do sitema");
        getContentPane().setLayout(null);

        jButton1.setBackground(new java.awt.Color(255, 0, 0));
        jButton1.setFont(new java.awt.Font("Segoe UI", 0, 36)); // NOI18N
        jButton1.setForeground(new java.awt.Color(0, 0, 153));
        jButton1.setText("Destaque");
        getContentPane().add(jButton1);
        jButton1.setBounds(0, 380, 190, 50);

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/telas/Ramen.jpg"))); // NOI18N
        getContentPane().add(jLabel1);
        jLabel1.setBounds(0, 0, 660, 430);

        mnuDepartamentos.setText("Departamentos");

        itmCadastrarDepartamentos.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_C, java.awt.event.InputEvent.ALT_DOWN_MASK | java.awt.event.InputEvent.CTRL_DOWN_MASK));
        itmCadastrarDepartamentos.setText("Cadastrar");
        itmCadastrarDepartamentos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                itmCadastrarDepartamentosActionPerformed(evt);
            }
        });
        mnuDepartamentos.add(itmCadastrarDepartamentos);

        itmConsultarDepartamentos.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_S, java.awt.event.InputEvent.ALT_DOWN_MASK | java.awt.event.InputEvent.CTRL_DOWN_MASK));
        itmConsultarDepartamentos.setText("Consultar");
        mnuDepartamentos.add(itmConsultarDepartamentos);

        itmAlterarDepartamentos.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_R, java.awt.event.InputEvent.ALT_DOWN_MASK | java.awt.event.InputEvent.CTRL_DOWN_MASK));
        itmAlterarDepartamentos.setText("Alterar");
        mnuDepartamentos.add(itmAlterarDepartamentos);

        mnuRelatoriosDepartamentos.setText("Relatórios");

        itmRelatorioGeralDepartamentos.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_G, java.awt.event.InputEvent.CTRL_DOWN_MASK));
        itmRelatorioGeralDepartamentos.setText("Geral");
        mnuRelatoriosDepartamentos.add(itmRelatorioGeralDepartamentos);

        itmRelatorioPorCidadeDepartamentos.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_C, java.awt.event.InputEvent.SHIFT_DOWN_MASK | java.awt.event.InputEvent.CTRL_DOWN_MASK));
        itmRelatorioPorCidadeDepartamentos.setText("Por cidade");
        itmRelatorioPorCidadeDepartamentos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                itmRelatorioPorCidadeDepartamentosActionPerformed(evt);
            }
        });
        mnuRelatoriosDepartamentos.add(itmRelatorioPorCidadeDepartamentos);

        mnuDepartamentos.add(mnuRelatoriosDepartamentos);

        jMenuItem4.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_X, java.awt.event.InputEvent.ALT_DOWN_MASK | java.awt.event.InputEvent.CTRL_DOWN_MASK));
        jMenuItem4.setText("Excluir");
        mnuDepartamentos.add(jMenuItem4);
        mnuDepartamentos.add(jSeparator1);

        itmSair.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_X, java.awt.event.InputEvent.CTRL_DOWN_MASK));
        itmSair.setText("Sair");
        mnuDepartamentos.add(itmSair);

        jMenuBar1.add(mnuDepartamentos);

        mnuFuncionarios.setText("Funcionários");

        itmCadastrarFuncionarios.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_C, java.awt.event.InputEvent.ALT_DOWN_MASK | java.awt.event.InputEvent.SHIFT_DOWN_MASK));
        itmCadastrarFuncionarios.setText("Cadastrar");
        mnuFuncionarios.add(itmCadastrarFuncionarios);

        itmAlterarFuncionarios.setText("Alterar");
        mnuFuncionarios.add(itmAlterarFuncionarios);

        itmConsultarFuncionarios.setText("Consultar");
        mnuFuncionarios.add(itmConsultarFuncionarios);

        itmExcluirFuncionarios.setText("Excluir");
        mnuFuncionarios.add(itmExcluirFuncionarios);

        itmRelatorioFuncionarios.setText("Relatórios");
        mnuFuncionarios.add(itmRelatorioFuncionarios);

        jMenuBar1.add(mnuFuncionarios);

        mnuUsuarios.setText("Usuários");
        jMenuBar1.add(mnuUsuarios);

        mnuAjuda.setText("Ajuda");

        itmManualUsuario.setText("Manual do usuário");
        mnuAjuda.add(itmManualUsuario);

        itmSobre.setText("Sobre");
        mnuAjuda.add(itmSobre);

        jMenuBar1.add(mnuAjuda);

        setJMenuBar(jMenuBar1);

        setSize(new java.awt.Dimension(616, 455));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void itmRelatorioPorCidadeDepartamentosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_itmRelatorioPorCidadeDepartamentosActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_itmRelatorioPorCidadeDepartamentosActionPerformed

    private void itmCadastrarDepartamentosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_itmCadastrarDepartamentosActionPerformed
    new CadastroDepartamentos().setVisible( true);
    
    }//GEN-LAST:event_itmCadastrarDepartamentosActionPerformed

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
            java.util.logging.Logger.getLogger(TelaMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TelaMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TelaMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TelaMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TelaMenu().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenuItem itmAlterarDepartamentos;
    private javax.swing.JMenuItem itmAlterarFuncionarios;
    private javax.swing.JMenuItem itmCadastrarDepartamentos;
    private javax.swing.JMenuItem itmCadastrarFuncionarios;
    private javax.swing.JMenuItem itmConsultarDepartamentos;
    private javax.swing.JMenuItem itmConsultarFuncionarios;
    private javax.swing.JMenuItem itmExcluirFuncionarios;
    private javax.swing.JMenuItem itmManualUsuario;
    private javax.swing.JMenuItem itmRelatorioFuncionarios;
    private javax.swing.JMenuItem itmRelatorioGeralDepartamentos;
    private javax.swing.JMenuItem itmRelatorioPorCidadeDepartamentos;
    private javax.swing.JMenuItem itmSair;
    private javax.swing.JMenuItem itmSobre;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem4;
    private javax.swing.JPopupMenu.Separator jSeparator1;
    private javax.swing.JMenu mnuAjuda;
    private javax.swing.JMenu mnuDepartamentos;
    private javax.swing.JMenu mnuFuncionarios;
    private javax.swing.JMenu mnuRelatoriosDepartamentos;
    private javax.swing.JMenu mnuUsuarios;
    // End of variables declaration//GEN-END:variables
}
