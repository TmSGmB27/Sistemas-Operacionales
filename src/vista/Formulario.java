package vista;

import javax.swing.JButton;
import javax.swing.JRadioButton;
import javax.swing.JTextField;

public class Formulario extends javax.swing.JFrame {

    public Formulario() {
        initComponents();
    }

    public JButton getBtnañadir() {
        return btnañadir;
    }

    public void setBtnañadir(JButton btnañadir) {
        this.btnañadir = btnañadir;
    }

    public JButton getBtncontinuar() {
        return btncontinuar;
    }

    public void setBtncontinuar(JButton btncontinuar) {
        this.btncontinuar = btncontinuar;
    }

    public JRadioButton getRecurso1() {
        return recurso1;
    }

    public void setRecurso1(JRadioButton recurso1) {
        this.recurso1 = recurso1;
    }

    public JRadioButton getRecurso2() {
        return recurso2;
    }

    public void setRecurso2(JRadioButton recurso2) {
        this.recurso2 = recurso2;
    }

    public JRadioButton getRecurso3() {
        return recurso3;
    }

    public void setRecurso3(JRadioButton recurso3) {
        this.recurso3 = recurso3;
    }

    public JRadioButton getRecurso4() {
        return recurso4;
    }

    public void setRecurso4(JRadioButton recurso4) {
        this.recurso4 = recurso4;
    }

    public JRadioButton getRecurso5() {
        return recurso5;
    }

    public void setRecurso5(JRadioButton recurso5) {
        this.recurso5 = recurso5;
    }

    public JTextField getTxtnombre() {
        return txtnombre;
    }

    public void setTxtnombre(JTextField txtnombre) {
        this.txtnombre = txtnombre;
    }

    public JTextField getTxttamaño() {
        return txttamaño;
    }

    public void setTxttamaño(JTextField txttamaño) {
        this.txttamaño = txttamaño;
    }

    
    
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        btnañadir = new javax.swing.JButton();
        btncontinuar = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        txtnombre = new javax.swing.JTextField();
        recurso1 = new javax.swing.JRadioButton();
        recurso2 = new javax.swing.JRadioButton();
        recurso3 = new javax.swing.JRadioButton();
        recurso4 = new javax.swing.JRadioButton();
        recurso5 = new javax.swing.JRadioButton();
        txttamaño = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setText("CREANDO PROCESOS");

        btnañadir.setText("Añadir");
        btnañadir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnañadirActionPerformed(evt);
            }
        });

        btncontinuar.setText("Continuar");

        jLabel2.setText("Nombre:");

        jLabel3.setText("Tamaño:");

        jLabel4.setText("Recurso:");

        txtnombre.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtnombreActionPerformed(evt);
            }
        });

        recurso1.setText("R1");
        recurso1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                recurso1ActionPerformed(evt);
            }
        });

        recurso2.setText("R2");

        recurso3.setText("R3");

        recurso4.setText("R4");
        recurso4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                recurso4ActionPerformed(evt);
            }
        });

        recurso5.setText("R5");

        txttamaño.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txttamañoActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btncontinuar)
                .addGap(18, 18, 18))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(22, 22, 22)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jLabel1)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                            .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                            .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGap(174, 174, 174))
                                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                                .addGap(133, 133, 133)
                                                .addComponent(btnañadir))
                                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(txttamaño, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                        .addGap(15, 15, 15))))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(85, 85, 85)
                                .addComponent(recurso1, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(recurso2, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(recurso3, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(recurso4, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(12, 12, 12)
                        .addComponent(recurso5, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(85, 85, 85)
                        .addComponent(txtnombre, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(35, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addGap(29, 29, 29)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(txtnombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(txttamaño, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                    .addComponent(recurso5)
                    .addComponent(recurso4)
                    .addComponent(recurso3)
                    .addComponent(recurso2)
                    .addComponent(recurso1))
                .addGap(34, 34, 34)
                .addComponent(btnañadir)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btncontinuar)
                .addGap(16, 16, 16))
            .addGroup(layout.createSequentialGroup()
                .addGap(133, 133, 133)
                .addComponent(jLabel4)
                .addGap(151, 151, 151))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnañadirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnañadirActionPerformed


    }//GEN-LAST:event_btnañadirActionPerformed

    private void txtnombreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtnombreActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtnombreActionPerformed

    private void recurso1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_recurso1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_recurso1ActionPerformed

    private void recurso4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_recurso4ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_recurso4ActionPerformed

    private void txttamañoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txttamañoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txttamañoActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnañadir;
    private javax.swing.JButton btncontinuar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JRadioButton recurso1;
    private javax.swing.JRadioButton recurso2;
    private javax.swing.JRadioButton recurso3;
    private javax.swing.JRadioButton recurso4;
    private javax.swing.JRadioButton recurso5;
    private javax.swing.JTextField txtnombre;
    private javax.swing.JTextField txttamaño;
    // End of variables declaration//GEN-END:variables
}
