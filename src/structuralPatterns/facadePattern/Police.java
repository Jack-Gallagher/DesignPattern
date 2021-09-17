package structuralPatterns.facadePattern;

public class Police {
    public void checkLetter(ILetterProcess letterProcess){
        System.out.println(letterProcess + "letter has been checked");
    }
}
