package UJ;

public class MAin {
	public static boolean isBlankOrNull(String str) {
	    boolean flag=false;
	    if(str==null || str.equalsIgnoreCase("null")||str.length()<=1 || str.isEmpty() ||"".equals(str.trim()))
	    {
	    	return(true);
	    }
	    return(false);
	}
	public static String getFileName(String filePath) {
	    if( filePath==null || filePath.length()==0 )
	        return "";
	    filePath = filePath.replaceAll("[/\\\\]+", "/");
	    int len = filePath.length(),
	        upCount = 0;
	    while( len>0 ) {
	        //remove trailing separator
	        if( filePath.charAt(len-1)=='/' ) {
	            len--;
	            if( len==0 )
	                return "";
	        }
	        int lastInd = filePath.lastIndexOf('/', len-1);
	        String fileName = filePath.substring(lastInd+1, len);
	        if( fileName.equals(".") ) {
	            len--;
	        }
	        else if( fileName.equals("..") ) {
	            len -= 2;
	            upCount++;
	        }
	        else {
	            if( upCount==0 )
	                return fileName;
	            upCount--;
	            len -= fileName.length();
	        }
	    }
	    return "";
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stubString file1 = "C:/UjwalaNew25Nov2013/NewEclispeWorkspace26july2016/UJ_SIMILARITYLIBRARY_RELEASE/ReferenceOntologies/Hydro/Reference_Hydro-waterbody.json";
		String file1 = "C:/UjwalaNew25Nov2013/NewEclispeWorkspace26july2016/UJ_SIMILARITYLIBRARY_RELEASE/ReferenceOntologies/Hydro/Reference_Hydro-waterbody.json";
		
		System.out.println(isBlankOrNull(null));
		System.out.println(isBlankOrNull("ujwala"));
		System.out.println(getFileName(file1));
	}

}
