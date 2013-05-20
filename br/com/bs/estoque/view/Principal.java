/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package br.com.bs.estoque.view;

import br.com.bs.estoque.model.usuario.Usuario;
import java.awt.Image;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

/**
 *
 * @author Misael
 */
public class Principal extends Base_frame {
    private static Usuario usuarioLogado;
    /**
     * Creates new form Principal
     */
    public Principal() {        
        initComponents();  
        
        ImageIcon iconLogo = new ImageIcon("IMGS/logo.jpg");        
        initializeIconFor(lblLogo,iconLogo,lblLogo.getSize().width, lblLogo.getSize().height);        
        ImageIcon icoProduto = new ImageIcon("IMGS/produto_icon.png");
        initializeIconFor(btnTBCadastroProduto, icoProduto, 30, 30);
        ImageIcon icoCliente = new ImageIcon("IMGS/cliente_icon.png");
        initializeIconFor(btnTBCadastroCliente, icoCliente, 30, 30);
        
        lblUsuarioLogado.setText("" + usuarioLogado.getLogin());
        
        centerFrameOnScreen();        
    }
    
    public void initializeIconFor(Object obj, ImageIcon ico, int w, int h){
        Image resizedImg = br.com.bs.estoque.view.util.ImageUtil.getInstance().getScaledImage(ico.getImage(), w, h);
        ImageIcon resIcon = new ImageIcon(resizedImg);
        if(obj instanceof JLabel)
            ((JLabel)obj).setIcon(resIcon);
        else if(obj instanceof JButton)
            ((JButton)obj).setIcon(resIcon);
    }
    
    public static Usuario getUsuarioLogado(){
//        if(usuarioLogado == null)
//            JOptionPane.showMessageDialog(null, "Falha ao recuperar informações do usuário logado.\n"
//                    + "Você deve fechar o programa e iniciar novamente.", 
//                    "Erro de login", JOptionPane.ERROR_MESSAGE);
        return  usuarioLogado;
    }
    
    public static void setUsuarioLogado(Usuario usuario){
        usuarioLogado = usuario;
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lblLogo = new javax.swing.JLabel();
        jToolBar1 = new javax.swing.JToolBar();
        btnTBCadastroProduto = new javax.swing.JButton();
        ImageIcon prodIcon = new ImageIcon("imgs/produto.jpg");
        Image resizedProdIcon = br.com.bs.estoque.view.util.ImageUtil.getInstance().getScaledImage(prodIcon.getImage(), 30, 30);
        btnTBCadastroProduto.setIcon(new ImageIcon(resizedProdIcon));
        btnTBCadastroCliente = new javax.swing.JButton();
        jToolBar2 = new javax.swing.JToolBar();
        lblUsuarioLogado = new javax.swing.JLabel();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        jMenuItem2 = new javax.swing.JMenuItem();
        jMenuItem1 = new javax.swing.JMenuItem();
        jSeparator2 = new javax.swing.JPopupMenu.Separator();
        jmiMudarUsuario = new javax.swing.JMenuItem();
        jSeparator1 = new javax.swing.JPopupMenu.Separator();
        jMenuItem3 = new javax.swing.JMenuItem();
        jMenu2 = new javax.swing.JMenu();
        jMenuItem4 = new javax.swing.JMenuItem();
        jMenuItem5 = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);

