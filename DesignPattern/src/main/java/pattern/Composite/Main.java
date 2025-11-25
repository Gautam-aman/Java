package pattern.Composite;

import java.awt.print.Pageable;
import java.util.ArrayList;
import java.util.List;

interface FileSystemManager{
    public void openAll();
    public void ls();
    public int getSize();
    public FileSystemManager cd(String name);
    public String getName();
    public boolean isFolder();
}

class File implements FileSystemManager{
    String name;
    int size;
    public File(String name,int size){
        this.name=name;
        this.size=size;
    }

    @Override
    public void openAll() {
        System.out.println(" " +  name);
    }

    @Override
    public void ls() {
        System.out.println(" " +  name);
    }

    @Override
    public int getSize() {
        return this.size;
    }

    @Override
    public FileSystemManager cd(String name) {
        return null;
    }

    @Override
    public String getName() {
        return this.name;
    }

    @Override
    public boolean isFolder() {
        return false;
    }
}

class Folder implements FileSystemManager{
    String name;
    List<FileSystemManager> items = new ArrayList<>();

    public Folder(String name){
        this.name=name;
    }

    public void add(FileSystemManager item){
        items.add(item);
    }

    @Override
    public void openAll() {
       for(FileSystemManager item:items){
           item.openAll();
       }
    }

    @Override
    public void ls() {

        for (FileSystemManager item:items){
            if (item.isFolder()){
                System.out.println(item.getName() + " (Folder)");
            }
            else {
                System.out.println(item.getName());
            }
        }

    }

    @Override
    public int getSize() {
       int sum = 0 ;
       for (FileSystemManager item:items){
           sum += item.getSize();
       }
       return sum;
    }

    @Override
    public FileSystemManager cd(String name) {
        for (FileSystemManager item:items){
            if (item.isFolder() && item.getName().equals(name)){
                return item;
            }
        }
        return null;
    }

    @Override
    public String getName() {
        return this.name;
    }

    @Override
    public boolean isFolder() {
        return true;
    }
}

public class Main {
    public static void main(String[] args) {
        Folder folder = new Folder("root");
        File file = new File("Photo1" , 5);
        File file2 = new File("Photo2" , 10);
        File file3 = new File("Photo3" , 15);
        File file4 = new File("Photo4" , 20);
        folder.add(file);
        folder.add(file2);
        folder.add(file3);
        folder.add(file4);

        Folder folder1 = new Folder("root1");
        File file7 =  new File("Photo1" , 5);
        File file8 = new File("Photo2" , 10);
        folder1.add(file7);
        folder1.add(file8);
        folder.add(folder1);

        folder.getSize();
        folder.openAll();
        folder.ls();

    }
}
