import java.awt.*;
import java.awt.event.*;
public class QuizController implements ActionListener{
    private LoginView loginView = new LoginView();
    private RegView regView = new RegView();
    public QuizController(){
        loginView.setVisible(true);
        loginView.getBtnReg().addActionListener(this);
        regView.getBtnReg().addActionListener(this);
    }
    public static void main(String[] args) {
        new QuizController();
    }
    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource().equals(loginView.getBtnReg())){
            loginView.setVisible(false);
            regView.setVisible(true);
        }else{
            loginView.setVisible(true);
            regView.setVisible(false);
        }
        
    }
}
