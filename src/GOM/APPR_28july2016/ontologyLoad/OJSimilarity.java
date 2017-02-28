package GOM.APPR_28july2016.ontologyLoad;

import java.util.ArrayList;

public class OJSimilarity 
{
	String node1;
//	String node2_1to1;
	ArrayList<String> node2_1to1;
	ArrayList<String> node2_1tom;
	
	public OJSimilarity() 
	{
	}
	
	public String toString()
	{
		return "node1 :"+node1+"\n"
				+"node2_1to1 "+node2_1to1+"\n"
				+"node2_1tom : "+node2_1tom+"\n";
	}
}
