package dz5;


import java.io.Serializable;
import java.util.ArrayList;

public class FileClass implements Serializable {


    private ArrayList <String> header;
    private int[][] data;

    public FileClass(ArrayList<String> header, int[][] data) {
        this.header = header;
        this.data = data;
    }

    public ArrayList getHeader() {
        return header;
    }

    public int[][] getData() {
        return data;
    }
}