import java.util.Scanner;

public class QuestionService {

    Question[] questions = new Question[5];

    public QuestionService(){

        questions[0] = new Question(1,"What is OOP?","Programming style","Database","Operating system","Compiler","A");
        questions[1] = new Question(2,"Which keyword is used for inheritance?","this","super","extends","implements","C");
        questions[2] = new Question(3,"Which method is main method?","start()","run()","main()","init()","C");
        questions[3] = new Question(4,"Which is not a primitive type?","int","double","String","char","C");
        questions[4] = new Question(5,"Which keyword is used to create object?","new","class","void","static","A");
    }

    public void playQuiz(){

        Scanner scanner = new Scanner(System.in);
        int score = 0;

        for(Question q : questions){

            System.out.println("\nQuestion " + q.getId());
            System.out.println(q.getQuestion());

            System.out.println("A) " + q.getOpt1());
            System.out.println("B) " + q.getOpt2());
            System.out.println("C) " + q.getOpt3());
            System.out.println("D) " + q.getOpt4());

            System.out.print("Your answer (A/B/C/D): ");
            String answer = scanner.nextLine().toUpperCase();

            if(answer.equals(q.getAnswer())){
                System.out.println("Correct.");
                score++;
            } else {
                System.out.println("Wrong. Correct answer: " + q.getAnswer());
            }
        }

        System.out.println("\nFinal Score: " + score + "/" + questions.length);
        scanner.close();
    }
}