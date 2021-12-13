
import javax.swing.JButton;
import javax.swing.JTextField;

public class AddCourseView extends javax.swing.JFrame {

    public AddCourseView() {
        initComponents();
        this.setDefaultCloseOperation(DISPOSE_ON_CLOSE);
    }
    public JTextField getTfCourseName() {
        return tfCourseName;
    }

    public JTextField getTfCourseScore() {
        return tfCourseScore;
    }

    public JButton getBtnCreateCourse() {
        return btnCreateCourse;
    }

    public JTextField getTfCourseExpire() {
        return tfCourseExpire;
    }

    public JTextField getTfCourseRelease() {
        return tfCourseRelease;
    }
    

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {
        java.awt.GridBagConstraints gridBagConstraints;

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        tfCourseName = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        tfCourseScore = new javax.swing.JTextField();
        btnCreateCourse = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        tfCourseRelease = new javax.swing.JTextField();
        tfCourseExpire = new javax.swing.JTextField();
        jDatePicker_Date1 = new net.sourceforge.jdatepicker.impl.JDatePicker_Date();
        jDatePicker_Date2 = new net.sourceforge.jdatepicker.impl.JDatePicker_Date();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setLayout(new java.awt.GridBagLayout());

        jLabel1.setText("Course Name");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.insets = new java.awt.Insets(0, 19, 0, 0);
        jPanel1.add(jLabel1, gridBagConstraints);

        tfCourseName.setText("jTextField1");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 0;
        jPanel1.add(tfCourseName, gridBagConstraints);

        jLabel2.setText("Course Score");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.insets = new java.awt.Insets(0, 19, 0, 0);
        jPanel1.add(jLabel2, gridBagConstraints);

        tfCourseScore.setText("jTextField2");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 1;
        jPanel1.add(tfCourseScore, gridBagConstraints);

        btnCreateCourse.setText("Create Course");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 4;
        jPanel1.add(btnCreateCourse, gridBagConstraints);

        jLabel3.setText("Course Release");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 2;
        gridBagConstraints.insets = new java.awt.Insets(0, 24, 0, 0);
        jPanel1.add(jLabel3, gridBagConstraints);

        jLabel4.setText("Course Expire");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 3;
        gridBagConstraints.insets = new java.awt.Insets(0, 24, 0, 0);
        jPanel1.add(jLabel4, gridBagConstraints);

        tfCourseRelease.setText("jTextField1");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 2;
        jPanel1.add(tfCourseRelease, gridBagConstraints);

        tfCourseExpire.setText("jTextField2");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 3;
        jPanel1.add(tfCourseExpire, gridBagConstraints);
        jPanel1.add(jDatePicker_Date1, new java.awt.GridBagConstraints());
        jPanel1.add(jDatePicker_Date2, new java.awt.GridBagConstraints());

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 635, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 303, Short.MAX_VALUE)
        );

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
            java.util.logging.Logger.getLogger(AddCourseView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(AddCourseView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(AddCourseView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(AddCourseView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new AddCourseView().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCreateCourse;
    private net.sourceforge.jdatepicker.impl.JDatePicker_Date jDatePicker_Date1;
    private net.sourceforge.jdatepicker.impl.JDatePicker_Date jDatePicker_Date2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTextField tfCourseExpire;
    private javax.swing.JTextField tfCourseName;
    private javax.swing.JTextField tfCourseRelease;
    private javax.swing.JTextField tfCourseScore;
    // End of variables declaration//GEN-END:variables
}
