
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
        kGradientPanel4 = new keeptoo.KGradientPanel();
        jPanel3 = new javax.swing.JPanel();
        cbA1 = new javax.swing.JCheckBox();
        cbB1 = new javax.swing.JCheckBox();
        cbC1 = new javax.swing.JCheckBox();
        cbD1 = new javax.swing.JCheckBox();
        kGradientPanel5 = new keeptoo.KGradientPanel();
        btnDelQuiz1 = new javax.swing.JButton();
        kGradientPanel6 = new keeptoo.KGradientPanel();
        btnEditQuiz1 = new javax.swing.JButton();
        tfQuestion1 = new javax.swing.JTextField();
        tfCBA1 = new javax.swing.JTextField();
        tfCBB1 = new javax.swing.JTextField();
        tfCBC1 = new javax.swing.JTextField();
        tfCBD1 = new javax.swing.JTextField();
        jPanel4 = new javax.swing.JPanel();
        kGradientPanel1 = new keeptoo.KGradientPanel();
        jPanel2 = new javax.swing.JPanel();
        kGradientPanel2 = new keeptoo.KGradientPanel();
        btnDelQuiz = new javax.swing.JButton();
        kGradientPanel3 = new keeptoo.KGradientPanel();
        btnEditQuiz = new javax.swing.JButton();
        tfQuestion = new javax.swing.JTextField();
        tfCBA = new javax.swing.JTextField();
        tfCBB = new javax.swing.JTextField();
        tfCBC = new javax.swing.JTextField();
        tfCBD = new javax.swing.JTextField();
        cbA = new javax.swing.JCheckBox();
        cbB = new javax.swing.JCheckBox();
        cbC = new javax.swing.JCheckBox();
        cbD = new javax.swing.JCheckBox();

        jPanel1.setMaximumSize(new java.awt.Dimension(1000, 1000));
        jPanel1.setMinimumSize(new java.awt.Dimension(435, 212));
        jPanel1.setLayout(new java.awt.GridBagLayout());

        kGradientPanel4.setkEndColor(new java.awt.Color(204, 204, 255));
        kGradientPanel4.setkStartColor(new java.awt.Color(255, 204, 204));
        kGradientPanel4.setLayout(new javax.swing.BoxLayout(kGradientPanel4, javax.swing.BoxLayout.LINE_AXIS));

        jPanel3.setBackground(new java.awt.Color(255, 255, 255));

        cbA1.setBackground(new java.awt.Color(204, 204, 255));
        cbA1.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        cbA1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbA1ActionPerformed(evt);
            }
        });

        cbB1.setBackground(new java.awt.Color(204, 204, 255));
        cbB1.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        cbB1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbB1ActionPerformed(evt);
            }
        });

        cbC1.setBackground(new java.awt.Color(204, 204, 255));
        cbC1.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        cbC1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbC1ActionPerformed(evt);
            }
        });

        cbD1.setBackground(new java.awt.Color(204, 204, 255));
        cbD1.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N

        kGradientPanel5.setkEndColor(new java.awt.Color(255, 204, 204));
        kGradientPanel5.setkGradientFocus(100);
        kGradientPanel5.setkStartColor(new java.awt.Color(204, 204, 255));

        btnDelQuiz1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        btnDelQuiz1.setForeground(new java.awt.Color(255, 255, 255));
        btnDelQuiz1.setText("DELETE");
        btnDelQuiz1.setBorder(null);
        btnDelQuiz1.setContentAreaFilled(false);
        btnDelQuiz1.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

        javax.swing.GroupLayout kGradientPanel5Layout = new javax.swing.GroupLayout(kGradientPanel5);
        kGradientPanel5.setLayout(kGradientPanel5Layout);
        kGradientPanel5Layout.setHorizontalGroup(
            kGradientPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(btnDelQuiz1, javax.swing.GroupLayout.DEFAULT_SIZE, 120, Short.MAX_VALUE)
        );
        kGradientPanel5Layout.setVerticalGroup(
            kGradientPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(btnDelQuiz1, javax.swing.GroupLayout.DEFAULT_SIZE, 36, Short.MAX_VALUE)
        );

        kGradientPanel6.setkEndColor(new java.awt.Color(204, 204, 255));
        kGradientPanel6.setkGradientFocus(100);
        kGradientPanel6.setkStartColor(new java.awt.Color(255, 204, 204));

        btnEditQuiz1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        btnEditQuiz1.setForeground(new java.awt.Color(255, 255, 255));
        btnEditQuiz1.setText("EDIT");
        btnEditQuiz1.setBorder(null);
        btnEditQuiz1.setContentAreaFilled(false);

        javax.swing.GroupLayout kGradientPanel6Layout = new javax.swing.GroupLayout(kGradientPanel6);
        kGradientPanel6.setLayout(kGradientPanel6Layout);
        kGradientPanel6Layout.setHorizontalGroup(
            kGradientPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(btnEditQuiz1, javax.swing.GroupLayout.DEFAULT_SIZE, 120, Short.MAX_VALUE)
        );
        kGradientPanel6Layout.setVerticalGroup(
            kGradientPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(btnEditQuiz1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        tfQuestion1.setBackground(new java.awt.Color(204, 204, 255));
        tfQuestion1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        tfQuestion1.setText("jTextField1");
        tfQuestion1.setBorder(null);

        tfCBA1.setBackground(new java.awt.Color(204, 204, 255));
        tfCBA1.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        tfCBA1.setText("jTextField2");
        tfCBA1.setBorder(null);

        tfCBB1.setBackground(new java.awt.Color(204, 204, 255));
        tfCBB1.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        tfCBB1.setText("jTextField3");
        tfCBB1.setBorder(null);
        tfCBB1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tfCBB1ActionPerformed(evt);
            }
        });

        tfCBC1.setBackground(new java.awt.Color(204, 204, 255));
        tfCBC1.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        tfCBC1.setText("jTextField4");
        tfCBC1.setBorder(null);

        tfCBD1.setBackground(new java.awt.Color(204, 204, 255));
        tfCBD1.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        tfCBD1.setText("jTextField5");
        tfCBD1.setBorder(null);

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(65, 65, 65)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(cbC1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(cbA1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(1, 1, 1)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(tfCBC1, javax.swing.GroupLayout.DEFAULT_SIZE, 91, Short.MAX_VALUE)
                            .addComponent(tfCBA1)))
                    .addComponent(kGradientPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(42, 42, 42)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(cbD1)
                        .addGap(1, 1, 1)
                        .addComponent(tfCBD1, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(cbB1)
                        .addGap(1, 1, 1)
                        .addComponent(tfCBB1, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(kGradientPanel6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(tfQuestion1)
                .addContainerGap())
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addComponent(tfQuestion1, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE, false)
                        .addComponent(cbB1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(cbA1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addComponent(tfCBA1)
                    .addComponent(tfCBB1))
                .addGap(20, 20, 20)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(cbD1, javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(cbC1))
                    .addComponent(tfCBD1)
                    .addComponent(tfCBC1))
                .addGap(18, 18, 18)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(kGradientPanel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(kGradientPanel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(0, 0, Short.MAX_VALUE))
        );

        kGradientPanel4.add(jPanel3);

        jPanel1.add(kGradientPanel4, new java.awt.GridBagConstraints());

        setMaximumSize(new java.awt.Dimension(1000, 1000));
        setMinimumSize(new java.awt.Dimension(435, 212));
        setLayout(new javax.swing.BoxLayout(this, javax.swing.BoxLayout.LINE_AXIS));

        jPanel4.setBackground(new java.awt.Color(255, 255, 255));

        kGradientPanel1.setkEndColor(new java.awt.Color(204, 204, 255));
        kGradientPanel1.setkStartColor(new java.awt.Color(255, 204, 204));

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));

        kGradientPanel2.setkEndColor(new java.awt.Color(204, 204, 255));
        kGradientPanel2.setkGradientFocus(100);
        kGradientPanel2.setkStartColor(new java.awt.Color(255, 204, 204));

        btnDelQuiz.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        btnDelQuiz.setForeground(new java.awt.Color(255, 255, 255));
        btnDelQuiz.setText("DELETE");
        btnDelQuiz.setBorder(null);
        btnDelQuiz.setContentAreaFilled(false);

        javax.swing.GroupLayout kGradientPanel2Layout = new javax.swing.GroupLayout(kGradientPanel2);
        kGradientPanel2.setLayout(kGradientPanel2Layout);
        kGradientPanel2Layout.setHorizontalGroup(
            kGradientPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(btnDelQuiz, javax.swing.GroupLayout.DEFAULT_SIZE, 121, Short.MAX_VALUE)
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
            .addComponent(btnEditQuiz, javax.swing.GroupLayout.DEFAULT_SIZE, 122, Short.MAX_VALUE)
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
                .addGap(86, 86, 86)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(kGradientPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(cbA, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(cbC, javax.swing.GroupLayout.Alignment.TRAILING))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(tfCBA)
                            .addComponent(tfCBC))))
                .addGap(30, 30, 30)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(kGradientPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(cbB, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(cbD, javax.swing.GroupLayout.Alignment.TRAILING))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(tfCBB)
                            .addComponent(tfCBD))))
                .addContainerGap(52, Short.MAX_VALUE))
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(tfQuestion)
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(tfQuestion, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(tfCBA)
                        .addComponent(cbA))
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(tfCBB)
                        .addComponent(cbB)))
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(tfCBD, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(16, 16, 16)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(tfCBC, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(cbC)))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(cbD)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 30, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(kGradientPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(kGradientPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );

        javax.swing.GroupLayout kGradientPanel1Layout = new javax.swing.GroupLayout(kGradientPanel1);
        kGradientPanel1.setLayout(kGradientPanel1Layout);
        kGradientPanel1Layout.setHorizontalGroup(
            kGradientPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(kGradientPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        kGradientPanel1Layout.setVerticalGroup(
            kGradientPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(kGradientPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(kGradientPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(kGradientPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        add(jPanel4);
    }// </editor-fold>//GEN-END:initComponents

    private void cbA1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbA1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cbA1ActionPerformed

    private void cbB1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbB1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cbB1ActionPerformed

    private void cbC1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbC1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cbC1ActionPerformed

    private void tfCBB1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tfCBB1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tfCBB1ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnDelQuiz;
    private javax.swing.JButton btnDelQuiz1;
    private javax.swing.JButton btnEditQuiz;
    private javax.swing.JButton btnEditQuiz1;
    private javax.swing.JCheckBox cbA;
    private javax.swing.JCheckBox cbA1;
    private javax.swing.JCheckBox cbB;
    private javax.swing.JCheckBox cbB1;
    private javax.swing.JCheckBox cbC;
    private javax.swing.JCheckBox cbC1;
    private javax.swing.JCheckBox cbD;
    private javax.swing.JCheckBox cbD1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private keeptoo.KGradientPanel kGradientPanel1;
    private keeptoo.KGradientPanel kGradientPanel2;
    private keeptoo.KGradientPanel kGradientPanel3;
    private keeptoo.KGradientPanel kGradientPanel4;
    private keeptoo.KGradientPanel kGradientPanel5;
    private keeptoo.KGradientPanel kGradientPanel6;
    private javax.swing.JTextField tfCBA;
    private javax.swing.JTextField tfCBA1;
    private javax.swing.JTextField tfCBB;
    private javax.swing.JTextField tfCBB1;
    private javax.swing.JTextField tfCBC;
    private javax.swing.JTextField tfCBC1;
    private javax.swing.JTextField tfCBD;
    private javax.swing.JTextField tfCBD1;
    private javax.swing.JTextField tfQuestion;
    private javax.swing.JTextField tfQuestion1;
    // End of variables declaration//GEN-END:variables
}
