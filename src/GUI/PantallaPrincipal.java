/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package GUI;

/**
 *
 * @author fabricio
 */
public class PantallaPrincipal extends javax.swing.JFrame {

    /**
     * Creates new form pantalla
     */
    public PantallaPrincipal() {
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

        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        lblTablero = new javax.swing.JLabel();
        lblCarcaj = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(522, 614));
        setPreferredSize(new java.awt.Dimension(522, 614));
        getContentPane().setLayout(null);

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/GUI/Imagenes/A.GIF"))); // NOI18N
        jLabel2.setText("jLabel2");
        jLabel2.setMaximumSize(new java.awt.Dimension(30, 30));
        jLabel2.setMinimumSize(new java.awt.Dimension(30, 30));
        jLabel2.setPreferredSize(new java.awt.Dimension(30, 30));
        getContentPane().add(jLabel2);
        jLabel2.setBounds(240, 0, 32, 32);

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/GUI/Imagenes/A.GIF"))); // NOI18N
        jLabel3.setText("jLabel2");
        jLabel3.setMaximumSize(new java.awt.Dimension(30, 30));
        jLabel3.setMinimumSize(new java.awt.Dimension(30, 30));
        jLabel3.setPreferredSize(new java.awt.Dimension(30, 30));
        getContentPane().add(jLabel3);
        jLabel3.setBounds(490, 240, 32, 32);

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/GUI/Imagenes/A.GIF"))); // NOI18N
        jLabel4.setText("jLabel2");
        jLabel4.setMaximumSize(new java.awt.Dimension(30, 30));
        jLabel4.setMinimumSize(new java.awt.Dimension(30, 30));
        jLabel4.setPreferredSize(new java.awt.Dimension(30, 30));
        getContentPane().add(jLabel4);
        jLabel4.setBounds(0, 240, 32, 32);

        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/GUI/Imagenes/A.GIF"))); // NOI18N
        jLabel5.setText("jLabel2");
        jLabel5.setMaximumSize(new java.awt.Dimension(30, 30));
        jLabel5.setMinimumSize(new java.awt.Dimension(30, 30));
        jLabel5.setPreferredSize(new java.awt.Dimension(30, 30));
        getContentPane().add(jLabel5);
        jLabel5.setBounds(240, 490, 32, 32);

        lblTablero.setBackground(new java.awt.Color(254, 127, 1));
        lblTablero.setIcon(new javax.swing.ImageIcon(getClass().getResource("/GUI/Imagenes/tablero.gif"))); // NOI18N
        lblTablero.setText("jLabel1");
        lblTablero.setBorder(null);
        lblTablero.setMaximumSize(new java.awt.Dimension(460, 460));
        lblTablero.setMinimumSize(new java.awt.Dimension(460, 460));
        lblTablero.setPreferredSize(new java.awt.Dimension(460, 460));
        getContentPane().add(lblTablero);
        lblTablero.setBounds(30, 30, 460, 460);
        lblTablero.getAccessibleContext().setAccessibleName("lblTablero");

        lblCarcaj.setIcon(new javax.swing.ImageIcon(getClass().getResource("/GUI/Imagenes/carcaj.png"))); // NOI18N
        lblCarcaj.setText("jLabel6");
        lblCarcaj.setMaximumSize(new java.awt.Dimension(411, 90));
        lblCarcaj.setMinimumSize(new java.awt.Dimension(411, 90));
        lblCarcaj.setPreferredSize(new java.awt.Dimension(411, 90));
        getContentPane().add(lblCarcaj);
        lblCarcaj.setBounds(50, 520, 411, 90);
        lblCarcaj.getAccessibleContext().setAccessibleName("lblCarcaj");
        lblCarcaj.getAccessibleContext().setAccessibleDescription("");

        pack();
    }// </editor-fold>//GEN-END:initComponents

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
            java.util.logging.Logger.getLogger(PantallaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(PantallaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(PantallaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(PantallaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new PantallaPrincipal().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel lblCarcaj;
    private javax.swing.JLabel lblTablero;
    // End of variables declaration//GEN-END:variables
}
