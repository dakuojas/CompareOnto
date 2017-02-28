package GOM.APPR_28july2016.ontologyLoad;

import java.util.ArrayList;

public class Similarity 
{
	String node1;
	ArrayList<String> node2_1to1 = new ArrayList<>();
	ArrayList<String> node2_1tom = new ArrayList<>();
	
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
