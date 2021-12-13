
import java.util.ArrayList;
public class CardQuizModel {
    private ArrayList<CardQuizView> cardQuiz;
    public CardQuizModel(){
        cardQuiz = new ArrayList<CardQuizView>();
    }
    public ArrayList<CardQuizView> getCardQuiz(){
        return cardQuiz;
    }
    
}
