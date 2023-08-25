package com.example.easyquizy;

import java.util.ArrayList;
import java.util.List;

public class QuestionsBank {

    private static List<QuestionsList> javaQuestions() {

        final List<QuestionsList> questionsLists = new ArrayList<>();

        // Create object of QuestionList class and pass a questions along with option and answer
        final QuestionsList question1 = new QuestionsList("What is the size of int variable?", "16bits", "8bits", "32bits", "64bits", "32bits", "");
        final QuestionsList question2 = new QuestionsList("What is the default value of Boolean variable?", "true", "false", "null", "not defined", "false", "");
        final QuestionsList question3 = new QuestionsList("What of the following is the default value of an instance variable?", "Depends upon the type of variable", "null", "0", "not assigned", "Depends upon the type of variable", "");
        final QuestionsList question4 = new QuestionsList("Which is a reserve word in the java programming language?", "method", "native", "reference", "array", "native", "");
        final QuestionsList question5 = new QuestionsList("Which of the following is NOT a keyword or reserved words in java?", "if", "then", "goto", "while", "then", "");
        final QuestionsList question6 = new QuestionsList("Which is the valid declaration within an interface definition?", "object reference", "objects", "primitive", "none", "objects", "");
        final QuestionsList question7 = new QuestionsList("What is Runnable?", "abstract class", "interface", "class", "method", "interface", "");
        final QuestionsList question8 = new QuestionsList("Where is System class defined?", "java.lang.package", "java.util.package", "java,io,package", "none", "java.lang.package", "");
        final QuestionsList question9 = new QuestionsList("Identify the incorrect Java feature.", "object oriented", "use of pointer", "dynamic", "architectural neural", "use of pointer", "");
        final QuestionsList question10 = new QuestionsList("Who invented java programming", "Guido van Rossum", "James Gosling", "Dennis Ritchie", "Bjarne Stroustrup", "James Gosling", "");
        final QuestionsList question11 = new QuestionsList("What is the extension of java code files?", ".js", ".txt", ".class", ".java", ".java", "");
        final QuestionsList question12 = new QuestionsList("Which of these are selection statements in Java?", "break", "continue", "for()", "if()", "if()", "");
        final QuestionsList question13 = new QuestionsList("Which one of the following is not an access modifier?", "Protected", "void", "Public", "Private", "void", "");
        final QuestionsList question14 = new QuestionsList("Which of the following is not a Java features?", "Dynamic", "Architecture Neural", "Use of pointer", "Object Oriented", "Use of pointer", "");
        final QuestionsList question15 = new QuestionsList("What does the expression float a = 35 / 0 return?", "0", "not a number", "infinity", "run time exception", "infinity", "");
        final QuestionsList question16 = new QuestionsList("Which method of the Class.class is used to determine the name of a class represented by the class object as a String?", "getClass()", "getName()", "intern()", "toString()", "getName()", "");
        final QuestionsList question17 = new QuestionsList("In which memory a String is stored, when we create a string using new operator?", "Stack", "String Memory", "Heap Memory", "none", "Heap Memory", "");
        final QuestionsList question18 = new QuestionsList("Which keyword is used for accessing the features of a package?", "package", "import", "export", "extends", "import", "");
        final QuestionsList question19 = new QuestionsList("Which of the following is the correct syntax to create a variable in Java?", "int name;", "var name;", "both a nd b", "name", "int name;", "");
        final QuestionsList question20 = new QuestionsList("Which of the following is a valid data structure in java?", "Array", "List", "Vector", "All of the above", "All of the above", "");

        // add all questions to List<QuestionsList>
        questionsLists.add(question1);
        questionsLists.add(question2);
        questionsLists.add(question3);
        questionsLists.add(question4);
        questionsLists.add(question5);
        questionsLists.add(question6);
        questionsLists.add(question7);
        questionsLists.add(question8);
        questionsLists.add(question9);
        questionsLists.add(question10);
        questionsLists.add(question11);
        questionsLists.add(question12);
        questionsLists.add(question13);
        questionsLists.add(question14);
        questionsLists.add(question15);
        questionsLists.add(question16);
        questionsLists.add(question17);
        questionsLists.add(question18);
        questionsLists.add(question19);
        questionsLists.add(question20);

        return questionsLists;
    }

