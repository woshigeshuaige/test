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


<<<<<<< HEAD
		System.out.println(3);

		System.out.println();

		System.out.println(5);


		System.out.println(4);

		System.out.println("1");

		System.out.println(true);
=======
		
>>>>>>> branch 'master' of https://github.com/woshigeshuaige/test.git
	}
}
