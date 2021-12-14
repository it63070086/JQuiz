import java.util.*;
import javax.swing.JOptionPane;
import java.sql.*;
import java.awt.event.*;
import java.util.logging.Level;
import java.util.logging.Logger;
public class QuizController implements ActionListener, KeyListener, WindowListener, MouseListener{
    private ArrayList<Course> course = new ArrayList<>();
    private LoginView loginView = new LoginView();
    private RegView regView = new RegView();
    private MainView mainView = new MainView();
    private CourseModel courseModel = new CourseModel();
    private CardCourseModel cardCourse = new CardCourseModel();
    private AdminMainView adminMainView = new AdminMainView();
    private AllQuizView allQuizView = new AllQuizView();
    private AddCourseView addCourseView = new AddCourseView();
    private QuizModel quizModel = new QuizModel();
    private CourseView courseView = new CourseView();
    private AddQuizView addQuizView = new AddQuizView();
    private CardQuizModel cardQuiz = new CardQuizModel();
    private QuizView quizView = new QuizView();
    private SubmittedModel submittedModel = new SubmittedModel();
    private int courseIdCurrent = 0;
    private int courseIndexCurrent = 0;
    private int lastestId = 0;
    private Connection con = null;
    private ResultSet rs = null;
    private PreparedStatement pst = null;
    private String userRoleCurrent = "Student";
    private String userNameCurrent = "NOT FOUND CURRENT USER";
    public void ShowDataToForm(){
        String selectSql = "SELECT * FROM course";
        try {
            pst = con.prepareStatement(selectSql);
            rs = pst.executeQuery();
        } catch (SQLException ex) {
            Logger.getLogger(QuizController.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    public QuizController(){
        con = Connect.ConnectDB();
        loginView.setVisible(true);
        loginView.setLocationRelativeTo(null);
//        addevent
        quizView.getBtnCourse().addActionListener(this);
        addCourseView.addWindowListener(this);
        loginView.getBtnReg().addActionListener(this);
        regView.getBtnReg().addActionListener(this);
        loginView.getBtnLogin().addMouseListener(this);
        regView.getTfEmail().addKeyListener(this);
        mainView.addWindowListener(this);
        adminMainView.addWindowListener(this);
        adminMainView.getBtnAddCourse().addActionListener(this);
        addCourseView.getBtnCreateCourse().addActionListener(this);
        adminMainView.getBtnCourse().addActionListener(this);
        mainView.getBtnCourse().addActionListener(this);
        courseView.getBtnCourse().addActionListener(this);
        courseView.getBtnAllQuiz().addActionListener(this);
        allQuizView.getBtnAddQuiz().addActionListener(this);
        addQuizView.addWindowListener(this);
        addQuizView.getBtnSave1().addActionListener(this);
        addQuizView.getBtnSave2().addActionListener(this);
        addQuizView.getBtnSave3().addActionListener(this);
        allQuizView.getBtnCourse().addActionListener(this);
        quizView.getBtnSubmit().addActionListener(this);
        allQuizView.addWindowListener(this);
        
    }   
    public static void main(String[] args) {
        new QuizController();
    }
    public void reAdminMainView(){
        adminMainView.getCardPanel().removeAll();
        adminMainView.getCardPanel().repaint();
        courseModel.load(quizModel);
        course = courseModel.getCourse();
        cardCourse.getCardCourse().clear();
        for (int i=0; i < course.size(); i++){
            cardCourse.getCardCourse().add(new CardCourseView(course.get(i).getCourseID(),
                    course.get(i).getCourseName(),
                    course.get(i).getCourseScore(),
                    course.get(i).getCourseRelease(),
                    course.get(i).getCourseExpire(),
                    course.get(i).getCourseOwner()));
            adminMainView.getCardPanel().add(cardCourse.getCardCourse().get(i));
            cardCourse.getCardCourse().get(i).getBtnEnter().addActionListener(this);
            cardCourse.getCardCourse().get(i).getBtnRemove().addActionListener(this);
            if (course.get(i).getCourseID() > lastestId){
                lastestId = course.get(i).getCourseID();
            }
        }
        adminMainView.setVisible(true);
        adminMainView.setLocationRelativeTo(null);
    }
//    quiz all
    public void reQuiz(){
        quizView.getCardPanel().removeAll();
        quizView.getCardPanel().repaint();
        ArrayList<Quiz> allQuiz = quizModel.loadData(courseIdCurrent);
        cardQuiz.getCardQuiz().clear();
        for (int i=0; i<allQuiz.size(); i++){
            System.out.println(cardQuiz.getCardQuiz());
            switch (allQuiz.get(i).getType()) {
                case "Choice":
                    Choice choice = ((Choice)allQuiz.get(i));
                    cardQuiz.getCardQuiz().add(new ChoiceView(((Choice)allQuiz.get(i)).getQuestion(),
                            choice.getChoiceA(),
                            choice.getChoiceB(),
                            choice.getChoiceC(),
                            choice.getChoiceD(),
                            choice.getAnswer()));
                    quizView.getCardPanel().add(((ChoiceView)cardQuiz.getCardQuiz().get(i)));
                    quizView.getCardPanel().setVisible(true);
                    System.out.println("Choice Maa");
                    break;
                case "MultipleChoice":
                    MultipleChoice multiChoice = ((MultipleChoice)allQuiz.get(i));
                    cardQuiz.getCardQuiz().add(new MultiChoiceView(((MultipleChoice)allQuiz.get(i)).getQuestion(),
                            multiChoice.getChoiceA(),
                            multiChoice.getChoiceB(),
                            multiChoice.getChoiceC(),
                            multiChoice.getChoiceD(),
                            multiChoice.getAnswer()));
                    quizView.getCardPanel().add(((MultiChoiceView)cardQuiz.getCardQuiz().get(i)));
                    quizView.getCardPanel().setVisible(true);
                    break;
                default:
                    FillAnswer fillAnswer = ((FillAnswer)allQuiz.get(i));
                    cardQuiz.getCardQuiz().add(new FillAnswerView(((FillAnswer)allQuiz.get(i)).getQuestion(),
                            fillAnswer.getAnswer()));
                    quizView.getCardPanel().add(((FillAnswerView)cardQuiz.getCardQuiz().get(i)));
                    quizView.getCardPanel().setVisible(true);
                    break;
            }
        }
        
    }
    public void reAdminQuiz(){
        allQuizView.getCardPanel().removeAll();
        allQuizView.getCardPanel().repaint();
        ArrayList<Quiz> allQuiz = quizModel.loadData(courseIdCurrent);
        System.out.println(courseIdCurrent+"id");
        System.out.println(courseIndexCurrent+"index");
        System.out.println(allQuiz + " ReAdminAllQuiz");
        cardQuiz.getCardQuiz().clear();
        for (int i=0; i < allQuiz.size(); i++){
//            Choice Fetch
            switch (allQuiz.get(i).getType()) {
                case "Choice":
                    Choice choice = ((Choice)allQuiz.get(i));
                    cardQuiz.getCardQuiz().add(new EditChoiceView(((Choice)allQuiz.get(i)).getQuestion(),
                            choice.getChoiceA(),
                            choice.getChoiceB(),
                            choice.getChoiceC(),
                            choice.getChoiceD(),
                            choice.getAnswer()));
                    EditChoiceView editChoiceView = ((EditChoiceView)cardQuiz.getCardQuiz().get(i));
                    editChoiceView.getBtnEditQuiz().addActionListener(this);
                    editChoiceView.getBtnDelQuiz().addActionListener(this);
                    System.out.println(choice.getAnswer());
                    if (choice.getAnswer().equals("A")){
                        editChoiceView.getRbtnA().setSelected(true);
                    }else if (choice.getAnswer().equals("B")){
                        editChoiceView.getRbtnB().setSelected(true);
                    }else if (choice.getAnswer().equals("C")){
                        editChoiceView.getRbtnC().setSelected(true);
                    }else if (choice.getAnswer().equals("D")){
                        editChoiceView.getRbtnD().setSelected(true);
                    }
                    allQuizView.getCardPanel().add(((EditChoiceView)cardQuiz.getCardQuiz().get(i)));
                    allQuizView.getCardPanel().setVisible(true);
//            MultipleChoice Fetch
                    break;
                case "MultipleChoice":
                    MultipleChoice multiChoice = ((MultipleChoice)allQuiz.get(i));
                    cardQuiz.getCardQuiz().add(new EditMultiChoiceView(((MultipleChoice)allQuiz.get(i)).getQuestion(),
                            multiChoice.getChoiceA(),
                            multiChoice.getChoiceB(),
                            multiChoice.getChoiceC(),
                            multiChoice.getChoiceD(),
                            multiChoice.getAnswer()));
                    EditMultiChoiceView editMultiChoiceView = ((EditMultiChoiceView)cardQuiz.getCardQuiz().get(i));
                    editMultiChoiceView.getBtnEditQuiz().addActionListener(this);
                    editMultiChoiceView.getBtnDelQuiz().addActionListener(this);
                    System.out.println(multiChoice.getAnswer());
                    if (multiChoice.getAnswer().contains("A")){
                        editMultiChoiceView.getCbA().setSelected(true);
                    }   if (multiChoice.getAnswer().contains("B")){
                        editMultiChoiceView.getCbB().setSelected(true);
                    }   if (multiChoice.getAnswer().contains("C")){
                        editMultiChoiceView.getCbC().setSelected(true);
                    }   if (multiChoice.getAnswer().contains("D")){
                        editMultiChoiceView.getCbD().setSelected(true);
                    }   
                    allQuizView.getCardPanel().add(((EditMultiChoiceView)cardQuiz.getCardQuiz().get(i)));
                    allQuizView.getCardPanel().setVisible(true);
//                FileAnswer Fetch
                    break;
                default:
                    FillAnswer fillAnswer = ((FillAnswer)allQuiz.get(i));
                    cardQuiz.getCardQuiz().add(new EditFillAnswerView(((FillAnswer)allQuiz.get(i)).getQuestion(),
                            fillAnswer.getAnswer()));
                    EditFillAnswerView editFillAnswerView = ((EditFillAnswerView)cardQuiz.getCardQuiz().get(i));
                    editFillAnswerView.getBtnEditQuiz().addActionListener(this);
                    editFillAnswerView.getBtnDelQuiz().addActionListener(this);
                    allQuizView.getCardPanel().add(((EditFillAnswerView)cardQuiz.getCardQuiz().get(i)));
                    allQuizView.getCardPanel().setVisible(true);
                    break;
            }
        }
        allQuizView.setVisible(true);
        allQuizView.setLocationRelativeTo(null);
    }
    public void reMainView(){
        mainView.getCardPanel().removeAll();
        courseModel.load(quizModel);
        course = courseModel.getCourse();
        for (int i=0; i<course.size(); i++){
            cardCourse.getCardCourse().add(new CardCourseView(course.get(i).getCourseID(),course.get(i).getCourseName(), course.get(i).getCourseScore(), course.get(i).getCourseRelease(), course.get(i).getCourseExpire(), course.get(i).getCourseOwner()));
            mainView.getCardPanel().add(cardCourse.getCardCourse().get(i));
            cardCourse.getCardCourse().get(i).getBtnRemove().setVisible(false);
            cardCourse.getCardCourse().get(i).getBtnEnter().addActionListener(this);
            mainView.setVisible(true);
            mainView.setLocationRelativeTo(null);
        }
        
    }
//    Press BTN
    @Override
    public void actionPerformed(ActionEvent e) {
//        Show AddCourse
        if (e.getSource().equals(adminMainView.getBtnAddCourse())){
            adminMainView.setEnabled(false);
            addCourseView.setVisible(true);
            addCourseView.setLocationRelativeTo(null);
        }
            ArrayList<Course> data = courseModel.getCourse();
//            Create Course
        if (e.getSource().equals(addCourseView.getBtnCreateCourse())){
            
            data.add(new Course(lastestId+1, 
                    addCourseView.getTfCourseName().getText(),
                    Integer.parseInt(addCourseView.getTfCourseScore().getText()),
                    addCourseView.getTfCourseRelease().getText(), 
                    addCourseView.getTfCourseExpire().getText(),
                    userNameCurrent,
                    
                    new QuizModel(lastestId+1).getQuiz()));
            courseModel.save(addCourseView.getTfCourseName().getText(), 
                    Integer.parseInt(addCourseView.getTfCourseScore().getText()),
                    addCourseView.getTfCourseRelease().getText(),
                    addCourseView.getTfCourseExpire().getText(),
                    userNameCurrent);
                    reAdminMainView();
                    addCourseView.dispose();
                    adminMainView.setEnabled(true);
                    submittedModel.createSubmitted(courseIdCurrent);
        }
//        Login WIth User
        if ((this.userRoleCurrent.equals("Student"))&& 
                (!e.getSource().equals(adminMainView.getBtnAddCourse())) && 
                (!e.getSource().equals(adminMainView.getBtnCourse())) &&
                (!e.getSource().equals(courseView.getBtnAllQuiz())) &&
                (!e.getSource().equals(allQuizView.getBtnAddQuiz())) &&
                (!e.getSource().equals(addQuizView.getBtnSave1())) &&
                (!e.getSource().equals(addQuizView.getBtnSave2())) &&
                (!e.getSource().equals(addQuizView.getBtnSave3())) &&
                (!e.getSource().equals(addCourseView.getBtnCreateCourse()))){
            for (int i=0; i < cardCourse.getCardCourse().size(); i++){
                if (e.getSource().equals(cardCourse.getCardCourse().get(i).getBtnEnter())){
                  courseView.setVisible(true);
                    courseView.setLocationRelativeTo(null);
                    courseView.getLbCourseName().setText(course.get(i).getCourseName());
                    courseView.getLbUserName().setText(userNameCurrent);
                    courseIdCurrent = course.get(i).getCourseID();
                    courseIndexCurrent = i;
                }
            }
        }
//        Login With Admin
        if ((this.userRoleCurrent.equals("Admin")) && 
                (!e.getSource().equals(adminMainView.getBtnAddCourse())) && 
                (!e.getSource().equals(adminMainView.getBtnCourse())) &&
                (!e.getSource().equals(courseView.getBtnAllQuiz())) &&
                (!e.getSource().equals(allQuizView.getBtnAddQuiz())) &&
                (!e.getSource().equals(addQuizView.getBtnSave1())) &&
                (!e.getSource().equals(addQuizView.getBtnSave2())) &&
                (!e.getSource().equals(addQuizView.getBtnSave3())) &&
                (!e.getSource().equals(addCourseView.getBtnCreateCourse()))){
            int checkEvent = 0;
            String state = "btnNull";
//&&           
            ArrayList<CardCourseView> tmp = new ArrayList<>(cardCourse.getCardCourse());
            for (int i=0; i < cardCourse.getCardCourse().size(); i++){
                if (e.getSource().equals(cardCourse.getCardCourse().get(i).getBtnEnter())){
                    courseView.setVisible(true);
                    courseView.setLocationRelativeTo(null);
                    courseView.getLbCourseName().setText(course.get(i).getCourseName());
                    courseView.getLbUserName().setText(userNameCurrent);
                    state = "btnEnter";
                    courseIdCurrent = course.get(i).getCourseID();
                    courseIndexCurrent = i;
                    checkEvent = 1;
                }
                if (e.getSource().equals(cardCourse.getCardCourse().get(i).getBtnRemove())){
                    int x = JOptionPane.showConfirmDialog(null, "Are you sure to delete this course", "choose one", JOptionPane.YES_NO_OPTION);
                    if (x == 0){
                        tmp.remove(cardCourse.getCardCourse().get(i));
                        courseModel.delete(course.get(i).getCourseID());
                        quizModel.deleteData(course.get(i).getCourseID());
                        state = "btnRemove";
                        checkEvent = 1;
                    }
                    
                }
            }
            
            if ((state.equals("btnRemove"))){
                cardCourse.getCardCourse().clear();
                cardCourse.getCardCourse().addAll(tmp);
                reAdminMainView();
            }else if(state.equals("btnNull")){}
            else{
                adminMainView.setVisible(false);
            }
            if (checkEvent == 0){
                System.out.println("test");
                ArrayList<Quiz> allQuiz = quizModel.loadData(courseIdCurrent);
                ArrayList<Quiz> allQuizTmp = new ArrayList<>(allQuiz);
                for (int i=0; i < allQuiz.size(); i++){
                    
                    if (allQuiz.get(i).getType().equals("Choice")){
                        EditChoiceView editChoiceView = ((EditChoiceView)cardQuiz.getCardQuiz().get(i));
                        Choice choice = ((Choice)allQuiz.get(i));
                        if (e.getSource().equals(((EditChoiceView)cardQuiz.getCardQuiz().get(i)).getBtnDelQuiz())){
                            allQuizTmp.remove(i);
                        }
                        String answer = "null";
                        if (e.getSource().equals(((EditChoiceView)cardQuiz.getCardQuiz().get(i)).getBtnEditQuiz())){
                            if (editChoiceView.getRbtnA().isSelected()){
                                answer = "A";
                            }else if (editChoiceView.getRbtnB().isSelected()){
                                answer = "B";
                            }else if (editChoiceView.getRbtnC().isSelected()){
                                answer = "C";
                            }else if (editChoiceView.getRbtnD().isSelected()){
                                answer = "D";
                            }
                            allQuizTmp.set(i, new Choice(i+1, 
                                    editChoiceView.getTfQuestion().getText(), 
                                    editChoiceView.getTfChoiceA().getText(),
                                    editChoiceView.getTfChoiceB().getText(),
                                    editChoiceView.getTfChoiceC().getText(), 
                                    editChoiceView.getTfChoiceD().getText(), 
                                    answer, 
                                    "Choice"));
                        }
                    }
                    if (allQuiz.get(i).getType().equals("MultipleChoice")){
                        EditMultiChoiceView editMultiChoiceView = ((EditMultiChoiceView)cardQuiz.getCardQuiz().get(i));
                        if (e.getSource().equals(((EditMultiChoiceView)cardQuiz.getCardQuiz().get(i)).getBtnDelQuiz())){
                            allQuizTmp.remove(i);
                        }
                        if (e.getSource().equals(((EditMultiChoiceView)cardQuiz.getCardQuiz().get(i)).getBtnEditQuiz())){
                            String answer = "";
                            if (editMultiChoiceView.getCbA().isSelected()){
                                answer += "A";
                            }else if (editMultiChoiceView.getCbB().isSelected()){
                                answer += "B";
                            }else if (editMultiChoiceView.getCbC().isSelected()){
                                answer += "C";
                            }else if (editMultiChoiceView.getCbD().isSelected()){
                                answer += "D";
                            }
                            allQuizTmp.set(i, new MultipleChoice(i+1, 
                                    editMultiChoiceView.getTfQuestion().getText(), 
                                    editMultiChoiceView.getTfCBA().getText(),
                                    editMultiChoiceView.getTfCBA().getText(),
                                    editMultiChoiceView.getTfCBA().getText(), 
                                    editMultiChoiceView.getTfCBA().getText(), 
                                    answer,
                                    "MultipleChoice"));
                        }
                    }
                    if (allQuiz.get(i).getType().equals("FillAnswer")){
                        EditFillAnswerView editFillAnswerView = ((EditFillAnswerView)cardQuiz.getCardQuiz().get(i));
                        if (e.getSource().equals(((EditFillAnswerView)cardQuiz.getCardQuiz().get(i)).getBtnDelQuiz())){
                            allQuizTmp.remove(i);
                        }
                        if (e.getSource().equals(((EditFillAnswerView)cardQuiz.getCardQuiz().get(i)).getBtnEditQuiz())){
                            allQuizTmp.set(i, new FillAnswer(i+1, editFillAnswerView.getTfQuestion().getText(), editFillAnswerView.getTfAnswer().getText(),"FillAnswer"));
                        }
                    }
                }
                System.out.println("WIll Save");
                System.out.println(allQuizTmp + ": TMP : Quiz");
                quizModel.saveData(courseIdCurrent, allQuizTmp);
                reAdminQuiz();
                
            }
            
        }
//        Register Login View
        if (e.getSource().equals(loginView.getBtnReg())){
            loginView.setVisible(false);
            regView.setVisible(true);
            regView.setLocationRelativeTo(null);
        }
//        Submit Register View
        if (e.getSource().equals(regView.getBtnReg())){
            String username = regView.getTfUsername().getText();
            String password = regView.getTfPassword().getText();
            String fullname = regView.getTfFirstname().getText()+" "+regView.getTfLastname().getText();
            String email = regView.getTfEmail().getText();
            String findSql = "SELECT userName, userPassword FROM user WHERE userName = '"+username+"' OR userEmail = '"+email+"'";
            String insertSql = "INSERT INTO user (userName, userPassword, userFullname, UserEmail, userRole) VALUES (?, ?, ?, ?, ?)";
            try {
                pst = con.prepareStatement(findSql);
                rs = pst.executeQuery();
                if (rs.next() == true){
                    JOptionPane.showMessageDialog(null, "Already User Or Email", "Duplicate Information", JOptionPane.WARNING_MESSAGE);
                }
                //                  Valid input check By toenTeen
                else if("".equals(username) || "".equals(password) || "".equals(fullname) || "".equals(email)){
                    JOptionPane.showMessageDialog(null, "Empty Informatin !!", "Empty Information", JOptionPane.WARNING_MESSAGE);
                }
                else if(!regView.getTfEmail().getText().contains("@")){
                    JOptionPane.showMessageDialog(null, "Invalid Email Information !!", "Invalid Email", JOptionPane.WARNING_MESSAGE);
                }
                else{
                    pst = con.prepareStatement(insertSql);
                    pst.setString(1, username);
                    pst.setString(2, password);
                    pst.setString(3, fullname);
                    pst.setString(4, email);
                    pst.setString(5, "Student");
                    pst.execute();
                    loginView.setVisible(true);
                    loginView.setLocationRelativeTo(null);
                    regView.setVisible(false);
                }
            } catch (SQLException ex) {
                Logger.getLogger(QuizController.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        if (e.getSource().equals(allQuizView.getBtnCourse())){
            allQuizView.setVisible(false);
            reAdminMainView();
        }
//        Login
        
        if (e.getSource().equals(adminMainView.getBtnCourse())){
            reAdminMainView();
        }
        if (e.getSource().equals(mainView.getBtnCourse())){
            reMainView();
        }
        if (e.getSource().equals(courseView.getBtnCourse())){
            courseView.setVisible(false);
            if (userRoleCurrent.equals("Admin")){
                adminMainView.setVisible(true);
                adminMainView.setLocationRelativeTo(null);
            }else{
                mainView.setVisible(true);
                mainView.setLocationRelativeTo(null);
            }
        }
//        Add Quiz
        if (e.getSource().equals(allQuizView.getBtnAddQuiz())){
            allQuizView.setEnabled(false);
            addQuizView.setVisible(true);
            addQuizView.setLocationRelativeTo(null);
        }
        if (e.getSource().equals(courseView.getBtnAllQuiz())){
            if (userRoleCurrent.equals("Admin")){
                allQuizView.setVisible(true);
                allQuizView.setLocationRelativeTo(null);
                courseView.setVisible(false);
                reAdminQuiz();
            }else{
                quizView.setVisible(true);
                quizView.setLocationRelativeTo(null);
                courseView.setVisible(false);
                reQuiz();
            }
            
        }
//        Add Quiz
        if (e.getSource().equals(addQuizView.getBtnSave1())){
            courseModel.load(quizModel);
            System.out.println(quizModel.loadData(courseIdCurrent));
            Choice quiz = new Choice(course.get(courseIndexCurrent).getQuiz().size() + 1, 
                    addQuizView.getTfQuestion1().getText(),
                    addQuizView.getTfChoiceA().getText(),
                    addQuizView.getTfChoiceB().getText(),
                    addQuizView.getTfChoiceC().getText(),
                    addQuizView.getTfChoiceD().getText(),
                    addQuizView.getBtngChoice().getSelection().getActionCommand(),
                    "Choice");
            course.get(courseIndexCurrent).getQuiz().add(quiz);
            quizModel.saveData(courseIdCurrent, course.get(courseIndexCurrent).getQuiz());
        }
        if (e.getSource().equals(addQuizView.getBtnSave2())){
            courseModel.load(quizModel);
            String answer = "";
            if(addQuizView.getCbMCA().isSelected()){
                answer += "A";
            }
            if(addQuizView.getCbMCB().isSelected()){
                answer += "B";
            }
            if(addQuizView.getCbMCC().isSelected()){
                answer += "C";
            }
            if(addQuizView.getCbMCD().isSelected()){
                answer += "D";
            }
            MultipleChoice quiz = new MultipleChoice(course.get(courseIndexCurrent).getQuiz().size() + 1, 
                    addQuizView.getTfQuestion2().getText(),
                    addQuizView.getMultiChoiceA().getText(),
                    addQuizView.getMultiChoiceB().getText(),
                    addQuizView.getMultiChoiceC().getText(),
                    addQuizView.getMultiChoiceD().getText(),
                    answer,
                    "MultipleChoice");
            course.get(courseIndexCurrent).getQuiz().add(quiz);
            quizModel.saveData(courseIdCurrent, course.get(courseIndexCurrent).getQuiz());
//            for(Quiz i: course.get(courseIndexCurrent).getQuiz()){
//                System.out.println(i.getAnswer());
//            }
            
        }
        if (e.getSource().equals(addQuizView.getBtnSave3())){
            courseModel.load(quizModel);
            FillAnswer quiz = new FillAnswer(course.get(courseIndexCurrent).getQuiz().size() + 1, 
                    addQuizView.getTfQuestion3().getText(),
                    addQuizView.getTfAnswer().getText(),
                    "FillAnswer");
            course.get(courseIndexCurrent).getQuiz().add(quiz);
            quizModel.saveData(courseIdCurrent, course.get(courseIndexCurrent).getQuiz());
//            for(Quiz i: course.get(courseIndexCurrent).getQuiz()){
//                System.out.println(i.getAnswer());
//            }
        }
        if (e.getSource().equals(addQuizView.getBtnSave1()) ||
                e.getSource().equals(addQuizView.getBtnSave2()) ||
                e.getSource().equals(addQuizView.getBtnSave3())){
            addQuizView.setVisible(false);
            allQuizView.setEnabled(true);
            reAdminQuiz();
        }
        if (e.getSource().equals(quizView.getBtnSubmit())){
            
        }
    }
    @Override
    public void keyTyped(KeyEvent ke) {
    }

    @Override
    public void keyPressed(KeyEvent ke) {
    }

    @Override
    public void keyReleased(KeyEvent ke) {
        if(!regView.getTfEmail().getText().contains("@")){
            regView.getLbEmail().setText("Email Invalid");
        }
        else{
            regView.getLbEmail().setText("");
        }
    }
//    windowevent
    @Override
    public void windowOpened(WindowEvent we) {
        if (we.getSource().equals(allQuizView)){
            reAdminQuiz();
        }
        
        if (we.getSource().equals(mainView)){
            reMainView();
        }
        if (we.getSource().equals(adminMainView)){
            reAdminMainView();
        }
    }
    @Override
    public void windowClosing(WindowEvent we) {
    }
    @Override
    public void windowClosed(WindowEvent we) {
        if (we.getSource().equals(addCourseView)){
            adminMainView.setEnabled(true);
        }
        if (we.getSource().equals(addQuizView)){
            allQuizView.setEnabled(true);
        }
    }
    @Override
    public void windowIconified(WindowEvent we) {
    }
    @Override
    public void windowDeiconified(WindowEvent we) {
    }
    @Override
    public void windowActivated(WindowEvent we) {
    }
    @Override
    public void windowDeactivated(WindowEvent we) {
    }
    @Override
    public void mouseClicked(MouseEvent me) {
        if (me.getSource().equals(loginView.getBtnLogin())){
            String username = loginView.getTfUsername().getText();
            String userPassWord = loginView.getTfUserPassword().getText();
            String findSql = "SELECT userName, userPassword, userRole FROM user WHERE userName = '"+username+"' AND userPassword = '"+userPassWord+"'";
            try {
                pst = con.prepareStatement(findSql);
                rs = pst.executeQuery();
                if (rs.next()){
                    this.userNameCurrent = rs.getString("userName");
                    if (rs.getString("userRole").equals("Admin")){
                        loginView.setVisible(false);
                        adminMainView.setVisible(true);
                        adminMainView.setLocationRelativeTo(null);
                        this.userRoleCurrent = "Admin";
                    }else{
                        loginView.setVisible(false);
                        mainView.setVisible(true);
                        mainView.setLocationRelativeTo(null);
                        this.userRoleCurrent = "Student";
                    }
                }else{
                    JOptionPane.showMessageDialog(null, "Username or Password Incorrect", "Invalid Information", JOptionPane.WARNING_MESSAGE);
                }
            } catch (SQLException ex) {
                Logger.getLogger(QuizController.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }
    @Override
    public void mousePressed(MouseEvent me) {
    }
    @Override
    public void mouseReleased(MouseEvent me) {
    }
    @Override
    public void mouseEntered(MouseEvent me) {
    }
    @Override
    public void mouseExited(MouseEvent me) {
    }
}
