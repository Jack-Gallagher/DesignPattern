package prototypePattern;

/**
 * @Author：Jack
 * @Date： 2021/9/8 - 22:59
 * @Description： prototypePattern
 * @Version： 1.0
 */
public class Client {
    private static int MAX = 6;
    public static void main(String[] args) {
        int i = 0;
        final Mail mail = new Mail(new AdvTemplate());
        mail.setTail("of bank");

        while (i < MAX){
            mail.setAppellation(i+"sir");
            mail.setReceiver(i + "@email");
            sendMail(mail);
            i++;
        }
    }

    private static void sendMail(Mail mail) {
        System.out.println("title :"+mail.getSubject()+"receiver:"+mail.getReceiver());
    }
}