        lblLogo.setBackground(new java.awt.Color(255, 255, 255));
        lblLogo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);

        jToolBar1.setFloatable(false);
        jToolBar1.setRollover(true);

        btnTBCadastroProduto.setToolTipText("Cadastro de produto");
        btnTBCadastroProduto.setFocusable(false);
        btnTBCadastroProduto.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnTBCadastroProduto.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btnTBCadastroProduto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnTBCadastroProdutoActionPerformed(evt);
            }
        });
        jToolBar1.add(btnTBCadastroProduto);

        btnTBCadastroCliente.setToolTipText("Cadastro de Cliente");
        btnTBCadastroCliente.setFocusable(false);
        btnTBCadastroCliente.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnTBCadastroCliente.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btnTBCadastroCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnTBCadastroClienteActionPerformed(evt);
            }
        });
        jToolBar1.add(btnTBCadastroCliente);

        jToolBar2.setFloatable(false);
        jToolBar2.setRollover(true);
        jToolBar2.add(lblUsuarioLogado);

        jMenu1.setText("Arquivo");

        jMenuItem2.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_C, java.awt.event.InputEvent.ALT_MASK | java.awt.event.InputEvent.SHIFT_MASK));
        jMenuItem2.setText("Cadastro de Cliente");
        jMenuItem2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem2ActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItem2);

        jMenuItem1.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_P, java.awt.event.InputEvent.ALT_MASK | java.awt.event.InputEvent.SHIFT_MASK));
        jMenuItem1.setText("Cadastro de Estoque");
        jMenuItem1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem1ActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItem1);
        jMenu1.add(jSeparator2);

        jmiMudarUsuario.setText("Mudar Usuário");
        jmiMudarUsuario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jmiMudarUsuarioActionPerformed(evt);
            }
        });
        jMenu1.add(jmiMudarUsuario);
        jMenu1.add(jSeparator1);

        jMenuItem3.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_X, java.awt.event.InputEvent.CTRL_MASK));
        jMenuItem3.setText("Sair");
        jMenuItem3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem3ActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItem3);

        jMenuBar1.add(jMenu1);

        jMenu2.setText("Ajuda");

        jMenuItem4.setText("Sobre");
        jMenuItem4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem4ActionPerformed(evt);
            }
        });
        jMenu2.add(jMenuItem4);

        jMenuItem5.setText("Ajuda");
        jMenuItem5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem5ActionPerformed(evt);
            }
        });
        jMenu2.add(jMenuItem5);

        jMenuBar1.add(jMenu2);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(lblLogo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jToolBar1, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jToolBar2, javax.swing.GroupLayout.PREFERRED_SIZE, 199, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jToolBar1, javax.swing.GroupLayout.DEFAULT_SIZE, 43, Short.MAX_VALUE)
                    .addComponent(jToolBar2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(lblLogo, javax.swing.GroupLayout.PREFERRED_SIZE, 236, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jMenuItem2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem2ActionPerformed
        new ManutencaoCliente().setVisible(true);
    }//GEN-LAST:event_jMenuItem2ActionPerformed

    private void jMenuItem1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem1ActionPerformed
        new ManutencaoEstoque().setVisible(true);
    }//GEN-LAST:event_jMenuItem1ActionPerformed

    private void jMenuItem3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem3ActionPerformed
        System.exit(0);
    }//GEN-LAST:event_jMenuItem3ActionPerformed

    private void jMenuItem4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem4ActionPerformed
        String text = "\nBiz Automation Inc.\n\n"
                + "2013\n\n"
                + "Todos os direitos reservados\n";
        JOptionPane.showMessageDialog(this, text, "Sobre", 
                JOptionPane.INFORMATION_MESSAGE, new ImageIcon("imgs/ico.jpg"));
    }//GEN-LAST:event_jMenuItem4ActionPerformed

    private void jMenuItem5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem5ActionPerformed
        StringBuilder helpText = new StringBuilder();
        try{
            File f = new File("./build/classes/help.txt");
            BufferedReader br = new BufferedReader(new FileReader(f));
            String s;
            while((s = br.readLine()) != null){
            helpText.append(s).append("\n");
        }
        }catch(IOException exc){
            exc.printStackTrace();
        }
        JOptionPane.showMessageDialog(this, helpText, "Ajuda do Sistema de Estoque", 
                JOptionPane.INFORMATION_MESSAGE, new ImageIcon("imgs/info.png"));
    }//GEN-LAST:event_jMenuItem5ActionPerformed

    private void btnTBCadastroProdutoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnTBCadastroProdutoActionPerformed
        new ManutencaoEstoque().setVisible(true);
    }//GEN-LAST:event_btnTBCadastroProdutoActionPerformed

    private void btnTBCadastroClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnTBCadastroClienteActionPerformed
        new ManutencaoCliente().setVisible(true);
    }//GEN-LAST:event_btnTBCadastroClienteActionPerformed

    private void jmiMudarUsuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jmiMudarUsuarioActionPerformed
        new LoginForm().setVisible(true);
        dispose();
    }//GEN-LAST:event_jmiMudarUsuarioActionPerformed

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
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Principal().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnTBCadastroCliente;
    private javax.swing.JButton btnTBCadastroProduto;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JMenuItem jMenuItem2;
    private javax.swing.JMenuItem jMenuItem3;
    private javax.swing.JMenuItem jMenuItem4;
    private javax.swing.JMenuItem jMenuItem5;
    private javax.swing.JPopupMenu.Separator jSeparator1;
    private javax.swing.JPopupMenu.Separator jSeparator2;
    private javax.swing.JToolBar jToolBar1;
    private javax.swing.JToolBar jToolBar2;
    private javax.swing.JMenuItem jmiMudarUsuario;
    private javax.swing.JLabel lblLogo;
    private javax.swing.JLabel lblUsuarioLogado;
    // End of variables declaration//GEN-END:variables
    
}