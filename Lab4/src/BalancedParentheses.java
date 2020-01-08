package OOP_univer.lab_4_done;

import java.util.Stack;

import javax.script.ScriptEngineManager;
import javax.script.ScriptEngine;
import javax.script.ScriptException;

public class BalancedParentheses {

    BalancedParentheses(String text) throws ScriptException {

        String[] splittedString = text.split("\n");
        for(String everyLine : splittedString){

            checkParenthesis(everyLine);

        }
    }
        boolean checkParenthesis(String expression) throws ScriptException {

            Stack<Character> Stack = new Stack<>();

            char[] equation = expression.toCharArray();
            for (char element : equation) {

                if (element == ')') {

                    char top = Stack.peek();
                    Stack.pop();

                    int elementsInside = 0;
                    while (top != '(') {
                        elementsInside++;
                        top = Stack.peek();
                        Stack.pop();
                    }
                    if (elementsInside < 1) {
                        System.out.println("The expression is not correct");
                        return true;
                    }
                }
                else {

                    Stack.push(element);
                }
            }
            if(!expression.contains("x")){
                ScriptEngineManager manager = new ScriptEngineManager();
                ScriptEngine engine = manager.getEngineByName("JavaScript");
                System.out.println("The expression is correct, the result is " + engine.eval(expression));
            }else
                System.out.println("The expression is correct");
            return false;
        }

    }
