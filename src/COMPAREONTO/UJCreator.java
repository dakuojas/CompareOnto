package COMPAREONTO;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;

public class UJCreator 
{
	public UJCreator()throws IOException 
	{
//		ArrayList<UJSimilarity> al = new ArrayList<UJSimilarity>(); //2D ARRAYLIST 
		
		ArrayList<Similarity> al = new ArrayList<Similarity>();
		
//		UJSimilarity obj1=new UJSimilarity();
		Similarity obj1 = new Similarity();
		obj1.node1="SensorMeasurements";
		obj1.node2_1to1.add("SensorMeasurements");
		ArrayList<String> sl1 = new ArrayList<String>(Arrays.asList("SensorMeasurements","Oceanographic","Water","Atmospheric", "Sensors"));
		obj1.node2_1tom=sl1;
		al.add(obj1);

// 		UJSimilarity obj2=new UJSimilarity();
 		Similarity obj2 = new Similarity();
 		obj2.node1="Oceanographic";
 		obj2.node2_1to1.add("Oceanographic");
 		ArrayList<String> sl2 = new ArrayList<String>(Arrays.asList("Oceanographic","Atmospheric","Water","Atmospheric", "SensorMeasurements"));
 		obj2.node2_1tom=sl2;
 		al.add(obj2);
 
//		UJSimilarity obj3=new UJSimilarity();
		Similarity obj3 = new Similarity();
		obj3.node1="Atmospheric";
		obj3.node2_1to1.add("Atmospheric");
		ArrayList<String> sl3 = new ArrayList<String>(Arrays.asList("Atmospheric","Oceanographic","Water","SensorMeasurements", "Wind"));
		obj3.node2_1tom=sl3;
		al.add(obj3);
		
//		UJSimilarity obj4=new UJSimilarity();
		Similarity obj4 = new Similarity();
		obj4.node1="Water";
		obj4.node2_1to1.add("Water");
		ArrayList<String> sl4 = new ArrayList<String>(Arrays.asList("Atmospheric","Oceanographic","Water","SensorMeasurements", "Wind"));
		obj4.node2_1tom=sl4;
		al.add(obj4);

//		UJSimilarity obj5=new UJSimilarity();
		Similarity obj5 = new Similarity();
		obj5.node1="WaterTemperature";
		obj5.node2_1to1.add("WaterTemperature");
		ArrayList<String> sl5 = new ArrayList<String>(Arrays.asList("Oceanographic","Water","sea_surface_temperature","air_temperature", "dominant_wave_period"));
		obj5.node2_1tom=sl5;
		al.add(obj5);
		
//		UJSimilarity obj6=new UJSimilarity();
		Similarity obj6 = new Similarity();
		obj6.node1="Waves";
		obj6.node2_1to1.add("Waves");
		ArrayList<String> sl6 = new ArrayList<String>(Arrays.asList("dominant_wave_period","significant_wave_height","Water","SensorMeasurements","Wind"));
		obj6.node2_1tom=sl6;
		al.add(obj6);
		
//		UJSimilarity obj7=new UJSimilarity();
		Similarity obj7 = new Similarity();
		obj7.node1="DominantWavePeriod";
		obj7.node2_1to1.add("DominantWavePeriod");
		ArrayList<String> sl7 = new ArrayList<String>(Arrays.asList("dominant_wave_period","significant_wave_height","Water","wind_speed","wind_gust"));
		obj7.node2_1tom=sl7;
		al.add(obj7);
				
//		UJSimilarity obj8=new UJSimilarity();
		Similarity obj8 = new Similarity();
		obj8.node1="WaveHeight";
		obj8.node2_1to1.add("WaveHeight");
		ArrayList<String> sl8 = new ArrayList<String>(Arrays.asList("dominant_wave_period","significant_wave_height","wind_speed","wind_gust","wind_direction"));
		obj8.node2_1tom=sl8;
		al.add(obj8);
		
//		UJSimilarity obj9=new UJSimilarity();
		Similarity obj9 = new Similarity();
		obj9.node1="Wind";
		obj9.node2_1to1.add("Wind");
		ArrayList<String> sl9 = new ArrayList<String>(Arrays.asList("dominant_wave_period","significant_wave_height","wind_speed","wind_gust","wind_direction"));
		obj9.node2_1tom=sl9;
		al.add(obj9);
				
//		UJSimilarity obj10=new UJSimilarity();
		Similarity obj10 = new Similarity();
		obj10.node1="WindSpeed";
		obj10.node2_1to1.add("wind_speed");
		ArrayList<String> sl10 = new ArrayList<String>(Arrays.asList("wind_speed","wind_gust","wind_direction","dominant_wave_period", "significant_wave_height"));
		obj10.node2_1tom=sl10;
		al.add(obj10);
		
//		UJSimilarity obj11=new UJSimilarity();
		Similarity obj11 = new Similarity();
		obj11.node1="WindGust";
		obj11.node2_1to1.add("wind_gust");
		ArrayList<String> sl11 = new ArrayList<String>(Arrays.asList("wind_speed","wind_gust","wind_direction","dominant_wave_period", "significant_wave_height"));
		obj11.node2_1tom=sl11;
		al.add(obj11);
		
//		UJSimilarity obj12=new UJSimilarity();
		Similarity obj12 = new Similarity();
		obj12.node1="wind_direction";
		obj12.node2_1to1.add("wind_direction");
		ArrayList<String> sl12 = new ArrayList<String>(Arrays.asList("wind_speed","wind_gust","wind_direction","dominant_wave_period", "significant_wave_height"));
		obj12.node2_1tom=sl12;
		al.add(obj12);
		
//		UJSimilarity obj13=new UJSimilarity();
		Similarity obj13 = new Similarity();
		obj13.node1="AtmosphericPressure";
		obj13.node2_1to1.add("barometric_pressure");
		ArrayList<String> sl13 = new ArrayList<String>(Arrays.asList("barometric_pressure","air_temperature","wind_gust","wind_direction","dominant_wave_period"));
		obj13.node2_1tom=sl13;
		al.add(obj13);
		
//		UJSimilarity obj14=new UJSimilarity();
		Similarity obj14 = new Similarity();
		obj14.node1="AirTemperature";
		obj14.node2_1to1.add("air_temperature");
		ArrayList<String> sl14 = new ArrayList<String>(Arrays.asList("barometric_pressure","sea_surface_temperature","air_temperature","dominant_wave_period", "significant_wave_height"));
		obj14.node2_1tom=sl14;
		al.add(obj14);
		
//		UJSimilarity obj15=new UJSimilarity();
		Similarity obj15 = new Similarity();
		obj15.node1="Sensors";
		obj15.node2_1to1.add("Sensors");
		ArrayList<String> sl15 = new ArrayList<String>(Arrays.asList("Sensors","ForeignKey","Buoy","StationID", "BuoyOwnedAndMaintainedBy"));
		obj15.node2_1tom=sl15;
		al.add(obj15);
		
//		UJSimilarity obj16=new UJSimilarity();
		Similarity obj16 = new Similarity();
		obj16.node1="ForeignKey";
		obj16.node2_1to1.add("ForeignKey");
		ArrayList<String> sl16 = new ArrayList<String>(Arrays.asList("Sensors","ForeignKey","Buoy","StationID", "BuoyOwnedAndMaintainedBy"));
		obj16.node2_1tom=sl16;
		al.add(obj16);
		
//		UJSimilarity obj17=new UJSimilarity();
		Similarity obj17 = new Similarity();
		obj17.node1="StationID";
		obj17.node2_1to1.add("StationID");
		ArrayList<String> sl17 = new ArrayList<String>(Arrays.asList("Sensors","ForeignKey","Buoy","StationID", "BuoyOwnedAndMaintainedBy"));
		obj17.node2_1tom=sl17;
		al.add(obj17);
		
//		UJSimilarity obj18=new UJSimilarity();
		Similarity obj18 = new Similarity();
		obj18.node1="Buoy";
		obj18.node2_1to1.add("Buoy");
		ArrayList<String> sl18 = new ArrayList<String>(Arrays.asList("Sensors","ForeignKey","Buoy","StationID", "BuoyOwnedAndMaintainedBy"));
		obj18.node2_1tom=sl18;
		al.add(obj18);
		
//		UJSimilarity obj19=new UJSimilarity();
		Similarity obj19 = new Similarity();
		obj19.node1="BuoyOwnedAndMaintainedBy";
		obj19.node2_1to1.add("BuoyOwnedAndMaintainedBy");
		ArrayList<String> sl19 = new ArrayList<String>(Arrays.asList("Sensors","ForeignKey","Buoy","StationID", "BuoyOwnedAndMaintainedBy"));
		obj19.node2_1tom=sl19;
		al.add(obj19);
		
		//WRITING TO JSON
		
		JSONIO jsonio = new JSONIO();
		jsonio.write("ALIGNMENT.json", al);        
	}
}
