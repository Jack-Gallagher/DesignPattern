package prototypePattern;

import com.sun.tools.javac.Main;

/**
 * @Author：Jack
 * @Date： 2021/9/8 - 22:58
 * @Description： prototypePattern
 * @Version： 1.0
 */
public class Mail implements Cloneable{
    private String receiver;
    private String subject;
    private String appellation;
    private String context;
    private String tail;

    public Mail(AdvTemplate advTemplate) {
        this.context = advTemplate.getAdvContxt();
        this.subject = advTemplate.getAdvSubject();
    }

    public Mail clone(){
        Mail mail = null;
        try {
            mail = (Mail) super.clone();
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }
        return mail;
    }

    public String getReceiver() {
        return receiver;
    }

    public void setReceiver(String receiver) {
        this.receiver = receiver;
    }

    public String getSubject() {
        return subject;
    }

    public void setSubject(String subject) {
        this.subject = subject;
    }

    public String getAppellation() {
        return appellation;
    }

    public void setAppellation(String appellation) {
        this.appellation = appellation;
    }

    public String getContext() {
        return context;
    }

    public void setContext(String context) {
        this.context = context;
    }

    public String getTail() {
        return tail;
    }

    public void setTail(String tail) {
        this.tail = tail;
    }
}