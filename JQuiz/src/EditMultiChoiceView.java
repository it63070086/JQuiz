
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JTextField;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author jessa
 */
public class EditMultiChoiceView extends javax.swing.JPanel {

    /**
     * Creates new form CardQuizMultiAdmin
     */
    public EditMultiChoiceView() {
        initComponents();
    }
    public EditMultiChoiceView(String question, String a, String b, String c, String d, String answer){
        initComponents();
        this.tfQuestion.setText(question);
        this.tfCBA.setText(a);
        this.tfCBB.setText(b);
        this.tfCBC.setText(c);
        this.tfCBD.setText(d);   
    }

    public JButton getBtnDelQuiz() {
        return btnDelQuiz;
    }

    public JButton getBtnEditQuiz() {
        return btnEditQuiz;
    }

    public JCheckBox getCbA() {
        return cbA;
    }

    public JCheckBox getCbB() {
        return cbB;
    }

    public JCheckBox getCbC() {
        return cbC;
    }

    public JCheckBox getCbD() {
        return cbD;
    }

    public JTextField getTfCBA() {
        return tfCBA;
    }

    public JTextField getTfCBB() {
        return tfCBB;
    }

    public JTextField getTfCBC() {
        return tfCBC;
    }

    public JTextField getTfCBD() {
        return tfCBD;
    }

