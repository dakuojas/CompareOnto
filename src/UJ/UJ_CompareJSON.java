package UJ;




import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;



public class UJ_CompareJSON 
{    
    public static ArrayList<UJSimilarity26feb2017> alREF;
    public static ArrayList<UJSimilarity26feb2017> alALIGN;
    
    //SWITCH
    public static final int ONE2ONE = 1;
    public static final int ONE2MANY = 2;
    public static double Round(double Rval, int Rpl) {
		 double p = (double)Math.pow(10,Rpl);
		  Rval = Rval * p;
		  double tmp = Math.round(Rval);
		  return (double)tmp/p;
		  }
	 
	public static void main(String[] args) throws IOException 
	{

//		USE THIS TO CREATE "ALIGNMENT.json". SEE UJCreator.java
//		UJCreator ujc = new UJCreator();	
		
		//String file1 = "REFERENCE.json";
		//String file2 = "ALIGNMENT.json";
		//Road
		//String file1 = "C:/UjwalaNew25Nov2013/NewEclispeWorkspace26july2016/UJ_SIMILARITYLIBRARY_RELEASE/ReferenceOntologies/Sensor/Reference_NDBC-GomooSe.json";
		//String file2 = "C:/UjwalaNew25Nov2013/NewEclispeWorkspace26july2016/UJ_SIMILARITYLIBRARY_RELEASE/Alignment/TAVPPRp/Sensor/Output_TAVPPRp_NDBC-GomooSe.json";
		//String file1 = "C:/UjwalaNew25Nov2013/NewEclispeWorkspace26july2016/UJ_SIMILARITYLIBRARY_RELEASE/ReferenceOntologies/Orgnization/Reference_BMC-State.json";
		//String file2 = "C:/UjwalaNew25Nov2013/NewEclispeWorkspace26july2016/UJ_SIMILARITYLIBRARY_RELEASE/Alignment/TAVPPRp/Organization/Output_TAVPPRp_BMC-State.json";
		//String file1 = "C:/UjwalaNew25Nov2013/NewEclispeWorkspace26july2016/UJ_SIMILARITYLIBRARY_RELEASE/ReferenceOntologies/Road/Reference_OSM-Indian-.json";
		//String file2 = "C:/UjwalaNew25Nov2013/NewEclispeWorkspace26july2016/UJ_SIMILARITYLIBRARY_RELEASE/Alignment/TAVPPRp/Road/Output_TAVPPRp_OSM-Indian-.json";
		//String file1 = "C:/UjwalaNew25Nov2013/NewEclispeWorkspace26july2016/UJ_SIMILARITYLIBRARY_RELEASE/ReferenceOntologies/LandCover/Reference_IGBP-OLSON.json";
		//String file2 = "C:/UjwalaNew25Nov2013/NewEclispeWorkspace26july2016/UJ_SIMILARITYLIBRARY_RELEASE/Alignment/TAVPPRp/Lancover-LandUse/Output_TAVPPRp_IGBP-OLSON.json";
				String filepath1="C:/UjwalaNew25Nov2013/NewEclispeWorkspace26july2016/UJ_SIMILARITYLIBRARY_RELEASE//ReferenceOntologies/";
				String filepath2="C:/UjwalaNew25Nov2013/NewEclispeWorkspace26july2016/UJ_SIMILARITYLIBRARY_RELEASE/Alignment/";
		String file1 = filepath1+"Orgnization/Reference_State-BMC.json";
		String file2 = filepath2+"TVPPR/TVPPR_State-BMC.json";
					
		UJ_JSONIO jsonio = new UJ_JSONIO();
		
		alREF = jsonio.read(file1);
		alALIGN = jsonio.read(file2);
		//for()
		//jsonio.print(file1);
		//jsonio.print(file2);
	/*for(UJSimilarity26feb2017 s2 : alALIGN)
		{
			System.out.println("- "+s2.Node1);
		}*/
		int sizeofALIGN_1to1 = getSize(alALIGN , ONE2ONE);
		int sizeofALIGN_1tom = getSize(alALIGN , ONE2MANY); 
		int sizeofREF_1to1 = getSize(alREF , ONE2ONE);
		int sizeofREF_1tom = getSize(alREF , ONE2MANY);
		
		System.out.println("REF_1to1 : "+sizeofREF_1to1);
		System.out.println("REF_1tom : "+sizeofREF_1tom);
		
		System.out.println("ALIGN_1to1 : "+sizeofALIGN_1to1);
		System.out.println("ALIGN_1tom : "+sizeofALIGN_1tom);
		

		System.out.println("--------------------1to1-------------------------");

		List<String> INTER1to1 = new ArrayList<>();
		List<List<String>> RMINA1to1 = new ArrayList<>();
		List<List<String>> AMINR1to1 = new ArrayList<>(); 
		
		INTER1to1 = INTERSECTION(alALIGN, alREF, ONE2ONE);
		System.out.println(" INTER1to1 ......"+INTER1to1.size());
 		RMINA1to1 = DIFFERENCE(alREF, alALIGN, ONE2ONE);
 		System.out.println(" RMINA1to1 ......"+RMINA1to1.size());
		AMINR1to1 = DIFFERENCE(alALIGN, alREF, ONE2ONE);
		System.out.println(" AMINR1to1 ......"+AMINR1to1.size());
//		/*UNCOMMENT THE FOLLOWING FOR DEBUGGING
//		System.out.println("DIFF 1to1: "+ RMINA1to1);
		System.out.println("1to1 FP : "+countinside(RMINA1to1));
//		System.out.println("DIFF 1to1 REV: "+ AMINR1to1);
		System.out.println("1to1 FN: "+countinside(AMINR1to1));
//		System.out.println("INTERSECTION 1to1 : "+INTER1to1);
		System.out.println("1to1 TP: "+INTER1to1.size());
		
//		FORMAT : PrecisionRecall(TP,FP,FN)
//		PrecisionRecall(INTERSECTION(alALIGN, alREF, ONE2ONE).size(),
//						countinside(DIFFERENCE(alREF, alALIGN, ONE2ONE)),
//						countinside(DIFFERENCE(alALIGN, alREF, ONE2ONE)));
		
		
		System.out.println("1to1 PRECISION :"+Round(Precision(INTERSECTION(alALIGN, alREF, ONE2ONE).size(),
														countinside(DIFFERENCE(alREF, alALIGN, ONE2ONE))),3));
		System.out.println("1to1 RECALL :"+Round(Recall(INTERSECTION(alALIGN, alREF, ONE2ONE).size(),
										   countinside(DIFFERENCE(alALIGN, alREF, ONE2ONE))),3));
		
		System.out.println("--------------------1tom-------------------------");		

		List<String> INTER1tom = new ArrayList<>();
		List<List<String>> RMINA1tom = new ArrayList<>();
		List<List<String>> AMINR1tom = new ArrayList<>();
		
		INTER1tom = INTERSECTION(alALIGN, alREF, ONE2MANY);
		RMINA1tom = DIFFERENCE(alREF, alALIGN, ONE2MANY);
		AMINR1tom = DIFFERENCE(alALIGN, alREF, ONE2MANY);
		
		

//		UNCOMMENT THE FOLLOWING FOR DEBUGGING
//		System.out.println("DIFF 1tom : "+RMINA1tom);
		System.out.println("1tom FP: "+countinside(RMINA1tom));
//		System.out.println("DIFF 1tom REV: "+AMINR1tom);
		System.out.println("1tom FN: "+countinside(AMINR1tom));
//		System.out.println("INTERSECTION 1tom : "+INTER1tom);
		System.out.println("1tom TP: "+INTER1tom.size());

//		FORMAT : PrecisionRecall(TP,FP,FN)
//		PrecisionRecall(INTERSECTION(alALIGN, alREF, ONE2MANY).size(),
//				countinside(DIFFERENCE(alREF, alALIGN, ONE2MANY)),
//				countinside(DIFFERENCE(alALIGN, alREF, ONE2MANY)));
		
		System.out.println("1tom PRECISION :"+Round(Precision(INTERSECTION(alALIGN, alREF, ONE2MANY).size(),
											 			countinside(DIFFERENCE(alREF, alALIGN, ONE2MANY))),3));
		System.out.println("1tom RECALL :"+Round(Recall(INTERSECTION(alALIGN, alREF, ONE2MANY).size(),
												  countinside(DIFFERENCE(alALIGN, alREF, ONE2MANY))),3));

			
	}
	
//---------------------------FUNCTIONS----------------------------------------------
	//RETURNING FUNCTION FOR PRECISION 
	public static double Precision(double TP , double FP)
	{
		double precision = 0.0;
		precision = TP/(TP+FP);
		return precision;

	}
	//RETURNING METHOD FOR RECALL
	public static double Recall(double TP , double FN) 
	{
		double recall = 0.0;
		recall = TP/(TP+FN);
		return recall;
	}
	//NON RETURNING PRECISION AND RECALL
	public static void PrecisionRecall(double TP , double FP , double FN)
	{
		double precision = 0.0;
		double recall = 0.0;
		precision = TP/(TP+FP);
		recall = TP/(TP+FN);
		System.out.println("Precision : "+precision);
		System.out.println("Recall : "+recall);
	}
	public static List<List<String>>DIFFERENCE
	(ArrayList<UJSimilarity26feb2017> al1,ArrayList<UJSimilarity26feb2017> al2, int SWITCH) 
	{
		List<List<String>> tempdiff = new ArrayList<>();
		List<List<String>> diff = new ArrayList<>();
		
		if(SWITCH == ONE2ONE)
		{
			for(UJSimilarity26feb2017 s1 : al1)
			{
				for(UJSimilarity26feb2017 s2 : al2)
				{
					String string1 = s1.Node1;
					String string2 = s2.Node1;
					if(string1.equalsIgnoreCase(string2))
					{
						tempdiff.add(s1.Node2_1to1
											.stream()
											.filter(el->!s2.Node2_1to1.contains(el))
											.collect(Collectors.toList()));
						break;
					}									
				}
			}
		}
		else
		{
			for(UJSimilarity26feb2017 s1 : al1)
			{
				for(UJSimilarity26feb2017 s2 : al2)
				{
					String string1 = s1.Node1;
					String string2 = s2.Node1;
					if(string1.equalsIgnoreCase(string2))
					{
						tempdiff.add(s1.Node2_1tom
											.stream()
											.filter(el->!s2.Node2_1tom.contains(el))
											.collect(Collectors.toList()));
						break;
					}									
				}
			}
		}
		
		diff = removeNULLS(tempdiff);
		
		return diff;
	}
	public static boolean isBlankOrNull(String str) {
	    boolean flag=false;
	    if(str==null || str.equalsIgnoreCase("null")||str.length()<=1 || str.isEmpty() ||"".equals(str.trim()))
	    {
	    	return(true);
	    }
	    return(false);
	}
	public static List<String> INTERSECTION(ArrayList<UJSimilarity26feb2017> al1 , ArrayList<UJSimilarity26feb2017> al2, int SWITCH) 
	{
		List<String> inter = new ArrayList<>();
		if(SWITCH == ONE2ONE)
		{
			for(UJSimilarity26feb2017 s1 : al1)
			{ //System.out.println( s1.Node1+"=>");
				for(UJSimilarity26feb2017 s2 : al2)
				{
					String string1 = s1.Node1;
					String string2 = s2.Node1;
					//System.out.print(" :    "+string2);
					//System.out.println(string1+"   :    "+string2);
					if(string1.equals(string2))
					{
						inter.addAll(intersection(s1.Node2_1to1, s2.Node2_1to1));
						break;
					}
				
				}
			//	System.out.println();
			}
			//System.out.println();
		}
		else
		{
			for(UJSimilarity26feb2017 s1 : al1)
			{
				for(UJSimilarity26feb2017 s2 : al2)
				{
					String string1 = s1.Node1;
					String string2 = s2.Node1;
					
						if(string1.equals(string2))
					{
						inter.addAll(intersection(s1.Node2_1tom, s2.Node2_1tom));
						break;
					}
					
				}
			}
		}
		return inter;
	}
	public static List<List<String>> removeNULLS(List<List<String>> llsnulls)
	{
		List<List<String>> llsnonulls = new ArrayList<>();
		for(int i = 0 ; i < llsnulls.size();i++)
		{
			if(llsnulls.get(i).isEmpty())
				continue;
			else 
				llsnonulls.add(llsnulls.get(i));
		}
		
		return llsnonulls;
	}
	
	public static double countinside(List<List<String>> lls)
	{
		double c = 0.0;
		for(List<String> ls : lls)
			c += ls.size();
		
		return c;
	}
	
	public static List<String> intersection(List<String> list1, List<String> list2)
	{
		List<String> list = new ArrayList<>();

        for (String t : list1) {
            if(list2.contains(t)) 
            {
//            	return t;
                list.add(t);
            }
        }
        return list;
	}
	
	public static int getSize(ArrayList<UJSimilarity26feb2017> al, int SWITCH)
	{
		
		int size = 0;
		
		if(SWITCH == ONE2ONE)
		{
			for(UJSimilarity26feb2017 s : al)
				size += s.Node2_1to1.size();
		}
		else
		{
			for(UJSimilarity26feb2017 s : al)
				size += s.Node2_1tom.size();
		}
		return size;
		
	}

}
