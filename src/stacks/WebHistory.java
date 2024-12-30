package stacks;

import java.util.Stack;

public class WebHistory {
    private Stack<String> backwardStack;
    private Stack<String> forwardStack;
    private String currentPage;

    public WebHistory(){
        backwardStack = new Stack<>();
        forwardStack = new Stack<>();
        currentPage ="HomePage";
    }

    public void visitPage(String url){
        if (url!=null){
            backwardStack.push(url);
            currentPage = url;
            forwardStack.clear();
            //System.out.println(currentPage);
        }
        else
            System.out.println("Invalid URL");
    }

    public void previousPage(){
        if (!backwardStack.isEmpty()){
            forwardStack.push(currentPage);
            currentPage = backwardStack.pop();
        }
        else
            System.out.println("Reached home page");
        System.out.println(currentPage);
    }

    public void nextPage(){
        if (!forwardStack.isEmpty()){
            backwardStack.push(currentPage);
            currentPage = forwardStack.pop();
        }
        else
            System.out.println("Reached last page");
        System.out.println(currentPage);
    }

    public String getCurrentPage(){
        return currentPage;
    }

}
