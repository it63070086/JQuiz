
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JTextField;


public class FillAnswerView extends javax.swing.JPanel {

    public FillAnswerView() {
        initComponents();
    }
    public FillAnswerView(String question, String answer) {
        initComponents();
        this.lbQuestion.setText(question);
        this.tfAnswer.setText("");
    }
    public JTextField getTfAnswer() {
        return tfAnswer;
    }

    public JLabel getLbQuestion() {
        return lbQuestion;
    }

    
    

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lbQuestion = new javax.swing.JLabel();
        jPanel4 = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        tfAnswer = new javax.swing.JTextField();

        lbQuestion.setText("Question");
        add(lbQuestion);

        tfAnswer.setText("jTextField1");
        tfAnswer.setPreferredSize(new java.awt.Dimension(280, 19));
        jPanel3.add(tfAnswer);

        jPanel4.add(jPanel3);

        add(jPanel4);
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JLabel lbQuestion;
    private javax.swing.JTextField tfAnswer;
    // End of variables declaration//GEN-END:variables
}
