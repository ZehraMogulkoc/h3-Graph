import java.util.*;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
public class Graph {
    int a;
	
    LinkedList<Edge> list[];
	public Graph(int s){
		list= new LinkedList[s];
		for(int i=0;i<list.length;i++) {
			list[i]=new LinkedList<Edge>();
		}
	}
	public void addEdge(int a, int b,int c) {
		list[a].add(new Edge(b,c,0));
	}
public static void main(String[] args) {
	
	int lastnum=0;
		Edge mygraph= new Edge(0,0,0);
		Graph ng= new Graph(32836);
		File files= new File("Input.txt");
   	 try {
   		
			Scanner reader = new Scanner(files);
			while(reader.hasNext()) {
				
				mygraph.id1=reader.nextInt();
				mygraph.id2=reader.nextInt();
				mygraph.weight=reader.nextInt();
				lastnum=mygraph.id2;
				ng.addEdge(mygraph.id2, mygraph.id1, mygraph.weight);
			
			}
			reader.close();
			} 
   	catch (FileNotFoundException e) {
			e.printStackTrace();
		}
   	File file = new File("Output.txt"); 
   	try {
		FileWriter writer= new FileWriter(file,true);
		for(int i=1;i<=lastnum;i++) {
			writer.write("Node "+i+"==>"+ng.list[i]+"\n");
			System.out.println(i+"==>"+ng.list[i]);
		}
		writer.close();
	} catch (IOException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
}}
