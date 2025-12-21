package pattern.IteratorPattern;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

// Generic Iterator Interface
interface MyIterator<T> {
    boolean hasNext();
    T next();
}

// Generic Iterable Interface
interface MyIterable<T> {
    MyIterator<T> getIterator();
}

// LinkedList Node
class LinkedList implements MyIterable<Integer> {
    public LinkedList next;
    int data;

    LinkedList(int data) {
        this.data = data;
        next = null;
    }

    @Override
    public MyIterator<Integer> getIterator() {
        return new LinkedListIterator(this);
    }
}

// LinkedList Iterator
class LinkedListIterator implements MyIterator<Integer> {
    LinkedList curr;

    public LinkedListIterator(LinkedList head) {
        this.curr = head;
    }

    @Override
    public boolean hasNext() {
        return curr != null;
    }

    @Override
    public Integer next() {
        int value = curr.data;
        curr = curr.next;
        return value;
    }
}

// BinaryTree Node
class BinaryTree implements MyIterable<Integer> {
    BinaryTree left;
    BinaryTree right;
    int data;

    BinaryTree(int data) {
        this.data = data;
    }

    @Override
    public MyIterator<Integer> getIterator() {
        return new BinaryTreeIterator(this);
    }
}

// Binary Tree Iterator (Inorder)
class BinaryTreeIterator implements MyIterator<Integer> {
    Stack<BinaryTree> stack = new Stack<>();

    public BinaryTreeIterator(BinaryTree root) {
        pushLeft(root);
    }

    private void pushLeft(BinaryTree node) {
        while (node != null) {
            stack.push(node);
            node = node.left;
        }
    }

    @Override
    public boolean hasNext() {
        return !stack.isEmpty();
    }

    @Override
    public Integer next() {
        BinaryTree node = stack.pop();
        int val = node.data;

        if (node.right != null) {
            pushLeft(node.right);
        }

        return val;
    }
}

// Song Class
class Song {
    private String name;
    private String artist;

    public Song(String name, String artist) {
        this.name = name;
        this.artist = artist;
    }

    public String toString() {
        return name + " by " + artist;
    }
}

// Playlist Class
class Playlist implements MyIterable<Song> {
    List<Song> songs = new ArrayList<>();

    public void addSong(Song s) {
        songs.add(s);
    }

    @Override
    public MyIterator<Song> getIterator() {
        return new PlaylistIterator(songs);
    }
}

// Playlist Iterator
class PlaylistIterator implements MyIterator<Song> {
    private List<Song> songs;
    int index;

    PlaylistIterator(List<Song> songs) {
        this.songs = songs;
        index = 0;
    }

    @Override
    public boolean hasNext() {
        return index < songs.size();
    }

    @Override
    public Song next() {
        return songs.get(index++);
    }
}


// MAIN DRIVER
public class Main {
    public static void main(String[] args) {

        System.out.println("=== Linked List Iterator ===");

        LinkedList head = new LinkedList(1);
        head.next = new LinkedList(2);
        head.next.next = new LinkedList(3);
        head.next.next.next = new LinkedList(4);

        MyIterator<Integer> listIter = head.getIterator();
        while (listIter.hasNext()) {
            System.out.println(listIter.next());
        }


        System.out.println("\n=== Binary Tree Iterator (Inorder) ===");

        BinaryTree root = new BinaryTree(10);
        root.left = new BinaryTree(5);
        root.right = new BinaryTree(20);
        root.left.left = new BinaryTree(3);
        root.left.right = new BinaryTree(8);

        MyIterator<Integer> treeIter = root.getIterator();
        while (treeIter.hasNext()) {
            System.out.println(treeIter.next());
        }


        System.out.println("\n=== Playlist Iterator ===");

        Playlist playlist = new Playlist();
        playlist.addSong(new Song("Shape of You", "Ed Sheeran"));
        playlist.addSong(new Song("Believer", "Imagine Dragons"));
        playlist.addSong(new Song("Levitating", "Dua Lipa"));

        MyIterator<Song> playIter = playlist.getIterator();
        while (playIter.hasNext()) {
            System.out.println(playIter.next());
        }
    }
}
