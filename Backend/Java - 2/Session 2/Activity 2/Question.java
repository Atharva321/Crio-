public class Question {
    private String text;
    private String answer;

    public Question() {
        text = "";
        answer = "";
    }

    public Question(String text){
        this.text = text;
        answer = "";
    }

    public String getQuestion() {
        return text;
    }

    public String getAnswer() {
        return answer;
    }

    public void setText(String text) {
        this.text = text;
    }

    public void setAnswer(String answer) {
        this.answer = answer;
    }

    public boolean checkAnswer(String response){
        return answer.equals(response);
    }

    public void display(){
        System.out.println(text);
    }
}
