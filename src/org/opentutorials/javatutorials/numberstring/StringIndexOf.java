package org.opentutorials.javatutorials.numberstring;

public class StringIndexOf {
	public static void main(String[] args) {
		
		String srcFileName = "SFAaEntplInfoDao.java";
		String srcFileExt = "";
		srcFileExt = srcFileName .equals("") ? srcFileName : srcFileName.substring(srcFileName.lastIndexOf('.')+1);
		System.out.println("srcFileExt:" + srcFileExt);
	}
}
