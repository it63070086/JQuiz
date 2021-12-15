
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

public class ScoreView extends javax.swing.JFrame {
    private DefaultTableModel tableModel;
    public ScoreView() {
        initComponents();
        String col[] = {"Username", "Score", "Submit Time"};
        tableModel  = new DefaultTableModel(col, 0);
    }
    public DefaultTableModel getTableModel() {
        return tableModel;
    }

    public JButton getBtnCourse() {
        return btnCourse;
    }

    public JLabel getLbCourseName() {
        return lbCourseName;
    }

    public JLabel getLbUserName() {
        return lbUserName;
    }

    public JTable getTbScore() {
        return tbScore;
    }

    public JButton getBtnExportCSV() {
        return btnExportCSV;
    }

    public JButton getBtnExportExcel() {
        return btnExportExcel;
    }
    
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        lbUserName = new javax.swing.JLabel();
        btnCourse = new javax.swing.JButton();
        btnExportExcel = new javax.swing.JButton();
        btnExportCSV = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        lbCourseName = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tbScore = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setLayout(new java.awt.FlowLayout(java.awt.FlowLayout.CENTER, 5, 30));

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("JQuiz");
        jPanel1.add(jLabel1);

        lbUserName.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        lbUserName.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbUserName.setText("Thiraphop Phokied");
        jPanel1.add(lbUserName);

        btnCourse.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        btnCourse.setText("Course");
        btnCourse.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCourseActionPerformed(evt);
            }
        });
        jPanel1.add(btnCourse);

        btnExportExcel.setText("Export Excel");
        jPanel1.add(btnExportExcel);

        btnExportCSV.setText("Export CSV");
        jPanel1.add(btnExportCSV);

        jPanel2.setLayout(new java.awt.BorderLayout());

        lbCourseName.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        lbCourseName.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbCourseName.setText("Problem Solving in Information Technology 2021 (IT) ");
        jPanel2.add(lbCourseName, java.awt.BorderLayout.PAGE_START);

        jPanel3.setMinimumSize(new java.awt.Dimension(50, 26));
        jPanel3.setLayout(new java.awt.CardLayout());

        jScrollPane1.setPreferredSize(new java.awt.Dimension(600, 400));

        tbScore.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane1.setViewportView(tbScore);

        jPanel3.add(jScrollPane1, "card2");

        jPanel2.add(jPanel3, java.awt.BorderLayout.CENTER);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, 820, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 400, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, 376, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnCourseActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCourseActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnCourseActionPerformed

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
            java.util.logging.Logger.getLogger(ScoreView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ScoreView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ScoreView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ScoreView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ScoreView().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCourse;
    private javax.swing.JButton btnExportCSV;
    private javax.swing.JButton btnExportExcel;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lbCourseName;
    private javax.swing.JLabel lbUserName;
    private javax.swing.JTable tbScore;
    // End of variables declaration//GEN-END:variables
}
