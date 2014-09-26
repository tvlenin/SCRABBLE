/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package GUI;

/**
 * Clase en la que se crean e inicializan los componentes de la pantalla de juego, 
 * Asi como la ventana en la que apareceran estos elementos.
 * @author fabricio
 */
public class PantallaPrincipal extends javax.swing.JFrame {

    /**
     * Metodo constructor de la clase PantallaPrincipal,
     * Para crear el formulario en el que se mostrara la apariencia del juego;
     * Hace referencia al metodo en el que se inicializa el formulario para la pantalla.
     * @author fabricio
     */
    public PantallaPrincipal() {
        initComponents();
    }

    /**
     * Metodo que es llamado desde el constructor, en el cual se inicializa el formulario para la pantalla,
     * se crean los elementos que apareceran en esta pantalla y los coloca en las posiciones correspondientes.
     * @author fabricio
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        lblCarcaj = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMaximumSize(new java.awt.Dimension(522, 614));
        setMinimumSize(new java.awt.Dimension(522, 614));
        setPreferredSize(new java.awt.Dimension(522, 614));
        setResizable(false);
        getContentPane().setLayout(null);

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/GUI/Imagenes/P3_Opaco.gif"))); // NOI18N
        jLabel2.setText("jLabel2");
        jLabel2.setMaximumSize(new java.awt.Dimension(30, 30));
        jLabel2.setMinimumSize(new java.awt.Dimension(30, 30));
        jLabel2.setPreferredSize(new java.awt.Dimension(30, 30));
        getContentPane().add(jLabel2);
        jLabel2.setBounds(240, 0, 32, 32);
        jLabel2.getAccessibleContext().setAccessibleName("lblP3");

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/GUI/Imagenes/P2_Opaco.gif"))); // NOI18N
        jLabel3.setText("jLabel2");
        jLabel3.setMaximumSize(new java.awt.Dimension(30, 30));
        jLabel3.setMinimumSize(new java.awt.Dimension(30, 30));
        jLabel3.setPreferredSize(new java.awt.Dimension(30, 30));
        getContentPane().add(jLabel3);
        jLabel3.setBounds(490, 240, 32, 32);
        jLabel3.getAccessibleContext().setAccessibleName("lblP2");

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/GUI/Imagenes/P4_Opaco.gif"))); // NOI18N
        jLabel4.setText("jLabel2");
        jLabel4.setMaximumSize(new java.awt.Dimension(30, 30));
        jLabel4.setMinimumSize(new java.awt.Dimension(30, 30));
        jLabel4.setPreferredSize(new java.awt.Dimension(30, 30));
        getContentPane().add(jLabel4);
        jLabel4.setBounds(0, 240, 32, 32);
        jLabel4.getAccessibleContext().setAccessibleName("lblP4");

        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/GUI/Imagenes/P1_Opaco.gif"))); // NOI18N
        jLabel5.setText("jLabel2");
        jLabel5.setMaximumSize(new java.awt.Dimension(30, 30));
        jLabel5.setMinimumSize(new java.awt.Dimension(30, 30));
        jLabel5.setPreferredSize(new java.awt.Dimension(30, 30));
        getContentPane().add(jLabel5);
        jLabel5.setBounds(240, 490, 32, 32);
        jLabel5.getAccessibleContext().setAccessibleName("lblP1");

        lblCarcaj.setIcon(new javax.swing.ImageIcon(getClass().getResource("/GUI/Imagenes/carcaj.png"))); // NOI18N
        lblCarcaj.setText("jLabel6");
        lblCarcaj.setMaximumSize(new java.awt.Dimension(411, 90));
        lblCarcaj.setMinimumSize(new java.awt.Dimension(411, 90));
        lblCarcaj.setPreferredSize(new java.awt.Dimension(411, 90));
        getContentPane().add(lblCarcaj);
        lblCarcaj.setBounds(50, 520, 411, 90);
        lblCarcaj.getAccessibleContext().setAccessibleName("lblCarcaj");
        lblCarcaj.getAccessibleContext().setAccessibleDescription("");

        jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/GUI/Imagenes/tablero.gif"))); // NOI18N
        jLabel6.setText("jLabel6");
        getContentPane().add(jLabel6);
        jLabel6.setBounds(30, 30, 455, 455);
        jLabel6.getAccessibleContext().setAccessibleName("lblTablero");

        pack();
    }// </editor-fold>//GEN-END:initComponents

    /**
     * Metodo en el que se inicializan todos los componetes que componen la pantalla de juego,
     * Y tambien se colocan los componestes en la pantalla.
     * @param args
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
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel lblCarcaj;
    // End of variables declaration//GEN-END:variables
}
