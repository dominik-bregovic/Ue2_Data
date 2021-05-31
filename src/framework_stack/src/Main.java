package framework_stack.src;

import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * Main class that is the entry point of the stack and infix to postfix notation
 * program.
 */
public class Main {

    public static void main(String[] args) {


        if (args.length != 1) {
            System.err.println("Error: Please specify an input file");
            System.exit(-1);
        }

        // read input
        IOHandler ioHandler=new IOHandler();
        List<String> input = ioHandler.readInput(args[0]);
        System.out.println("Input File: " + args[0]);

        // create stack
        MyStack my_stack = new MyStack();
        StringBuilder result = new StringBuilder();

        //infixToPostfix testcase
        if(!input.get(0).equals("stack")) {
            String postfix = infixToPostfix(input.get(0), my_stack);
            result.append(postfix);
        }
        else {
            //stack testcase
            for(int i=1;i< input.size();i++){

                //get character between parentheses
                String line = input.get(i);
                char char_within_brackets=' ';
                Matcher character_matcher = Pattern.compile("\\((.?)\\)").matcher(line);
                while(character_matcher.find()) {
                    String match=character_matcher.group();
                    char_within_brackets=match.charAt(1);
                }

                if(line.contains("push")) {
                    my_stack.push((char)char_within_brackets);
                }
                else if (line.contains("pop")){
                    char value = my_stack.pop();
                }
                else {
                    //print
                    result.append(my_stack.toString());
                }
            }
        }

        System.out.println("Result: " + result.toString());
        ioHandler.printResultToOutputFile(result.toString(),args[0]);
    }


    /**
     * Converts an expression in infix notation to its equivalent postfix notation using the class MyStack
     * @param input The String in infix notation (without any whitespaces, tabulators,...)
     * @param stack An instance of your stack class.
     * @return String that contains input in postfix notation
     */
    public static String infixToPostfix(String input, MyStack stack){
        //TODO

        return "";
    }

}
