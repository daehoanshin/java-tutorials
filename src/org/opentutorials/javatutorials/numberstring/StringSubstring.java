package org.opentutorials.javatutorials.numberstring;

public class StringSubstring {
	public static void main(String[] args) {
		String srcPath = "/NGS_Source/ngs-ch-dbio/src/main/java/ngs/ch/sf/dao/aa/";
		srcPath = srcPath.replaceAll("/NGS_Source", "NGS");
		srcPath = srcPath.substring(0, srcPath.length()-1);
		System.out.println(srcPath);
	}
}
