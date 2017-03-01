package COMPAREONTO;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class CompareJSON 
{    
    public static ArrayList<Similarity> alREF;
    public static ArrayList<Similarity> alALIGN;
    
    //SWITCH
    public static final int ONE2ONE = 1;
    public static final int ONE2MANY = 2;
    
	public static void main(String[] args) throws IOException 
	{

//		USE THIS TO CREATE "ALIGNMENT.json". SEE UJCreator.java
//		UJCreator ujc = new UJCreator();	
		
		String file1 = "REFERENCE.json";
		String file2 = "ALIGNMENT.json";
				

		JSONIO jsonio = new JSONIO();
		
		alREF = jsonio.read(file1);
		alALIGN = jsonio.read(file2);
		
//		jsonio.print(file1);
//		jsonio.print(file2);

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
 		RMINA1to1 = DIFFERENCE(alREF, alALIGN, ONE2ONE);
		AMINR1to1 = DIFFERENCE(alALIGN, alREF, ONE2ONE);
		
//		UNCOMMENT THE FOLLOWING FOR DEBUGGING
//		System.out.println("DIFF 1to1: "+ RMINA1to1);
		System.out.println("1to1 FP : "+countinside(RMINA1to1));
//		System.out.println("DIFF 1to1 REV: "+ AMINR1to1);
		System.out.println("1to1 FN: "+countinside(AMINR1to1));
//		System.out.println("INTERSECTION 1to1 : "+INTER1to1);
		System.out.println("1to1 TP: "+INTER1to1.size());
		
//		PrecisionRecall(TP,FP,FN)
//		YOU CAN ALSO PUT INTER1to1.size() , 
//						 countinside(RMINA1to1),
//						 countinside(AMINR1to1) 
//						 as args
		PrecisionRecall(INTERSECTION(alALIGN, alREF, ONE2ONE).size(),
						countinside(DIFFERENCE(alREF, alALIGN, ONE2ONE)),
						countinside(DIFFERENCE(alALIGN, alREF, ONE2ONE)));		
		
		
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

//		YOU CAN ALSO PUT INTER1tom.size() , 
//		 				 countinside(RMINA1tom),
//		 				 countinside(AMINR1tom) 
//		 				 as args
		PrecisionRecall(INTERSECTION(alALIGN, alREF, ONE2MANY).size(),
				countinside(DIFFERENCE(alREF, alALIGN, ONE2MANY)),
				countinside(DIFFERENCE(alALIGN, alREF, ONE2MANY)));		
				
	}
	
//---------------------------FUNCTIONS----------------------------------------------
	
	
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
	(ArrayList<Similarity> al1,ArrayList<Similarity> al2, int SWITCH) 
	{
		List<List<String>> tempdiff = new ArrayList<>();
		List<List<String>> diff = new ArrayList<>();
		
		if(SWITCH == ONE2ONE)
		{
			for(Similarity s1 : al1)
			{
				for(Similarity s2 : al2)
				{
					String string1 = s1.node1;
					String string2 = s2.node1;
					if(string1.equals(string2))
					{
						tempdiff.add(s1.node2_1to1
											.stream()
											.filter(el->!s2.node2_1to1.contains(el))
											.collect(Collectors.toList()));
						break;
					}									
				}
			}
		}
		else
		{
			for(Similarity s1 : al1)
			{
				for(Similarity s2 : al2)
				{
					String string1 = s1.node1;
					String string2 = s2.node1;
					if(string1.equals(string2))
					{
						tempdiff.add(s1.node2_1tom
											.stream()
											.filter(el->!s2.node2_1tom.contains(el))
											.collect(Collectors.toList()));
						break;
					}									
				}
			}
		}
		
		diff = removeNULLS(tempdiff);
		
		return diff;
	}
	
	public static List<String> INTERSECTION(ArrayList<Similarity> al1 , ArrayList<Similarity> al2, int SWITCH) 
	{
		List<String> inter = new ArrayList<>();
		if(SWITCH == ONE2ONE)
		{
			for(Similarity s1 : al1)
			{
				for(Similarity s2 : al2)
				{
					String string1 = s1.node1;
					String string2 = s2.node1;
					if(string1.equals(string2))
					{
						inter.addAll(intersection(s1.node2_1to1, s2.node2_1to1));
						break;
					}									
				}
			}
		}
		else
		{
			for(Similarity s1 : al1)
			{
				for(Similarity s2 : al2)
				{
					String string1 = s1.node1;
					String string2 = s2.node1;
					if(string1.equals(string2))
					{
						inter.addAll(intersection(s1.node2_1tom, s2.node2_1tom));
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
	
	public static int getSize(ArrayList<Similarity> al, int SWITCH)
	{
		
		int size = 0;
		
		if(SWITCH == ONE2ONE)
		{
			for(Similarity s : al)
				size += s.node2_1to1.size();
		}
		else
		{
			for(Similarity s : al)
				size += s.node2_1tom.size();
		}
		return size;
	}

}
