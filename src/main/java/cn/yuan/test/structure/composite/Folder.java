package cn.yuan.test.structure.composite;

import java.util.ArrayList;
import java.util.List;

/**
 * 容器文件夹
 *
 * @author abner<huiyuan.zhang @ hex-tech.net>
 * @date 2024-04-25 11:16:22
 */
public class Folder implements FileSystemComponent {
    private String name;
    private List<FileSystemComponent> components = new ArrayList<>();

    public Folder(String name) {
        this.name = name;
    }

    public void add(FileSystemComponent component) {
        components.add(component);
    }

    @Override
    public void dispaly() {
        System.out.println("Folder: " + name);
        for (FileSystemComponent component : components) {
            component.dispaly();
        }
    }
}