    private static  List<QuestionsList> phpQuestions() {

        final List<QuestionsList> questionsLists = new ArrayList<>();

        // Create object of QuestionList class and pass a questions along with option and answer
        final QuestionsList question1 = new QuestionsList("What does PHP stands for?", "Professional Home Page", "HyperText Preprocessor", "PreText HyperText Preprocessor", "PreprocessorHome Page", "HyperText Preprocessor", "");
        final QuestionsList question2 = new QuestionsList("Who is the father of PHP?", "Rasmus Lerdorf", "Willam Makepiece", "Drek Kolkev", "List Barely", "Rasmus Lerdorf", "");
        final QuestionsList question3 = new QuestionsList("PHP files have a default file extension of.", ".html", ".php", ".xml", ".json", ".php", "");
        final QuestionsList question4 = new QuestionsList("A PHP script should starts with       and end with       ", "< php >", "< php />", "< ? ? >", "< ?php ? >", "< ?php ? >", "");
        final QuestionsList question5 = new QuestionsList("Which version of PHP introduced Try/Catch Exception?", "PHP 4", "PHP 5", "PHP 6", "PHP 5.3", "PHP 5", "");
        final QuestionsList question6 = new QuestionsList("If $a = 12 what will be the returned when ($a ==12) ? 5 : 1 is executed?", "12", "1", "5", "error", "5", "");
        final QuestionsList question7 = new QuestionsList("Which of the following is used for concatenation in PHP?", "+", "*", ".", ";", ".", "");
        final QuestionsList question8 = new QuestionsList("Which of the following function is used to find files in PHP?", "glob();", "fold();", "file();", "none of the above", "globe();", "");
        final QuestionsList question9 = new QuestionsList("Which of the following is/are the code editors in PHP?", "Notepad++", "Notepad", "Adobe Dreamweaver", "all of above", "all of the above", "");
        final QuestionsList question10 = new QuestionsList("Which one of the following is the default PHP session name?", "PHPSESSIONID", "PHPIDSESS", "PHPSESSID", "PHPSESID", "PHPSESSID", "");

        // add all questions to List<QuestionsList>
        questionsLists.add(question1);
        questionsLists.add(question2);
        questionsLists.add(question3);
        questionsLists.add(question4);
        questionsLists.add(question5);
        questionsLists.add(question6);
        questionsLists.add(question7);
        questionsLists.add(question8);
        questionsLists.add(question9);
        questionsLists.add(question10);

        return questionsLists;
    }

    private static  List<QuestionsList> htmlQuestions() {

        final List<QuestionsList> questionsLists = new ArrayList<>();

        // Create object of QuestionList class and pass a questions along with option and answer
        final QuestionsList question1 = new QuestionsList("HTML stands for?", "Hyper Text Markup Language", "High Text Markup Language", "Hyper Tbular Markup Language", "none of these", "Hyper text markup Language", "");
        final QuestionsList question2 = new QuestionsList("Which of the following tag is used to work to mark a beginning of paragraph?", "<TD>", "<br>", "<p>", "<TR>", "<P>", "");
        final QuestionsList question3 = new QuestionsList("From which tag descriptive list starts?", "<LL>", "<DD>", "<DL>", "<DS>", "<DL>", "");
        final QuestionsList question4 = new QuestionsList("Correct HTML tag for the largest heading is", "<head>", "<larger>", "<h6>", "<heading>", "<h6>", "");
        final QuestionsList question5 = new QuestionsList("The attributes of <form> tag", "Method", "Action", "both a and b", "none of these", "both a and b", "");
        final QuestionsList question6 = new QuestionsList("Markup tag tell the web browser?", "how to organise the page", "how to display the page", "how to display message box on page", "none of these", "how to display the page", "");
        final QuestionsList question7 = new QuestionsList("How many sizes of headers are available in HTML by default?", "5", "1", "3", "6", "6", "");
        final QuestionsList question8 = new QuestionsList("What is the smallest header in HTML by default?", "h!", "h2", "h6", "h4", "h6", "");
        final QuestionsList question9 = new QuestionsList("Colors are defined in HTML using?", "RGBA vale", "RGB value", "HEX value", "all of the above", "", "");
        final QuestionsList question10 = new QuestionsList("Which property is used to set colors in HTML?", "color", "background color", "text color", "font color", "color", "");

        // add all questions to List<QuestionsList>
        questionsLists.add(question1);
        questionsLists.add(question2);
        questionsLists.add(question3);
        questionsLists.add(question4);
        questionsLists.add(question5);
        questionsLists.add(question6);
        questionsLists.add(question7);
        questionsLists.add(question8);
        questionsLists.add(question9);
        questionsLists.add(question10);

        return questionsLists;
    }

