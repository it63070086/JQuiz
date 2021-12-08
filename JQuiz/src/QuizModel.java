import java.util.*;
import java.io.*;
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author pc
 */
public class QuizModel {
    private ArrayList<Quiz> Quiz;
    public QuizModel(){
        Quiz = new ArrayList<Quiz>();
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
