package cn.yuan.test.structure.composite;

/**
 * 叶子:文件
 *
 * @author abner<huiyuan.zhang @ hex-tech.net>
 * @date 2024-04-25 11:14:47
 */
public class File implements FileSystemComponent {

    private String name;

    public File(String name) {
        this.name = name;
    }


    @Override
    public void dispaly() {
        System.out.println("File: " + name);
    }
}
