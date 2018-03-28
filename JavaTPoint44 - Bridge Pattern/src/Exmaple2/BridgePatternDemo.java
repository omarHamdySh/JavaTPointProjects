package Exmaple2;

public class BridgePatternDemo {

    /**
     * Kindly Maintain this order:
     * Questions interface;
     * JavaQuesions class;
     * QuestionManager class;
     * QuestionFormat class;
     * BridgePatternDemo class;
     * 
     * @param args 
     */
    public static void main(String[] args) {

        QuestionFormat questions = new QuestionFormat("Java Programming Language");

        questions.q = new JavaQuestions();

        questions.next();
        questions.display();
        questions.delete("What is class? ");

        questions.newOne("What is inheritance? ");

        questions.newOne("How many types of inheritance are there in java?");

        System.out.println("-------------------");
        questions.displayAll();
    }

}