    private static  List<QuestionsList> androidQuestions() {

        final List<QuestionsList> questionsLists = new ArrayList<>();

        // Create object of QuestionList class and pass a questions along with option and answer
        final QuestionsList question1 = new QuestionsList("Select a component which is NOT a part of Android architecture?", "Android Framework", "Libraries", "Linux Kernel", "Android Document", "Linux Kernel", "");
        final QuestionsList question2 = new QuestionsList("A           makes a specific set of the  application data available to other application?", "Content Provider", "Broadcast Receiver", "Intent", "none of the above", "Content Provider", "");
        final QuestionsList question3 = new QuestionsList("Which among these are NOT a part of Android's native libraries?", "Depends upon the type of variable", "Webkit", "Dalvik", "OpenGL", "Dalvik", "");
        final QuestionsList question4 = new QuestionsList("During an activity life-cycle, what is the first callback method invoked by the system?", "OnStop()", "OnStart()", "OnCreate()", "OnRestore()", "OnCreate()", "");
        final QuestionsList question5 = new QuestionsList("What activity method you use to retrieve a reference to an Android view by using the id attribute of a resources XML?", "findViewByReference(int id);", "findViewBYId(int id);", "findViewBYId(String id);", "retrieveResourceById(int id);", "findViewById(int id);", "");
        final QuestionsList question6 = new QuestionsList("The requests from contact provider class is handled by which method?", "OnCreate", "OnSelect", "ContentResolver", "OnClick", "ContentResolver", "");
        final QuestionsList question7 = new QuestionsList("Android is a", "an operating system", "a web browser", "a web server", "none of the above", "an operating system", "");
        final QuestionsList question8 = new QuestionsList("For which of the following Android is mainly developed?", "server", "desktop", "laptop", "mobile device", "mobile device", "");
        final QuestionsList question9 = new QuestionsList("Android is based on which of the following language?", "java", "C", "C++", "nonbe of the above", "java", "");
        final QuestionsList question10 = new QuestionsList("What does API stand for?", "Application Programming Interface", "Android Programming Interface", "Android Page Interface", "Application Page Interface", "Application Programming Interface", "");

        // add all questions to List<QuestionsList>
        questionsLists.add(question1);
        questionsLists.add(question2);
        questionsLists.add(question3);
        questionsLists.add(question4);
        questionsLists.add(question5);
        questionsLists.add(question6);
        questionsLists.add(question7);
        questionsLists.add(question8);
        questionsLists.add(question9);
        questionsLists.add(question10);

        return questionsLists;
    }

    private static  List<QuestionsList> android1Questions() {

        final List<QuestionsList> questionsLists = new ArrayList<>();

        // Create object of QuestionList class and pass a questions along with option and answer
        final QuestionsList question1 = new QuestionsList("Select a component which is NOT a part of Android architecture?", "Android Framework", "Libraries", "Linux Kernel", "Android Document", "Linux Kernel", "");
        final QuestionsList question2 = new QuestionsList("A           makes a specific set of the  application data available to other application?", "Content Provider", "Broadcast Receiver", "Intent", "none of the above", "Content Provider", "");
        final QuestionsList question3 = new QuestionsList("Which among these are NOT a part of Android's native libraries?", "Depends upon the type of variable", "Webkit", "Dalvik", "OpenGL", "Dalvik", "");
        final QuestionsList question4 = new QuestionsList("During an activity life-cycle, what is the first callback method invoked by the system?", "OnStop()", "OnStart()", "OnCreate()", "OnRestore()", "OnCreate()", "");
        final QuestionsList question5 = new QuestionsList("What activity method you use to retrieve a reference to an Android view by using the id attribute of a resources XML?", "findViewByReference(int id);", "findViewBYId(int id);", "findViewBYId(String id);", "retrieveResourceById(int id);", "findViewById(int id);", "");
        final QuestionsList question6 = new QuestionsList("The requests from contact provider class is handled by which method?", "OnCreate", "OnSelect", "ContentResolver", "OnClick", "ContentResolver", "");
        final QuestionsList question7 = new QuestionsList("Android is a", "an operating system", "a web browser", "a web server", "none of the above", "an operating system", "");
        final QuestionsList question8 = new QuestionsList("For which of the following Android is mainly developed?", "server", "desktop", "laptop", "mobile device", "mobile device", "");
        final QuestionsList question9 = new QuestionsList("Android is based on which of the following language?", "java", "C", "C++", "nonbe of the above", "java", "");
        final QuestionsList question10 = new QuestionsList("What does API stand for?", "Application Programming Interface", "Android Programming Interface", "Android Page Interface", "Application Page Interface", "Application Programming Interface", "");

        // add all questions to List<QuestionsList>
        questionsLists.add(question1);
        questionsLists.add(question2);
        questionsLists.add(question3);
        questionsLists.add(question4);
        questionsLists.add(question5);
        questionsLists.add(question6);
        questionsLists.add(question7);
        questionsLists.add(question8);
        questionsLists.add(question9);
        questionsLists.add(question10);

        return questionsLists;
    }

