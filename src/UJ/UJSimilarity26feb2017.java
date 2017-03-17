package UJ;

import java.util.ArrayList;



public class UJSimilarity26feb2017 {
	public String Node1="";
	//String Node2_1to1;
	public ArrayList<String> Node2_1tom=new ArrayList<String>();
	public ArrayList<String> Node2_1to1=new ArrayList<String>();
	
	public double Rank;
	public double Simi;
	//UJSimilarityClass ujsimi_node1_1to1=new UJSimilarityClass();
	//ArrayList<UJSimilarityClass> ujsimi_node2_1tom=new ArrayList<UJSimilarityClass>();
	public UJSimilarity26feb2017()
	{
		
	}
	public String toString()
	{
		return "node1 : "+Node1+"\n"
				+"node2_1to1 : "+Node2_1to1+"\n"
				+"node2_1tom : "+Node2_1tom+"\n";
	}
	/*public String toString(){
		String str="";
		str="  " + this.Node1 + "  *  " + this.Node2_1to1 +"   "+Node2_1tom+"\n" ;
		return(str);
	}*/

}
