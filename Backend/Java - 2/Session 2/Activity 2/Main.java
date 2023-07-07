import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
//        Scanner in = new Scanner(System.in);
//        Question q = new Question();
//        q.setText("Who invented AC Current?");
//        q.setAnswer("Nikola Tesla");
//        q.display();
//        System.out.print("Your answer:");
//        String response = in.nextLine();
//        System.out.println(q.checkAnswer(response));

        MultiChoiceQuestion first = new MultiChoiceQuestion("What was the original name of the Java language?");
        first.addChoice("*7",false);
        first.addChoice("Duke",false);
        first.addChoice("Oak",true);
        first.addChoice("Gosling",false);
        MultiChoiceQuestion second = new MultiChoiceQuestion("In which country was the Java born?");
        second.addChoice("Australia",false);
        second.addChoice("Canada",true);
        second.addChoice("Denmark",false);
        second.addChoice("USA",false);
        askQuestion(first);
        askQuestion(second);
    }

    public static void askQuestion(Question q){
        q.display();
        System.out.print("Your answer:");
        Scanner in = new Scanner(System.in);
        String response = in.nextLine();
        System.out.println(q.checkAnswer(response));
    }
}
