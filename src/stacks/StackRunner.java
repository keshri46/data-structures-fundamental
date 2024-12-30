package stacks;

public class StackRunner {
    public static void main(String[] args) {
        WebHistory history = new WebHistory();
        history.visitPage("www.amazon.com");
        history.visitPage("www.flipkart.com");
        history.visitPage("www.myntra.com");
        history.visitPage("www.code.com");
        history.previousPage();
        history.previousPage();
        history.previousPage();
        history.previousPage();
        history.previousPage();
        history.previousPage();
        history.previousPage();
        history.nextPage();
        history.nextPage();
        history.nextPage();
        history.nextPage();
        history.nextPage();
        history.nextPage();
        history.nextPage();
        history.previousPage();
        history.previousPage();
        history.nextPage();
    }
}
