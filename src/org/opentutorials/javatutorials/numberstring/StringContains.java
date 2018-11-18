package org.opentutorials.javatutorials.numberstring;

public class StringContains {
	public static void main(String[] args) {
		String srcPath = "/NGS_Source/ngs-ch-dbio/src/main/java/ngs/ch/sf/dao/aa/";
		String srcToken1 = ""; 
		String srcToken2 = "";
		
		srcPath = srcPath.replaceAll("/NGS_Source", "NGS");
		srcPath = srcPath.substring(0, srcPath.length()-1);
		
		srcToken1 = srcPath.substring(0, srcPath.indexOf("src/main/java"));
		srcToken2 = srcPath.substring(srcPath.length() - srcPath.indexOf("src/main/java"));
		System.out.println(srcToken1);
		System.out.println(srcToken2);
		
		String changesetPath = "NGS/ngs-ch-dbio/classes/ngs/ch/sf/dao/aa";
		String csToken1 = ""; 
		String csToken2 = ""; 
				
		System.out.println(changesetPath.contains("classes"));
		if(changesetPath.contains("classes")) {
			csToken1 = changesetPath.substring(0, changesetPath.indexOf("classes"));
			csToken2 = changesetPath.substring(changesetPath.length() - changesetPath.indexOf("classes"));
		}
		System.out.println(csToken1);
		System.out.println(csToken2);
		System.out.println(changesetPath.substring(33));
		/*System.out.println(changesetPath.contains(srcPath));
		System.out.println(srcPath.contains(changesetPath));*/
	}
}
