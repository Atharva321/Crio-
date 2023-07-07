import java.util.ArrayList;
import java.util.List;

public class MultiChoiceQuestion extends Question{
    private List<String> choices;

    public MultiChoiceQuestion(String text){
        super(text);
        this.choices = new ArrayList<>();
    }

    public void addChoice(String choice, boolean isCorrect){
        choices.add(choice);
        if(isCorrect){
            setAnswer(choice);
        }
    }
}
