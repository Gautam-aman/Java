package pattern.IteratorPattern;

import java.util.Iterator;
import java.util.List;

interface MyIterator<T> {
    boolean hasNext();
    T next();
}

interface MyIterable<T> {
    MyIterator<T> getIterator();
}

class LinkedList implements MyIterable<Integer> {
    public LinkedList next;
    int data;

    LinkedList(int data){
        this.data = data;
        next = null;
    }

    @Override
    public MyIterator<Integer> getIterator() {
        return null;
    }
}

class BinaryTree implements MyIterable<Integer> {
    BinaryTree left;
    BinaryTree right;
    int data;
    BinaryTree(int data){
        this.data = data;
        left = null;
        right = null;
    }
    @Override
    public MyIterator<Integer> getIterator() {
        return null;
    }
}

class Playlist implements MyIterable<Integer> {

    List<Song> songs;
    public void addSong(Song song){
        songs.add(song);
    }

    @Override
    public MyIterator<Integer> getIterator() {
        return null;
    }
}

class Song{
    private String name;
    private String artist;
    public Song(String name,String artist){
        this.name = name;
        this.artist = artist;
    }
}

class LinkedlistIterator implements MyIterator<Integer>{
    LinkedList curr;
    public LinkedlistIterator(LinkedList head){
        this.curr = head;
    }
    @Override
    public boolean hasNext() {
        return curr.next != null;
    }
    @Override
    public Integer next() {
        int value = curr.data;
        curr = curr.next;
        return value;
    }
}


public class Main {
    public static void main(String[] args) {

    }
}
