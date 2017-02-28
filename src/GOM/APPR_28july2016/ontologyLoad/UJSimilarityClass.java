package GOM.APPR_28july2016.ontologyLoad;
import java.util.Vector;

public class UJSimilarityClass {
	public String Node1;
	public String Node2;
	
	public double wordnetNounSimilarity;
	public double wupalmer;
	public double googleSimilarity;
	public double KLDiverdenace;// 
	public double covariancevalue;
	public double SymmetricKLDiverdenace;
	public double JSKLDiverdenace;
	public double KLDiverdenaceJP;
	public double PathSimilarity;
	public double PathChildrenSimilarity;
	public Double AreaOfInfluenceFactor; 
	public double SimpleKLDiverdenaceJP;
	public double AggragateWSimpleKLDiverdenaceJP;
	public double AverageWSimpleKLDiverdenaceJP;
	public double SimpleKLDiverdenaceVec;
	public double AggragateWSimpleKLDiverdenaceVec;
	public double AverageWSimpleKLDiverdenaceVec;
	public double AggragateWCosineRE;
	public double AverageWSCosineRE;// simple word denoted not relative
	public double googleNGD;					// entropy
	public double InformationGain;
	public double gaussvalue1;
	public double gaussvalue2;
	public double csWeight;
	public double csInstance;
	public double uncertainityCoefficient;
	public double JaroSimilarity;
	public double sentenceH;
	public double CosineStringSimilarity;
	public double StringKenelSimilarity;
	public double CosineSimilarity;
	public double rank;
	public double rankPr;
	public double singleObjectiveWeight;
	public double StembasedSimilarity;
	public double max;
	public double min;
	public double f1;
	public double f2;
	public double f3;
	public double x1;
	public double x2;
	public double x3;
	public double x4;
	public int flag;
	public double gaussvalue;
	public double dataPropertySimi;
	public double objectPropertySimi;
	public double associatedPropertySimi;
	public double equivalentClassSimii;
	public double disjointClassSimi;
	public double subClassSimi;
	public double superClassSimi;
	public double associatedClassSimi;
	public double childClassSimi;
	public double siblingClassSimi;
	public double annotationSimi=0.0;
	public double f21;
	public double f23;
	public double f22;
	public double theta;
	public double theta2;
	public double theta3;
	public double f24;
	public  double performanceP;
	//public UJNodeModified20April2014 SourceNode1= new UJNodeModified20April2014();
	//public UJNodeModified20April2014 TargetNode1= new UJNodeModified20April2014();
	//public UJNodeModified20April2014 TargetNode2= new UJNodeModified20April2014();
	public Vector SourceLUBVec=new Vector();
	public Vector TargetLUBVec=new Vector();
	public String SourceLUB;
	public String TargetLUB;
	public int SourceLUBLevel;
	public int TargetLevel;
	public String SourceLLB;
	public String TargetLLB;
	public int SourceLLBLevel;
	public int TargetLLBLevel;
	public int CaseNo=0;
	public double radius=0.0;
	public UJSimilarityClass(UJSimilarityClass obj) {
		// System.out.println(obj.CosineSimilarity+"------------");;
		this.wordnetNounSimilarity = obj.wordnetNounSimilarity;
		this.googleSimilarity = obj.googleSimilarity;
		this.KLDiverdenace = obj.KLDiverdenace;
		this.covariancevalue = obj.covariancevalue;
		this.gaussvalue1 = obj.gaussvalue1;
		this.gaussvalue2 = obj.gaussvalue2;
		this.csWeight = obj.csWeight;
		this.csInstance = obj.csInstance;
		this.StembasedSimilarity=obj.StembasedSimilarity;;
		this.InformationGain = obj.InformationGain;
		this.uncertainityCoefficient = obj.uncertainityCoefficient;
		this.JaroSimilarity = obj.JaroSimilarity;
		this.sentenceH = obj.sentenceH;
		this.SymmetricKLDiverdenace = obj.SymmetricKLDiverdenace;
		this.JSKLDiverdenace = obj.JSKLDiverdenace;
		this.KLDiverdenaceJP = obj.KLDiverdenaceJP;
		this.SimpleKLDiverdenaceJP = obj.SimpleKLDiverdenaceJP;
		this.CosineStringSimilarity = obj.CosineStringSimilarity;
		this.StringKenelSimilarity = obj.StringKenelSimilarity;
		this.rank = obj.rank;
		this.max = obj.max;
		this.min = obj.min;
		this.singleObjectiveWeight = obj.singleObjectiveWeight;
		this.gaussvalue=obj.gaussvalue;
		this.PathChildrenSimilarity=obj.PathChildrenSimilarity;
		this.AreaOfInfluenceFactor=obj.AreaOfInfluenceFactor; 
		this.SimpleKLDiverdenaceJP=obj.SimpleKLDiverdenaceJP;
		this.AggragateWSimpleKLDiverdenaceJP=obj.AggragateWSimpleKLDiverdenaceJP;
		this.AverageWSimpleKLDiverdenaceJP=obj.AverageWSimpleKLDiverdenaceJP;
		this.SimpleKLDiverdenaceVec=obj.SimpleKLDiverdenaceVec;
		this.AggragateWSimpleKLDiverdenaceVec=obj.AggragateWSimpleKLDiverdenaceVec;
		this.AverageWSimpleKLDiverdenaceVec=obj.AverageWSimpleKLDiverdenaceVec;
		this.AggragateWCosineRE=obj.AggragateWCosineRE;
		this.AverageWSCosineRE=obj.AverageWSCosineRE;
	}

