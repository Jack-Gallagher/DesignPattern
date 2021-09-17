package structuralPatterns.facadePattern;

public class PostOffice {
    private ILetterProcess letterProcess = new Letter();
    private Police police = new Police();
    public void sendLetter(String context,String address){
        letterProcess.write(context);
        letterProcess.address(address);
        police.checkLetter(letterProcess);
        letterProcess.send();
    }
}