    private static  List<QuestionsList> android2Questions() {

        final List<QuestionsList> questionsLists = new ArrayList<>();

        // Create object of QuestionList class and pass a questions along with option and answer
        final QuestionsList question1 = new QuestionsList("Select a component which is NOT a part of Android architecture?", "Android Framework", "Libraries", "Linux Kernel", "Android Document", "Linux Kernel", "");
        final QuestionsList question2 = new QuestionsList("A           makes a specific set of the  application data available to other application?", "Content Provider", "Broadcast Receiver", "Intent", "none of the above", "Content Provider", "");
        final QuestionsList question3 = new QuestionsList("Which among these are NOT a part of Android's native libraries?", "Depends upon the type of variable", "Webkit", "Dalvik", "OpenGL", "Dalvik", "");
        final QuestionsList question4 = new QuestionsList("During an activity life-cycle, what is the first callback method invoked by the system?", "OnStop()", "OnStart()", "OnCreate()", "OnRestore()", "OnCreate()", "");
        final QuestionsList question5 = new QuestionsList("What activity method you use to retrieve a reference to an Android view by using the id attribute of a resources XML?", "findViewByReference(int id);", "findViewBYId(int id);", "findViewBYId(String id);", "retrieveResourceById(int id);", "findViewById(int id);", "");
        final QuestionsList question6 = new QuestionsList("The requests from contact provider class is handled by which method?", "OnCreate", "OnSelect", "ContentResolver", "OnClick", "ContentResolver", "");
        final QuestionsList question7 = new QuestionsList("Android is a", "an operating system", "a web browser", "a web server", "none of the above", "an operating system", "");
        final QuestionsList question8 = new QuestionsList("For which of the following Android is mainly developed?", "server", "desktop", "laptop", "mobile device", "mobile device", "");
        final QuestionsList question9 = new QuestionsList("Android is based on which of the following language?", "java", "C", "C++", "nonbe of the above", "java", "");
        final QuestionsList question10 = new QuestionsList("What does API stand for?", "Application Programming Interface", "Android Programming Interface", "Android Page Interface", "Application Page Interface", "Application Programming Interface", "");

        // add all questions to List<QuestionsList>
        questionsLists.add(question1);
        questionsLists.add(question2);
        questionsLists.add(question3);
        questionsLists.add(question4);
        questionsLists.add(question5);
        questionsLists.add(question6);
        questionsLists.add(question7);
        questionsLists.add(question8);
        questionsLists.add(question9);
        questionsLists.add(question10);

        return questionsLists;
    }

