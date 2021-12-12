import java.util.*;
import java.io.*;

public class QuizModel{
    private ArrayList<Quiz> quiz;
    public QuizModel(){
        quiz = new ArrayList<Quiz>();
    }
    public QuizModel(int courseId){
        quiz = new ArrayList<Quiz>();
        createQuiz(courseId);
    }
    public void createQuiz(int quizId){
        File f = new File("quiz/"+quizId+".JQuiz");
        try(FileOutputStream fOut = new FileOutputStream(f);
            ObjectOutputStream oout = new ObjectOutputStream(fOut);) {
            oout.writeObject(quiz);
        } catch (Exception i) {
        }
    }
    public boolean loadData(int quizId){
        File f = new File("quiz/"+quizId+".JQuiz");
        if (f.exists()) {
            try (FileInputStream fin = new FileInputStream("dataQuiz.dat");
                ObjectInputStream in = new ObjectInputStream(fin);){
                quiz = (ArrayList<Quiz>) in.readObject();
                return true;
            } catch (Exception i) {
                return false;
            }
        }
        return false;
    }
    public void deleteData(int quizId){
        System.out.println(quizId);
        File myObj = new File("quiz/"+quizId+".JQuiz"); 
        if (myObj.delete()) {
          System.out.println("Deleted the file: " + myObj.getName());
        }
    }
//    young miatongcum
    public boolean saveData(){
        try(FileOutputStream fOut = new FileOutputStream("dataQuiz.dat");
            ObjectOutputStream oout = new ObjectOutputStream(fOut);) {
            oout.writeObject(quiz);
            return true;
        } catch (Exception i) {
            return false;
        }
    }

    public ArrayList<Quiz> getQuiz() {
        return quiz;
    }

    public void setQuiz(ArrayList<Quiz> quiz) {
        this.quiz = quiz;
    }
    
    
}
