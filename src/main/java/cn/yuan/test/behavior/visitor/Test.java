package cn.yuan.test.behavior.visitor;

public class Test {

    public static void main(String[] args) {
        Website website = new Website();
        website.addElement(new Article());
        website.addElement(new Comment());

        Admin admin = new Admin();
        website.accept(admin);
    }
}