    private static  List<QuestionsList> android3Questions() {

        final List<QuestionsList> questionsLists = new ArrayList<>();

        // Create object of QuestionList class and pass a questions along with option and answer
        final QuestionsList question1 = new QuestionsList("Select a component which is NOT a part of Android architecture?", "Android Framework", "Libraries", "Linux Kernel", "Android Document", "Linux Kernel", "");
        final QuestionsList question2 = new QuestionsList("A           makes a specific set of the  application data available to other application?", "Content Provider", "Broadcast Receiver", "Intent", "none of the above", "Content Provider", "");
        final QuestionsList question3 = new QuestionsList("Which among these are NOT a part of Android's native libraries?", "Depends upon the type of variable", "Webkit", "Dalvik", "OpenGL", "Dalvik", "");
        final QuestionsList question4 = new QuestionsList("During an activity life-cycle, what is the first callback method invoked by the system?", "OnStop()", "OnStart()", "OnCreate()", "OnRestore()", "OnCreate()", "");
        final QuestionsList question5 = new QuestionsList("What activity method you use to retrieve a reference to an Android view by using the id attribute of a resources XML?", "findViewByReference(int id);", "findViewBYId(int id);", "findViewBYId(String id);", "retrieveResourceById(int id);", "findViewById(int id);", "");
        final QuestionsList question6 = new QuestionsList("The requests from contact provider class is handled by which method?", "OnCreate", "OnSelect", "ContentResolver", "OnClick", "ContentResolver", "");
        final QuestionsList question7 = new QuestionsList("Android is a", "an operating system", "a web browser", "a web server", "none of the above", "an operating system", "");
        final QuestionsList question8 = new QuestionsList("For which of the following Android is mainly developed?", "server", "desktop", "laptop", "mobile device", "mobile device", "");
        final QuestionsList question9 = new QuestionsList("Android is based on which of the following language?", "java", "C", "C++", "nonbe of the above", "java", "");
        final QuestionsList question10 = new QuestionsList("What does API stand for?", "Application Programming Interface", "Android Programming Interface", "Android Page Interface", "Application Page Interface", "Application Programming Interface", "");

        // add all questions to List<QuestionsList>
        questionsLists.add(question1);
        questionsLists.add(question2);
        questionsLists.add(question3);
        questionsLists.add(question4);
        questionsLists.add(question5);
        questionsLists.add(question6);
        questionsLists.add(question7);
        questionsLists.add(question8);
        questionsLists.add(question9);
        questionsLists.add(question10);

        return questionsLists;
    }

    private static  List<QuestionsList> android4Questions() {

        final List<QuestionsList> questionsLists = new ArrayList<>();

        // Create object of QuestionList class and pass a questions along with option and answer
        final QuestionsList question1 = new QuestionsList("Select a component which is NOT a part of Android architecture?", "Android Framework", "Libraries", "Linux Kernel", "Android Document", "Linux Kernel", "");
        final QuestionsList question2 = new QuestionsList("A           makes a specific set of the  application data available to other application?", "Content Provider", "Broadcast Receiver", "Intent", "none of the above", "Content Provider", "");
        final QuestionsList question3 = new QuestionsList("Which among these are NOT a part of Android's native libraries?", "Depends upon the type of variable", "Webkit", "Dalvik", "OpenGL", "Dalvik", "");
        final QuestionsList question4 = new QuestionsList("During an activity life-cycle, what is the first callback method invoked by the system?", "OnStop()", "OnStart()", "OnCreate()", "OnRestore()", "OnCreate()", "");
        final QuestionsList question5 = new QuestionsList("What activity method you use to retrieve a reference to an Android view by using the id attribute of a resources XML?", "findViewByReference(int id);", "findViewBYId(int id);", "findViewBYId(String id);", "retrieveResourceById(int id);", "findViewById(int id);", "");
        final QuestionsList question6 = new QuestionsList("The requests from contact provider class is handled by which method?", "OnCreate", "OnSelect", "ContentResolver", "OnClick", "ContentResolver", "");
        final QuestionsList question7 = new QuestionsList("Android is a", "an operating system", "a web browser", "a web server", "none of the above", "an operating system", "");
        final QuestionsList question8 = new QuestionsList("For which of the following Android is mainly developed?", "server", "desktop", "laptop", "mobile device", "mobile device", "");
        final QuestionsList question9 = new QuestionsList("Android is based on which of the following language?", "java", "C", "C++", "nonbe of the above", "java", "");
        final QuestionsList question10 = new QuestionsList("What does API stand for?", "Application Programming Interface", "Android Programming Interface", "Android Page Interface", "Application Page Interface", "Application Programming Interface", "");

        // add all questions to List<QuestionsList>
        questionsLists.add(question1);
        questionsLists.add(question2);
        questionsLists.add(question3);
        questionsLists.add(question4);
        questionsLists.add(question5);
        questionsLists.add(question6);
        questionsLists.add(question7);
        questionsLists.add(question8);
        questionsLists.add(question9);
        questionsLists.add(question10);

        return questionsLists;
    }

    public static List<QuestionsList> getQuestions(String selectedTopicName) {
        switch (selectedTopicName){
            case "java":
                return javaQuestions();
            case "php":
                return phpQuestions();
            case "android":
                return androidQuestions();
            case "android1":
                return android1Questions();
            case "android2":
                return android2Questions();
            case "android3":
                return android3Questions();
            case "android4":
                return android4Questions();
            default:
                return htmlQuestions();
        }
    }

}
