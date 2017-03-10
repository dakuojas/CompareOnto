package COMPAREONTO;

import java.util.ArrayList;

public class Similarity 
{
	public String node1;
	public ArrayList<String> node2_1to1 = new ArrayList<>();
	public ArrayList<String> node2_1tom = new ArrayList<>();
	
	public Similarity() 
	{
	}
	
	public String toString()
	{
		return "node1 : "+node1+"\n"
				+"node2_1to1 : "+node2_1to1+"\n"
				+"node2_1tom : "+node2_1tom+"\n";
	}
}
