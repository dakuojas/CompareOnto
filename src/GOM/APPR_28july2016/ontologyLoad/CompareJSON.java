package GOM.APPR_28july2016.ontologyLoad;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;

public class CompareJSON {
    
    public static ArrayList<Similarity> alOJ;
    public static ArrayList<Similarity> alUJ;
    
	public static void main(String[] args) throws IOException 
	{
		UJCreator ujc = new UJCreator();
		
		String file1 = "OJOutput.json";
		String file2 = "UJOutput.json";
				
		JSONIO jsonio = new JSONIO();
		
		alOJ = jsonio.read(file1);
		alUJ = jsonio.read(file2);
		
		jsonio.print(file1);

		for(Similarity s : alOJ)
			System.out.println(s);
		
		//CALCULATE TP
		//CALCULATE FP
		//CALCULATE PRECISION
		//CALCULATE RECALL
				
	}
	
	public void count()
	{
		
	}

}
