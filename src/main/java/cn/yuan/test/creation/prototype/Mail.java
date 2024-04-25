package cn.yuan.test.creation.prototype;

public class Mail implements Prototype{
    private String sender;
    private String receiver;
    private String subject;

    public Mail(String sender, String receiver, String subject){
        this.sender = sender;
        this.receiver = receiver;
        this.subject = subject;
    }

    @Override
    public Prototype clone() {
        return new Mail(this.sender, this.receiver, this.subject);
    }

    @Override
    public String toString() {
        return "Mail{" +
                "sender='" + sender + '\'' +
                ", receiver='" + receiver + '\'' +
                ", subject='" + subject + '\'' +
                '}';
    }
}
