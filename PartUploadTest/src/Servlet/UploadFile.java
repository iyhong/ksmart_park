package Servlet;

import java.io.IOException;
import java.io.InputStream;
import java.util.UUID;

import javax.servlet.ServletException;
import javax.servlet.annotation.MultipartConfig;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.Part;

import com.j256.simplemagic.ContentInfo;
import com.j256.simplemagic.ContentInfoUtil;


@WebServlet("/UploadFile")
@MultipartConfig
public class UploadFile extends HttpServlet {
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		System.out.println("doGet 메서드");
		request.getRequestDispatcher("upload.html").forward(request, response);
	}
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		System.out.println("doPost 메서드");
		request.setCharacterEncoding("euc-kr");
		String name = request.getParameter("name");
		System.out.println("name:"+name);
		Part part = request.getPart("file");
		//업로드할 파일이름 가져오기
		InputStream inputStream = part.getInputStream();
		
		
		String strFileName = part.getSubmittedFileName();
		System.out.println("strFileName : "+strFileName);
		//파일이름의 확장자 가져오기
		int pos = strFileName.lastIndexOf( "." );
		String ext = strFileName.substring( pos + 1 );
		System.out.println("ext : "+ext);
		//파일 업로드
        String dir = "D:/upload/";
        String filename = UUID.randomUUID().toString().replace("-", "");
        //String ext1 = ".jpg";
        part.write(dir+filename+"."+ext);
        System.out.println(dir+filename+"."+ext);
        //마임타입추출
		System.out.println("결과 :"+part.getContentType());
		
		
		String path = new java.io.File("..").getCanonicalPath();
		System.out.println("path:"+path);
		
		ContentInfoUtil util = new ContentInfoUtil();
		try {
			ContentInfo info;

			info = util.findMatch(inputStream);
			if (info == null) {
				System.out.println(" Unknown content-type");
			}

			System.out.println(" ContentType : " + info.getName());
			System.out.println(" MimeType : " + info.getMimeType());

			/*
			String[] extensions = info.getFileExtensions();
			
			if (extensions != null && extensions.length > 0) {
				for (int j = 0; j < extensions.length; j++) {
					System.out.println(" File Extension " + j + " : "
							+ extensions[j]);
				}
			}*/
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		
		
		
	}
}
