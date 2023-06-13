package com.asgar72.quizapp;

import java.util.ArrayList;
import java.util.List;

public class QuestionBank {

    private static List<QuestionList> CQuestions() {
        final List<QuestionList> questionLists = new ArrayList<>();


        final QuestionList question1 = new QuestionList("Who is the father of C language?", "Steve Jobs", "James Gosling", "Dennis Ritchie", "Rasmus Lerdorf", "Dennis Ritchie", "");
        final QuestionList question2 = new QuestionList("All keywords in C are in ____", "LowerCase letters", "UpperCase letters", "CamelCase letters", "None of the mentioned", "LowerCase letters", "");
        final QuestionList question3 = new QuestionList("C programs are converted into machine language with the help of____", "an editor", "a compiler", "an operating system", "None of the mentioned", "a compiler", "");
        final QuestionList question4 = new QuestionList("Who is the father of C language?", "Steve Jobs", "James Gosling", "Dennis Ritchie", "Rasmus Lerdorf", "Steve Jobs", "");
        final QuestionList question5 = new QuestionList("Who is the father of C language?", "Steve Jobs", "James Gosling", "Dennis Ritchie", "Rasmus Lerdorf", "Rasmus Lerdorf", "");
        final QuestionList question6 = new QuestionList("Who is the father of C language?", "Steve Jobs", "James Gosling", "Dennis Ritchie", "Rasmus Lerdorf", "Rasmus Lerdorf", "");

        //add all questions to List
        questionLists.add(question1);
        questionLists.add(question2);
        questionLists.add(question3);
        questionLists.add(question4);
        questionLists.add(question5);
        questionLists.add(question6);

        return questionLists;
    }

    private static List<QuestionList> CCCQuestions() {
        final List<QuestionList> questionLists = new ArrayList<>();


        final QuestionList question1 = new QuestionList("Who is the father of C language?", "Steve Jobs", "James Gosling", "Dennis Ritchie", "Rasmus Lerdorf", "Dennis Ritchie", "");
        final QuestionList question2 = new QuestionList("All keywords in C are in ____", "LowerCase letters", "UpperCase letters", "CamelCase letters", "None of the mentioned", "LowerCase letters", "");
        final QuestionList question3 = new QuestionList("C programs are converted into machine language with the help of____", "an editor", "a compiler", "an operating system", "None of the mentioned", "a compiler", "");
        final QuestionList question4 = new QuestionList("Who is the father of C language?", "Steve Jobs", "James Gosling", "Dennis Ritchie", "Rasmus Lerdorf", "Steve Jobs", "");
        final QuestionList question5 = new QuestionList("Who is the father of C language?", "Steve Jobs", "James Gosling", "Dennis Ritchie", "Rasmus Lerdorf", "Rasmus Lerdorf", "");
        final QuestionList question6 = new QuestionList("Who is the father of C language?", "Steve Jobs", "James Gosling", "Dennis Ritchie", "Rasmus Lerdorf", "Rasmus Lerdorf", "");

        //add all questions to List
        questionLists.add(question1);
        questionLists.add(question2);
        questionLists.add(question3);
        questionLists.add(question4);
        questionLists.add(question5);
        questionLists.add(question6);

        return questionLists;
    }

    private static List<QuestionList> JavaQuestions() {
        final List<QuestionList> questionLists = new ArrayList<>();


        final QuestionList question1 = new QuestionList("Who is the father of C language?", "Steve Jobs", "James Gosling", "Dennis Ritchie", "Rasmus Lerdorf", "Dennis Ritchie", "");
        final QuestionList question2 = new QuestionList("All keywords in C are in ____", "LowerCase letters", "UpperCase letters", "CamelCase letters", "None of the mentioned", "LowerCase letters", "");
        final QuestionList question3 = new QuestionList("C programs are converted into machine language with the help of____", "an editor", "a compiler", "an operating system", "None of the mentioned", "a compiler", "");
        final QuestionList question4 = new QuestionList("Who is the father of C language?", "Steve Jobs", "James Gosling", "Dennis Ritchie", "Rasmus Lerdorf", "Steve Jobs", "");
        final QuestionList question5 = new QuestionList("Who is the father of C language?", "Steve Jobs", "James Gosling", "Dennis Ritchie", "Rasmus Lerdorf", "Rasmus Lerdorf", "");
        final QuestionList question6 = new QuestionList("Who is the father of C language?", "Steve Jobs", "James Gosling", "Dennis Ritchie", "Rasmus Lerdorf", "Rasmus Lerdorf", "");

        //add all questions to List
        questionLists.add(question1);
        questionLists.add(question2);
        questionLists.add(question3);
        questionLists.add(question4);
        questionLists.add(question5);
        questionLists.add(question6);

        return questionLists;
    }

    private static List<QuestionList> AndroidQuestions() {
        final List<QuestionList> questionLists = new ArrayList<>();


        final QuestionList question1 = new QuestionList("Who is the father of C language?", "Steve Jobs", "James Gosling", "Dennis Ritchie", "Rasmus Lerdorf", "Dennis Ritchie", "");
        final QuestionList question2 = new QuestionList("All keywords in C are in ____", "LowerCase letters", "UpperCase letters", "CamelCase letters", "None of the mentioned", "LowerCase letters", "");
        final QuestionList question3 = new QuestionList("C programs are converted into machine language with the help of____", "an editor", "a compiler", "an operating system", "None of the mentioned", "a compiler", "");
        final QuestionList question4 = new QuestionList("Who is the father of C language?", "Steve Jobs", "James Gosling", "Dennis Ritchie", "Rasmus Lerdorf", "Steve Jobs", "");
        final QuestionList question5 = new QuestionList("Who is the father of C language?", "Steve Jobs", "James Gosling", "Dennis Ritchie", "Rasmus Lerdorf", "Rasmus Lerdorf", "");
        final QuestionList question6 = new QuestionList("Who is the father of C language?", "Steve Jobs", "James Gosling", "Dennis Ritchie", "Rasmus Lerdorf", "Rasmus Lerdorf", "");

        //add all questions to List
        questionLists.add(question1);
        questionLists.add(question2);
        questionLists.add(question3);
        questionLists.add(question4);
        questionLists.add(question5);
        questionLists.add(question6);

        return questionLists;
    }

    public  static List<QuestionList> getQuestions(String selectedTopicName) {
        switch (selectedTopicName) {
            case "C++":
                return CCCQuestions();
            case "Java":
                return JavaQuestions();
            case "android":
                return AndroidQuestions();
            default:
                return CQuestions();

        }
    }
}
