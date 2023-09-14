package org.example.onlinesurvey;

import java.util.*;

public class OnlineSurvey {

    public static void main(String[] args) {

        QuestionList theQuestions = new QuestionList();

        loadSurveyQuestions(theQuestions);

        ResultsList theResults = startSurvey(theQuestions);

        theResults.reportAnswers();

    }

    public static void loadSurveyQuestions(QuestionList questionList) {

        questionList.addQuestion("Does the candidate represent your concerns?");
        questionList.addQuestion("Will you vote in the upcoming election?");
        questionList.addQuestion("Are there any concerns that you believe need to be addressed?");
        questionList.addQuestion("Does the political affiliation of the candidate concern you?");

    }

    public static ResultsList startSurvey(QuestionList theQuestions) {

        final Scanner keyboard = new Scanner(System.in);

//        Map<String, String> ourResults = new HashMap<>();

        ResultsList ourResults = new ResultsList();

        System.out.println();
        System.out.println("Thank you for taking our online survey!  You will be presented ");
        System.out.println("with a short list of questions and have the opportunity to answer.");
        System.out.println("Your answer will be saved along with the question and used to ");
        System.out.println("help candidates better understand your concerns.");


        for(String question : theQuestions.getQuestionList()) {

            System.out.println(question);

            System.out.println();

            System.out.println("Please key in your answer:");

            String answer = keyboard.nextLine();

            if ((answer != null) && (answer.length() > 2)) {
                ourResults.addResult(question, answer);
            } else {
                ourResults.addResult(question, "No answer was given.");
            }


        }

        keyboard.close();

        return ourResults;
    }

    public static class QuestionList {

        protected List<String> questionList;
        public QuestionList() {
            this.questionList = new ArrayList<>();
        }

        public void addQuestion(String question) {

            if (question != null)
                this.questionList.add(question);
        }

        public List<String> getQuestionList() {
            return questionList;
        }
    }

    public static class ResultsList {

        protected Map<String, String> resultsList;

        public ResultsList() {
            this.resultsList = new LinkedHashMap<>() {
            };
        }

        public void addResult(String question, String answer){
            this.resultsList.put(question, answer);
        }

        public Map<String, String> getResultsList() {
            return resultsList;
        }

        public void reportAnswers() {
            System.out.println();
            System.out.println();
            System.out.println("Survey Results:");
            for (Map.Entry<String, String> pair : this.getResultsList().entrySet()) {

                System.out.println("Q: " + pair.getKey());
                System.out.println("A: " + pair.getValue());

            }
        }
    }
}
