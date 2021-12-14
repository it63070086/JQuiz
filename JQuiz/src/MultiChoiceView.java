
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class MultiChoiceView extends javax.swing.JPanel {

    /**
     * Creates new form EditChoiceView
     */
    public MultiChoiceView() {
        initComponents();
    }
    public MultiChoiceView(String question, String a, String b, String c, String d, String answer){
        initComponents();
        this.lbQuestion.setText(question);
        this.lbA.setText(a);
        this.lbB.setText(b);
        this.lbC.setText(c);
        this.lbD.setText(d);   
        this.cbA.setActionCommand("A");
        this.cbB.setActionCommand("B");
        this.cbC.setActionCommand("C");
        this.cbD.setActionCommand("D");
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

    public JLabel getLbA() {
        return lbA;
    }

    public JLabel getLbB() {
        return lbB;
    }

    public JLabel getLbC() {
        return lbC;
    }

    public JLabel getLbD() {
        return lbD;
    }

    public JLabel getLbQuestion() {
        return lbQuestion;
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {
        java.awt.GridBagConstraints gridBagConstraints;

        lbQuestion = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        cbA = new javax.swing.JCheckBox();
        cbC = new javax.swing.JCheckBox();
        cbB = new javax.swing.JCheckBox();
        cbD = new javax.swing.JCheckBox();
        lbA = new javax.swing.JLabel();
        lbB = new javax.swing.JLabel();
        lbC = new javax.swing.JLabel();
        lbD = new javax.swing.JLabel();

        lbQuestion.setText("jLabel1");
        add(lbQuestion);

        jPanel1.setPreferredSize(new java.awt.Dimension(300, 50));
        jPanel1.setLayout(new java.awt.GridBagLayout());
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.ipadx = 4;
        gridBagConstraints.ipady = 4;
        jPanel1.add(cbA, gridBagConstraints);
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.ipadx = 4;
        gridBagConstraints.ipady = 4;
        jPanel1.add(cbC, gridBagConstraints);
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 2;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.ipadx = 4;
        gridBagConstraints.ipady = 4;
        jPanel1.add(cbB, gridBagConstraints);
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 2;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.ipadx = 4;
        gridBagConstraints.ipady = 4;
        jPanel1.add(cbD, gridBagConstraints);

        lbA.setText("Choice A");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 0;
        jPanel1.add(lbA, gridBagConstraints);

        lbB.setText("jLabel1");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 3;
        gridBagConstraints.gridy = 0;
        jPanel1.add(lbB, gridBagConstraints);

        lbC.setText("jLabel1");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 1;
        jPanel1.add(lbC, gridBagConstraints);

        lbD.setText("jLabel1");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 3;
        gridBagConstraints.gridy = 1;
        jPanel1.add(lbD, gridBagConstraints);

        add(jPanel1);
    }// </editor-fold>//GEN-END:initComponents

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JCheckBox cbA;
    private javax.swing.JCheckBox cbB;
    private javax.swing.JCheckBox cbC;
    private javax.swing.JCheckBox cbD;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel lbA;
    private javax.swing.JLabel lbB;
    private javax.swing.JLabel lbC;
    private javax.swing.JLabel lbD;
    private javax.swing.JLabel lbQuestion;
    // End of variables declaration//GEN-END:variables
}
