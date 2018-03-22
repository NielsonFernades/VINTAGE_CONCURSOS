package com.srcsoftware.vintage.util;


import java.io.*;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.Part;

public class Util {
	private static final String LOCAL_DIR = "C:\\Users\\SPC\\workspace\\Vintage_Concursos\\WebContent\\ressources\\img\\perfil\\";

	public static String uploadFiles(HttpServletRequest request, String UPLOAD_DIR, String nomeArquivo) {
		String fileName = "";

		try {
			Part filePart = request.getPart("photo");
			// fileName=filePart.getSubmittedFileName();
			fileName = nomeArquivo + ".png";

			// **WEB**//
			// String applicationPath =
			// request.getServletContext().getRealPath("");
			// String basePath = applicationPath + File.separator + UPLOAD_DIR +
			// File.separator;

			// **LOCAL**//
			String basePath = LOCAL_DIR + UPLOAD_DIR + File.separator;

			InputStream inputStream = null;
			OutputStream outputStream = null;

			try {
				File outputFilePath = new File(basePath + fileName);
				inputStream = filePart.getInputStream();
				outputStream = new FileOutputStream(outputFilePath);
				int read = 0;
				final byte[] bytes = new byte[1024];
				while ((read = inputStream.read(bytes)) != -1) {
					outputStream.write(bytes, 0, read);

				}

			} catch (Exception ex) {
				ex.printStackTrace();
				fileName = "";
			} finally {
				if (outputStream != null) {
					outputStream.close();
				}
				if (inputStream != null) {
					inputStream.close();
				}

			}
		} catch (Exception e) {
			fileName = "";
		}
		return fileName;
	}

	public String getFileName(Part part) {
		final String partHeader = part.getHeader("content-disposition");
		System.out.println("**** partHeader: " + partHeader);
		for (String content : part.getHeader("content-disposition").split(";")) {
			if (content.trim().startsWith("filename")) {
				return content.substring(content.indexOf('=') + 1).trim().replace("\"", "");
			}
		}
		return null;
	}

}
