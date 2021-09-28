
public class Edge extends Node{
public int weight;
	public Edge(int id1, int id2, int weight) {//
		super(id1, id2);
		this.weight=weight;
	}
	@Override
	public String toString() {
		return "("+id1+", "+id2+")";
	}


}
