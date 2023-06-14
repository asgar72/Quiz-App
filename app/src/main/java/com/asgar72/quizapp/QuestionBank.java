package com.asgar72.quizapp;

import java.util.ArrayList;
import java.util.List;

public class QuestionBank {

    private static List<QuestionList> CQuestions() {
        final List<QuestionList> questionLists = new ArrayList<>();

        final QuestionList question1 = new QuestionList("Who is the father of C language?", "Steve Jobs", "James Gosling", "Dennis Ritchie", "Rasmus Lerdorf", "Dennis Ritchie", "");
        final QuestionList question2 = new QuestionList("All keywords in C are in ____", "LowerCase letters", "UpperCase letters", "CamelCase letters", "None of the mentioned", "LowerCase letters", "");
        final QuestionList question3 = new QuestionList("C programs are converted into machine language with the help of____", "an editor", "a compiler", "an operating system", "None of the mentioned", "a compiler", "");
        final QuestionList question4 = new QuestionList("What is a correct syntax to output \"Hello World\" in C?", "printf(\"Hello World\");", "System.out.println(\"Hello World\");", "cout << \"Hello World\";", "Console.WriteLine(\"Hello World\");", "printf(\"Hello World\");", "");
        final QuestionList question5 = new QuestionList("Which format specifier is often used to print integers?", "%f", "%d", "%c", "%s", "%d", "");
        final QuestionList question6 = new QuestionList("How do you start writing a while loop in C?", "while x < y then", "while x < y", "while (x < y)", "if x > y while", "while (x < y)", "");

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


        final QuestionList question1 = new QuestionList("Who is the father of C++ language?", "Ken Thompson", "Bjarne Stroustrup", "Dennis Ritchie", "Brian Kernighan", "Bjarne Stroustrup", "");
        final QuestionList question2 = new QuestionList("What is C++?", "C++ is an object oriented programming language", "C++ is a procedural programming language", "C++ is a functional programming language", "C++ supports both procedural and object oriented programming language", "C++ supports both procedural and object oriented programming language", "");
        final QuestionList question3 = new QuestionList("Which of the following approach is used by C++?", "Left-right", "Right-left", "Bottom-up", "Top-down", "Bottom-up", "");
        final QuestionList question4 = new QuestionList("Which of the following type is provided by C++ but not C?", "bool", "double", "float", "int", "bool", "");
        final QuestionList question5 = new QuestionList("Which of the following user-defined header file extension used in c++?", "hg", "cpp", "h", "hf", "h", "");
        final QuestionList question6 = new QuestionList("Identify the correct syntax for declaring arrays in C++.", "array arr[10]", "array{10}", "int arr", "int arr[10]", "int arr[10]", "");

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


        final QuestionList question1 = new QuestionList("Who invented Java Programming?", "Guido van Rossum", "James Gosling", "Anders Hejlsberg", "Rasmus Lerdorf", "James Gosling", "");
        final QuestionList question2 = new QuestionList("What is the extension of java code files?", ".java", ".js", ".txt", ".class", ".java", "");
        final QuestionList question3 = new QuestionList("What is the extension of compiled java classes?", ".js", ".cpp", ".class", ".java", ".class", "");
        final QuestionList question4 = new QuestionList("Which of these are selection statements in Java?", "break", "if()", "continue", "for()", "if()", "");
        final QuestionList question5 = new QuestionList("Which one of the following is not an access modifier?", "Protected", "Public", "Private", "void", "void", "");
        final QuestionList question6 = new QuestionList("What is the numerical range of a char data type in Java?", "0 to 256", "-128 to 127", "0 to 65535", "0 to 32767", "0 to 65535", "");

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


        final QuestionList question1 = new QuestionList("Who is the founder of android?", "Andy Rubin", "James Gosling", "Anders Hejlsberg", "Rasmus Lerdorf", "Andy Rubin", "");
        final QuestionList question2 = new QuestionList("Android is ___", "web browser", "operating system", "web server", "None of the above", "operating system", "");
        final QuestionList question3 = new QuestionList("Which of the following is the first mobile phone released that ran the Android OS?", "HTC Hero", "Google gPhone", "T - Mobile G1", "None of the above", "T - Mobile G1", "");
        final QuestionList question4 = new QuestionList("APK stands for ___", "Android Page Kit", "Android Phone Kit", "Android Package Kit", "Android Photo Kit", "Android Package Kit", "");
        final QuestionList question5 = new QuestionList("What is an activity in android?", "android class", "A single screen in an application with supporting java code", "android package", "None of the above", "A single screen in an application with supporting java code", "");
        final QuestionList question6 = new QuestionList("ADB stands for ___", "Android debug bridge", "Android delete bridge", "Android destroy bridge", "None of the above", "Android debug bridge", "");


        //add all questions to List
        questionLists.add(question1);
        questionLists.add(question2);
        questionLists.add(question3);
        questionLists.add(question4);
        questionLists.add(question5);
        questionLists.add(question6);

        return questionLists;
    }

    public static List<QuestionList> getQuestions(String selectedTopicName) {
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
