import java.util.*; 
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
public class Node {
	public int id1;
	public int id2;
    public Node(int id1,int id2) {
    	this.id1=id1;
    	this.id2=id2;
    }
    public void setId1(int id1) {
    	this.id1=id1;
    } 
    public int getId1() {
    	return this.id1;
    }
    public void setId2(int id2) {
    	this.id2=id2;
    } 
    public int getId2() {
    	return this.id2;
    }
  }

