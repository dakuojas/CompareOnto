package UJ;

import java.util.ArrayList;



public class UJSimilarity26feb2017 {
	public String Node1="";
	//String Node2_1to1;
	public ArrayList<String> Node2_1tom=new ArrayList<>();
	public ArrayList<String> Node2_1to1=new ArrayList<>();
	public ArrayList<SpacialyRelatedNode> Node2_1tos = new ArrayList<>();
	
	//UJSimilarityClass ujsimi_node1_1to1=new UJSimilarityClass();
	//ArrayList<UJSimilarityClass> ujsimi_node2_1tom=new ArrayList<UJSimilarityClass>();
	public UJSimilarity26feb2017()
	{
		
	}
	public String toString()
	{
//		StringBuffer string = new StringBuffer();
		String string = "";
		for(SpacialyRelatedNode srn : Node2_1tos)
		{	
			string = string+srn.toString();
			
		}
		
		return "node1 : "+Node1+"\n"
				+"node2_1to1 : "+Node2_1to1+"\n"
				+"node2_1tom : "+Node2_1tom+"\n"
				+"node2_1tos :"+string+"\n";
	}
	/*public String toString(){
		String str="";
		str="  " + this.Node1 + "  *  " + this.Node2_1to1 +"   "+Node2_1tom+"\n" ;
		return(str);
	}*/

}