	public UJSimilarityClass(UJSimilarityClass obj, double r) {
		// System.out.println(obj.CosineSimilarity+"------------");;
		this.wordnetNounSimilarity = obj.wordnetNounSimilarity;
		this.googleSimilarity = obj.googleSimilarity;
		this.KLDiverdenace = obj.KLDiverdenace;
		this.covariancevalue = obj.covariancevalue;
		this.gaussvalue1 = obj.gaussvalue1;
		this.gaussvalue2 = obj.gaussvalue2;
		this.csWeight = obj.csWeight;
		this.csInstance = obj.csInstance;
		this.wupalmer=obj.wupalmer;
		this.InformationGain = obj.InformationGain;
		this.uncertainityCoefficient = obj.uncertainityCoefficient;
		this.JaroSimilarity = obj.JaroSimilarity;
		this.sentenceH = obj.sentenceH;
		this.SymmetricKLDiverdenace = obj.SymmetricKLDiverdenace;
		this.JSKLDiverdenace = obj.JSKLDiverdenace;
		this.KLDiverdenaceJP = obj.KLDiverdenaceJP;
		this.SimpleKLDiverdenaceJP = obj.SimpleKLDiverdenaceJP;
		this.CosineStringSimilarity = obj.CosineStringSimilarity;
		this.StringKenelSimilarity = obj.StringKenelSimilarity;
		this.rank = r;
		this.max = obj.max;
		this.min = obj.min;
		this.StringKenelSimilarity=obj.StembasedSimilarity;

	}

	public UJSimilarityClass() {
		flag=0;
		wordnetNounSimilarity = 0.0;
		googleSimilarity = 0.0;
		KLDiverdenace = 0.0;
		covariancevalue = 0.0;
		gaussvalue1 = 0.0;
		gaussvalue2 = 0.0;
		csWeight = 0.0;
		googleNGD=0.0;
		csInstance = 0.0;
		wupalmer=1.0;
		InformationGain = 0.0;
		uncertainityCoefficient = 0.0;
		JaroSimilarity = 0.0;
		sentenceH = 0.0;
		SymmetricKLDiverdenace = 0.0;
		JSKLDiverdenace = 0.0;
		KLDiverdenaceJP = 0.0;
		SimpleKLDiverdenaceJP = 0.0;
		CosineStringSimilarity = 0.0;
		StringKenelSimilarity = 0.0;
		rank = 0.0;
		min = 99999;
		max = 99999;
		rankPr = 0.0;
		StembasedSimilarity=1.0;
		subClassSimi=0;
		superClassSimi=0;
		SourceLUB="";
		TargetLUB="";
		SourceLUBLevel=0;
		TargetLevel=0;
		SourceLLB="";
		TargetLLB="";
		SourceLLBLevel=0;
		TargetLLBLevel=0;
		associatedClassSimi=0;
		siblingClassSimi=0;
		f3=1;
		f21=1;
		f23=1;
		f22=1;
		f24=1;
		performanceP=1;
		x1=0;
		x2=0;
		x3=0;
		x4=0;
	}

	public boolean isEmpty() {
		boolean flag = false;
		if (this.Node1 == null && this.Node2 == null)
			flag=true;
		if (this.min == 99999 && this.max == 99999)
			flag = true;
		return (flag);
	}

	public void setRank(double r) {

		this.rank = r;
		System.out.println(this.rank + "------------" + r);
	}

	public void setParameters(double a, double b, double c, double d, double e) {
		wordnetNounSimilarity = a;
		googleSimilarity = b;
		KLDiverdenace = c;
		InformationGain = d;
		uncertainityCoefficient = 0;

	}

	public double getWordnetSimilarity() {
		return (wordnetNounSimilarity);
	}

	public double getGoogleSimilarity() {
		return (googleSimilarity);
	}

	public double getKLDiverdenace() {
		return (KLDiverdenace);
	}

	public double getInformationGain() {
		return (InformationGain);
	}

	public double getUncertainityCoefficient() {
		return (uncertainityCoefficient);
	}

	public static double Round(double Rval, int Rpl) {
		double p = (double) Math.pow(10, Rpl);
		Rval = Rval * p;
		double tmp = Math.round(Rval);
		return (double) tmp / p;
	}

	public void print() {
		
		System.out.println("  " + this.Node1 + "|" + this.Node2 + "|");
		System.out.println(" f1-> max : " + Round(this.max, 3) + " f2->min: "
				+ Round(this.min, 3) + " Rank: " + Round(this.rank, 3));

	}
//
//	public String toString()
//	{
//		return "node1 :"+Node1+"\n"
//				+"node2_1to1 "+Node2+"\n"
//				+"node2_1tom : "+Node2+"\n";
//	}
}
