
import javax.swing.JButton;


public class CardCourseView extends javax.swing.JPanel {

    public CardCourseView() {
        initComponents();
    }
    public CardCourseView(int id, String name, int score, String release, String expire, String owner){
        initComponents();
        jLabel1.setText("Course Name : "+name);
        jLabel2.setText("Course Score : "+score);
        jLabel3.setText("Course Release : "+release);
        jLabel4.setText("Course Expire : "+expire);
        jLabel5.setText("Course Owner : "+owner);
    }

    public JButton getBtnEnter() {
        return btnEnter;
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {
        java.awt.GridBagConstraints gridBagConstraints;

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        btnEnter = new javax.swing.JButton();

        setBackground(java.awt.Color.gray);
        setLayout(new java.awt.GridBagLayout());

        jLabel1.setText("Course Name : ");
        add(jLabel1, new java.awt.GridBagConstraints());

        jLabel2.setText("Course Score : ");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 1;
        add(jLabel2, gridBagConstraints);

        jLabel3.setText("Course Release : ");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 2;
        add(jLabel3, gridBagConstraints);

        jLabel4.setText("Course Expire : ");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 3;
        add(jLabel4, gridBagConstraints);

        jLabel5.setText("Course Owner : ");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 4;
        add(jLabel5, gridBagConstraints);

        btnEnter.setText("Enter");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 5;
        add(btnEnter, gridBagConstraints);
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnEnter;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    // End of variables declaration//GEN-END:variables
}
