import java.io.InputStream;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;
import java.net.URL;
import java.net.URLConnection;

class  TcpServer
{
	
	public static void main(String[] args) throws Exception
	{
		ServerSocket ss1 = new ServerSocket(12000);
		
		Socket s = ss1.accept();
		
		PrintWriter out = new PrintWriter(s.getOutputStream(),true);

		out.println("<font color='red' size='7'>客户端你好</font>");
		
		s.close();
		ss1.close();
		
		System.out.println("hello");

		
	}
}