    public JTextField getTfQuestion() {
        return tfQuestion;
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        kGradientPanel1 = new keeptoo.KGradientPanel();
        jPanel2 = new javax.swing.JPanel();
        cbA = new javax.swing.JCheckBox();
        cbB = new javax.swing.JCheckBox();
        cbC = new javax.swing.JCheckBox();
        cbD = new javax.swing.JCheckBox();
        kGradientPanel2 = new keeptoo.KGradientPanel();
        btnDelQuiz = new javax.swing.JButton();
        kGradientPanel3 = new keeptoo.KGradientPanel();
        btnEditQuiz = new javax.swing.JButton();
        tfQuestion = new javax.swing.JTextField();
        tfCBA = new javax.swing.JTextField();
        tfCBB = new javax.swing.JTextField();
        tfCBC = new javax.swing.JTextField();
        tfCBD = new javax.swing.JTextField();

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setForeground(new java.awt.Color(255, 255, 255));

        kGradientPanel1.setkEndColor(new java.awt.Color(204, 204, 255));
        kGradientPanel1.setkStartColor(new java.awt.Color(255, 204, 204));

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));

        cbA.setBackground(new java.awt.Color(204, 204, 255));
        cbA.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        cbA.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbAActionPerformed(evt);
            }
        });

        cbB.setBackground(new java.awt.Color(204, 204, 255));
        cbB.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        cbB.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbBActionPerformed(evt);
            }
        });

        cbC.setBackground(new java.awt.Color(204, 204, 255));
        cbC.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        cbC.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbCActionPerformed(evt);
            }
        });

        cbD.setBackground(new java.awt.Color(204, 204, 255));
        cbD.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N

        kGradientPanel2.setkEndColor(new java.awt.Color(255, 204, 204));
        kGradientPanel2.setkGradientFocus(100);
        kGradientPanel2.setkStartColor(new java.awt.Color(204, 204, 255));

        btnDelQuiz.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        btnDelQuiz.setForeground(new java.awt.Color(255, 255, 255));
        btnDelQuiz.setText("DELETE");
        btnDelQuiz.setBorder(null);
        btnDelQuiz.setContentAreaFilled(false);
        btnDelQuiz.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

        javax.swing.GroupLayout kGradientPanel2Layout = new javax.swing.GroupLayout(kGradientPanel2);
        kGradientPanel2.setLayout(kGradientPanel2Layout);
        kGradientPanel2Layout.setHorizontalGroup(
            kGradientPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(btnDelQuiz, javax.swing.GroupLayout.DEFAULT_SIZE, 120, Short.MAX_VALUE)
        );
        kGradientPanel2Layout.setVerticalGroup(
            kGradientPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(btnDelQuiz, javax.swing.GroupLayout.DEFAULT_SIZE, 36, Short.MAX_VALUE)
        );

        kGradientPanel3.setkEndColor(new java.awt.Color(204, 204, 255));
        kGradientPanel3.setkGradientFocus(100);
        kGradientPanel3.setkStartColor(new java.awt.Color(255, 204, 204));

        btnEditQuiz.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        btnEditQuiz.setForeground(new java.awt.Color(255, 255, 255));
        btnEditQuiz.setText("EDIT");
        btnEditQuiz.setBorder(null);
        btnEditQuiz.setContentAreaFilled(false);

        javax.swing.GroupLayout kGradientPanel3Layout = new javax.swing.GroupLayout(kGradientPanel3);
        kGradientPanel3.setLayout(kGradientPanel3Layout);
        kGradientPanel3Layout.setHorizontalGroup(
            kGradientPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(btnEditQuiz, javax.swing.GroupLayout.DEFAULT_SIZE, 120, Short.MAX_VALUE)
        );
        kGradientPanel3Layout.setVerticalGroup(
            kGradientPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(btnEditQuiz, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        tfQuestion.setBackground(new java.awt.Color(204, 204, 255));
        tfQuestion.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        tfQuestion.setText("jTextField1");
        tfQuestion.setBorder(null);

        tfCBA.setBackground(new java.awt.Color(204, 204, 255));
        tfCBA.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        tfCBA.setText("jTextField2");
        tfCBA.setBorder(null);

        tfCBB.setBackground(new java.awt.Color(204, 204, 255));
        tfCBB.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        tfCBB.setText("jTextField3");
        tfCBB.setBorder(null);
        tfCBB.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tfCBBActionPerformed(evt);
            }
        });

        tfCBC.setBackground(new java.awt.Color(204, 204, 255));
        tfCBC.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        tfCBC.setText("jTextField4");
        tfCBC.setBorder(null);

        tfCBD.setBackground(new java.awt.Color(204, 204, 255));
        tfCBD.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        tfCBD.setText("jTextField5");
        tfCBD.setBorder(null);

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(65, 65, 65)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(cbC, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(cbA, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(1, 1, 1)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(tfCBC, javax.swing.GroupLayout.DEFAULT_SIZE, 91, Short.MAX_VALUE)
                            .addComponent(tfCBA)))
                    .addComponent(kGradientPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(42, 42, 42)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(cbD)
                        .addGap(1, 1, 1)
                        .addComponent(tfCBD, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(cbB)
                        .addGap(1, 1, 1)
                        .addComponent(tfCBB, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(kGradientPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(0, 64, Short.MAX_VALUE))
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(tfQuestion)
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addComponent(tfQuestion, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE, false)
                        .addComponent(cbB, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(cbA, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addComponent(tfCBA)
                    .addComponent(tfCBB))
                .addGap(20, 20, 20)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(cbD, javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(cbC))
                    .addComponent(tfCBD)
                    .addComponent(tfCBC))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(kGradientPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(kGradientPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(0, 21, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout kGradientPanel1Layout = new javax.swing.GroupLayout(kGradientPanel1);
        kGradientPanel1.setLayout(kGradientPanel1Layout);
        kGradientPanel1Layout.setHorizontalGroup(
            kGradientPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, kGradientPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        kGradientPanel1Layout.setVerticalGroup(
            kGradientPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(kGradientPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(kGradientPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(0, 0, 0))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(kGradientPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
    }// </editor-fold>//GEN-END:initComponents

    private void cbAActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbAActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cbAActionPerformed

    private void cbCActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbCActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cbCActionPerformed

    private void cbBActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbBActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cbBActionPerformed

    private void tfCBBActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tfCBBActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tfCBBActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnDelQuiz;
    private javax.swing.JButton btnEditQuiz;
    private javax.swing.JCheckBox cbA;
    private javax.swing.JCheckBox cbB;
    private javax.swing.JCheckBox cbC;
    private javax.swing.JCheckBox cbD;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private keeptoo.KGradientPanel kGradientPanel1;
    private keeptoo.KGradientPanel kGradientPanel2;
    private keeptoo.KGradientPanel kGradientPanel3;
    private javax.swing.JTextField tfCBA;
    private javax.swing.JTextField tfCBB;
    private javax.swing.JTextField tfCBC;
    private javax.swing.JTextField tfCBD;
    private javax.swing.JTextField tfQuestion;
    // End of variables declaration//GEN-END:variables
}
