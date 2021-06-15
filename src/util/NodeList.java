package util;

public class NodeList {

    public int data;
    public NodeList next;

    public NodeList(int data){
        this.data = data;
        next = null;
    }

    @Override
    public String toString(){
        return data + "";
    }
}
