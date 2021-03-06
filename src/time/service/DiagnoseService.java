package time.service;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import time.domain.User;



public interface DiagnoseService {
	// 产生诊断报告
	void producePDF(String templatePdf, String result, String pdfImage, User user);

	String diagnose(String typeName,String jpgDir, String resultDir) throws IOException, InterruptedException;

	boolean getPDF(String string, HttpServletResponse response);

	String[] getImagePath(String result);

	void scanDcm(String resultDir, HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException;

	String getpdfImage(String[] imagePath, String result, String string);
	
	/*void changeFolderPermission(String dirFile) throws IOException ;*/
	//void changeFolderPermission(String dirFile);
}
