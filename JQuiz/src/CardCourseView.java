
import javax.swing.JButton;
import javax.swing.JPanel;


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

    public JPanel getPanelBtn() {
        return panelBtn;
    }
    
    public JButton getBtnEnter() {
        return btnEnter;
    }

    public JButton getBtnRemove() {
        return btnRemove;
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
        panelBtn = new javax.swing.JPanel();
        btnEnter = new javax.swing.JButton();
        btnRemove = new javax.swing.JButton();

        setBackground(java.awt.Color.gray);
        setLayout(new java.awt.GridBagLayout());

        jLabel1.setText("Course Name : ");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.gridwidth = 2;
        add(jLabel1, gridBagConstraints);

        jLabel2.setText("Course Score : ");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.gridwidth = 2;
        add(jLabel2, gridBagConstraints);

        jLabel3.setText("Course Release : ");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 2;
        gridBagConstraints.gridwidth = 2;
        add(jLabel3, gridBagConstraints);

        jLabel4.setText("Course Expire : ");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 3;
        gridBagConstraints.gridwidth = 2;
        add(jLabel4, gridBagConstraints);

        jLabel5.setText("Course Owner : ");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 4;
        gridBagConstraints.gridwidth = 2;
        add(jLabel5, gridBagConstraints);

        panelBtn.setLayout(new java.awt.FlowLayout(java.awt.FlowLayout.RIGHT));

        btnEnter.setText("Enter");
        panelBtn.add(btnEnter);

        btnRemove.setText("Delete");
        panelBtn.add(btnRemove);

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 5;
        add(panelBtn, gridBagConstraints);
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnEnter;
    private javax.swing.JButton btnRemove;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel panelBtn;
    // End of variables declaration//GEN-END:variables
}
