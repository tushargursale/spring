

import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.ow2.util.base64.Base64;




/**
 * Servlet implementation class retrive
 */
@WebServlet("/retrive")
public class retrive extends HttpServlet {
	private static final long serialVersionUID = 1L;
    
	@Override
	protected void service(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		try {
		System.out.println("servlet");
			Class.forName("com.mysql.jdbc.Driver");  
			Connection con=DriverManager.getConnection(  
			"jdbc:mysql://localhost:3306/springtest","root","root");
			PreparedStatement ps=con.prepareStatement("select * from imgtable");  
			ResultSet rs=ps.executeQuery();  
			
			List<String> bytes=new ArrayList<String>();
			while(rs.next())
			{
	        	bytes.add(new String(Base64.encode(rs.getBytes(3))));
	        }
		
			 System.out.println(bytes);
		        request.setAttribute("data", bytes);
		        RequestDispatcher  dispatcher=request.getRequestDispatcher("index.jsp");
		        
		        dispatcher.forward(request, response);
			
			/*if(rs.next()){//now on 1st row  
			              
			Blob b=rs.getBlob(3);//2 means 2nd column data  
			byte barr[]=b.getBytes(1,(int)b.length());//1 means first image  
			
			request.setAttribute("rs",barr);
			System.out.println("last");
			RequestDispatcher requestDispatcher=getServletContext().getRequestDispatcher("http://localhost:8080/ONLINE_EXAM/removeCourse.jsp");
            requestDispatcher.forward(request,response);*/

			
			//}	
			
		} catch (Exception e) {
			// TODO: handle exception
		}
		
		
		
		
	
	}
	}
	

