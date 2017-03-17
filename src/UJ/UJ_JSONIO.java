package UJ;





import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.Reader;
import java.io.Writer;
import java.lang.reflect.Type;
import java.util.ArrayList;

import com.google.gson.*;
import com.google.gson.reflect.TypeToken;



public class UJ_JSONIO {

	public void write( String file , ArrayList<UJSimilarity26feb2017> al) throws IOException
	{
		Writer writer = new FileWriter("UJOutput.json"); 
        Gson gsonw = new GsonBuilder().setPrettyPrinting().create();
        System.out.println("----WRITING JSON : "+file+"----");
        gsonw.toJson( al , writer );
        writer.close();        
	}
	public ArrayList<UJSimilarity26feb2017> read(String file) throws IOException
	{
		ArrayList<UJSimilarity26feb2017> al = new ArrayList<>();
		System.out.println("----READING JSON : "+file+"----");
        Reader reader = new FileReader(file);
        
        Gson gsonr = new GsonBuilder().setPrettyPrinting().create();
        Type collectionType = new TypeToken<ArrayList<UJSimilarity26feb2017>>() {}.getType();
        al = gsonr.fromJson(reader, collectionType);
       // System.out.println(al);
        reader.close();      
        return al;
	}

	public void print(String file) throws IOException
	{
		ArrayList<UJSimilarity26feb2017> al = new ArrayList<>();
		Reader reader = new FileReader(file);
		Gson gson = new GsonBuilder().setPrettyPrinting().create();
        Type collectionType = new TypeToken<ArrayList<UJSimilarity26feb2017>>() {}.getType();
        System.out.println("PRINTING : "+file);
        al = gson.fromJson(reader, collectionType);
        System.out.println(al);
        reader.close();
	}

}
