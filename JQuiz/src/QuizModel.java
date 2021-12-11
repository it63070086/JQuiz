import java.util.*;
import java.io.*;

public class QuizModel{
    private ArrayList<Quiz> Quiz;
    public QuizModel(){
        Quiz = new ArrayList<Quiz>();
        
    }
    public QuizModel(int courseId){
        Quiz = new ArrayList<Quiz>();
        createQuiz(courseId);
        
    }
    public void createQuiz(int quizId){
        File f = new File("quiz/"+quizId+".JQuiz");
        try(FileOutputStream fOut = new FileOutputStream(f);
            ObjectOutputStream oout = new ObjectOutputStream(fOut);) {
            oout.writeObject(Quiz);
        } catch (Exception i) {
        }
    }
    public boolean loadData(){
        File f = new File("dataQuiz.dat");
        if (f.exists()) {
            try (FileInputStream fin = new FileInputStream("dataQuiz.dat");
                ObjectInputStream in = new ObjectInputStream(fin);){
                Quiz = (ArrayList<Quiz>) in.readObject();
                return true;
            } catch (Exception i) {
                return false;
            }
        }
    return false;
    }
    public boolean saveData(){
        try(FileOutputStream fOut = new FileOutputStream("dataQuiz.dat");
            ObjectOutputStream oout = new ObjectOutputStream(fOut);) {
            oout.writeObject(Quiz);
            return true;
        } catch (Exception i) {
            return false;
        }
    }

    public ArrayList<Quiz> getQuiz() {
        return Quiz;
    }

    public void setQuiz(ArrayList<Quiz> Quiz) {
        this.Quiz = Quiz;
    }
    
    
}
