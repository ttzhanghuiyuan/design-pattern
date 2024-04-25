package cn.yuan.test.structure.composite;

public class Test {

    public static void main(String[] args) {
        File file1 = new File("file1.txt");
        File file2 = new File("file2.txt");
        File file3 = new File("file3.txt");

        Folder folder1 = new Folder("Folder1");
        folder1.add(file1);
        folder1.add(file2);

        Folder folder2 = new Folder("Folder2");
        folder2.add(file3);
        folder2.add(folder1);

        folder2.dispaly();
    }
}
