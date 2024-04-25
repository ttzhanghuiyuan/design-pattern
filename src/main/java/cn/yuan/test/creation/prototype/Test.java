package cn.yuan.test.creation.prototype;

public class Test {

    public static void main(String[] args) {
        Mail mail = new Mail("yuan", "yuan", "subject");
        System.out.println("original mail :"+ mail);

        Mail clonedMail = (Mail)mail.clone();
        System.out.println("cloned mail :" + clonedMail);
    }
}
